/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.clase02.ejercicio01clase02;

/**
 *
 * @author FAMILIA
 */
public class Libros {
    
     private int id;
    private String NombreLibro;
    private int NumeroPaginas;
    private String Autor;

    public Libros(int id, String NombreLibro, int NumeroPaginas, String Autor) {

        this.id = id;
        this.NombreLibro = NombreLibro;
        this.NumeroPaginas = NumeroPaginas;
        this.Autor = Autor;
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreLibro() {
        return NombreLibro;
    }

    public void setNombreLibro(String NombreLibro) {
        this.NombreLibro = NombreLibro;
    }

    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(int NumeroPaginas) {
        this.NumeroPaginas = NumeroPaginas;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    @Override
    public String toString() {
        return "Libros{" + "id=" + id + ", NombreLibro=" + NombreLibro + ", NumeroPaginas=" + NumeroPaginas + ", Autor=" + Autor + '}';
    }

}
