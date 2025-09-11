package main.proxy.domain;

import lombok.Data;

@Data
public class Usuario {
  String nombre;
  String apellido;
  Rol rol;

  public Usuario(String nombre, String apellido, Rol rol) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.rol = rol;
  }
}
