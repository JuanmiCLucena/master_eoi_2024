package electrodomesticos;

// Definición de la clase Lámpara

public class Lampara extends Electrodomestico{

    // Atributos de la clase

     // Indica si la lámpara está encendida o apagada

    private int intensidad;    // Nivel de intensidad de la luz de la lámpara
    private String color;      // Color de la luz emitida por la lámpara

    // Constructor de la clase Lampara

    public Lampara() {
        // Inicializa la lámpara. Con super llamamos al padre inmediato (Electrodomestico).
        super(true);
        this.intensidad = 50;
        this.color = "blanca";
    }

    // Método para cambiar la intensidad de la luz
    public void cambiarIntensidad(int nuevaIntensidad) {

        if (nuevaIntensidad >= 0 && nuevaIntensidad <= 100) {
            intensidad = nuevaIntensidad;
        } else {
            System.out.println("Intensidad inválida. Debe estar entre 0 y 100.");
        }

    }

    // Método para cambiar el color de la luz
    public void cambiarColor(String nuevoColor) {

        color = nuevoColor;
        System.out.println("Color de la lámpara cambiado a " + color + ".");

    }

    // Método para obtener el estado actual de la lámpara
    public String obtenerEstado() {
        // Verificar si el horno está encendido
        if (this.isEncendido()) {
            // Si está encendido, mostrar la temperatura actual
            return "Lámpara encendida, Intensidad: " + intensidad + ", Color: " + color;
        } else {
            // Si está apagado, mostrar la temperatura como 0
            this.cambiarIntensidad(0);
            return "Lámpara apagada, Intensidad: " + intensidad + ", Sin Color";
        }
    }
}
