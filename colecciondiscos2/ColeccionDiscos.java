/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciondiscos2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PocyxDesigner
 */
public class ColeccionDiscos {

    static Scanner s = new Scanner(System.in);
    //final static int tam = 3;
    static ArrayList<Disco> discos = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //discos[0] = new Disco("a", "n", "d", 5);
        boolean fin = false;
        int n = 0;
        String t = "";
        for(int i=0;i<10;i++){
            discos.add(new Disco("vacio","vacio","vacio",0));
        }
        do {
            System.out.println("1. Insertar disco\n"
                    + "2. Listar\n"
                    + "3. Borrar\n"
                    + "4. Salir");
            int op = Integer.parseInt(s.nextLine());

            switch (op) {
                case 1:

                    for (int i = 0; i < discos.size(); i++) {
                        if (discos.get(i).getTitulo().equals("vacio")) {
                            boolean rep = false;
                            do {
                                rep=false;
                                System.out.println("Titulo: ");
                                t = s.nextLine();
                              
                                for (Disco disco : discos) {
                                    if (!disco.getTitulo().equals("vacio")) {
                                        if (disco.getTitulo().equals(t)) {
                                            rep = true;
                                            System.out.println("Titulo repetido, vuelve a intentarlo.");
                                            
                                        }
                                    }
                                }
                            } while (rep);

                            System.out.println("Autor: ");
                            String a = s.nextLine();
                            System.out.println("Genero: ");
                            String g = s.nextLine();
                            System.out.println("Duracion: ");
                            double du = Double.parseDouble(s.nextLine());
                            discos.set(i,(new Disco(t, a, g, du)));
                            break;
                        } else if (i == discos.size() - 1 && !discos.get(i).getTitulo().equals("vacio")) {
                            System.out.println("No queda sitio,borra un disco para seguir.");
                            break;
                        }
                    }
                    n++;
                    break;
                case 2:
                    for (Disco d : discos) {
                        System.out.println(d);
                    }
                    break;
                case 3:
                    System.out.println("Titulo: ");
                    t = s.nextLine();
                    for (int i = 0; i < discos.size(); i++) {
                        if (!discos.get(i).getTitulo().equals("vacio")) {
                            if (discos.get(i).getTitulo().equals(t)) {
                                //discos.set(i,(new Disco("vacio","vacio","vacio",0)));
                                discos.remove(i);
                                break;
                            }
                        }
                    }
                    break;
                case 4:
                    fin = true;
                    break;
            }
        } while (!fin);
    }

}
