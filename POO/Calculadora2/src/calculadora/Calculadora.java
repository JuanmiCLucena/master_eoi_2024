package calculadora;

public class Calculadora {
        public Calculadora() {

        }

        public double calcular(int numeroA, String signo, int numeroB) {
            double resultado= 0;
            switch (signo) {
                case "+" -> resultado = numeroA + numeroB;
                case "-" -> resultado = numeroA - numeroB;
                case "*" -> resultado = numeroA * numeroB;
                case "/" -> resultado = (double)numeroA / numeroB;
                default -> System.out.println("Operación Invalida");
            }

            return resultado;
        }

    }