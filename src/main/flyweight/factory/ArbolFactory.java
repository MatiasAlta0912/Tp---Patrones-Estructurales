package main.flyweight.factory;

import main.flyweight.domain.Arbol;
import main.flyweight.domain.Color;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class ArbolFactory {
  public static final Map<String, Arbol> arboles = new LinkedHashMap<>();
  private static char siguienteSimbolo = 'A';

  public static Arbol obtenerArbol(String tipo, Color color, String textura) {
    String clave = tipo + "-" + color + "-" + textura;
    Arbol arbol = arboles.get(clave);

    if (arbol == null) {
      arbol = new Arbol(tipo, color, textura,  siguienteSimbolo++);
      arboles.put(clave, arbol);
    }

    return arbol;
  }

  public static int cantidadTipos() {
    return arboles.size();
  }

  public static Collection<Arbol> obtenerCatalogo() {
    return arboles.values();
  }
}
