package calculadora;

public class Operacion {

    // Propiedades
    private int operando1;
    private int operando2;
    private String signo;
    private double resultado;

    // Constructor Por Defecto


    public Operacion() {
    }

    // Constructor
    public Operacion(int operando1, String signo, int operando2) {
        this.operando1 = operando1;
        this.signo = signo;
        this.operando2 = operando2;
    }

    // Getters.
    public int getOperando1() {
        return operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public String getSigno() {
        return signo;
    }

    public double getResultado() {
        return resultado;
    }

    // Setters.
    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
