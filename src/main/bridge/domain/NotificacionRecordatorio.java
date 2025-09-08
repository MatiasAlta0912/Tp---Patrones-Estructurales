package main.bridge.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class NotificacionRecordatorio extends Notificacion {
  @Override
  protected String getTipoNotificacion() {
    return "RECORDATORIO";
  }
}
