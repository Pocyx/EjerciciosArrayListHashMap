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
 *  Escribe un programa que ordene 10 números enteros introducidos por teclado
    y almacenados en un objeto de la clase ArrayList.
 * 
 * @author PocyxDesigner
 */
public class E03T10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> ordenados = new ArrayList<>();
        
        for(int i=0;i<10;i++){
            System.out.print("Intro numero: ");
            int n = Integer.parseInt(s.nextLine());
            ordenados.add(n);
        }
        System.out.println("Desordenado: "+ordenados);
        Collections.sort(ordenados);
        System.out.println("Ordenados: "+ordenados);
        
    }
}
