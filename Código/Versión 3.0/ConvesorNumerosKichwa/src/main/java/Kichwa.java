public class Kichwa {

    private NumeroKichwa[] numerosKichwa;

    public Kichwa() {
        this.numerosKichwa = new NumeroKichwa[20];
    }

    public void agregarNumero(NumeroKichwa... numerosKichwa) {
        this.numerosKichwa = numerosKichwa;
    }

    public String buscarNumero(int numero) {
        String resultado = "";
        for (NumeroKichwa numeroKichwa : numerosKichwa) {
            if (numero == numeroKichwa.getValorNumerico() && numeroKichwa != null) {
                resultado = numeroKichwa.getValorVerbal();
            }
        }
        return resultado;
    }

    public boolean estaEnLista(int numeroABuscar) {
        for (NumeroKichwa numeroKichwa : numerosKichwa) {
            if (numeroKichwa != null && numeroKichwa.getValorNumerico() == numeroABuscar) {
                return true;
            }
        }
        return false;
    }
}
