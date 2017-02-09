/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosarraylist;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * Implementa el control de acceso al área restringida de un programa. Se debe
 * pedir un nombre de usuario y una contraseña. Si el usuario introduce los
 * datos correctamente, el programa dirá “Ha accedido al área restringida”. El
 * usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
 * el programa dirá “Lo siento, no tiene acceso al área restringida”. Los
 * nombres de usuario con sus correspondientes contraseñas deben estar
 * almacenados en una estructura de la clase HashMap.
 *
 * @author PocyxDesigner
 */
public class E06Tema10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, Integer> m = new HashMap<String, Integer>();
        m.put("Amalia", 123);
        m.put("Cindy", 456);
        m.put("César", 789);
        m.put("Víctor", 123);
        m.put("Alan", 456);
        m.put("Esteban", 789);

        int con=0;
        do {
            System.out.print("Por favor, introduzca usuario: ");
            String usuario = s.nextLine();
            System.out.print("Por favor, introduzca contraseña: ");
            int contrasena = Integer.parseInt(s.nextLine());
            if (m.containsKey(usuario) && m.get(usuario) == contrasena) {
                System.out.println("“Ha accedido al área restringida");

                con=3;
            } else {
                System.out.println("Lo siento, no tiene acceso al área restringida");
                con++;
            }
        }while(con<3);
        
    
    }
}
