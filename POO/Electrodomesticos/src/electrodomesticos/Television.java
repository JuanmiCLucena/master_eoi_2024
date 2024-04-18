package electrodomesticos;

public class Television extends Electrodomestico {

    // Atributos de la clase.
    private int tamaño;
    private String resolucion, tipoPanel;

    // Método constructor por Defecto.
    public Television() {
        super(true);
        this.tamaño = 54;
        this.resolucion = "Full HD";
        this.tipoPanel = "LED";
    }

    // Getters.
    public int getTamaño() {
        return tamaño;
    }

    public String getResolucion() {
        return resolucion;
    }

    public String getTipoPanel() {
        return tipoPanel;
    }

    // Setters.

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public void setTipoPanel(String tipoPanel) {
        this.tipoPanel = tipoPanel;
    }

    // Método para ver el estado actual de la Televisión.
    public String obtenerEstado() {
        return "Televisión " + (this.isEncendido() ? "encendida" : "apagada")
                + ", Tamaño: " + tamaño + " pulgadas" + ", Resolución: " + resolucion + ", Panel: " + tipoPanel;
    }
}
