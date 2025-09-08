package main.bridge.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@SuperBuilder
public abstract class Notificacion {
  protected List<Canal> canal;
  protected String mensaje;
  List<String> destinatarios = new ArrayList<>();

  public Notificacion() {}

  protected abstract String getTipoNotificacion();

  public final void enviar() {
    if (destinatarios.isEmpty()) {
      System.out.println("No hay destinatarios asignados para notificar");
    } else if (canal.isEmpty()) {
      System.out.println("No hay canal asignados para notificar");
    } else if (mensaje == null) {
      System.out.println("No hay mensaje asignados para notificar");
    }

    for (Canal canal : canal) {
    System.out.println("Preparando notificacion/es para enviar como: " + getTipoNotificacion() + " a traves de: " + canal.getTipoCanal());
      for (String destinatario : destinatarios) {
        System.out.println("Destinatario: " + destinatario);
        canal.enviar(getMensaje());
      }
    }
  }
}
