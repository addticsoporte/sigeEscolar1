
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class AltasAlumnos extends javax.swing.JFrame {

    /**
     * Creates new form AltasAlumnos
     */
    public AltasAlumnos() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cmbBoxEspecialidadAlumno = new javax.swing.JComboBox<>();
        txtApellidoPat = new javax.swing.JTextField();
        txtidAlumno = new javax.swing.JTextField();
        txtApellidoMat = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        txtNum = new javax.swing.JTextField();
        txtCol = new javax.swing.JTextField();
        txtMun = new javax.swing.JTextField();
        txtEdo = new javax.swing.JTextField();
        txtCurp = new javax.swing.JTextField();
        txtMat = new javax.swing.JTextField();
        cmbBoxSemestreCurso = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jTextField7.setText("jTextField7");

        jLabel16.setText("jLabel16");

        jRadioButton1.setText("jRadioButton1");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGOEXACTAS.png"))); // NOI18N
        jLabel18.setText("jLabel14");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Altas de Alumnos ");

        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Nombre");

        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Apellido Paterno");

        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Apellido Materno");

        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Email");

        btnGuardar.setForeground(new java.awt.Color(0, 51, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setForeground(new java.awt.Color(0, 51, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Ingrese datos del alumno");

        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Telefono");

        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Calle");

        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Numero");

        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Colonia");

        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Municipio");

        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Estado");

        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("CURP");

        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setText("Matricula");

        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Semestre en Curso");

        jLabel15.setForeground(new java.awt.Color(0, 0, 255));
        jLabel15.setText("Especialidad");

        cmbBoxEspecialidadAlumno.setForeground(new java.awt.Color(0, 51, 255));
        cmbBoxEspecialidadAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cirujano", "General", "Forense" }));

        cmbBoxSemestreCurso.setForeground(new java.awt.Color(0, 51, 255));
        cmbBoxSemestreCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        jLabel17.setForeground(new java.awt.Color(0, 0, 255));
        jLabel17.setText("idAlumno");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGOEXACTAS.png"))); // NOI18N
        jLabel19.setText("jLabel19");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel14))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                        .addComponent(cmbBoxEspecialidadAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(79, 79, 79))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(76, 76, 76)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel17)
                                            .addGap(119, 119, 119)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(127, 127, 127)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtidAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtApellidoPat)
                                        .addComponent(txtApellidoMat)
                                        .addComponent(txtEmail)
                                        .addComponent(txtTel)
                                        .addComponent(txtCalle)
                                        .addComponent(txtNum)
                                        .addComponent(txtCol)
                                        .addComponent(txtMun)
                                        .addComponent(txtEdo)
                                        .addComponent(txtCurp)
                                        .addComponent(txtMat)
                                        .addComponent(cmbBoxSemestreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btnGuardar)
                .addGap(89, 89, 89)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtidAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtApellidoPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(txtApellidoMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtMun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtEdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cmbBoxSemestreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cmbBoxEspecialidadAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
          //Se capturan los datos del docente para insertarlos a la base de datos. Por medio de getText().
        int id = Integer.parseInt(txtidAlumno.getText());
        String nombres = txtNombre.getText();
        String apellidopat = txtApellidoPat.getText();
        String apellidomat = txtApellidoMat.getText();
        String email = txtEmail.getText();
        String tel = txtTel.getText();
        String calle = txtCalle.getText();
        String num = txtNum.getText();
        String col = txtCol.getText();
        String mun = txtMun.getText();
        String edo = txtEdo.getText();
        String curp = txtCurp.getText();
        String mat = txtMat.getText();
        int semestreCurso = Integer.parseInt((String)cmbBoxSemestreCurso.getSelectedItem());
        int idEspecialidad = 1; //se inicializa con 1, como opcion predeterminada
        //Se convierte en cadena la especialidad seleccionada 
        String especialidad = (String) cmbBoxEspecialidadAlumno.getSelectedItem();
        if(especialidad.equals("Cirujano"))
        {
          idEspecialidad = 1;   //para que coincida con el registro de la tabla "Especialidad"
        }
        else if(especialidad.equals("General")){
          idEspecialidad = 2; //para que coincida con el registro de la tabla "Especialidad"
        }
        else if(especialidad.equals("Forense")){
          idEspecialidad = 3; //para que coincida con el registro de la tabla "Especialidad"
        }
        Conexion mysql = new Conexion(); //Para poder usar los metodos de la clase Conexion 
        //Se manda a la función los campos que se van a insertar
        int confirma = JOptionPane.showConfirmDialog(rootPane,"¿Estás seguro de querer insertar los datos de este alumno?",
            "Actividad Complementaria",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
        if(JOptionPane.OK_OPTION==confirma){
            mysql.insertarAlumno(id,nombres,apellidopat,apellidomat,email,tel,calle,num,col,mun,edo,curp,
                mat,semestreCurso,idEspecialidad);  
        }
        else if(JOptionPane.NO_OPTION==confirma){
            return;
        }
       
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //Salir
        //Esta variable "confirma" obtiene 1 si se confirma la salida por parte del usuario, 0 si no. 
        int confirma = JOptionPane.showConfirmDialog(rootPane,"¿Estás seguro que deseas salir?,AMADEO COPORO QUINTANA,DS-DPO2-2102-B1-001",
                                     "Actividad Complementaria",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
      if(JOptionPane.OK_OPTION==confirma){
          //Solo cerrará la ventana en curso. 
        this.dispose();
      
       }
       else if(JOptionPane.CANCEL_OPTION==confirma){
        return;   
       }
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(AltasAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltasAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltasAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltasAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltasAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbBoxEspecialidadAlumno;
    private javax.swing.JComboBox<String> cmbBoxSemestreCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField txtApellidoMat;
    private javax.swing.JTextField txtApellidoPat;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCol;
    private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtEdo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMat;
    private javax.swing.JTextField txtMun;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtidAlumno;
    // End of variables declaration//GEN-END:variables
}