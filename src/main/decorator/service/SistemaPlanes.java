package main.decorator.service;

import main.decorator.domain.interfaces.Plan;

public class SistemaPlanes {
  public void mostrarPlan(Plan plan) {
    System.out.println(plan.getDescripcion() + " -> Costo: $" + plan.getCosto());
  }
}
