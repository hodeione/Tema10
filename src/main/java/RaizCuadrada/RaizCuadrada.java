package RaizCuadrada;

import java.util.Scanner;

public class RaizCuadrada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir un valor: ");
        double valor = scanner.nextDouble();
        scanner.close();

        try {
            double resultado = raizCuadradaV(valor);
            System.out.printf("√%.2f = %.2f", valor, resultado);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static double raizCuadradaV(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("La raíz cuadrada no está definida para un número negativo.");
        }
        return Math.sqrt(valor);
    }
}
