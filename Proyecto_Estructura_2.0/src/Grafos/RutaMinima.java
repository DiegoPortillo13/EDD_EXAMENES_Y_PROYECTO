
package Grafos;

/**
 *
 * @author Ariel
 */
public class RutaMinima {
    //Metodo para determinar todos los algoritmos; Floyd    
    public String algortitmoFloyd(long[][] mAd){//Recibir una matriz de pesos
        int vertices= mAd.length;
        long matrizPesos[][] = mAd;
        String ruta[][] = new String[vertices][vertices];
        String rutaAux[][] = new String[vertices][vertices];
        String rutaRecorrida ="",cadena="",rutas="";
        
        float temp1,temp2,temp3,temp4,minimo;
        //Inicializando las matrices, rutas y rutas Aux
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                ruta[i][j]="";
                rutaAux[i][j]="";
            }
        }
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                for (int k = 0; k < vertices; k++) {
                    temp1= matrizPesos[j][k];//Ordenar la matriz
                    temp2= matrizPesos[j][i];
                    temp3= matrizPesos[i][k];
                    temp4=temp2+temp3;
                    //Encontrando al minimo
                    minimo= Math.max(temp1, temp4);
                    if (temp1!=temp4) {
                        if (minimo==temp4) {
                            rutaRecorrida="";
                            rutaAux[j][k]= k+"";
                            ruta[j][k]=rutaR(i,k,rutaAux,rutaRecorrida)+(k+1);
                        }
                    }
                    matrizPesos[j][k] = (long)minimo;
                }
            }
        }
        //Agregando el camino minimo a cadena
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                cadena = cadena+"["+matrizPesos[i][j]+"]";
            }
            cadena = cadena+ "\n";
        }
        ///////////////////////
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                if (matrizPesos[i][j]!=1000000000) {
                    if (i!=j) {
                        if (ruta[i][j].equals("")) {
                            rutas+= "De ("+(i+1)+ "---->"+(j+1)+") Irse por: ("+(i+1)+", "+(j+1)+")\n";
                            
                        }else{
                            rutas += "De ("+(i+1)+"--->"+(j+1)+") Irse por: ("+(i+1)+", "+ruta[i][j]+", "+(j+1)+")\n";
                            
                        }
                    }
                }
            }
        }
        return "La matriz de rutas mas cortos entre los distintos vertices :\n"+cadena+"\n Los distinos caminos mas cortos entre vertices son: \n"+ rutas;
    }
    
    public String rutaR(int i, int k, String[][] rutaAux, String rutaRecorrida){
        if (rutaAux[i][k].equals("")) {
            return "";
        }else{
            rutaRecorrida += rutaR(i,Integer.parseInt(rutaAux[i][k].toString()),rutaAux,rutaRecorrida) + Integer.parseInt(rutaAux[i][k].toString()+1)+", ";
            return rutaRecorrida;
        }
    }
    
}
