package Calculadora;

public class DesbordaCapacidadExcepcion extends Exception {
    public DesbordaCapacidadExcepcion() {
        super("El resultado desborda la capacidad de esta calculadora");
    }
}