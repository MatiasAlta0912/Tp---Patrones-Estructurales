package main.proxy;

import main.proxy.domain.Archivo;
import main.proxy.domain.Rol;
import main.proxy.domain.Usuario;
import main.proxy.proxy.ArchivoProxy;
import main.proxy.service.IArchivoReal;

public class Main {
  public static void main(String[] args) {
    Archivo archivo = new Archivo();
    archivo.setNombre("Archivo 1");
    archivo.setDescripcion("Descripcion del archivo 1, importante y clasificado");
    archivo.setTipo("PDF Cifrado");

    Usuario usuario = new Usuario("Santi", "Wengorra", Rol.USER);
    IArchivoReal servicio = new ArchivoProxy(usuario);
    servicio.abrirArchivo(archivo);
  }
}
