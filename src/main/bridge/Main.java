package main.bridge;

import main.bridge.domain.*;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    Canal canalEmail = new CanalEmail();
    Canal canalSMS = new CanalSMS();

    Notificacion notificacionAlertaEmail = NotificacionAlerta.builder()
      .canal(List.of(canalEmail))
      .destinatarios(List.of("Destinatario 1", "Destinatario 2"))
      .mensaje("Mensaje automatico 1")
      .build();

    Notificacion notificacionPromocionEmail = NotificacionPromocion.builder()
      .canal(List.of(canalSMS))
      .destinatarios(List.of("Destinatario 3", "Destinatario 4"))
      .mensaje("Mensaje automatico 2")
      .build();

    Notificacion notificacionRecordatorioEmail = NotificacionRecordatorio.builder()
      .canal(List.of(canalEmail, canalSMS))
      .destinatarios(List.of("Destinatario 5", "Destinatario 6"))
      .mensaje("Mensaje automatico 3")
      .build();

    System.out.println("-".repeat(10));
    notificacionRecordatorioEmail.enviar();

    System.out.println("-".repeat(10));
    notificacionPromocionEmail.enviar();

    System.out.println("-".repeat(10));
    notificacionAlertaEmail.enviar();
  }
}
