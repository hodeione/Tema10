package Calculadora;

class Operacion {
    public static int sumar(int a, int b) throws DesbordaCapacidadExcepcion {
        long resultado = (long) a + b;
        if (resultado > Integer.MAX_VALUE || resultado < Integer.MIN_VALUE) {
            throw new DesbordaCapacidadExcepcion();
        }
        return (int) resultado;
    }

    public static int restar(int a, int b) throws DesbordaCapacidadExcepcion {
        long resultado = (long) a - b;
        if (resultado > Integer.MAX_VALUE || resultado < Integer.MIN_VALUE) {
            throw new DesbordaCapacidadExcepcion();
        }
        return (int) resultado;
    }

    public static int multiplicar(int a, int b) throws DesbordaCapacidadExcepcion {
        long resultado = (long) a * b;
        if (resultado > Integer.MAX_VALUE || resultado < Integer.MIN_VALUE) {
            throw new DesbordaCapacidadExcepcion();
        }
        return (int) resultado;
    }
}
