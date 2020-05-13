package com.choucair.tdd;

public class NivelSeguridadContrasena {

	public enum NivelSeguridad {
        DEBIL, MEDIO, FUERTE
    }

    public static NivelSeguridad evaluarContrasena(String contrasena) {

        if (contrasena.length() < 8) {
            return NivelSeguridad.DEBIL;
        }

        if (contrasena.matches("[a-zA-Z]+")) {
            return NivelSeguridad.DEBIL;
        }

        if (contrasena.matches("[a-zA-Z0-9]+")) {
            return NivelSeguridad.MEDIO;
        }

        return NivelSeguridad.FUERTE;
    }

}

