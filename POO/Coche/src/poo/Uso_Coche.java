package poo;

public class Uso_Coche {
    public static void main(String[] args) {

        // Instanciación de la clase Coche.
        Coche renault = new Coche();

        System.out.println( "Este coche tiene " + renault.getRuedas() + " ruedas");
        System.out.println(renault.getLargo());

        renault.setColor("Naranja");
        System.out.println(renault.getColor());
        renault.color = "Azul"; // Como la propiedad de color no ha sido encapsulada podemos modificarla desde fuera de su Clase.
        System.out.println(renault.color); // También podemos acceder a su valor.

    }
}
