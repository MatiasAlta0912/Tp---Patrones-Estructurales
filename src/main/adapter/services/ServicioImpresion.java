package main.adapter.services;

import main.adapter.domain.Impresora;

public class ServicioImpresion {
  private final Impresora impresora;

  public ServicioImpresion(Impresora impresora) {
    this.impresora = impresora;
  }

  public void imprimir() {
    impresora.imprimirPdf();
  }
}
