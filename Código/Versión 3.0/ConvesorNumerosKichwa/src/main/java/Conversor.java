public class Conversor {

    private Cadena cadena;
    private Validacion validacion;
    private Kichwa kichwa;
    private int[] numeros = new int[3];

    public Conversor(Kichwa numeroKichwa) {
        this.cadena = new Cadena();
        this.validacion = new Validacion();
        this.kichwa = numeroKichwa;
    }

    public String convertirNumero(int numeroAConvertir) {
        if (validacion.calcularNumeroDigitos(numeroAConvertir) == 1 || validacion.calcularNumeroDigitos(numeroAConvertir) == 2) {
            return transformarDosDigitos(numeroAConvertir);
        }
        if (validacion.calcularNumeroDigitos(numeroAConvertir) == 3) {
            return transformarTresDigitos(numeroAConvertir);
        }
        if (validacion.calcularNumeroDigitos(numeroAConvertir) == 4) {
            return transformarCuatroDigitos(numeroAConvertir);
        }
        return " ";
    }

    private String transformarCuatroDigitos(int numeroAConvertir) {
        if (this.kichwa.estaEnLista(numeroAConvertir)) {
            return this.kichwa.buscarNumero(numeroAConvertir);
        }
        if (numeroAConvertir % 1000 == 0) {
            numeros[0] = 1000;
            int res1 = numeroAConvertir / 1000;
            numeros[1] = res1;
            numeros[2] = 0;
            return cadena.armarCadena(kichwa, numeros);
        } else {
            int res1 = numeroAConvertir % 1000;
            numeroAConvertir -= res1;
            numeros[0] = 1000;
            if (res1 < 100) {
                if (numeroAConvertir != 1000) {
                    int res2 = numeroAConvertir / 1000;
                    numeros[1] = res2;
                    numeros[2] = 0;
                    return cadena.armarCadena(kichwa, numeros) + transformarDosDigitos(res1);
                } else {
                    numeros[1] = 0;
                    numeros[2] = 0;
                    return cadena.armarCadena(kichwa, numeros) + transformarDosDigitos(res1);
                }
            }
            if (numeroAConvertir == 1000) {
                numeros[1] = 0;
                numeros[2] = 0;
                return cadena.armarCadena(kichwa, numeros) + transformarTresDigitos(res1);
            }
            int res2 = numeroAConvertir / 1000;
            numeros[1] = res2;
            numeros[2] = 0;
            return cadena.armarCadena(kichwa, numeros) + transformarTresDigitos(res1);
        }
    }

    private String transformarTresDigitos(int numeroAConvertir) {
        if (kichwa.estaEnLista(numeroAConvertir)) {
            return kichwa.buscarNumero(numeroAConvertir);
        }
        if (numeroAConvertir % 100 == 0) {
            numeros[0] = 100;
            int res1 = numeroAConvertir / 100;
            numeros[1] = res1;
            numeros[2] = 0;
            return cadena.armarCadena(kichwa, numeros);
        } else {
            int res1 = numeroAConvertir % 100;
            numeroAConvertir -= res1;
            numeros[0] = 100;
            if (numeroAConvertir == 100) {
                numeros[1] = 0;
                numeros[2] = 0;
                return cadena.armarCadena(kichwa, numeros) + transformarDosDigitos(res1);
            }
            int res2 = numeroAConvertir / 100;
            numeros[1] = res2;
            numeros[2] = 0;
            return cadena.armarCadena(kichwa, numeros) + transformarDosDigitos(res1);
        }
    }

    private String transformarDosDigitos(int numeroAConvertir) {
        if (kichwa.estaEnLista(numeroAConvertir)) {
            return kichwa.buscarNumero(numeroAConvertir);
        }
        if (numeroAConvertir % 10 == 0) {
            numeros[0] = 10;
            int res1 = numeroAConvertir / 10;
            numeros[1] = res1;
            numeros[2] = 0;
            return cadena.armarCadena(kichwa, numeros);
        } else {
            int res1 = numeroAConvertir % 10;
            numeroAConvertir -= res1;
            numeros[0] = res1;
            numeros[1] = 10;
            if (numeroAConvertir == 10) {
                numeros[2] = 0;
                return cadena.armarCadena(kichwa, numeros);
            }
            int res2 = numeroAConvertir / 10;
            numeros[2] = res2;
            return cadena.armarCadena(kichwa, numeros);
        }
    }
}
