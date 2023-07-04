
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Kichwa numeroKichwa = new Kichwa();
        numeroKichwa.agregarNumero(new NumeroKichwa(0, "illak"),
                new NumeroKichwa(1, "shuk"),
                new NumeroKichwa(2, "ishkay"),
                new NumeroKichwa(3, "kimsa"),
                new NumeroKichwa(4, "chusku"),
                new NumeroKichwa(5, "pishka"),
                new NumeroKichwa(6, "shukta"),
                new NumeroKichwa(7, "kanchis"),
                new NumeroKichwa(8, "pushak"),
                new NumeroKichwa(9, "ishkun"),
                new NumeroKichwa(10, "chunka"),
                new NumeroKichwa(100, "patsak"),
                new NumeroKichwa(1000, "waranka"));

        Conversor conversor = new Conversor(numeroKichwa);
        Validacion validacion = new Validacion();
        String numeroIngresado = "";
        String resp = "";
        boolean opcion = true;
        String resultado = "";
        do {
            numeroIngresado = JOptionPane.showInputDialog("\tConversor de números a kichwa\nIngrese un número:\n");
            if (numeroIngresado == null) {
                JOptionPane.showMessageDialog(null, "Opcion invalida\nVuelva a ingresar");
            } else {
                if (validacion.validarNumero(numeroIngresado)) {
                    if (numeroIngresado.contains("-")) {
                        numeroIngresado = numeroIngresado.replace("-", "");
                        resultado = conversor.convertirNumero(Integer.parseInt(numeroIngresado));
                        JOptionPane.showMessageDialog(null, ("Número ingresado: " + "-" + numeroIngresado + "\nNúmero traducido en kichwa: " + resultado));
                    } else {
                        resultado = conversor.convertirNumero(Integer.parseInt(numeroIngresado));
                        JOptionPane.showMessageDialog(null, ("Número ingresado: " + numeroIngresado + "\nNúmero traducido en kichwa: " + resultado));
                    }
                } else {
                    if (validacion.validarLetras(numeroIngresado)) {
                        JOptionPane.showMessageDialog(null, "Este campo solo admite numeros");
                    } else {
                        JOptionPane.showMessageDialog(null, "Introduzca un número entre el -9999 y 9999");
                    }
                }
            }

            do {
                resp = JOptionPane.showInputDialog("¿Desea introducir otro número? si/no");
                if (resp == null) {
                    JOptionPane.showMessageDialog(null, "Opcion invalida\nVuelva a ingresar");
                    resp = "";
                } else {
                    if (validacion.validarOpcion(resp)) {
                        switch (resp) {
                            case "si":
                                opcion = true;
                                break;
                            case "no":
                                opcion = false;
                                break;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Opcion invalida\nVuelva a ingresar");
                    }
                }
            } while (!validacion.validarOpcion(resp));
        } while (opcion);
    }
}
