/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Ventana extends javax.swing.JFrame {

    char []contra;
    String nombre = "Sergio";
    String apellido = "Santos";
    String clave = "200018340";
    String titulo;
    String id;
    Mostrar mi = new Mostrar();
    
    
    
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        this.titulo ="Inicio de Sesion";       
        setSize(425,350);
        setTitle(titulo);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void Validar(){
        char [] contra = txtPassword.getPassword();
        id = "";
        int i;
        for (i = 0; i<contra.length; i++){
            id += (contra[i]);
        }
        if(txtUsuario.getText().equals(nombre) && clave.equals(id))
            
            MostrarInfo();   
        else    
        JOptionPane.showMessageDialog(null, "Por favor, introduzca credenciales validas");
    }
    public void MostrarInfo(){
        mi.setVisible(true);
        mi.txtRecibeUsuario.setText(nombre+ " "+apellido);
        mi.txtRecibePass.setText(clave);
        
    }      
    public void Borrar(){
        txtUsuario.setText(" ");
        txtPassword.setText("");
    }
    public void Salir(){
        System.exit(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPassword = new javax.swing.JPasswordField();
        btnAceptar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(txtPassword);
        txtPassword.setBounds(210, 180, 103, 19);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar);
        btnAceptar.setBounds(40, 250, 90, 25);

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar);
        btnBorrar.setBounds(160, 250, 90, 25);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(270, 250, 100, 25);

        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 140, 90, 20);

        jLabel2.setText("Contrase??a:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 180, 120, 20);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(210, 140, 100, 19);

        lblImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Captura.PNG"))); // NOI18N
        lblImagen.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                lblImagenComponentAdded(evt);
            }
        });
        getContentPane().add(lblImagen);
        lblImagen.setBounds(140, 10, 120, 110);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        Borrar();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        Salir();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        Validar();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void lblImagenComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_lblImagenComponentAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lblImagenComponentAdded

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
