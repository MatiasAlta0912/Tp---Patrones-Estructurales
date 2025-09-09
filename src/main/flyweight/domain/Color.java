package main.flyweight.domain;

public enum Color {
  VERDE("\u001B[32;1m"),
  AMARILLO("\u001B[33m");

  private final String ansiCode;

  Color(String ansiCode) {
    this.ansiCode = ansiCode;
  }

  public String getAnsiCode() {
    return ansiCode;
  }
}
