package poo;

public class Coche {

    // Propiedades Comunes
    // Encapsulamos con modificador de acceso private.
    private int ruedas, largo, ancho;
    private int motor;
    private int peso_plataforma;

    // Propiedades No Comunes
    String color;
    int peso_total;
    boolean asientos_cuero, climatizador;

    // Constructor
    public Coche () {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
    }

    // Getters para poder ver el valor de las propiedades de la Clase Coche en otras Clases.

    public int getRuedas() {
        return ruedas;
    }

    public String getLargo() {
        return "El largo de tu coche es " + largo;
    }

    public int getAncho() {
        return ancho;
    }

    public int getMotor() {
        return motor;
    }

    public int getPeso_plataforma() {
        return peso_plataforma;
    }

    public String getColor(){
        return "El color de tu coche es " + color;
    }

    // Setters para poder modificar el valor de las propiedades de la Clase Coche en otras Clases.

    public void setColor(String color) {
        this.color = color;
    }
}
