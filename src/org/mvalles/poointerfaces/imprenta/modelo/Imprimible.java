package org.mvalles.poointerfaces.imprenta.modelo;

public interface Imprimible {
    default String imprimir(){
        return "Imprimiento un valor por defecto";
    }
}
