package electrodomesticos;

public class Electrodomestico {

    // Atributos - Propiedades.
    private boolean encendido;

    // Método constructor.
    public Electrodomestico(boolean encendido) {
        this.encendido = encendido;
    }

    // Métodos de Clase.

    // Método para encender el Electrodoméstico.
    public void encender() {
        encendido = true;
        System.out.println("Encendiendo Electrodoméstico.");
    }

    // Método para apagar el Electrodoméstico.
    public void apagar() {
        encendido = false;
        System.out.println("Apagando Electrodoméstico.");
    }

    // Getters.
    public boolean isEncendido() {
        return encendido;
    }

}
