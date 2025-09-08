package main.bridge.domain;

public class CanalSMS implements Canal {

  @Override
  public void enviar(String mensaje) {
    System.out.println("Enviando mensaje por SMS: " + mensaje);
  }

  @Override
  public String getTipoCanal() {
    return "SMS";
  }

  @Override
  public boolean estaDisponible() {
    return true;
  }
}
