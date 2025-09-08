package main.adapter;

import main.adapter.adapters.ImpresoraTextoAdapter;
import main.adapter.domain.Impresora;
import main.adapter.domain.ImpresoraPDF;
import main.adapter.domain.ImpresoraTexto;
import main.adapter.services.ServicioImpresion;

/**
 * Esta opción está orientada a una solución teniendo en cuenta
 * que las clases ImpresoraPDF y ServicioImpresion son parte de
 * un sistema muy grande y no pueden ser cambiadas, por ello
 * la clase ImpresoraTextoAdapter lo que hace es tomar los metodos
 * de Impresora para que ServicioImpresion la reconozca como
 * tal, de esta forma no es necesario tocar las clases del sistema
 * original en caso de que fuesen muy grandes
 */
public class Main {
  public static void main(String[] args) {
    Impresora impresoraPDF = new ImpresoraPDF();
    ImpresoraTexto impresoraTexto = new ImpresoraTexto();
    Impresora impresoraAdapter = new ImpresoraTextoAdapter(impresoraTexto);

    ServicioImpresion servicioImpresion = new ServicioImpresion(impresoraPDF);
    servicioImpresion.imprimir();

    ServicioImpresion servicioImpresion1 = new ServicioImpresion(impresoraAdapter);
    servicioImpresion1.imprimir();
  }
}
