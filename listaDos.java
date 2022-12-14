package listas;

import java.util.Scanner;

/**
 *
 * @author OHM-ASTER
 */
public class listaDos {

    Nodo inicio = null;
    Nodo fin = null;

    public void InsertarDato(char valor) {
        Nodo nuevo = new Nodo();
        nuevo.letra = valor;
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

    public void EliminarUltimo() {
        Nodo actual = inicio;
        if (inicio == fin) {
            System.out.println("DATO:" + inicio.letra + " ELIMINADO");
            inicio = null;
            fin = null;
        } else {
            while (actual.siguiente != fin) {
                actual = actual.siguiente;
            }
            System.out.println("DATO:" + fin.letra + " ELIMINADO");
            actual.siguiente = null;
            fin = actual;
        }
    }

    public void EliminarPrimero() {
        if (inicio != null) {
            System.out.println("\n DATO" + inicio.letra + "\n");
            inicio = inicio.siguiente;
        } else {
            System.out.println("\n La lista se encuentra vacia\n");
        }
    }
    
     public void EliminarPersonalizado(char target) {
        Nodo actual = inicio;
        Nodo anterior = null;
        boolean encontrado = false;
        if (inicio != null) {
            while (actual != null && encontrado != true) {            
                if (actual.letra == target) {
                    if (actual == inicio) {
                        inicio = inicio.siguiente;
                    } else if (actual == fin) {
                        anterior.siguiente = null;
                        fin = anterior;
                    } else {
                        anterior.siguiente = actual.siguiente;
                    }
                    System.out.println("\n Nodo eliminado\n");
                    encontrado = true;
                }
                anterior = actual;
                actual = actual.siguiente;
            }
            if (!encontrado) {
                System.out.println("\n Nodo no encontrado \n");
            }
        } else {
            System.out.println("\n La lista se encuentra vacia\n");
        }
    }
    
    public void MostrarLista() {
        Nodo actual = inicio;
        if (inicio != null) {
            while (actual != null) {
                System.out.print("[" + actual.letra + "]");
                actual = actual.siguiente;
            }
        } else {
            System.out.println("\n La lista se encuentra vacia\n");
        }
    }

    public void BuscarDato(char temp) {
        Nodo actual = inicio;
        boolean encontrado = false;
        char nodoBuscado = temp;
        if (inicio != null) {
            while (actual != null ) {
                if (actual.letra == nodoBuscado) {
                    System.out.println("\n Nodo con el dato (" + actual.letra 
                            + ") Encontrado \n");
                    encontrado=true;
                }
                actual = actual.siguiente;
            }
            if (!encontrado) {
                System.out.println("\n Nodo no encontrado \n");
            }
        } else {
            System.out.println("\n La lista se encuentra vacia\n");
        }
    }

    public static void main(String[] args) {
        listaDos obj = new listaDos();
        Scanner sc = new Scanner(System.in);
        int opt;
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
                    for (int i = 0; i < 26; i++) {
                        char temp = (char) ((int) (Math.random() * (90 - 65) + 65));
                        obj.InsertarDato(temp);
                    }
                    break;
                case 2:
                    obj.MostrarLista();
                    break;
                case 3:
                    obj.EliminarPrimero();
                    break;
                case 4:
                    obj.EliminarUltimo();
                    break;
                case 5:
                    System.out.print(" Ingrese el dato del nodo a buscar: ");
                    char letra = sc.next().charAt(0);
                    obj.BuscarDato(letra);
                    break;
                case 6:
                    System.out.print(" Ingrese el dato del nodo a Eliminar: ");
                    char target = sc.next().charAt(0);
                    obj.EliminarPersonalizado(target);
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
