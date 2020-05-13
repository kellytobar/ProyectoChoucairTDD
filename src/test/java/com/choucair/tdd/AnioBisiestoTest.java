package com.choucair.tdd;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class AnioBisiestoTest {
	
    @Test
    public void retornaTrueCuandoAnioEsDivisiblePor400() {
        assertThat( AnioBisiesto.esAnioBisiesto(1600), is(true) );
        assertThat( AnioBisiesto.esAnioBisiesto(2000), is(true) );
        assertThat( AnioBisiesto.esAnioBisiesto(2400), is(true) );
    }

    @Test
    public void retornaFalseCuandoAnioEsDivisiblePor100PeroNoPor400() {
        assertThat( AnioBisiesto.esAnioBisiesto(1700), is(false) );
        assertThat( AnioBisiesto.esAnioBisiesto(1800), is(false) );
        assertThat( AnioBisiesto.esAnioBisiesto(1900), is(false) );
    }

    @Test
    public void retornaTrueCuandoAnioEsDivisiblePor4PeroNoPor100() {
        assertThat( AnioBisiesto.esAnioBisiesto(1996), is(true) );
        assertThat( AnioBisiesto.esAnioBisiesto(2004), is(true) );
        assertThat( AnioBisiesto.esAnioBisiesto(2008), is(true) );
    }

    @Test
    public void retornaFalseCuandoAnioNoEsDivisiblePor4() {	
        assertThat( AnioBisiesto.esAnioBisiesto(2017), is(false) );
        assertThat( AnioBisiesto.esAnioBisiesto(2018), is(false) );
        assertThat( AnioBisiesto.esAnioBisiesto(2019), is(false) );
    }
}

    /*
    Requisitos: 
    -Todos los anios divisibles por 400 SON anios bisiestos (1600,2000,2400),
    -Todos los anios divisibles por 100 pero no por 400 NO son anios bisiestos (1700, 1800, 1900),
    -Todos los anios divisibles por 4 pero no por 100 NO son anios bisiestos (1996, 2004, 2008),
    -Todos los anios no divisibles por 4  NO son anios bisiestos(2017, 2018, 2019).
   */
