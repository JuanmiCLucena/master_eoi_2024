package electrodomesticos;

public class Main {
    public static void main(String[] args) {

        // Instanciamos el objeto lampara.
        Lampara lampara = new Lampara();
        System.out.println(lampara.obtenerEstado());

        lampara.apagar();
        System.out.println(lampara.obtenerEstado());

        // Instanciamos el objeto horno.
        Horno horno = new Horno();
        horno.apagar();
        System.out.println(horno.obtenerEstado()); // Mostramos sus atributos.

        // Instanciamos el objeto televisión.
        Television television = new Television();
        System.out.println(television.obtenerEstado()); // Mostramos sus atributos.
    }
}
