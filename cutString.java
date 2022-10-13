/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uno;

/**
 *
 * @author OHM-ASTER
 */
public class cutString {

    static String cadena = "[{()}{}{}]";
    static char l;
    static char Pila[] = new char[cadena.length()];
    static int tope = 0;

    public void push(char l) {
        Pila[tope] = l;
        tope++;
    }

    public void pop() {
        tope--;
    }

    public void show() {
        for (int i = 0; i < tope; i++) {
            System.out.print(" " + Pila[i]);
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        cutString c = new cutString();
        System.out.println("tamaño de cadena = " + cadena.length());
        char letra[] = new char[cadena.length()];

        System.out.println("cadena= " + cadena);
        for (int i = 0; i < cadena.length(); i++) {
            l = cadena.charAt(i);
            System.out.println("valor actual de l =" + l);
            if (l == '{' || l == '[' || l == '(') {
                System.out.println("push " + l);
                c.push(l);
            } else if ((l == '}' && Pila[tope - 1] == '{') || 
                    (l == ']' && Pila[tope - 1] == '[') || 
                    (l == ')' && Pila[tope - 1] == '(')) {
                System.out.println("pop " + l);
                c.pop();
            } else {
                System.out.println("no es igual al anterior, se agrega ");
                c.push(l);
            }
        }
        c.show();
    }
}
