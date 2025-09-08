package main.bridge.domain;

public abstract class Notificacion {
  protected Canal canal;
  protected String mensaje;

  public Notificacion(Canal canal) {
    this.canal = canal;
  }

  protected abstract String getTipoNotificacion();

  public final void enviar(String destinatario) {
    if (!canal.estaDisponible()) {
      System.out.println("No se puede enviar la notificacion");
    }

    System.out.println("Preparando notificacion para enviar como: " + getTipoNotificacion());

    canal.enviar(getMensaje());
  }

  public void setMensaje(String mensaje) {
    this.mensaje = mensaje;
  }

  public String getMensaje() {
    return mensaje;
  }

  public void cambiarCanal(Canal canal) {
    this.canal = canal;
  }
}
