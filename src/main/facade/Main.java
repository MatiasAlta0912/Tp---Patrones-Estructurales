package main.facade;

import main.facade.domain.Producto;
import main.facade.service.TiendaFacade;

public class Main {
  public static void main(String[] args) {
    TiendaFacade tiendaFacade = new TiendaFacade();
    tiendaFacade.comprar(Producto.COMPUTADORA);
  }
}
