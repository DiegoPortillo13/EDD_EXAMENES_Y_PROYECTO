
import java.util.Scanner;

public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tecla = new Scanner(System.in);
        Scanner key = new Scanner(System.in);
        int tam;
        System.out.println("ingrese tamaño");//pedir el tamaño
        tam = tecla.nextInt();//pasar la linea de arriba a un entero
        String[] A = new String[tam];//declara el array y asignarle el tamaño
        for (int i = 0; i < A.length; i++) {//se piden los valors y se guardan en el arreglo
            System.out.println("ingrese texto: " + i);
            A[i] = key.nextLine();
        }
        //Arreglos desordenado
        imp(A);

        //selectionSort(A);
        //imp(A);
        insertionSort(A);
        imp(A);
        //bubbleSort(A);
        //imp(A);
        //quickSort(A, 0, tam-1);
        //imp(A);

    }

 
    public static void imp(String[] A) {
        for (String i : A) {
            System.out.print("[" + i + "]");
        }
        System.out.println("\n---------------------------------");
    }

    public static void selectionSort(String[] Arre) {
        for (int i = 0; i < Arre.length - 1; i++) {//lista en desorden 
            int min = i;
            //marcar la posicion del minimo 
            for (int j = i + 1; j < Arre.length; j++) {
                if (Arre[j].compareTo(Arre[min]) < 0) {
                    min = j;
                }
            }
            //intercambiar con la primer posicion de la lista en desorden 
            String t = Arre[min];
            Arre[min] = Arre[i];
            Arre[i] = t;
        }
    }

    public static void insertionSort(String[] Arre) {
        int n = Arre.length;//Se declara una variable que lea todo el arreglo
        for (int i = 1; i < n; ++i) {//el for que recorre el arreglo
            String temp = Arre[i];//una variable temp con el valor en i
            int j = i - 1;//variable para la insersion
            while (j >= 0 && Arre[j].compareTo(temp) > 0) {
                Arre[j + 1] = Arre[j];
                j = j - 1;
            }
            Arre[j + 1] = temp;
        }
    }

    public static void bubbleSort(String[] A) {
        String aux;
        for (int i = 1; i <= A.length; i++) {
            for (int j = 0; j < A.length - i; j++) {
                if (A[j].compareTo(A[j + 1]) > 0) {
                    aux = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = aux;
                }
            }
        }

    }

    public static void quickSort(String[] Arre, int izq, int der) {
        int i = izq;
        int j = der;
        String aux;
        String pivote = Arre[i];
        while (j > i) {
            while (Arre[i].compareTo(pivote) <= 0 && j > i) {
                i++;
            }
            while (Arre[j].compareTo(pivote) > 0) {
                j--;
            }
            if (j > i) {
                aux = Arre[i];
                Arre[i] = Arre[j];
                Arre[j] = aux;
            }
        }
        Arre[izq] = Arre[j];
        Arre[j] = pivote;
        if (izq < j - 1) {
            quickSort(Arre, izq, j - 1);
        }
        if (j + 1 < der) {
            quickSort(Arre, j + 1, der);
        }
    }

}
