

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class BajasAlumnos extends javax.swing.JFrame {
  Conexion mysql = new Conexion();
    /**
     * Creates new form BajasAlumnos
     */
    public BajasAlumnos() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        cargarTabla(""); //Se carga de esta manera para poder mostrar todos los alumnos registrados
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
     public void cargarTabla(String cad){
     //se envia la tabla y se indica lo que se desea filtrar
      mysql.cargarTablaAlumnos(tableBajasAlumnos,cad);
     
      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCadenaBajasAlumnos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBajasAlumnos = new javax.swing.JTable();
        btnDarBaja = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bajas de Alumnos");

        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Ingrese nombres, apellido paterno y apellido materno del alumno que va a dar de baja.");

        txtCadenaBajasAlumnos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCadenaBajasAlumnosKeyReleased(evt);
            }
        });

        tableBajasAlumnos.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tableBajasAlumnos);
        tableBajasAlumnos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnDarBaja.setForeground(new java.awt.Color(0, 51, 255));
        btnDarBaja.setText("Dar de baja");
        btnDarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarBajaActionPerformed(evt);
            }
        });

        btnSalir.setForeground(new java.awt.Color(0, 51, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnReset.setForeground(new java.awt.Color(0, 51, 255));
        btnReset.setText("Resetear tabla");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btnDarBaja)
                        .addGap(132, 132, 132)
                        .addComponent(btnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(txtCadenaBajasAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnReset))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCadenaBajasAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDarBaja)
                    .addComponent(btnSalir))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarBajaActionPerformed
         int confirma = JOptionPane.showConfirmDialog(rootPane,"¿Estás seguro de querer dar de baja a este alumno?",
                                     "Actividad Complementaria",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
      if(JOptionPane.OK_OPTION==confirma){
        int fila = tableBajasAlumnos.getSelectedRow();
        if(fila>=0){
           mysql.eliminarRegistroAlumno(tableBajasAlumnos,fila);
        }else{
          JOptionPane.showMessageDialog(null,"Debe seleccionar una fila");
        }
      
       }
       else if(JOptionPane.NO_OPTION==confirma){
        return;   
       }
    }//GEN-LAST:event_btnDarBajaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //Salir
        int confirma = JOptionPane.showConfirmDialog(rootPane,"¿Estás seguro que deseas salir?,AMADEO COPORO QUINTANA,DS-DPO2-2102-B1-001",
                                     "Actividad Complementaria",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
      if(JOptionPane.OK_OPTION==confirma){
        this.dispose();
      
       }
       else if(JOptionPane.CANCEL_OPTION==confirma){
        return;   
       }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtCadenaBajasAlumnosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCadenaBajasAlumnosKeyReleased
        //Se envia al metodo lo que se quiere filtrar
        cargarTabla(txtCadenaBajasAlumnos.getText());
    }//GEN-LAST:event_txtCadenaBajasAlumnosKeyReleased

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        //Con esto se quitan los valores del cuadro de texto y se vuelven a poner los registros 
        cargarTabla("");
        txtCadenaBajasAlumnos.setText(null); 
    }//GEN-LAST:event_btnResetActionPerformed
   
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
            java.util.logging.Logger.getLogger(BajasAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BajasAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BajasAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BajasAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BajasAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDarBaja;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableBajasAlumnos;
    private javax.swing.JTextField txtCadenaBajasAlumnos;
    // End of variables declaration//GEN-END:variables
}
