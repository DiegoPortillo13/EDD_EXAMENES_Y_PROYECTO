
package Grafos;


import static VentanasSec.RutaDeTransporte.jPanel1;
import static VentanasSec.RutaDeTransporte.R_repaint;
import static VentanasSec.RutaDeTransporte.ingresarNodoOrigen;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Ariel
 */
public class Algoritmo_Dijkstra {
   private  Trees arboles;
   private int subTope;
   private Nodo auxi=null;
   private int auxAumulado; // es un acumulado auxiliar
   private int subAcomulado;
   private Nodo nodo[]; 
   private int tope;
   private int permanente;     
   private int nodoFin; 
   
   
    public Algoritmo_Dijkstra (Trees arboles, int tope,int permanente, int nodoFin){//Constructor por defecto para inicializar los datos para poder calcular 
        //la ruta minima
        this.arboles = arboles;//Esto va a ser igual al arbol que se esta usando en la ruta        
        this.tope = tope;//El tope va a ser igual a el tope(numero de nodos que se esta mostrando) que estaen la ruta (n)
        this.nodo= new Nodo[tope]; //Cremos un arreglo para poner comom limite el numero de nodos
        this.permanente = permanente;//Permanete va a ser el origen de la ruta
        this.nodoFin = nodoFin;//Fin será la meta de la ruta
        
    }

    public int getAcumulado(){
        return nodo[nodoFin].getAcumulado(); 
    }
        
    public void dijkstra(){ 
         for (int i = 0; i < tope; i++){  // creamos el vector nodo del tamaño de tope el cual tiene el numero de nodo pintados 
                    nodo[i]= new Nodo(); 
         }
         
        if(permanente != nodoFin){//Si el nodo inicial no es el nodo final, procedemos a pasar al siguiente
             jPanel1.paint(jPanel1.getGraphics());
             R_repaint(tope, arboles);   
             Pintar.clickSobreNodo(jPanel1.getGraphics(), arboles.getCordeX(permanente), arboles.getCordeY(permanente), null,Color.GREEN); // pinta de color GREEN los nodos
            
        
            nodo[permanente].setVisitado(true);        
            nodo[permanente].setNombre(permanente);       
            
            do{            
              subAcomulado=0;//Auxiliar para calcular el limite
              auxAumulado = 20000000; // lo igualamos a esta cifra ya q el acomulado de los nodos, supuestamente  nunca sera mayor 
              nodo[permanente].setEtiqueta(true); 
              for (int j = 0; j < tope; j++) {
                  if(arboles.getmAdyacencia(j, permanente)==1){
                 //Esta condicion sirve para setear el primer nodo en el algoritmo     
                        subAcomulado= nodo[permanente].getAcumulado()+arboles.getmCoeficiente(j, permanente);    
                        //Esta sumatoria nos rive para ir clculando la ruta minima
                        
                        if(subAcomulado <= nodo[j].getAcumulado() && nodo[j].isVisitado()==true && nodo[j].isEtiqueta()== false){
                            nodo[j].setAcumulado(subAcomulado);
                            nodo[j].setVisitado(true);
                            nodo[j].setNombre(j);
                            nodo[j].setPrevio(nodo[permanente]);
                        }
                        
                        else if( nodo[j].isVisitado()==false){
                            nodo[j].setAcumulado(subAcomulado);
                            nodo[j].setVisitado(true);
                            nodo[j].setNombre(j);
                            nodo[j].setPrevio(nodo[permanente]); 
                       }
                 }
              }
              for (int i = 0; i <tope; i++) { // buscamos cual de los nodos visitado tiene el acomulado menor par escogerlo como permanente 
                if(nodo[i].isVisitado()== true && nodo[i].isEtiqueta()== false){
                   if(nodo[i].getAcumulado()<=auxAumulado){
                       permanente= nodo[i].getNombre();
                       //Para poder mover en el arbol
                       auxAumulado= nodo[i].getAcumulado();
                       
                   }
                }               
             }
            subTope++;                
          }while(subTope<tope+1);//El ciclo se repetira hasta que lleguemos al final
            
          auxi= nodo[nodoFin]; 
          
           if(auxi.getPrevio() == null )
            JOptionPane.showMessageDialog(null,"No se Pudo LLegar Al Nodo "+nodoFin);
           
          while(auxi.getPrevio() != null){           
              Pintar.pintarCamino(jPanel1.getGraphics(), arboles.getCordeX(auxi.getNombre()), arboles.getCordeY(auxi.getNombre()), arboles.getCordeX(auxi.getPrevio().getNombre()), arboles.getCordeY(auxi.getPrevio().getNombre()),Color.GREEN);
              //Pintar.clickSobreNodo(jPanel1.getGraphics(), arboles.getCordeX(auxi.getNombre()), arboles.getCordeY(auxi.getNombre()), null,Color.GREEN);
             auxi=auxi.getPrevio();              
          }  
         Pintar.clickSobreNodo(jPanel1.getGraphics(), arboles.getCordeX(nodoFin), arboles.getCordeY(nodoFin), null,Color.GREEN);     
       }
       else Pintar.clickSobreNodo(jPanel1.getGraphics(), arboles.getCordeX(nodoFin), arboles.getCordeY(nodoFin), null,Color.GREEN);    
    }
    
    
 
}
