package main.flyweight.services;

import main.flyweight.domain.Arbol;
import main.flyweight.domain.Constantes;

public class MemoriaService {
  public static Arbol[][] crearMapa() {
    Arbol[][] mapaArbol = new Arbol[Constantes.ALTO][Constantes.ANCHO];

    for (int y = 0; y < Constantes.ALTO; y++) {
      for (int x = 0; x < Constantes.ANCHO; x++) {
        mapaArbol[y][x] = null;
      }
    }

    return mapaArbol;
  }

  public static double calcularPorcentajeAhorro(long memoriaConFlyweight, long memoriaSinFlyweight) {
    if (memoriaSinFlyweight == 0) return 0.0;
    return 100.0 - (100.0 * memoriaConFlyweight / (double) memoriaSinFlyweight);
  }
}
