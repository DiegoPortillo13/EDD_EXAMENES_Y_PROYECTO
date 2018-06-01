
import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author Ariel
 */
public class Dibujitos extends javax.swing.JFrame {

    /**
     * Creates new form Dibujitos
     */
    public Dibujitos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    final int[] aiDatos = new int[60];//Arreglo a dibujar
    public void llenarArr(int[] arr){//Funcion para llenar un arreglo
       for (int i = 0; i < arr.length; i++){
            arr[i]=(int) ((Math.random()*250)+1);//Lo llenamos aleatoriamente, el numero que tome cada valor se representará con el tamaño en el dibujo
        } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Plantilla = new java.awt.Canvas();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Plantilla.setName(""); // NOI18N
        Plantilla.setPreferredSize(new java.awt.Dimension(350, 350));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Plantilla, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Plantilla, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Metodos");

        jMenuItem1.setText("Selection");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Insertion");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Bubble");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Quick");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Merge");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    //Experiemnto fallido para arreglar la sobreposicion del canvas sobre los botones :'v    
    //this.setEnabled(false);
        llenarArr(aiDatos);
        Dibujar(aiDatos);//Dibujamos el arreglo
        SelectionSort(aiDatos);        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        llenarArr(aiDatos);
        Dibujar(aiDatos);
        InsertionSort(aiDatos);        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        llenarArr(aiDatos);
        Dibujar(aiDatos);
        BubbleAsquerosoSort(aiDatos);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        llenarArr(aiDatos);
        Dibujar(aiDatos);
        QuickSort(aiDatos);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        llenarArr(aiDatos);
        Dibujar(aiDatos);
        MergeSort(aiDatos);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dibujitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dibujitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dibujitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dibujitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dibujitos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas Plantilla;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
    private  void Dibujar(int[] arr){
        int n=0;
        
//Se dibuja cada valor del arreglo, recorriendolo con un for
        for (int i = 0; i < arr.length; i++){
            //  .setColor(Color.red) // no se como pintar la linea que se esta moviendo
            Graphics gpDibu = Plantilla.getGraphics();
            gpDibu.setColor(Color.blue);
            n=n+2;//Espacios entre linea
            //las lineas se dibujan juntas para dar la aparencia de una barra
            gpDibu.drawLine(n, Plantilla.getHeight(), n, Plantilla.getHeight()-arr[i]);
            n++;
            gpDibu.drawLine(n, Plantilla.getHeight(), n, Plantilla.getHeight()-arr[i]);
            n++;
            gpDibu.drawLine(n, Plantilla.getHeight(), n, Plantilla.getHeight()-arr[i]);
            n++;
            gpDibu.drawLine(n, Plantilla.getHeight(), n, Plantilla.getHeight()-arr[i]);
        }
    }
    // Estos metodos son los que vimos en clase
    // Solo es necesario que muestre visualmente lo que hace cada uno
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public  void SelectionSort(int[] aiArreglo){
       
        for (int i = 0; i < aiArreglo.length; i++) {//Lista en desorden...
            int iMin = i;
            //Marcar la posición del mas pequeño:
            for (int j = i+1; j < aiArreglo.length; j++) {
                if (aiArreglo[j] < aiArreglo[iMin]) {
                    iMin = j;  
                }         
            }
            //Intercambio con la primer posición de la lista en desorden
            int iTemp = aiArreglo[iMin];
                aiArreglo[iMin] = aiArreglo[i];
                aiArreglo[i] = iTemp;
            try{
                Thread.sleep(100);//Dormir la tarea .1 segundos o algo así
            }catch(Exception e){
                e.printStackTrace();
            }
            Graphics gpDibu = Plantilla.getGraphics();
            gpDibu.clearRect(0, 0, Plantilla.getWidth(), Plantilla.getHeight());
            Dibujar(aiArreglo);
        }
   
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public  void InsertionSort(int[] aiArreglo){   
        for (int i = 0; i < aiArreglo.length; i++) {
            int j = i;
            while (j > 0 && aiArreglo[j] < aiArreglo[j - 1]) {
                int Aux = aiArreglo[j];//Variable auxiliar para no perdr el valos que se es remplazado
                aiArreglo[j] = aiArreglo[j - 1];
                aiArreglo[j - 1] = Aux;
                j--;
                try{
                Thread.sleep(100);//Dormir la tarea .1 segundos o algo así
            }catch(Exception e){
                e.printStackTrace();
            }
            Graphics gpDibu = Plantilla.getGraphics();
            gpDibu.clearRect(0, 0, Plantilla.getWidth(), Plantilla.getHeight());
            Dibujar(aiArreglo);
            }
        }
    }    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public  void BubbleAsquerosoSort(int[] aiArreglo){//YOU HAVE TO AVOID THIS ALGORITHM
        
        for (int k = 0; k < aiArreglo.length-1; k++) {  
            for (int i = 0; i < aiArreglo.length-1; i++) {
                int j = i+1;
                if(aiArreglo[i]>aiArreglo[j]){
                    int temp = aiArreglo[i];
                    aiArreglo[i] = aiArreglo[j];
                    aiArreglo[j] = temp;
                    try{
                Thread.sleep(100);//Dormir la tarea .1 segundos o algo así
            }catch(Exception e){
                e.printStackTrace();
            }
            Graphics gpDibu = Plantilla.getGraphics();
            gpDibu.clearRect(0, 0, Plantilla.getWidth(), Plantilla.getHeight());
            Dibujar(aiArreglo);
                }               
            }
        }
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public  void QuickSort(int[] aiArreglo){
        QuickSort(aiArreglo, 0,aiArreglo.length-1);
        try{
                Thread.sleep(100);//Dormir la tarea .1 segundos o algo así
            }catch(Exception e){
                e.printStackTrace();
            }
            Graphics gpDibu = Plantilla.getGraphics();
            gpDibu.clearRect(0, 0, Plantilla.getWidth(), Plantilla.getHeight());
            Dibujar(aiArreglo);
    }
    public  int[] QuickSort(int[] arre, int ini, int fin){
        int piv;
        Graphics gpDibu = Plantilla.getGraphics();
        //gpDibu.setColor(Color.red);
        if (ini < fin) {
            try{
                Thread.sleep(100);//Dormir la tarea .1 segundos o algo así
            }catch(Exception e){
                e.printStackTrace();
            }
            piv = partition(arre, ini, fin);//Cacular el pivote del arreglo y saber si está o no particionado en varios arreglos
            QuickSort(arre, ini, piv);// Particion izquierda del pivote
            gpDibu.clearRect(0, 0, Plantilla.getWidth(), Plantilla.getHeight());
            Dibujar(arre);
            QuickSort(arre, piv+1, fin);// Particion derecha del pivote
            gpDibu.clearRect(0, 0, Plantilla.getWidth(), Plantilla.getHeight());
            Dibujar(arre);
        }
        
        return arre;
    }
    public  int partition(int[] arre, int ini, int fin){
        int piv, posPiv;
        piv = arre[ini];
        posPiv = ini;
        for (int i = ini+1; i <= fin; i++) {
            if(arre[i]<piv){
            arre[posPiv]= arre[i];
            arre[i]=arre[posPiv+1];
            posPiv++;//Cada que se cambia la posicion del pivote aumenta
            }
        }
        arre[posPiv] = piv;
        return posPiv;
    } 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public  void MergeSort(int [] arr){
        Mergesort(arr);
        Graphics gpDibu = Plantilla.getGraphics();
        gpDibu.clearRect(0, 0, Plantilla.getWidth(), Plantilla.getHeight());
        Dibujar(arr);
    }
    public  int[] Mergesort(int [] list){
        Graphics gpDibu = Plantilla.getGraphics();
        if (list.length <= 1){
            return list;
        }
        int[] first = new int[list.length / 2];
        int[] second = new int[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);
        Mergesort(first);
        Mergesort(second);
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        gpDibu.clearRect(0, 0, Plantilla.getWidth(), Plantilla.getHeight());
        Dibujar(list);
        merge(first, second, list);
        return list;
    }
    private  void merge(int[] first, int[] second, int [] result){
        int iFirst = 0;
        int iSecond = 0;
        int j = 0;
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                result[j] = first[iFirst];
                iFirst++;
                } else {
                result[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        System.arraycopy(first, iFirst, result, j, first.length - iFirst);
        /*for (int i = iFirst; i < (first.length - iFirst); i++) {
            result[i]=first[i];
        }*/
        System.arraycopy(second, iSecond, result, j, second.length - iSecond);
        /*for (int i = iSecond; i < (second.length - iSecond); i++) {
            result[i]=second[i];
        }*/
        
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
