/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciondiscos2;

/**
 *
 * @author PocyxDesigner
 */
public class Disco {
    private String titulo;
    private String autor;
    private String genero;
    private double duracion;
      
    
    public Disco(String titulo, String autor, String genero, double duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Disco{" + "titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", duracion=" + duracion + '}';
    }
    
    public static boolean tituloRepetido(String t,Disco[] discos){
        boolean repetido = false;
        for(int i=0;i<discos.length;i++){
            if(!discos[i].equals(null)){
                if(discos[i].getTitulo().equals(t)){
                    return repetido = true;
                }
            }
            
        }
        return repetido;
    }
    
    public static String compruebaTituloRepetido(String t,Disco[] discos){
        String repetido = "no";
        for(int i=0;i<discos.length;i++){

                if(discos[i].getTitulo().equals(t)){
                    return repetido = t;
                }
            
        }
        return repetido;
    }
}

