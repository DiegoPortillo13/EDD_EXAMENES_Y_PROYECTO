import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Eva2_Examen_Arbol_Binario {
static int tam=0;
    
    public static void main(String[] args) {
        ArbolitoBi arbolito = new ArbolitoBi();
        Scanner sc = new Scanner(System.in);
        int a=0,cont=0;
        System.out.println("Para dejar de agegar, ingrese un -1");
        try {
            while( a != -1){
            a = sc.nextInt();
            if(a==-1)
                break;
            arbolito.agregarNodo(new NodoBi(a));
            cont++;
            tam=cont;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //System.out.println("El tamaño es: "+ tam);
        System.out.println("----------------------------------------------------");
        System.out.println("¿En que metodo desea que el arbol binario sea impreso?\n PreOrder (1)\n InOrder (2)\n PostOrder (3)");
        int opc;
        opc = sc.nextInt();
        if (opc==1) {
            System.out.println("PreOrder");
            arbolito.imprimirPreOrdden();
            System.out.println("");
        }else if (opc ==2 ) {
            System.out.println("InOrder");
            arbolito.imprimirInOrden();
            System.out.println("");
        }else if (opc == 3) {
            System.out.println("PostOrder");
            arbolito.imprimirPost();
            System.out.println("");
        }else{
            System.out.println("Esa no es una opcion, adios :'v");
        }
        System.out.println("Ahora exportarlo.... ");
        Lista_Doble lsd = new Lista_Doble();
        arbolito.exp(tam,lsd);
        lsd.printList();
        
    }
    
}
