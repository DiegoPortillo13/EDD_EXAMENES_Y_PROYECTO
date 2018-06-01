package VentanasSec;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ariel
 */
public class Transporte extends javax.swing.JFrame {

   
    public Transporte() {
        initComponents();
        this.setLocationRelativeTo(null);
        panelOc.setVisible(false); 
        lblResultado.setVisible(false);
        jTable1.setVisible(false);
       
    }

    int Nro_Origen = 0, Nro_Destino = 0;
    int contador = 0, contadorAux = 0;
    ArrayList<Object> array = new ArrayList<Object>();
    
    
    
    public boolean campoVacio(JTextField... textFields) { //Éste método me ayuda a ver que campo está vacio
        for (JTextField textField : textFields) {
            if (textField.getText().isEmpty()) {
                return true;
            }
        }
        return false;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelOc = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableSolucion = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panel = new javax.swing.JPanel();
        txtOrigenes = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDestinos = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jbtnSol = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText(" Despues de presionar aceptar, procura\n llenar todas las casillas de la tabla\n correspondiente\n");
        jScrollPane2.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Problemas De Transporte");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/camion-de-reparto_318-61634.jpg"))); // NOI18N

        jTableSolucion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableSolucion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "A", "B", "C", "D"
            }
        ));
        jTableSolucion.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(jTableSolucion);

        javax.swing.GroupLayout panelOcLayout = new javax.swing.GroupLayout(panelOc);
        panelOc.setLayout(panelOcLayout);
        panelOcLayout.setHorizontalGroup(
            panelOcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        panelOcLayout.setVerticalGroup(
            panelOcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "A", "B", "C", "D"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setText("Origenes");

        jLabel5.setText("Destinos");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDestinos, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(txtOrigenes))
                .addGap(18, 18, 18)
                .addComponent(btnAceptar)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOrigenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDestinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAceptar)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jbtnSol.setText("Obtener la solucion");
        jbtnSol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSolActionPerformed(evt);
            }
        });

        lblResultado.setBackground(new java.awt.Color(255, 255, 204));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/logoITCH2.jpg"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Esquina Noroeste");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelOc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnSol, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)))
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnSol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelOc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        jTable1.setVisible(true);
        txtOrigenes.getText();
        txtDestinos.getText();
        if(campoVacio(txtOrigenes,txtDestinos)){
            JOptionPane.showMessageDialog(null, " Por favor llena los campos que te falten ", "Faltan Datos", JOptionPane.ERROR_MESSAGE);
        }else{
            Nro_Origen = Integer.parseInt(txtOrigenes.getText());
            Nro_Destino = Integer.parseInt(txtDestinos.getText());
            DefaultTableModel modelo = new DefaultTableModel();//Aquí creo la tabla para que el usuario la vea y no tener que hacer un cliclo todo feo
            modelo.setRowCount(Nro_Origen + 1);//Esta funcion me ayuda a establecer la contar las fillas
            modelo.setColumnCount(Nro_Destino + 2);//establecer las columnas

            int i = 0;
            if (contador > 0) {
                array.clear();
            }
            array.add("");
            while (i < Nro_Destino) {
                array.add("X" + (i + 1));//Los respectivos destinos
                i++;
            }
            array.add("Total_Oferta");//Ofertas de cada origen

            for (i = 0; i < Nro_Origen; i++) {
                modelo.setValueAt("Y" + (i + 1), i, 0);//Destinos de la mercancia
            }
            modelo.setValueAt("Total_Demanda", Nro_Origen, 0);//la demanda de cada destino
            modelo.setColumnIdentifiers(array.toArray());
            contador++;
            //-------------------------
            jTable1.setModel(modelo);//Establesco el modelo en la tabla
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jbtnSolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSolActionPerformed
        panelOc.setVisible(true);
        lblResultado.setVisible(true);

        //Busco hacer funciones para obtimizar el codigo y hacerlo mas entendible..... pendiente

        try {
            int Matriz[][], Matriz_Aux[][];
            char Orientacion = ' ';
            int i = 0, j = 0, Sx = 0, Sy = 0, resta = 0;
            Matriz = new int[Nro_Origen + 1][Nro_Destino + 1];
            Matriz_Aux = new int[Nro_Origen + 1][Nro_Destino + 1];
            for (int v = 0; v < (Nro_Origen + 1); v++) {
                for (int h = 0; h < (Nro_Destino + 1); h++) {
                    Matriz[v][h] = Integer.parseInt(jTable1.getValueAt(v, h + 1).toString());//----------
                    Matriz_Aux[v][h] = 0;
                }
            }
            //----------------------
            int Suma_x = 0, Suma_y = 0, total = 0;
            if (contadorAux == 1) {
                array.remove(Nro_Destino + 1);
                contadorAux = 0;
            }
            for (int h = 0; h < Nro_Destino; h++) {
                Suma_x += Matriz[Nro_Origen][h];
            }
            for (int v = 0; v < Nro_Origen; v++) {
                Suma_y += Matriz[v][Nro_Destino];
            }
            //-------------------
            if (Matriz[Nro_Origen][0] == Matriz[0][Nro_Destino]) {
                Orientacion = 'A';
                Matriz_Aux[0][0] = Matriz[Nro_Origen][0];
                i++;
                j++;
            } else if (Matriz[Nro_Origen][0] < Matriz[0][Nro_Destino]) {
                Orientacion = 'B';
                Matriz_Aux[0][0] = Matriz[Nro_Origen][0];
                Sx = Matriz[Nro_Origen][0];
                j++;
            } else {
                Orientacion = 'C';
                Matriz_Aux[0][0] = Matriz[0][Nro_Destino];
                Sy = Matriz[0][Nro_Destino];
                i++;
            }
            //
            while (i < Nro_Origen && j < Nro_Destino) {
                switch (Orientacion) {
                    case 'B':
                    resta = Matriz[i][Nro_Destino] - Sx;
                    if (resta == Matriz[Nro_Origen][j]) {
                        Orientacion = 'A';
                        Matriz_Aux[i][j] = resta;
                        Sx = 0;
                        Sy = 0;
                        i++;
                        j++;
                    } else if (resta < Matriz[Nro_Origen][j]) {
                        Orientacion = 'C';
                        Matriz_Aux[i][j] = resta;
                        Sy += resta;
                        Sx = 0;
                        i++;
                    } else {
                        Orientacion = 'B';
                        Matriz_Aux[i][j] = Matriz[Nro_Origen][j];
                        Sx += Matriz[Nro_Origen][j];
                        Sy = 0;
                        j++;
                    }
                    break;
                    case 'C':
                    resta = Matriz[Nro_Origen][j] - Sy;
                    if (resta == Matriz[i][Nro_Destino]) {
                        Orientacion = 'A';
                        Matriz_Aux[i][j] = resta;
                        Sx = 0;
                        Sy = 0;
                        i++;
                        j++;
                    } else if (resta < Matriz[i][Nro_Destino]) {
                        Orientacion = 'B';
                        Matriz_Aux[i][j] = resta;
                        Sx += resta;
                        Sy = 0;
                        j++;
                    } else {
                        Orientacion = 'C';
                        Matriz_Aux[i][j] = Matriz[i][Nro_Destino];
                        Sy += Matriz[i][Nro_Destino];
                        Sx = 0;
                        i++;
                    }

                    break;
                    case 'A':
                    if (Matriz[Nro_Origen][j] == Matriz[i][Nro_Destino]) {
                        Orientacion = 'A';
                        Matriz_Aux[i][j] = Matriz[i][Nro_Destino];
                        Sx = 0;
                        Sy = 0;
                        i++;
                        j++;
                    } else if (Matriz[Nro_Origen][j] < Matriz[i][Nro_Destino]) {
                        Orientacion = 'B';
                        Matriz_Aux[i][j] = Matriz[Nro_Origen][j];
                        Sx = Matriz[Nro_Origen][j];
                        Sy = 0;
                        j++;
                    } else {
                        Orientacion = 'C';
                        Matriz_Aux[i][j] = Matriz[i][Nro_Destino];
                        Sy = Matriz[i][Nro_Destino];
                        Sx = 0;
                        i++;
                    }
                    break;
                    
                    
                }
            }
            //----------------------

            DefaultTableModel modeloSolucion = new DefaultTableModel();

            if (Suma_x == Suma_y) {

                modeloSolucion.setRowCount(Nro_Origen + 1);
                modeloSolucion.setColumnCount(Nro_Destino + 2);
                Matriz[Nro_Origen][Nro_Destino] = Suma_x;
                total = Suma_x;
                contadorAux = 0;

            } else if (Suma_x < Suma_y) {

                modeloSolucion.setRowCount(Nro_Origen + 1);
                modeloSolucion.setColumnCount(Nro_Destino + 3);
                array.add(Nro_Destino + 1, "Colum_Ficticia");
                Matriz[Nro_Origen][Nro_Destino] = Suma_y - Suma_x;
                total = Suma_y;
                contadorAux = 1;

            } else {

                modeloSolucion.setRowCount(Nro_Origen + 2);
                modeloSolucion.setColumnCount(Nro_Destino + 2);
                Matriz[Nro_Origen][Nro_Destino] = Suma_x - Suma_y;
                total = Suma_x;
                contadorAux = 2;

            }

            modeloSolucion.setColumnIdentifiers(array.toArray());

            //-----------------------

            for (int v = 0; v < (Nro_Origen + 1); v++) {
                modeloSolucion.setValueAt("Y" + (v + 1), v, 0);
                for (int h = 0; h < (Nro_Destino + 1); h++) {
                    modeloSolucion.setValueAt(Matriz_Aux[v][h], v, h + 1);//----
                }
            }
            modeloSolucion.setValueAt("Total_Demanda", Nro_Origen, 0);

            //------------------------------------------------------------------------------------
            
            if (contadorAux == 2) {
                modeloSolucion.setValueAt("Fila_Ficticia", modeloSolucion.getRowCount() - 2, 0);
                modeloSolucion.setValueAt("Total_Demanda", modeloSolucion.getRowCount() - 1, 0);
            }
            if (contadorAux == 0) {
                modeloSolucion.setValueAt("Y" + (modeloSolucion.getRowCount() - 1), modeloSolucion.getRowCount() - 2, 0);
            }
            for (int k = 0; k < modeloSolucion.getColumnCount() - 2; k++) {
                modeloSolucion.setValueAt(Matriz[Nro_Origen][k], modeloSolucion.getRowCount() - 1, k + 1);
            }
            for (int h = 0; h < modeloSolucion.getRowCount() - 1; h++) {
                modeloSolucion.setValueAt(Matriz[h][Nro_Destino], h, modeloSolucion.getColumnCount() - 1);
            }
            //JOptionPane.showMessageDialog(this, Suma_x + ", " + Suma_y);//Mensaje para mostrar que esta balanceado o no lo esta

            modeloSolucion.setValueAt(total, modeloSolucion.getRowCount()-1, modeloSolucion.getColumnCount()-1);

            //--------------
            jTableSolucion.setModel(modeloSolucion);

            // REALIZANDO LAS OPERACIONES DESPUES DE EQUILIBRAR
            int suma = 0;
            for (int k = 0; k < Nro_Origen; k++) {
                for (int l = 0; l < Nro_Destino; l++) {
                    suma += Matriz[k][l] * Matriz_Aux[k][l];
                }
            }

            lblResultado.setText("El resultado de este problema es: "+ suma);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
        }
    }//GEN-LAST:event_jbtnSolActionPerformed

   
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
            java.util.logging.Logger.getLogger(Transporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableSolucion;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbtnSol;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelOc;
    private javax.swing.JTextField txtDestinos;
    private javax.swing.JTextField txtOrigenes;
    // End of variables declaration//GEN-END:variables
}
