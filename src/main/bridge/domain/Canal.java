package main.bridge.domain;

public interface Canal {
    void enviar(String mensaje);
    String getTipoCanal();
    boolean estaDisponible();
}
