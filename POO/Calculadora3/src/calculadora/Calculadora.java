package calculadora;

public class Calculadora {
    public Calculadora() {

    }

    public static Operacion calcular(Operacion operacion) {
        switch (operacion.getSigno()) {
            case "+" -> operacion.setResultado(operacion.getOperando1() + operacion.getOperando2());
            case "-" -> operacion.setResultado(operacion.getOperando1() - operacion.getOperando2());
            case "*" -> operacion.setResultado(operacion.getOperando1() * operacion.getOperando2());
            case "/" -> operacion.setResultado((double) operacion.getOperando1() / operacion.getOperando2());
            default -> System.out.println("Operación Invalida");
        }

        return operacion;
    }
}
