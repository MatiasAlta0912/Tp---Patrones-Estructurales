package main.decorator.domain;

import main.decorator.domain.decorator.PlanDecorator;
import main.decorator.domain.interfaces.Plan;

public class PlanDescargasOffline extends PlanDecorator {

  public PlanDescargasOffline(Plan plan) {
    super(plan);
  }

  @Override
  public String getDescripcion() {
    return super.getDescripcion() + " + " + this.getNombre();
  }

  @Override
  public double getCosto() {
    return super.getCosto() + 430.5;
  }

  @Override
  public String getNombre() {
    return "Descargas offline";
  }
}
