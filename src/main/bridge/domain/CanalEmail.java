package main.bridge.domain;

public class CanalEmail implements Canal {

  @Override
  public void enviar(String mensaje) {
    System.out.println("Enviando mensaje por email: " + mensaje);
  }

  @Override
  public String getTipoCanal() {
    return "EMAIL";
  }

  @Override
  public boolean estaDisponible() {
    return true;
  }
}
