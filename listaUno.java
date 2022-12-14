package listas;

import java.util.Scanner;

/**
 *
 * @author OHM-ASTER
 */
public class listaUno {

    Nodo inicio = null;
    Nodo fin = null;

    public void InsertarDato(int valor) {
        Nodo nuevo = new Nodo();
        nuevo.dato = valor;
        if (inicio == null) {
            inicio = nuevo;
            inicio.siguiente = null;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            nuevo.siguiente = null;
            fin = nuevo;
        }
        System.out.println("\n Nodo " + nuevo.dato + " ingresado");
    }

    public void MostrarLista() {
        Nodo actual = inicio;
        if (inicio != null) {
            while (actual != null) {
                System.out.print("[" + actual.dato + "]");
                actual = actual.siguiente;
            }
        } else {
            System.out.println("\n La lista se encuentra vacia\n");
        }
    }

    public static void main(String[] args) {
        listaUno obj = new listaUno();
        Scanner sc = new Scanner(System.in);
        int opt, dat;
        do {
            System.out.println("\n║1. Insertar ║ \n"
                    + "║2. Mostrar  ║ \n"
                    + "║3. Salir    ║");
            switch (opt = sc.nextInt()) {
                case 1:
                    System.out.println("cuantos datos quieres agregar");
                    int rep = sc.nextInt();
                    for (int i = 0; i < rep; i++) {
                        System.out.print(" Ingrese el dato: ");
                        dat = sc.nextInt();
                        if (dat % 3 == 0) {
                            obj.InsertarDato(dat);
                        } else {
                            System.out.println("dato no valido");
                            i--;
                        }
                    }
                    break;
                case 2:
                    obj.MostrarLista();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n\n OPCION NO VALIDA \n");
                    break;
            }
        } while (opt != 3);
    }
}
