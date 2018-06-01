
import java.util.*;

/**
 *
 * @author Ariel
 */
public class EVA3_PRACTICAS_EVALUATORIAS_MIXTO {

    
    public static void main(String[] args) {
        //Primero comparar quick e insertion hasta ver en que tamaño el quick es el doble de rápido
        int[] aiPrueba = new int[10];
        int lim = (comparar(aiPrueba.length));
        
        System.out.println("Límite para ordenar: "+ lim);
        Scanner sc = new Scanner(System.in);
        System.out.println("Que tamaño será el arreglo? ");
        int tam = sc.nextInt();
        aiPrueba = new int[tam];
        for (int i = 0; i < aiPrueba.length; i++) {
            aiPrueba[i] = (int)(Math.random()*100);
        }
        System.out.println("Arreglo Sin ordenar: ");
        for (int i : aiPrueba) {
            System.out.print("["+i+"] ");
        }
        if (tam<lim) {
            long startTime = System.nanoTime();
            InsertionS(aiPrueba);
            long endTime = System.nanoTime();
            System.out.println("\nMetodo Insertion, Duración: " + (endTime-startTime)/1e6 + " ms");
        }else{
            long startTime = System.nanoTime();
            InsertionS(aiPrueba);
            long endTime = System.nanoTime();
            System.out.println("\nMetodo Quick, Duración: " + (endTime-startTime)/1e6 + " ms");
        }
        System.out.println("Arreglo ordenado");
        for (int i : aiPrueba) {
            System.out.print("["+i+"] ");
        }
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static int comparar(int tam){
        //Creamos y ponemos los limites correspondientes para comparar los arreglos
        int lim=tam;
        int[] aiDatos = new int[tam];
        int[] aiCopia = new int[tam];
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int)(Math.random()*100);
            aiCopia[i] = aiDatos[i];//Los arreglos deben de ser del mismo tamaño y con los mismos elementos
        }
        //////////////////////////////// COMPARAR LOS TIEMPOS DE CADA METODO////////////////////////////////////////////
        long startTime = System.nanoTime();
        InsertionS(aiDatos);
        long endTime = System.nanoTime();
        long durIns = ((endTime-startTime));//Esta almacena cuanto duró el InsSort en nanoseg
        ////////////////////////////////////////////////////////////////////////////
        startTime = System.nanoTime();
        QuickS(aiCopia);
        endTime = System.nanoTime();
        long durQuick = ((endTime-startTime));//Almacena el tiempo del quick en nanoseg
        ////////////////////////////////////////////////////////////////////////////
        
        //System.out.println("Ins" + durIns);
        //System.out.println("Quick "+ durQuick);
        //System.out.println("tamaño: "+ tam+"\n");
        
        if(durIns < ((durQuick)+(durQuick))){
            lim= comparar(tam+1);//Si se cumple la condicion anterior vuelve a llamar esta funcion, ahora con un arreglo de mayo tamaño
        }
           //System.out.println("limite                      "+ lim);
        return lim;//Regresa el limite correspondiente.
    }
    
    
    public static void InsertionS(int[] ar){
        //long startTime = System.nanoTime();
        int i,n,j;
        for (i=1; i<ar.length; i++){
            n=ar[i];
            j=i-1;
            while(j>=0&&ar[j]>n)
            {
                ar[j+1]=ar[j];
                j=j-1;
            }
            ar[j+1]=n;
        }
        //long endTime = System.nanoTime();
        //System.out.println("Inserction Duración: " + (endTime-startTime) + " ms\n");
    }
    
    
    public static void QuickS(int[] array){ 
        //long startTime = System.nanoTime();
        recursiveQuickSort(array, 0, array.length - 1);
        //long endTime = System.nanoTime();
        //System.out.println("Quick Duración: " + (endTime-startTime) + " ms\n");
    } 
    
    public static void recursiveQuickSort(int[] array, int startIdx, int endIdx){ 
        int idx = partition(array, startIdx, endIdx); 
        if (startIdx < idx - 1){ 
            recursiveQuickSort(array, startIdx, idx - 1); 
        } 
        if (endIdx > idx){ 
            recursiveQuickSort(array, idx, endIdx); 
        } 
    }
    
    public static int partition(int[] array, int left, int right){ 
        int pivot = array[left]; 
        while (left <= right) { 
            while (array[left] < pivot){ 
                left++; 
            } 
            while (array[right] > pivot){ 
                right--; 
            } 
            if (left <= right){ 
                int tmp = array[left]; 
                array[left] = array[right]; 
                array[right] = tmp; 
                left++; 
                right--; 
            } 
        } 
        return left; 
    }
    
}
