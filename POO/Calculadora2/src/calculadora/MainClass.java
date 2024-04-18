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

            // Creamos una instancia de la Clase Calculadora.
            Calculadora calculadora = new Calculadora();

            // Llama al método calcular y muestra el resultado.
            double resultado = calculadora.calcular(numeroA, signo, numeroB);
            System.out.println(resultado);


        }
    }


