/*
Pila de tipo char de tamaño 26
Con las siguientes funciones.
-llenar: de forma automática de manera aleatoria, 
al seleccionar esta opción, con letras minúsculas del abecedario,
no se permiten valores repetidos.
-mostrar: contenido de la pila con el siguiente
formato. Posición n con el valor n.
-ordenar:metodo Shell sort.
-desordenar nuevamente desordenar la pila generada
 */
package uno;

import java.util.Scanner;

/**
 *
 * @author OHM-ASTER
 */
public class e3s12a {

    char pila[] = new char[26];
    int tope = 0;
    boolean bandera = false;
    char pila2[] = new char[26];
    char abc[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
        'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
        'u', 'v', 'w', 'x', 'y', 'z'};

    public void llenar() {
        System.out.println("llenando pila...");
        for (int i = 0; i < 26; i++) {
            int temp = (int) (Math.random() * 26);
            for (int j = 0; j <= i; j++) {
                if (abc[temp] == pila[j]) {
                    bandera = true;
                    break;
                }
                   //  System.out.println("temp: " + abc[temp] + " "
                   //           + bandera + " pila: " + pila[j]);
            }
            if (bandera == false) {
                pila[i] = abc[temp];
            } else {
                i--;
                bandera = false;
            }
        }
    }
    
    public void mostrar() {
        System.out.println("mostrar pila");
        for (int i = 25; i >= 0; i--) {
            System.out.println(i + " :" + pila[i]);
        }
    }

    public void shell() {
        int salto;
        char aux;
        boolean cambios;
        for (salto = pila.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento                                         
                cambios = false;
                for (int i = salto; i < pila.length; i++){ // se da una pasada
                    if (pila[i - salto]>pila[i]) {       // y si están desordenados
                        aux = pila[i];                  // se reordenan
                        pila[i] = pila[i - salto];
                        pila[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.                                   
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt=0;
        e3s12a e = new e3s12a();
        e.llenar();
        e.mostrar();
        e.shell();
        e.mostrar();
    }
}
