
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidacionTest {

    private Validacion validacion;

    @Before
    public void setUp() {
        validacion = new Validacion();
    }

    @Test
    public void given_a_number_when_validate_then_ok() {
        //Arrange: datos necesarios para la prueba
        String numero = "-1010";
        //Act: se llama al método validarNumero
        boolean resultado = validacion.validarNumero(numero);
        //Assert
        assertTrue(resultado);
    }

    @Test
    public void given_a_number_when_count_digits_then_ok() {
        //Arrange: datos necesarios para la prueba
        int numero = 777;
        int expected = 3;
        //Act: se llama al método validarNumero
        int actual = validacion.calcularNumeroDigitos(numero);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void given_a_text_when_validate_option_then_ok() {
        String opcion = "SI";
        //Act: se llama al método validarOpcion
        boolean resultado = validacion.validarOpcion(opcion);
        //Assert
        assertTrue(resultado);
    }

    @Test
    public void given_a_string_when_has_only_letters_then_ok(){
        String opcion = "SIasda";
        //Act: se llama al método validarLetras
        boolean resultado = validacion.validarLetras(opcion);
        //Assert
        assertTrue(resultado);
    }
}
