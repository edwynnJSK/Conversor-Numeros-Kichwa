import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacion {
    public Validacion() {

    }

    public boolean validarNumero(String numeroIngresado) {
        Pattern pattern = Pattern.compile("^(-?)(?!0[0-9])[0-9][0-9]{0,3}$");
        Matcher matcher = pattern.matcher(numeroIngresado);
        return matcher.matches();
    }

    public int calcularNumeroDigitos(int numero) {
        int contador = 0;
        if (numero == 0) {
            return 1;
        }
        while (numero != 0) {
            numero = numero / 10;
            contador++;
        }
        return contador;
    }

    public boolean validarOpcion(String opcion){
        String op = opcion.toLowerCase();
        if (op.equals("si") || op.equals("no")) {
            return true;
        }
        return false;
    }

    public boolean validarLetras(String texto) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(texto);
        return matcher.matches();
    }
}
