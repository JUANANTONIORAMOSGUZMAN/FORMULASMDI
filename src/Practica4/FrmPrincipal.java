/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica4;

import javax.swing.JOptionPane;

/**
 *
 * @author tesoem
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    private void cerrar(){
        String botones[]={"Cerrar ", "Cancelar "};
        int respuesta = JOptionPane.showOptionDialog(this,"Deseas cerrar la ventana",  "Confirmacion", 0, 0, null, botones, this);
        if(respuesta==JOptionPane.YES_OPTION){
            this.dispose();
        }
    }
    public FrmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        opSuma = new javax.swing.JMenuItem();
        opResta = new javax.swing.JMenuItem();
        opDivision = new javax.swing.JMenuItem();
        opMultiplicacion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        saTerminar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Operaciones");

        opSuma.setText("Suma");
        opSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSumaActionPerformed(evt);
            }
        });
        jMenu1.add(opSuma);

        opResta.setText("Resta");
        opResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRestaActionPerformed(evt);
            }
        });
        jMenu1.add(opResta);

        opDivision.setText("Division");
        opDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opDivisionActionPerformed(evt);
            }
        });
        jMenu1.add(opDivision);

        opMultiplicacion.setText("Multiplicacion");
        opMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opMultiplicacionActionPerformed(evt);
            }
        });
        jMenu1.add(opMultiplicacion);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");

        saTerminar.setText("Terminar");
        saTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saTerminarActionPerformed(evt);
            }
        });
        jMenu2.add(saTerminar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opDivisionActionPerformed
        // TODO add your handling code here:
        FrmDivision frmDivision = new FrmDivision();
        frmDivision.setVisible(true);
        jDesktopPane1.add(frmDivision);
    }//GEN-LAST:event_opDivisionActionPerformed

    private void opMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opMultiplicacionActionPerformed
        // TODO add your handling code here:
        FrmMultiplicacion frmMultiplicacion = new FrmMultiplicacion();
        frmMultiplicacion.setVisible(true);
        jDesktopPane1.add(frmMultiplicacion);
    }//GEN-LAST:event_opMultiplicacionActionPerformed

    private void opSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSumaActionPerformed
        // TODO add your handling code here:
        FrmSuma frmSuma = new FrmSuma();
        frmSuma.setVisible(true);
        jDesktopPane1.add(frmSuma);
    }//GEN-LAST:event_opSumaActionPerformed

    private void opRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRestaActionPerformed
        // TODO add your handling code here:
        FrmResta frmResta = new FrmResta();
        frmResta.setVisible(true);
        jDesktopPane1.add(frmResta);
    }//GEN-LAST:event_opRestaActionPerformed

    private void saTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saTerminarActionPerformed
        // TODO add your handling code here:
        cerrar();
    }//GEN-LAST:event_saTerminarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem opDivision;
    private javax.swing.JMenuItem opMultiplicacion;
    private javax.swing.JMenuItem opResta;
    private javax.swing.JMenuItem opSuma;
    private javax.swing.JMenuItem saTerminar;
    // End of variables declaration//GEN-END:variables
}
