package org.mvalles.poointerfaces.imprenta.modelo;

public class Informe extends Hoja implements Imprimible{

    public Persona autor;
    public Persona revisor;

    public Informe(String contenido) {
        super(contenido);
    }

    public Informe(String contenido, Persona autor, Persona revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por: " + autor
                + " y revisado por: " + revisor
                +"\n" + this.contenido;
    }
}
