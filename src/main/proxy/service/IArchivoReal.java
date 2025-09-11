package main.proxy.service;

import main.proxy.domain.Archivo;

public interface IArchivoReal {
  void abrirArchivo(Archivo archivo);
  String leerArchivo();
}
