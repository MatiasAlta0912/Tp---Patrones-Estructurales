package main.proxy.proxy;

import main.proxy.domain.Archivo;
import main.proxy.domain.Rol;
import main.proxy.domain.Usuario;
import main.proxy.service.ArchivoReal;
import main.proxy.service.IArchivoReal;

public class ArchivoProxy implements IArchivoReal {
  private Usuario usuario;
  private final IArchivoReal archivoReal;

  public ArchivoProxy(Usuario usuario) {
    this.usuario = usuario;
    this.archivoReal = new ArchivoReal();
  }

  @Override
  public void abrirArchivo(Archivo archivo) {
    if (usuario.getRol() == Rol.USER) {
      throw new UnsupportedOperationException("Accion no permitida");
    }

    archivoReal.abrirArchivo(archivo);
  }

  @Override
  public String leerArchivo() {
    if (usuario.getRol() == Rol.USER) {
      throw new UnsupportedOperationException("Accion no permitida");
    }

    return archivoReal.leerArchivo();
  }

  public void cambiarUsuario(Usuario usuario) {
    this.usuario = usuario;
  }
}
