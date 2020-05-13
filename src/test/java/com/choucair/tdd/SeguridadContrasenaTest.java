package com.choucair.tdd;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static com.choucair.tdd.NivelSeguridadContrasena.NivelSeguridad.*;

public class SeguridadContrasenaTest {

	@Test
    public void debilCuandoTieneMenosDe8Letras() { 
        assertEquals(DEBIL, NivelSeguridadContrasena.evaluarContrasena("123aa!"));
    }

    @Test
    public void debilCuandoTieneSoloLetras() {     
        assertEquals(DEBIL, NivelSeguridadContrasena.evaluarContrasena("abcdefghjk"));
    }

    @Test
    public void medioCuandoTieneLetrasYNumeros() { 
        assertEquals(MEDIO, NivelSeguridadContrasena.evaluarContrasena("abcde12345"));
    }

    @Test
    public void fuerteCuandoTieneLetrasNumerosYSimbolos() { 
        assertEquals(FUERTE, NivelSeguridadContrasena.evaluarContrasena("abcd123!"));
    }
	
}

