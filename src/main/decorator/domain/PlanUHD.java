package main.decorator.domain;

import main.decorator.domain.decorator.PlanDecorator;
import main.decorator.domain.interfaces.Plan;

public class PlanUHD extends PlanDecorator {

  public PlanUHD(Plan plan) {
    super(plan);
  }

  @Override
  public String getDescripcion() {
    return super.getDescripcion() + " + UltraHD";
  }

  @Override
  public String getCosto() {
    return super.getCosto() + 500.0;
  }
}
