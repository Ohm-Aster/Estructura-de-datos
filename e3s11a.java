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
public class e3s11a {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("tam de pila");
        int tam=sc.nextInt();
        String pila[]= new String[tam];
        
        /* return Math.random() * (max - min) + min;*/
        for (int i = 0; i < tam; i++) {
            String palabra = "";
            char esp[] = {'@', '#', '%', '&', '+', '-', '*'};
            String roma[] = {"I", "II", "III", "IV", "V", "VI", "VII"};
            palabra = palabra + ((char) (Math.random() * (90 - 65) + 65));
            palabra = palabra + ((char) (Math.random() * (122 - 97) + 97));
            palabra = palabra + esp[((char) (Math.random() * 7))];
            palabra = palabra + ((char) (Math.random() * (57 - 48) + 48));
            palabra = palabra + roma[((char) (Math.random() * 7))];
            pila[i]=palabra;
        }
        
        for(int i=tam-1;i>=0;i--){
            System.out.println(": "+pila[i]);
        }
        
        for(int i=0;i<tam;i++){
            String aux;
            int r=(int)(Math.random() * tam);
            aux=pila[r];
            pila[i]=pila[r];
            pila[r]= aux;
            
        }
        System.out.println("desorden");
        for(int i=tam-1;i>=0;i--){
            System.out.println(": "+pila[i]);
        }

    }

}
