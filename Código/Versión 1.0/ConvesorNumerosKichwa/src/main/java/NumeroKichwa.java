
public class NumeroKichwa {

    private int valorNumerico;
    private String valorVerbal;
    //private NumeroKichwa[] numerosKichwa;

    public NumeroKichwa() {
        //this.numerosKichwa = new NumeroKichwa[20];
    }

    public NumeroKichwa(int valorNumerico, String valorVerbal) {
        this.valorNumerico = valorNumerico;
        this.valorVerbal = valorVerbal;
    }

    @Override
    public String toString() {
        return "NumeroKichwa valorNumerico=" + valorNumerico + ", valorVerbal=" + valorVerbal;
    }

    public int getValorNumerico() {
        return valorNumerico;
    }

    public String getValorVerbal() {
        return valorVerbal;
    }
}
