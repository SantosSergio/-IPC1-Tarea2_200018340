/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class Mostrar extends javax.swing.JFrame {

    /**
     * Creates new form Mostrar
     */
    String titu = "Informacion de Usuario";
    public Mostrar() {
        initComponents();
        this.titu = titu;       
        setSize(425,350);
        setTitle(titu);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRecibeUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRecibePass = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(400, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido!!");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 40, 180, 15);

        jLabel2.setText("Usuario: ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 80, 70, 20);

        txtRecibeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecibeUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtRecibeUsuario);
        txtRecibeUsuario.setBounds(150, 80, 140, 19);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Inicio de sesion exitoso!!");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(64, 130, 250, 30);

        jLabel4.setText("Su Password es:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 200, 100, 20);

        txtRecibePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecibePassActionPerformed(evt);
            }
        });
        jPanel1.add(txtRecibePass);
        txtRecibePass.setBounds(170, 200, 140, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 380, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRecibeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecibeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecibeUsuarioActionPerformed

    private void txtRecibePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecibePassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecibePassActionPerformed

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
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mostrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField txtRecibePass;
    public static javax.swing.JTextField txtRecibeUsuario;
    // End of variables declaration//GEN-END:variables
}
