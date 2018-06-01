
package libreria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Alan
 */
public class BuscaMinas extends JFrame implements ActionListener{

	Principiante nivelPrincipiante = new Principiante();
	Intermedio nivelIntermedio = new Intermedio(); //Creamos niveles
	Demente nivelDemente = new Demente();
	
    private JMenuBar barra; //Barrita de titulaso bien rico
    private JMenu juego, carita; //El menu de nuestro super juegaso buscaminas y el boton de reinicio/nuevaPartida
    private JMenuItem principiante, intermedio, demente;   //Menu para Niveles 
    private boolean prin=true, inter=false, demen=false;  // Iniciamos siempre con principiante
    
    private String[] archi = {"/libreria/gano.png", "/libreria/perdio.png", "/libreria/nueva.png"}; //tomamos las imagenes para mostrar si gano o perdio
	  
    private ImageIcon[] ima = new ImageIcon[3]; 
    
    public BuscaMinas(){    	
    	for(int i=0;i<3;i++){
            ima[i] = new ImageIcon(getClass().getResource(archi[i]));
        }
    	this.add(nivelPrincipiante); //tomamos el tamaño del arreglo con sus elementos
    	this.setLayout(null);
    	this.setTitle("BuscaMinas (Easter Egg)");        
        barra = new JMenuBar();

        juego = new JMenu("Juego");
        carita = new JMenu(": D");

        principiante = new JMenuItem("Principiante");
        intermedio = new JMenuItem("Intermedio");
        demente = new JMenuItem("Demente");
        //agregamos los items de menu
        juego.add(principiante);
        juego.add(intermedio);
        juego.add(demente);
        //agregado los menu a la barra
        barra.add(juego);
        barra.add(carita);
        //barra agregada al frame
        this.setJMenuBar(barra);
        this.principiante.addActionListener(this);
        this.intermedio.addActionListener(this);
        this.demente.addActionListener(this);

        //propiedades del frame
        setSize(206, 294);        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   
        setIconImage(new ImageIcon(getClass().getResource("icono.png")).getImage());
        setVisible(true);
            }

    public void actionPerformed(ActionEvent e) {        
        if(e.getSource()==demente){
        	nivelDemente.botonD.setIcon(ima[2]);
        	nivelDemente.quitarBotonesDemente();
        	nivelDemente.setVisible(false);            
        	nivelDemente.labelD.setText("");
        	nivelDemente.nuevaPartidaDemente(); //Si el user lord da click en demente ventana principiante se esconde y se muestra demente
        	nivelDemente.setVisible(true);
        	if(prin){        		
        		this.remove(nivelPrincipiante); //aqui remueve principiante y cambia a demente
        		this.add(nivelDemente);
        		prin=false;        		
        		demen=true;
        	}else if(inter){  
        		this.remove(nivelIntermedio); //si no entonces muestra intermedio
        		this.add(nivelDemente);
        		inter=false;
        		demen=true;  
        	}
            setSize(606, 695);            
            setLocationRelativeTo(null);      //Modifica el tamaño del form
        }else if(e.getSource()==intermedio){ 
        	nivelIntermedio.botonI.setIcon(ima[2]);
        	nivelIntermedio.quitarBotonesIntermedio();
        	nivelIntermedio.setVisible(false);            
        	nivelIntermedio.labelI.setText("");
        	nivelIntermedio.nuevaPartidaIntermedio();
        	nivelIntermedio.setVisible(true);
        	if(prin){
        		this.remove(nivelPrincipiante);
        		this.add(nivelIntermedio);
        		prin=false;
        		inter=true; 
        	}else if(demen){
        		this.remove(nivelDemente);
        		this.add(nivelIntermedio);
        		inter=true;
        		demen=false;  
        	}
            setSize(406, 495);
            setLocationRelativeTo(null);  
        }else if(e.getSource()==principiante){        	
        	nivelPrincipiante.botonP.setIcon(ima[2]);
        	nivelPrincipiante.quitarBotonesPrincipiante();
        	nivelPrincipiante.setVisible(false);            
            nivelPrincipiante.labelP.setText("");
            nivelPrincipiante.nuevaPartidaPrincipiante();
            nivelPrincipiante.setVisible(true);
        	if(inter){
        		this.remove(nivelIntermedio);
        		this.add(nivelPrincipiante);
        		inter=false;
        		prin=true; 
        	}else if(demen){ 
        		this.remove(nivelDemente);
        		this.add(nivelPrincipiante);
        		prin=true;
        		demen=false;  
        	}	               
            setSize(206, 294);
            setLocationRelativeTo(null);   
        }
    }    

    public static void main(String[] args) {               
    	BuscaMinas i = new BuscaMinas();
        
        
    }
}
