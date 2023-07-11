import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConversorTest {
    private Conversor conversor;
    @Before
    public void setUp(){
        Kichwa numeroKichwa = new Kichwa();
        numeroKichwa.agregarNumero(new NumeroKichwa(0, "Illak"),
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
        conversor = new Conversor(numeroKichwa);
    }
    @Test
    public void given_a_number_when_translate_to_kichwa_then_ok() {
        //Arrange: datos necesarios para la prueba
        String numero = "-1010";
        String resultado = "";
        //Act: se llama al método convertir numero
        if(numero.contains("-")){
            numero = numero.replace("-","");
            resultado = conversor.convertirNumero(Integer.parseInt(numero));
        }else{resultado = conversor.convertirNumero(Integer.parseInt(numero));}
        //Assert
        assertArrayEquals("waranka chunka".getBytes(), resultado.getBytes());
    }
}