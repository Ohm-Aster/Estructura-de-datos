/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

import java.util.Scanner;

/**
 *
 * @author OHM-ASTER
 */
public class listatres {

    Nodo inicio = null;
    Nodo fin = null;

    public void InsertarDato(int id, char valor, String pal) {
        Nodo nuevo = new Nodo();
        nuevo.letra = valor;
        nuevo.dato = id;
        nuevo.nombre = pal;
        if (inicio == null) {
            inicio = nuevo;
            inicio.siguiente = null;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            nuevo.siguiente = null;
            fin = nuevo;
        }
        System.out.println("\n Nodo " + nuevo.letra + " ingresado");
    }

    public void MostrarLista() {
        Nodo actual = inicio;
        if (inicio != null) {
            while (actual != null) {
                System.out.print("[" + actual.dato + "--" + actual.letra + "--" + actual.nombre + "]");
                actual = actual.siguiente;
            }
        } else {
            System.out.println("\n La lista se encuentra vacia\n");
        }
    }

    public static void main(String[] args) {
        listatres obj = new listatres();
        Scanner sc = new Scanner(System.in);
        int opt; int id=1;
        do {
            System.out.println("\n║1. Insertar ║\n"
                    + "║2. Mostrar  ║\n"
                    + "║3. Eliminar primero║\n"
                    + "║4. Eliminar ultimo║\n"
                    + "║5. buscar║\n"
                    + "║6. Eliminar especial║\n"
                    + "║7. Salir ║");
            switch (opt = sc.nextInt()) {
                case 1:
                    //System.out.println("id");
                    //int id = sc.nextInt();
                    System.out.println("letra");
                    char let = sc.next().charAt(0);
                    System.out.println("palabra");
                    String pal = sc.next();
                    obj.InsertarDato(id, let, pal);
                    id++;
                    break;
                case 2:
                    obj.MostrarLista();
                    break;
                case 3:
                    //   obj.EliminarPrimero();
                    break;
                case 4:
                    //   obj.EliminarUltimo();
                    break;
                case 5:
                    System.out.print(" Ingrese el dato del nodo a buscar: ");
                    char letra = sc.next().charAt(0);
                    //  obj.BuscarDato(letra);
                    break;
                case 6:
                    System.out.print(" Ingrese el dato del nodo a Eliminar: ");
                    char target = sc.next().charAt(0);
                    //   obj.EliminarPersonalizado(target);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n\n OPCION NO VALIDA \n");
                    break;
            }
        } while (opt != 7);
    }
}
