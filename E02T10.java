/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosarraylist;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;
import java.util.ArrayList;

/**
 *
 *  Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
    ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
    números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
    y 20 elementos ambos inclusive.
 * 
 * @author PocyxDesigner
 */
public class E02T10 {
    public static void main(String[] args) {
        int max=MIN_VALUE;
        int min=MAX_VALUE;
        ArrayList<Integer> valores = new ArrayList<>();
        
        for(int i=0;i<(int) (Math.random()*10)+10;i++){
            valores.add((int) (Math.random()*100));
        }
        
        for(Integer e : valores){
            System.out.println(e);
        }
        int suma=0;
        for(Integer e : valores){
            if(max<e){
                max=e;
            }
            if(min>e){
                min=e;
            }
            suma+=e;
            
        }
        System.out.println("min: "+min+" max: "+max);
        System.out.println("Suma: "+suma);
        System.out.println("Media: "+suma/valores.size());
        
    }
}
