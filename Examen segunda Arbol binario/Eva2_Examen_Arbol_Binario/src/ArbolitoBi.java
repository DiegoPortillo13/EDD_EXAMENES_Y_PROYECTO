
import javax.swing.JOptionPane;

/**
 *
 * @author Ariel
 */
public class ArbolitoBi {
    private NodoBi nRoot;
    private boolean seEncuentra;
    
    public ArbolitoBi() {
        nRoot = null;
    }

    public ArbolitoBi(NodoBi root) {
        this.nRoot = root;
    }
    
    public void agregarNodo(NodoBi nNuevo) throws Exception{
        if (nRoot == null) {
           nRoot = nNuevo; 
        }else{
            agregarNodoRecur(nNuevo, nRoot);
        }
    }
    
    private void agregarNodoRecur(NodoBi nNuevo, NodoBi nActual) throws Exception{
        if (nNuevo.getiDato()> nActual.getiDato()) {//Mayor y va a la derecha
            if (nActual.getnSig() == null) {//Verificamos si el lado derecho esta vacío
                nActual.setnSig(nNuevo);
            }else{//No esta vavio, a volver a llamar esta fucnción
                agregarNodoRecur(nNuevo,nActual.getnSig());
            }
            }else if(nNuevo.getiDato() < nActual.getiDato()){//Menor y va a la izquierda
                if (nActual.getnPrev() == null) {//Verificamos si el lado izquierdo esta vacío
                nActual.setnPrev(nNuevo);
            }else{//No esta vavio, a volver a llamar esta fucnción
                agregarNodoRecur(nNuevo,nActual.getnPrev());
            }
        }else{
            System.out.println("Ta bien wey, no acepto valores repetidos");
            //throw new Exception("Ta bien wey, no acepto valores repetidos");
        }
        
        
    }
    
    
    public void imprimirPreOrdden(){
        preOrden(nRoot);
    }
    
    public void imprimirInOrden(){
        inOrden(nRoot);
    }
    
    public void imprimirPost(){
        postOrden(nRoot);
    }
    
    private void preOrden(NodoBi nActual){
        if (nActual != null) {
            System.out.print(nActual.getiDato() + " - ");
            preOrden(nActual.getnPrev()); //Lado izquierdo
            preOrden(nActual.getnSig()); //Lado erecho
        }

    }

    private void inOrden(NodoBi nActual){
        if (nActual != null) {
            inOrden(nActual.getnPrev()); //Lado izquierdo
            System.out.print(nActual.getiDato() + " - ");
            inOrden(nActual.getnSig()); //Lado erecho
           
        } 
    }
     
    private void postOrden(NodoBi nActual){
        if (nActual != null) {
            postOrden(nActual.getnPrev()); //Lado izquierdo
            postOrden(nActual.getnSig()); //Lado erecho
            System.out.print(nActual.getiDato() + " - ");
            
           
        }
    }
    
    public boolean buscar(int iVal){
        seEncuentra = false;
            if(buscarEn(nRoot,iVal)){
                seEncuentra=true;
            }
            return seEncuentra;        
    }
    
    private  boolean buscarEn(NodoBi nActual, int iVal) {
        seEncuentra = false;
          if (nActual != null) {
              if (nActual.getiDato()== iVal) {//Si es igual...
                  //System.out.println("Nodo encontrado: " + nActual.getiDato());//Tiene que regresar true si lo encuentra...
                  seEncuentra = true;
                  
              }else{//si no es igual...
            if(nActual.getiDato()<iVal){//Derecha
                buscarEn(nActual.getnSig(),iVal);
            }else{//Izquierda
                buscarEn(nActual.getnPrev(),iVal);
            }
            }

        }
        return seEncuentra;
        
    }
    int[] aiTemp;
    int cont=0;
    private int[] exportarL(NodoBi nActual){
        
        int a;//Se puede remover
        if (nActual != null) {
            
            exportarL(nActual.getnPrev()); //Lado izquierdo            
            a =(nActual.getiDato());
            aiTemp[cont]=a;
            cont++;
            exportarL(nActual.getnSig()); //Lado erecho
            
        }
        //System.out.println(""+aiTemp.length);
        /*for (int i : aiTemp) {
            System.out.println("["+i+"]");
        }*/
        return aiTemp;
        
    }
    public void exp(int tam, Lista_Doble lsd){
        
        aiTemp= new int[tam];
        exportarL(nRoot);
        //System.out.println(""+tam);
        /*for (int i : aiTemp) {
            System.out.print("["+i+"] ");
        }*/
        for (int i = 0; i < aiTemp.length; i++) {
            lsd.add(new NodoBi(aiTemp[i]));
        }
    }
}
