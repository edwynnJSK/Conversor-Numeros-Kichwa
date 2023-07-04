import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacion {
    public Validacion(){

    }

    public boolean validarNumero(String numeroIngresado) {
        Pattern pattern = Pattern.compile("^(?!0[0-9])[0-9][0-9]{0,3}$");
        Matcher matcher = pattern.matcher(numeroIngresado);
        return matcher.matches();
    }

    public int calcularNumeroDigitos(int i) {
        int contador = 0;
        if(i==0){
            return 1;
        }
        while(i!=0){
            i = i/10;
            contador++;
        }
        return contador;
    }

}
