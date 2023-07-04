
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Kichwa numeroKichwa = new Kichwa();
        numeroKichwa.agregarNumero(new NumeroKichwa(0, "Illak"),
                new NumeroKichwa(1, "Shuk"),
                new NumeroKichwa(2, "Ishkay"),
                new NumeroKichwa(3, "Kimsa"),
                new NumeroKichwa(4, "Chusku"),
                new NumeroKichwa(5, "Pishka"),
                new NumeroKichwa(6, "Shukta"),
                new NumeroKichwa(7, "Kanchis"),
                new NumeroKichwa(8, "Pushak"),
                new NumeroKichwa(9, "Ishkun"),
                new NumeroKichwa(10, "Chunka"),
                new NumeroKichwa(100, "Patsak"),
                new NumeroKichwa(1000, "Waranka"));

        Conversor conversor = new Conversor(numeroKichwa);
        Validacion validacion = new Validacion();
        String numeroIngresado = "";
        String respuesta = "";
        String resultado = "";
        do {
            numeroIngresado = JOptionPane.showInputDialog("\tConversor de números a kichwa\nIngrese un número:\n");
            if (validacion.validarNumero(numeroIngresado)) {
                resultado = conversor.convertirNumero(Integer.parseInt(numeroIngresado));
                JOptionPane.showMessageDialog(null, ("Número en kichwa: " + resultado));
            } else {
                JOptionPane.showMessageDialog(null, "Introduzca un número entre el 0 y 9999");
            }
            respuesta = JOptionPane.showInputDialog("¿Desea introducir otro número? si/no");

        } while (respuesta.toLowerCase().equals("si") || respuesta.toLowerCase().equals("s"));
    }
}
