
/**
 *
 * @author Ariel
 */
public class NodoBi {
     //Atributos: 1 dato a almacenar; 2 enlace al siguiente o anterior nodo
    private int iDato;//Generalmente solo cambia el tipo de dato
    private NodoBi nSig;
    private NodoBi nPrev;

    public void setnPrev(NodoBi nPrev) {
        this.nPrev = nPrev;
    }

    public NodoBi getnPrev() {
        return nPrev;
    }

    public NodoBi() {
        this.nSig = null;
        this.nPrev = null;
    }

    public NodoBi(int iDato) {
        this.iDato = iDato;
        this.nSig = null;
        this.nPrev = null;
    }
    
    
    
    public NodoBi(int iDato, NodoBi nSig, NodoBi nPrev) {
        this.iDato = iDato;
        this.nSig = nSig;
        this.nPrev = nPrev;
    }

    public int getiDato() {
        return iDato;
    }

    public void setnSig(NodoBi nSig) {
        this.nSig = nSig;
    }

    public void setiDato(int iDato) {
        this.iDato = iDato;
    }
    
    public NodoBi getnSig() {
        return nSig;
    }
}
