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

