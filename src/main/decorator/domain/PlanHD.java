package main.decorator.domain;

import main.decorator.domain.decorator.PlanDecorator;
import main.decorator.domain.interfaces.Plan;

public class PlanHD extends PlanDecorator {

  public PlanHD(Plan plan) {
    super(plan);

    if (plan.getDescripcion().contains("UHD")) {
      throw new IllegalArgumentException("Solo se puede añadir un tipo de HD al plan");
    }
  }

  @Override
  public String getDescripcion() {
    return super.getDescripcion() + " + " + this.getNombre();
  }

  @Override
  public double getCosto() {
    return super.getCosto() + 250.5;
  }

  @Override
  public String getNombre() {
    return "HD";
  }
}
