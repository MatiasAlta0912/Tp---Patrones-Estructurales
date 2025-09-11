package main.proxy.domain;

import lombok.Data;

@Data
public class Archivo {
  String nombre;
  String descripcion;
  String tipo;

  public String mostrar() {
    return "Archivo: " + nombre + ", descripcion: " + descripcion + ", tipo: " + tipo;
  }
}
