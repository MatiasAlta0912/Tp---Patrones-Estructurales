package main.decorator.domain.decorator;

import main.decorator.domain.interfaces.Plan;

public abstract class PlanDecorator implements Plan {
  private final Plan plan;
  private String nombre;

  public PlanDecorator(Plan plan) {
    this.plan = plan;
  }

  @Override
  public String getDescripcion() {
    return this.plan.getDescripcion();
  }

  @Override
  public String getCosto() {
    return  this.plan.getCosto();
  }

  @Override
  public String getNombre() {
    return this.plan.getNombre();
  }
}
