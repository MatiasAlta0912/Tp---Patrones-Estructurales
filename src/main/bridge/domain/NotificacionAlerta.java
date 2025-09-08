package main.bridge.domain;

public class NotificacionAlerta extends Notificacion {

  public NotificacionAlerta(Canal canal) {
    super(canal);
  }

  @Override
  protected String getTipoNotificacion() {
    return "ALERTA";
  }
}
