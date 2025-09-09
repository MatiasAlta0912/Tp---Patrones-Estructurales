package main.decorator;

import main.decorator.domain.PlanBasico;
import main.decorator.domain.PlanDescargasOffline;
import main.decorator.domain.PlanHD;
import main.decorator.domain.PlanUHD;
import main.decorator.domain.interfaces.Plan;
import main.decorator.service.SistemaPlanes;

public class Main {
  public static void main(String[] args) {
    SistemaPlanes sistemaPlanes = new SistemaPlanes();

    Plan planBasico = new PlanBasico();
    sistemaPlanes.mostrarPlan(planBasico);

    Plan planHD = new PlanHD(new PlanBasico());
    sistemaPlanes.mostrarPlan(planHD);

    PlanUHD planUHD = new PlanUHD(new PlanBasico());
    sistemaPlanes.mostrarPlan(planUHD);

    PlanDescargasOffline planDescargasOffline = new PlanDescargasOffline(new PlanUHD(new PlanBasico()));
    sistemaPlanes.mostrarPlan(planDescargasOffline);

    //Test de excepcion
    PlanUHD planUHD2 = new PlanUHD(new PlanHD(new PlanBasico()));
    sistemaPlanes.mostrarPlan(planUHD2);
  }
}
