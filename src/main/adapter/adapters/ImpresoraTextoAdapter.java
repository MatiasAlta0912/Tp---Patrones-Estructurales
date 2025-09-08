package main.adapter.adapters;

import main.adapter.domain.Impresora;
import main.adapter.domain.ImpresoraTexto;

public class ImpresoraTextoAdapter implements Impresora {
  private final ImpresoraTexto impresoraTexto;

  public ImpresoraTextoAdapter(ImpresoraTexto impresoraTexto) {
    this.impresoraTexto = impresoraTexto;
  }

  @Override
  public void imprimirPdf() {
    impresoraTexto.imprimirTexto();
  }
}
