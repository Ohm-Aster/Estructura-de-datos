/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uno;

import java.util.Scanner;

/**
 *
 * @author OHM-ASTER
 */
public class NodoUno {
    Scanner sc = new Scanner(System.in);
    
    public class Nodo {
        String dato;
        int num;
        Nodo sig;
    }
    
    Nodo inicio = null;
    Nodo temp = null;
    public void agregar() {
        System.out.println("agregar el dato ");
        if (inicio == null) {
            inicio = new Nodo();
            inicio.dato = sc.nextLine();//texto
            inicio.num=sc.nextInt();
            inicio.sig = null;
        } else {
            temp = new Nodo();
            System.out.println("dato: ");
            temp.dato = sc.nextLine();
            System.out.println("numero: ");
            temp.num=sc.nextInt();
            temp.sig = inicio;
            inicio = temp;
        }
    }
    
    public void mostrar() {
        Nodo actual = inicio;
        if (inicio != null) {
            while (actual != null) {
                System.out.println(" DATO " + "[" + actual.dato +" "+actual.num + "]");
                actual = actual.sig;
            }
        } else {
            System.out.println("\n La lista se encuentra vacia\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt;
        NodoUno n = new NodoUno();
        do {
            System.out.println("1 add \n"
                    + "2 mostrar \n"
                    + "3 salir");
            switch (opt = sc.nextInt()) {
                case 1:
                    n.agregar();
                    break;
                case 2:
                    n.mostrar();
                    break;
            }
        } while (opt != 3);
    }
}
