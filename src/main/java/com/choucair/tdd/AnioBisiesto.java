package com.choucair.tdd;

public class AnioBisiesto {

	public static boolean esAnioBisiesto(int anio) {
		return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
	}
}


// return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

/*
  if(anio % 4 == 0 && anio % 100 != 0){
			return true;
		}
		if (anio % 400 == 0){
			return true;
		} 
		else{ return false;
		}
*/