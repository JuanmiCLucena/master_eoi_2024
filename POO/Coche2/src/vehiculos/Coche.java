package vehiculos;

public class Coche {
    // Propiedades Comunes
    // Encapsulamos con modificador de acceso private.
    private int ruedas, largo, ancho;
    private int motor;
    private int peso_plataforma;

    // Propiedades No Comunes
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;

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

    public String getDatosGenerales() {
        return "La plataforma del vehículo tiene " + ruedas + " ruedas" +
                ". Mide " + largo / 1000 + " metros con un ancho de " + ancho +
                " cm y un peso de plataforma de " + peso_plataforma + " kg";
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

    // Métodos para ver y modificar la propiedad asientos_cuero.
    public void setAsientos_cuero(String asientos_cuero) {
        if(asientos_cuero.equalsIgnoreCase("si")){
            this.asientos_cuero = true;
        } else {
            this.asientos_cuero = false;
        }
    }

    public String getAsientosCuero() {
        return (asientos_cuero) ? "Tu coche tiene asientos de cuero" : "Tu coche no tiene asientos de cuero";
    }

    // Métodos para ver y modificar la propiedad del climatizador.
    public void setClimatizador(String climatizador) {
        if(climatizador.equalsIgnoreCase("si")) { // Para comparar Strings sin tener en cuenta el Case. (Mayúsculas o Minúsculas).
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }
    }

    public String getClimatizador() {
        return (climatizador) ? "Tu coche si tiene climatizador" : "Tu coche tiene aire acondicionado";
    }


    // Métodos para asignar y ver el peso total del coche.
    public void setPesoTotal() {
        int peso_carroceria = 500;
        peso_total = peso_plataforma + peso_carroceria;
        if(asientos_cuero){
            peso_total += 50;
        }
        if(climatizador) {
            peso_total += 20;
        }
    }

    public String dimePesoTotal() {
        return "El peso total del coche es: " + peso_total;
    }

    // Métodos para asignar y ver el precio final del coche.
    public String getPrecioCoche() {
        int precio_final = 10000;

        if(asientos_cuero) {
            precio_final += 500;
        }

        if(climatizador) {
            precio_final += 250;
        }

        return "El precio del coche es: " + precio_final + " Euros";
    }

}
