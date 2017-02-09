/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosarraylist;

import java.util.ArrayList;

/**
 *
 *  Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
    muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
    todo el ArrayList sin usar ningún índice.
 * 
 * @author PocyxDesigner
 */
public class E01T10 {
    public static void main(String[] args) {
        ArrayList<String> companeros = new ArrayList<>();
        
        companeros.add("Jorge");
        companeros.add("Juan");
        companeros.add("Angel");
        companeros.add("David");
        companeros.add("Jesus");
        companeros.add("Margarita");
        
        for(String c: companeros){
            System.out.println(c);
        }
    }
}
