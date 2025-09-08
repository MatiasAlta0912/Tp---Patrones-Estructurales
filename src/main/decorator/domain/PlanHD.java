package main.decorator.domain;

import main.decorator.domain.decorator.PlanDecorator;
import main.decorator.domain.interfaces.Plan;

public class PlanHD extends PlanDecorator {

  public PlanHD(Plan plan) {
    super(plan);
  }

  @Override
  public String getDescripcion() {
    return super.getDescripcion() + " " + this.getNombre();
  }

  @Override
  public String getCosto() {
    return super.getCosto() + 250.5;
  }

  @Override
  public String getNombre() {
    return "HD";
  }
}
