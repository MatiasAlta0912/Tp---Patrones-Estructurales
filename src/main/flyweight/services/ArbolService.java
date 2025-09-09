package main.flyweight.services;

import main.flyweight.domain.Arbol;
import main.flyweight.domain.Color;
import main.flyweight.domain.Constantes;
import main.flyweight.factory.ArbolFactory;

import java.util.Random;

public class ArbolService {
  private static final Random random = new Random();

  public static void generarArboles(Arbol[][] mapaArboles, int cantidad) {
    for (int i = 0; i < cantidad; i++) {
      Arbol arbol = crearArbolAleatorio();
      colocarArbolEnPosicionAleatoria(mapaArboles, arbol);
    }
  }

  public static Arbol crearArbolAleatorio() {
    String tipo = Constantes.TIPOS_ARBOLES[random.nextInt(Constantes.TIPOS_ARBOLES.length)];
    Color color = Constantes.COLORES[random.nextInt(Constantes.COLORES.length)];
    String textura = Constantes.TEXTURAS[random.nextInt(Constantes.TEXTURAS.length)];

    return ArbolFactory.obtenerArbol(tipo, color, textura);
  }

  public static void colocarArbolEnPosicionAleatoria(Arbol[][] mapaArbol, Arbol arbol) {
    int x = random.nextInt(Constantes.ANCHO);
    int y = random.nextInt(Constantes.ALTO);

    mapaArbol[y][x] = arbol;
  }


}
