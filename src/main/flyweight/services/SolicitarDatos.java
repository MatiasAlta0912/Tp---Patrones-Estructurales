package main.flyweight.services;

import java.util.Scanner;

public class SolicitarDatos {
  public static int solicitarCantidad() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingresa la cantidad de árboles a crear: ");
    int cantidad = sc.nextInt();
    System.out.println();
    return cantidad;
  }
}
