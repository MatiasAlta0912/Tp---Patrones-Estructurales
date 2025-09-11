package main.proxy.service;

import main.proxy.domain.Archivo;

public class ArchivoReal implements IArchivoReal {
  private Archivo archivo;

  @Override
  public void abrirArchivo(Archivo archivo) {
    this.archivo = archivo;
  }

  @Override
  public String leerArchivo() {
    return archivo.mostrar();
  }
}
