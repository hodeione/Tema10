package Calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;
public class MiniCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, resultado;
        char operador;

        while (true) {
            try {
                System.out.println("Introducir un número entero:");
                num1 = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor introducido incorrecto. Inténtelo de nuevo...");
                scanner.nextLine();
            }
        }

        while (true) {
            System.out.println(num1);
            System.out.println("¿operador? (+ - * / % o s para salir)");
            operador = scanner.next().charAt(0);

            if (operador == 's') {
                break;
            }

            try {
                System.out.println("Introducir un número entero:");
                num2 = scanner.nextInt();

                switch (operador) {
                    case '+':
                        resultado = Operacion.sumar(num1, num2);
                        System.out.printf("%d + %d = %d\n", num1, num2, resultado);
                        num1 = resultado;
                        break;
                    case '-':
                        resultado = Operacion.restar(num1, num2);
                        System.out.printf("%d - %d = %d\n", num1, num2, resultado);
                        num1 = resultado;
                        break;
                    case '*':
                        resultado = Operacion.multiplicar(num1, num2);
                        System.out.printf("%d * %d = %d\n", num1, num2, resultado);
                        num1 = resultado;
                        break;
                    case '/':
                        if (num2 == 0) {
                            throw new ArithmeticException("La división por cero no está definida");
                        }
                        resultado = num1 / num2;
                        System.out.printf("%d / %d = %d\n", num1, num2, resultado);
                        num1 = resultado;
                        break;
                    case '%':
                        if (num2 == 0) {
                            throw new ArithmeticException("La división por cero no está definida");
                        }
                        resultado = num1 % num2;
                        System.out.printf("%d %% %d = %d\n", num1, num2, resultado);
                        num1 = resultado;
                        break;
                    default:
                        System.out.println("Operador incorrecto. Inténtelo de nuevo...");

                }
            } catch (InputMismatchException e) {
                System.out.println("Valor introducido incorrecto. Inténtelo de nuevo...");
                scanner.nextLine();
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (DesbordaCapacidadExcepcion e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
