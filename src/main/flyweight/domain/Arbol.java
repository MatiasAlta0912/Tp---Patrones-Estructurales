package main.flyweight.domain;

import lombok.Getter;

@Getter
public class Arbol {
  private final String tipo;
  private final Color color;
  private final String textura;
  private final char simbolo;

  public Arbol(String tipo, Color color, String textura, char simbolo) {
    this.tipo = tipo;
    this.color = color;
    this.textura = textura;
    this.simbolo = simbolo;
  }

  public String getDescripcion() {
    return tipo + " - " +  color + " - " + textura + " => " + simbolo;
  }
}
