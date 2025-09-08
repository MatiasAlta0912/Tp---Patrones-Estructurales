package main.decorator.domain;

import lombok.Getter;
import lombok.Setter;
import main.decorator.domain.interfaces.Plan;

@Getter
@Setter
public class PlanBasico implements Plan {
  private String descripcion = "Descripción del plan basico";
  private double costo = 500.0;
  private String nombre = "Plan Basico";
}
