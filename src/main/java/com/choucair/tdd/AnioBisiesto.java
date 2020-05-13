package com.choucair.tdd;

public class AnioBisiesto {

	public static boolean esAnioBisiesto(int anio) {
		return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
	}
}