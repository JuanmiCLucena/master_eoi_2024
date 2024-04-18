package electrodomesticos;

public class Horno extends Electrodomestico {

    // Atributos de la clase.
    private float temperatura, capacidad;

    // Método Constructor por Defecto.
    public Horno() {
        super(true);
        this.temperatura = 200;
        this.capacidad = 57;
    }

    // Getters.
    public float getTemperatura() {
        return temperatura;
    }

    public float getCapacidad() {
        return capacidad;
    }

    // Setters.
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    // Método para ver el estado actual del Horno.
    public String obtenerEstado() {
        return "Horno " + (this.isEncendido() ? "encendido" : "apagado")
                + ", Temperatura: " + temperatura + "°C, Capacidad: " + capacidad + " litros";
    }
}
