package main.flyweight;

import main.flyweight.domain.Arbol;
import main.flyweight.services.MemoriaService;
import main.flyweight.services.SolicitarDatos;
import main.flyweight.services.ArbolService;
import main.flyweight.services.ImpresionService;



public class Main {
  public static void main(String[] args) {
    int cantidad = SolicitarDatos.solicitarCantidad();
    Arbol[][] mapaArboles = MemoriaService.crearMapa();
    ArbolService.generarArboles(mapaArboles, cantidad);
    ImpresionService.mostrarResultados(mapaArboles, cantidad);
  }
}