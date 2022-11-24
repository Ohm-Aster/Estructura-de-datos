import java.util.Scanner;

/**
 *
 * @author OHM-ASTER
 */
public class e3s112p {

    static int a = 0, b = 0, c = 0;

    String generar(int min, int max) {
        String pal = "";
        pal = pal + (char) (Math.random() * (max - min) + min);
        return pal;
    }

    public void llenar(int tam, String A[]) {
        for (int i = 0; i < tam; i++) {
            int temp = (int) (Math.random() * 3);
            if (temp == 0) {//caracter
                A[i] = generar(33, 126);
            } else if (temp == 1) {//numeros
                A[i] = generar(48, 57);
            } else {
                A[i] = generar(33, 126) + generar(33, 126) + generar(33, 126);
            }
        }
    }

    public void mostrar(String A[], int tam, String titulo) {
        System.out.println(titulo + " " + tam);
        for (int i = 0; i < tam; i++) {
            System.out.print(" " + A[i] + " ");
        }
        System.out.println(" ");
    }

    public void convertir(String A[], int a) {
        String B[] = new String[a];
        for (int i = 0; i < a; i++) {
            B[i] = A[i];
        }
        System.out.println("conversion terminada");
        mostrarp(B, a);
    }

    public void mostrarp(String A[], int tam) {
        for (int i = tam - 1; i >= 0; i--) {
            System.out.print(" " + A[i] + " ");
        }
        System.out.println(" ");
    }

    public void separar(String Cp[], String C1[], String C2[], String C3[], int tam) {
        for (int i = 0; i < tam; i++) {
            if (Cp[i].length() > 1) {//palabras
                C1[a] = Cp[i];
                a++;
            } //numeros
            else if (Cp[i].matches("[0-9]*")) {
                C2[b] = Cp[i];
                b++;
            } //letras
            else {
                C3[c] = Cp[i];
                c++;
            }
        }
    }

    public void burbuja(String A[], int a) {
        for (int i = 0; i < a - 1; i++) {
            for (int j = 0; j < a - i - 1; j++) {
                if (A[j].compareTo(A[j + 1]) < 0) {
                    String aux = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        int opt = 0;
        e3s112p m = new e3s112p();
        Scanner sc = new Scanner(System.in);
        System.out.println("tamaño de cola");
        int tam = sc.nextInt();
        String Cp[] = new String[tam];
        String C1[] = new String[tam];//palabras
        String C2[] = new String[tam];//numeros
        String C3[] = new String[tam];//caracteres
        do {
            System.out.println("--menu--\n"
                    + "1-llenar\n"
                    + "2-mostrar\n"
                    + "3-separar\n"
                    + "4-ordenar\n"
                    + "5-convertir\n"
                    + "6-salir");
            switch (opt = sc.nextInt()) {
                case 1:
                    m.llenar(tam, Cp);
                    System.out.println("llenado completado.");
                    break;
                case 2:
                    m.mostrar(Cp, tam, "cola completa\n");
                    m.mostrar(C1, a, "cola palabras\n");
                    m.mostrar(C2, b, "cola numeros\n");
                    m.mostrar(C3, c, "cola caracteres\n");
                    break;
                case 3:
                    m.separar(Cp, C1, C2, C3, tam);
                    System.out.println("separacion terminada.");
                    break;
                case 4:
                    m.burbuja(C1, a);
                    m.burbuja(C2, b);
                    m.burbuja(C3, c);
                    System.out.println("orden terminado");
                    break;
                case 5:
                    m.convertir(C1, a);
                    m.convertir(C2, b);
                    m.convertir(C3, c);
                    System.out.println("conversion terminada");
                    break;
            }
        } while (opt != 6);
    }
}