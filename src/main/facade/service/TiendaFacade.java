package main.facade.service;

import main.facade.domain.Carrito;
import main.facade.domain.Envio;
import main.facade.domain.Pago;
import main.facade.domain.Producto;

public class TiendaFacade {
  private final Carrito carrito;
  private final Pago pago;
  private final Envio envio;

  public TiendaFacade() {
    carrito = new Carrito();
    pago = new Pago();
    envio = new Envio();
  }

  public void comprar(Producto producto) {
    System.out.println("-- Iniciando compra --");
    carrito.agregarProducto(producto);
    pago.procesarPago(producto);
    envio.enviar(producto);
    System.out.println("-- Compra finalizada --");
  }
}
