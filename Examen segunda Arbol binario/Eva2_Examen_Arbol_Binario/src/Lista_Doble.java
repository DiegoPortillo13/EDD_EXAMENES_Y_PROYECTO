

/**
 *
 * @author Ariel
 */
public class Lista_Doble {
    private NodoBi nIni;//Nodo que almacena el inicio de la lista
    private NodoBi nFin;
    private int iCont;

    public Lista_Doble() {
        nIni = null;
        nFin = null;
        iCont = 0;
    }
    
    public Lista_Doble(NodoBi nNodo) {
        this.nIni = nNodo;
        this.nFin = nNodo;
        iCont = 1;
    }
    
    public void add(NodoBi nNodo){
        //La lista esta vacia
        if(nIni == null){
            nIni = nNodo;
            nFin = nNodo;
        }else{
            
            nFin.setnSig(nNodo);
            nNodo.setnPrev(nFin);
            nFin = nNodo;
        }
        iCont++;//Cada vez que agreguemos un nodo iCont aumenta
    }
    public void printList(){//Impimiendo hacia adelante
        NodoBi nTemp = nIni;
        while(nTemp != null){
            System.out.print(nTemp.getiDato()+ " - ");
            nTemp = nTemp.getnSig();
        }
    }
    public void printListBack(){//Impimiendo en  orden inverso
        NodoBi nTemp = nFin;
        while(nTemp != null){
            System.out.print(nTemp.getiDato()+ " - ");
            nTemp = nTemp.getnPrev();
        }
    }
    //Implementar todo lo de la practica pasada
    public boolean isEmpty(){
        if(nIni != null){
            return false;//Hay nodos en la lista
        }else{
            return true;//No hay  nodos en la lista
        }
            
    }
    public void clear(){
        nIni = null;//Solo tenemos que desconectar el primer elemento
        nFin = null;//Tambien el final lo tenemos que desconectar
        
    }
    
    public int count(){
        
        
         return iCont;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void insertAt(NodoBi nNodo, int iPos) throws Exception{//No cambiamos datos; cambiamos direcciones de memoria
        //Analizar los casos
        
        if(iPos < 0){//No se pueden insertar en valores negativos
            
            throw new Exception("No se puede agregar un nodo en una posició negativa");
            
        }else if(iPos>count()){//Si queremos insertar en una posicion mayor al tamaño de la lista
            
            throw new Exception("No se puede agregar un nodo en una posició mayor que el tamaño de la lista");
            
        }else if(iPos == 0){//Se quiere agregar al inicio de la lista
                    nNodo.setnSig(nIni);//Nuevo nodo.sig = nIni
                    nIni = nNodo;
                    
                    }
        else{//Error lógico requiere revisión y asignar los .previos correspondientes
                        NodoBi nTemp = nIni;
                        for (int i = 0; i < (iPos-1); i++) {
                            nTemp = nTemp.getnSig();    
                        }
                        nNodo.setnSig(nTemp.getnSig());
                        nTemp.getnSig().setnPrev(nNodo);
                        
                        nTemp.setnSig(nNodo);
                        nNodo.setnPrev(nTemp);
                        
                        
                       
        }
        iCont++;      
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public int getValueAt(int iPos) throws Exception{
        if(iPos < 0){//No se pueden insertar en valores negativos
            
            throw new Exception("No se puede leer un nodo en una posició negativa");
            
        }else if(iPos>count()){//Si queremos insertar en una posicion mayor al tamaño de la lista
            
            throw new Exception("No se puede leer un nodo en una posició mayor que el tamaño de la lista");
            
        }else{
        
                        NodoBi nTemp = nIni;
                        for (int i = 0; i < iPos; i++) {
                            nTemp = nTemp.getnSig();
                            
                        }
                        return nTemp.getiDato();
                        
        }     
                        
    }
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
    //Encontrar un elemento (devolver su posicion)
    public int find(int iVal){
        int iResu=-1;
        //Buscar el elemento
        int iPos=0;
        
         NodoBi nTemp = nIni;
         
        while(nTemp != null){
            
            if(nTemp.getiDato()== iVal){
                iResu = iPos;
                break;
                
            }
            nTemp = nTemp.getnSig();
            iPos++;
        }
        return iResu;
    }
    
    public void removeAt(int iPos) throws Exception{
        if(iPos < 0){//No se pueden insertar en valores negativos            
            throw new Exception("No se puede borrar un nodo en una posició negativa");           
        }else if(iPos>=count()){//Si queremos insertar en una posicion mayor al tamaño de la lista           
            throw new Exception("No se puede borrar un nodo en una posició mayor que el tamaño de la lista");  
        }else{//Aqui si se puede borrar
            if ((iPos==0)&&count()==1) {
                nIni=null;
                nFin=null;
            }else{
                NodoBi nTemp = nIni;
            for (int i = 0; i < (iPos-1); i++) {
                nTemp=nTemp.getnSig();  
            }
            nTemp.getnSig().setnPrev(nTemp.getnSig().getnPrev());
            nTemp.setnSig(nTemp.getnSig().getnSig());
            
                if (nTemp.getnSig()==null) {//Si borramos el último nodo de la lista
                    nFin= nTemp;
                }
                iCont--;//Si borramo un nodo, decrementamo el numero de nodos
            }
            //Error lógico
            
        }
    }
}
