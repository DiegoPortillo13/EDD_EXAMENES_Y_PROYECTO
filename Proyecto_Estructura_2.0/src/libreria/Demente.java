package libreria;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Alan
 */
public class Demente extends JPanel implements ActionListener{
	private int casillasFaltantes = 0, minas3 = 30;
	int valoresDemente[][] = new int[minas3][minas3];
	public JLabel labelD;	//Definiendo arreglos y minas que habra
	private JButton botonesDemente[][] = new JButton[minas3][minas3];
	public JButton botonD;
	
	public String[] archi = {"/libreria/gano.png", "/libreria/perdio.png", "/libreria/nueva.png"};
	private String archivos[] = {"/libreria/0.PNG", "/libreria/1.PNG", "/libreria/2.PNG", "/libreria/3.PNG", "/libreria/4.PNG", "/libreria/5.PNG", "/libreria/6.PNG", "/libreria/7.PNG", "/libreria/8.PNG", "/libreria/9.PNG"};
	
	private ImageIcon[] imagenes = new ImageIcon[10];    // tomando imagenes para la interfas
	public ImageIcon[] ima = new ImageIcon[3];   
    
    private boolean visibleDemente[][] = new boolean[minas3][minas3];
	

	public Demente() {
		this.setLayout(null);//Creamos el primer layout, vacio
		for(int i=0;i<3;i++){
            ima[i] = new ImageIcon(getClass().getResource(archi[i]));//Creamos la imagen en cada posicion del arreglo
        }
		nuevaPartidaDemente();     //Nueva partida   
		this.setSize(600, 640);//Creamos el tamaño del frame    
		botonD = new JButton();//Nuevo boton
		botonD.setBounds(286, 5, 30, 30);//Forma el primer rectangulo para despues dividirlo ("caber")
        botonD.setIcon(ima[2]); //Aqui los botones toman forma de la imagen correspondiente.               
        this.add(botonD);
        this.botonD.addActionListener(this);//
		labelD = new JLabel();
		labelD.setBounds(15, 15, 60, 15);
		this.add(labelD);
	}
	
	public void nuevaPartidaDemente(){
        casillasFaltantes = 0;        
        ponerBotonesDemente();
        verDemente(false);
        ponerMinasDemente();
        contornoDemente();
        visualizarMinasDemente();
        eventosDemente();
    }
	
	public void ponerBotonesDemente(){               
        
        for(int i=0;i<10;i++){
            imagenes[i] = new ImageIcon(getClass().getResource(archivos[i]));
        }
        
        for(int f = 0; f<minas3; f++){
        for(int c = 0; c<minas3; c++){
            botonesDemente[f][c] = new JButton();
            botonesDemente[f][c].setBounds(20*f, 20*c+40,20, 20);
            botonesDemente[f][c].setBackground(Color.gray);            
            this.add(botonesDemente[f][c]);
        }
        }        
    }
	
	public void ponerMinasDemente(){
        for(int f=0;f<minas3;f++){
        for(int c=0;c<minas3;c++){
            valoresDemente[f][c]=0;
        }
        }
           int f1, c1;
        for ( int i=0;i<3*minas3;i++){
            do{
                f1=(int)(Math.random()*minas3);
                c1=(int)(Math.random()*minas3);
            }while(valoresDemente[f1][c1]!=0);
            valoresDemente[f1][c1]=9;
        }
    }
	
	public void contornoDemente(){
        for(int f=0;f<minas3;f++){
            for(int c=0;c<minas3;c++){
                if(valoresDemente[f][c]==9){
                    for(int f2=f-1;f2<=f+1;f2++){
                        for(int c2=c-1;c2<=c+1;c2++){
                            if(f2>=0 && f2<minas3 && c2>=0 && c2<minas3 && valoresDemente[f2][c2]!=9)
                                valoresDemente[f2][c2]++;
                        }
                      }
                   }
                }
            }
        }
	
	public void verDemente(boolean valor){
        for(int f=0;f<minas3;f++){
        for(int c=0;c<minas3;c++){
            visibleDemente[f][c]=valor;
        }
        }
    }
	
	public void pulsarBotonVasDemente(int f, int c){
        if(f>=0 && f<minas3 && c>=0 && c<minas3 && visibleDemente[f][c]==false){
            if(visibleDemente[f][c]==false){
                visibleDemente[f][c]=true;
                if(valoresDemente[f][c]==9){
                    verDemente(true);
                    JOptionPane.showMessageDialog(null, "              PERDISTE");
                    botonD.setIcon(ima[1]);}
            else if(visibleDemente[f][c]==true){
                casillasFaltantes++;
                if (casillasFaltantes == 810){
                    verDemente(true);
                    JOptionPane.showMessageDialog(null, "              GANASTE");
                    botonD.setIcon(ima[0]);
                    labelD.setText("");
                }
                labelD.setText(casillasFaltantes+"/810");
            }
            }
            if(valoresDemente[f][c]==0){
                pulsarBotonVasDemente(f, c-1);
                pulsarBotonVasDemente(f, c+1);
                pulsarBotonVasDemente(f-1, c);
                pulsarBotonVasDemente(f+1, c);
                
            }
        }
    }
	
	public void pulsarBotonDemente(int f, int c) {
        pulsarBotonVasDemente(f,c);
        visualizarMinasDemente();
    }
	
	public void eventosDemente(){
        for(int f=0;f<minas3;f++){
        for(int c=0;c<minas3;c++){
            botonesDemente[f][c].addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    for(int f=0;f<minas3;f++){
                    for(int c=0;c<minas3;c++){
                        if(e.getSource()==botonesDemente[f][c])
                            pulsarBotonDemente(f,c);
                    }
                    }
                }
                }
            );
        }
        }
    }
	
	public void visualizarMinasDemente(){
        for(int f=0;f<minas3;f++){
        for(int c=0;c<minas3;c++){
         if(visibleDemente[f][c]==false){
           botonesDemente[f][c].setText("");
         }else if(visibleDemente[f][c]==true){
           if(valoresDemente[f][c]==0){
           botonesDemente[f][c].setIcon(imagenes[0]);
           }else if(valoresDemente[f][c]==1){
           botonesDemente[f][c].setIcon(imagenes[1]);
           }else if(valoresDemente[f][c]==2){
           botonesDemente[f][c].setIcon(imagenes[2]);
           }else if(valoresDemente[f][c]==3){
           botonesDemente[f][c].setIcon(imagenes[3]);
           }else if(valoresDemente[f][c]==4){
           botonesDemente[f][c].setIcon(imagenes[4]);
           }else if(valoresDemente[f][c]==5){
           botonesDemente[f][c].setIcon(imagenes[5]);
           }else if(valoresDemente[f][c]==6){
           botonesDemente[f][c].setIcon(imagenes[6]);
           }else if(valoresDemente[f][c]==7){
           botonesDemente[f][c].setIcon(imagenes[7]);
           }else if(valoresDemente[f][c]==8){
           botonesDemente[f][c].setIcon(imagenes[8]);
           }else if(valoresDemente[f][c]==9)
           botonesDemente[f][c].setIcon(imagenes[9]);
          }
        }
       }
   }
	
	public void quitarBotonesDemente(){
        for(int f1 = 0; f1<minas3; f1++){
               for(int c1 = 0; c1<minas3; c1++){
                   this.remove(botonesDemente[f1][c1]);
               }
        }
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==botonD){
			botonD.setIcon(ima[2]);
            quitarBotonesDemente();
            this.setVisible(false);            
            labelD.setText("");
			nuevaPartidaDemente();
			this.setVisible(true);
		}		
	}
}
