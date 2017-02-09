/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa
   debe ordenar palabras en lugar de números.
 * 
 * @author PocyxDesigner
 */
public class E04T10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> ordenados = new ArrayList<>();
        
        for(int i=0;i<10;i++){
            System.out.print("Intro palabra: ");
            String p = s.nextLine();
            ordenados.add(p);
        }
        System.out.println("Desordenado: "+ordenados);
        Collections.sort(ordenados);
        System.out.println("Ordenados: "+ordenados);
        
    }
}
