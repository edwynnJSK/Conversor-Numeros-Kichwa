public class Cadena {
    public Cadena(){

    }

    public String armarCadena(Kichwa numeroKichwa, int[] numeros) {
        String resultado = "";
        for(int j = numeros.length-1; j>=0; j--){
            if(numeros[j] != 0){
                resultado += numeroKichwa.buscarNumero(numeros[j]) + " ";
            }
        }
        return resultado;
    }

}
