package org.mvalles.poointerfaces.imprenta;

import org.mvalles.poointerfaces.imprenta.modelo.*;

import static org.mvalles.poointerfaces.imprenta.modelo.Genero.*;

public class EjemploImprenta {

    public static void main(String[] args) {

        Curriculum cv = new Curriculum("Resumen laboral...", new Persona("Mike", "Vallés"), "Ingeniería Informática");
        cv.addExperiencia("PHP")
                .addExperiencia("Java")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador fullstack")
                .addExperiencia("Angular");

        Libro libro = new Libro(new Persona("Erich", "Gamma"),
                "Patrones de diseño: Elem. Reusables POO",
                PROGRAMACION);
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observer"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));

        Informe informe = new Informe("Estudio sobre microservicios", new Persona("Martin", "Fowler"),
                new Persona("James", "Gosling"));
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
