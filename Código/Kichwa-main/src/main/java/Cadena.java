
public class Cadena {
    public Cadena(){

    }

    public String armarCadena(Kichwa numeroKichwa, int[] numeros) {
        String resultado = "";
        for(int j = numeros.length-1; j>=0; j--){
            //System.out.print(numeros[j] +" "); Si se quiere visualizar como se descompone el numero
            if(numeros[j] != 0){
                resultado += numeroKichwa.buscarNumero(numeros[j]) + " ";
            }
        }
        return resultado;
    }

}
