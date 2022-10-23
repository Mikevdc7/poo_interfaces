package org.mvalles.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{

    private List<Hoja> paginas;
    private Persona autor;
    private String titulo;
    private Genero genero;

    public Libro(Persona autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPagina(Hoja pagina){
        paginas.add(pagina);
        return this;
    }

    @Override
    public String imprimir(){
        StringBuilder sb = new StringBuilder("Título: ");
        sb.append(this.titulo)
                .append("\nAutor: ")
                .append(this.autor)
                .append("\nGenero: ")
                .append(this.genero)
                .append("\n");
        for(Hoja pagina: this.paginas){
            sb.append(pagina.imprimir())
                    .append("\n");
        }
        return sb.toString();
    }
}