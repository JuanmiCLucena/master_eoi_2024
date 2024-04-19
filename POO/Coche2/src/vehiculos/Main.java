package vehiculos;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // Instanciación de la clase Coche.
        Coche renault = new Coche();

        System.out.println(renault.getDatosGenerales());

        // Voy a usar javax.swing para poder hacer uso de la clase JOptionPane.
        // Con esto podemos hacer uso de ventanas emergentes para que interactuen con el usuario.
        renault.setColor(JOptionPane.showInputDialog("Introduce color"));
        System.out.println(renault.getColor());

        renault.setAsientos_cuero(JOptionPane.showInputDialog("¿Tiene asientos de cuero? (si/no)"));

        System.out.println(renault.getAsientosCuero());

        renault.setClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador? (si/no)"));

        System.out.println(renault.getClimatizador());

        // Como no hemos llamado al método setPesoTotal su peso será 0.
        System.out.println(renault.dimePesoTotal());

        renault.setPesoTotal(); // Llamamos al método y generamos el peso total del coche.

        System.out.println(renault.dimePesoTotal()); // Volvemos a mostrar el peso total ahora ya si con los valores correctos.

        System.out.println(renault.getPrecioCoche());

    }
}