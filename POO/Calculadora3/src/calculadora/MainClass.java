package calculadora;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        int numeroA, numeroB;
        String signo;

        Scanner s = new Scanner(System.in);

        System.out.println("Calculadora Iniciada");

        System.out.println("Ingrese el primer número:");
        numeroA = s.nextInt();

        System.out.println("Ingrese el operador (+, -, *, /):");
        signo = s.next();

        System.out.println("Ingrese el segundo número:");
        numeroB = s.nextInt();

        // Creamos una instancia de la Clase Operacion.
        Operacion operacion = new Operacion(numeroA, signo, numeroB);

        // Llama al método calcular y muestra el resultado.
        operacion = Calculadora.calcular(operacion); // Como hemos cambiado el método calculara a static simplemente necesita la clase y no tenemos que instanciar Calculadora.
        System.out.println(operacion.getResultado());
    }
}
