package main.bridge.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class NotificacionAlerta extends Notificacion {
  @Override
  protected String getTipoNotificacion() {
    return "ALERTA";
  }
}
