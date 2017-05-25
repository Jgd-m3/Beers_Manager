/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acc_r3_javier_gonzalez;

import acc_r3_javier_gonzalez.bbdd.Calculado;
import acc_r3_javier_gonzalez.bbdd.Join;
import java.util.List;

/**
 * Ventana para la muestra de Selects Predefinidas.
 * @author M3z
 */
public class Selects_Form extends javax.swing.JFrame {

    /**
     * Creates new form Selects_Form
     */
    public Selects_Form() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSub = new javax.swing.JButton();
        btnCalc = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConsultas = new javax.swing.JTextArea();
        lblExp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        btnSub.setText("SubQuery");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        btnCalc.setText("CalculatedField");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtConsultas.setEditable(false);
        txtConsultas.setColumns(20);
        txtConsultas.setRows(5);
        txtConsultas.setTabSize(13);
        jScrollPane1.setViewportView(txtConsultas);

        lblExp.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblExp.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblExp)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed
    
    //Metodo que ejecuta la consulta con campos calculados y la muestra en pantalla
    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        // TODO add your handling code here:
        List<Calculado> lista = Consultas.consultaCalculado();
        txtConsultas.setText(null);
        txtConsultas.append(String.format("Cliente \t|   Cantidad \t|   Cerveza\n"));
        txtConsultas.append(String.format("-----------------------------------------------------------"
                                            + "-----------------------------------------------------------%n"));
        
        for(Calculado aux : lista){
            txtConsultas.append(String.format("%s \t|   %d \t|   %s%n", aux.getNombreCli(),
                                    aux.getSumaCervezas(), aux.getNombreCerv()));
        }
        lblExp.setText("Cliente > Suma de cervezas de la misma marca > marca de cerveza");
    }//GEN-LAST:event_btnCalcActionPerformed
    
    // Metodo que ejecuta la consulta con tablas cruzadas y la muestra en pantalla
    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        List<Join> lista = Consultas.consultaJoin();
        txtConsultas.setText(null);
        txtConsultas.append(String.format("Cliente \t|   Tienda \t|   Cerveza \t|   Cantidad\n"));
        txtConsultas.append(String.format("-----------------------------------------------------------"
                                            + "-----------------------------------------------------------%n"));
        
        for(Join aux : lista){
            txtConsultas.append(String.format("%s \t|   %s \t|   %s \t|   %d%n", aux.getCliente(),
                                    aux.getTienda(), aux.getCerveza(), aux.getCantidad()));
        }
        lblExp.setText("Cliente > tienda > marca de cerveza > cantidad comprada");
    }//GEN-LAST:event_btnSubActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnSub;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblExp;
    private javax.swing.JTextArea txtConsultas;
    // End of variables declaration//GEN-END:variables
}