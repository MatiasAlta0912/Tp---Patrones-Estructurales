package main.flyweight.services;

import main.flyweight.domain.Arbol;
import main.flyweight.domain.Constantes;
import main.flyweight.factory.ArbolFactory;

public class ImpresionService {
  private static final String BORDE_HORIZONTAL = "─";
  private static final String BORDE_VERTICAL = "│";
  private static final String ESQUINA_SUP_IZQ = "╭";
  private static final String ESQUINA_SUP_DER = "╮";
  private static final String ESQUINA_INF_IZQ = "╰";
  private static final String ESQUINA_INF_DER = "╯";

  private static final String COLOR_BORDE = "\u001B[36m";
  private static final String COLOR_TITULO = "\u001B[33m";
  private static final String COLOR_COORDENADAS = "\u001B[90m";
  private static final String NEGRITA = "\u001B[1m";

  public static void mostrarResultados(Arbol[][] mapaArboles, int cantidad) {
    mostrarMapaVisual(mapaArboles, cantidad);
    mostrarCatalogo();
    mostrarEstadisticasMemoria(cantidad);
  }

  public static void mostrarMapaVisual(Arbol[][] mapaArbol, int cantidad) {
    if (cantidad <= Constantes.LIMITE_VISUALIZACION) {
      pintarMapa(mapaArbol);
    } else {
      System.out.println("\n⚠️ Cantidad demasiado grande para pintar en consola. Mostrando estadísticas...");
    }
  }

  public static void pintarMapa(Arbol[][] mapaArbol) {
    int ancho = mapaArbol[0].length;

    imprimirTituloMapa(ancho);
    imprimirBordeSuperior(ancho);

    for (Arbol[] arboles : mapaArbol) {
      imprimirFila(arboles);
    }

    imprimirBordeInferior(ancho);
    imprimirLeyenda();
  }

  private static void imprimirTituloMapa(int ancho) {
    String titulo = "🌲 MAPA DEL BOSQUE 🌲";
    int espacios = Math.max(0, (ancho * 2 + 6 - titulo.length()) / 2);

    System.out.println();
    System.out.print(" ".repeat(espacios));
    System.out.println(COLOR_TITULO + NEGRITA + titulo + Constantes.RESET_COLOR);
  }

  private static void imprimirBordeSuperior(int ancho) {
    System.out.print(COLOR_BORDE + ESQUINA_SUP_IZQ);
    System.out.print(BORDE_HORIZONTAL.repeat(ancho * 2));
    System.out.println(ESQUINA_SUP_DER + Constantes.RESET_COLOR);
  }

  private static void imprimirFila(Arbol[] fila) {
    System.out.print(COLOR_BORDE + BORDE_VERTICAL + Constantes.RESET_COLOR);

    for (Arbol arbol : fila) {
      imprimirPosicion(arbol);
    }

    System.out.println(COLOR_BORDE + BORDE_VERTICAL + Constantes.RESET_COLOR);
  }

  private static void imprimirBordeInferior(int ancho) {
    System.out.print(COLOR_BORDE + ESQUINA_INF_IZQ);
    System.out.print(BORDE_HORIZONTAL.repeat(ancho * 2));
    System.out.println(ESQUINA_INF_DER + Constantes.RESET_COLOR);
  }

  public static void imprimirPosicion(Arbol arbol) {
    if (arbol != null) {
      System.out.print(arbol.getColor().getAnsiCode() + NEGRITA + arbol.getSimbolo() + Constantes.RESET_COLOR + " ");
    } else {
      System.out.print(COLOR_COORDENADAS + "·" + Constantes.RESET_COLOR + " ");
    }
  }

  private static void imprimirLeyenda() {
    System.out.println();
    System.out.println(COLOR_TITULO + "📋 LEYENDA:" + Constantes.RESET_COLOR);
    System.out.println(COLOR_COORDENADAS + "   · = Terreno vacío" + Constantes.RESET_COLOR);
    System.out.println("   🌳 = Árboles (con diferentes colores según tipo)");
    System.out.println("   📍 Coordenadas: Fila (vertical) × Columna (horizontal)");
    System.out.println();
  }

  public static void mostrarEstadisticasMemoria(int cantidad) {
    long memoriaFlyweight = ArbolFactory.cantidadTipos() * Constantes.PESO_POR_ARBOL_BYTES;
    long memoriaSinFlyweight = (long) cantidad * Constantes.PESO_POR_ARBOL_BYTES;
    double porcentajeAhorro = MemoriaService.calcularPorcentajeAhorro(memoriaFlyweight, memoriaSinFlyweight);

    System.out.println(COLOR_TITULO + "📊 === Estadísticas de memoria ===" + Constantes.RESET_COLOR);
    System.out.printf("🌲 Cantidad de árboles en el mapa: " + NEGRITA + "%d" + Constantes.RESET_COLOR + "%n", cantidad);
    System.out.printf("🏷️  Tipos únicos en memoria: " + NEGRITA + "%d" + Constantes.RESET_COLOR + "%n", ArbolFactory.cantidadTipos());
    System.out.printf("💾 Memoria con Flyweight: " + NEGRITA + "%d KB" + Constantes.RESET_COLOR + " aprox.%n", memoriaFlyweight / 1024);
    System.out.printf("🔴 Memoria sin Flyweight: " + NEGRITA + "%d KB" + Constantes.RESET_COLOR + " aprox.%n", memoriaSinFlyweight / 1024);
    System.out.printf("✅ Ahorro estimado: " + COLOR_TITULO + NEGRITA + "%.2f%%" + Constantes.RESET_COLOR + "%n", porcentajeAhorro);
    System.out.println();
  }

  public static void mostrarCatalogo() {
    System.out.println(COLOR_TITULO + "📚 === Catálogo de Árboles ===" + Constantes.RESET_COLOR);
    ArbolFactory.obtenerCatalogo().forEach(arbol -> {
      System.out.print("🌿 ");
      System.out.println(arbol.getDescripcion());
    });
    System.out.println();
  }
}