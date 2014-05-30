package biblioteca;

 // author Alejandro
public class VentanaProfesores extends javax.swing.JDialog {

        

        java.util.ArrayList<String> Materias;
        
        Biblioteca biblioteca;
           
    public VentanaProfesores(java.awt.Frame parent, boolean modal,Biblioteca biblioteca ) {
        super(parent, modal);
        this.biblioteca=biblioteca;

        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarProfesor = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblNombreProfesor = new javax.swing.JLabel();
        lblApellidoProfesor = new javax.swing.JLabel();
        lblCedulaProfesor = new javax.swing.JLabel();
        lblMateriaProfesor = new javax.swing.JLabel();
        txtNombreProfesor = new javax.swing.JTextField();
        txtApellidoProfesor = new javax.swing.JTextField();
        txtCedulaProfesor = new javax.swing.JTextField();
        txtMateriaProfesor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstProfesores = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarProfesor.setText("Agregar Profesor");
        btnAgregarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProfesorActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 133, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 11, -1, -1));

        lblNombreProfesor.setForeground(new java.awt.Color(255, 0, 0));
        lblNombreProfesor.setText("Nombre");
        getContentPane().add(lblNombreProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, -1, -1));

        lblApellidoProfesor.setForeground(new java.awt.Color(255, 51, 51));
        lblApellidoProfesor.setText("Apellido");
        getContentPane().add(lblApellidoProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        lblCedulaProfesor.setForeground(new java.awt.Color(255, 51, 51));
        lblCedulaProfesor.setText("Cedula");
        getContentPane().add(lblCedulaProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 168, -1, -1));

        lblMateriaProfesor.setForeground(new java.awt.Color(255, 51, 51));
        lblMateriaProfesor.setText("Materia");
        getContentPane().add(lblMateriaProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 220, -1, -1));
        getContentPane().add(txtNombreProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 72, 162, -1));
        getContentPane().add(txtApellidoProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 117, 162, -1));
        getContentPane().add(txtCedulaProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 165, 162, -1));

        txtMateriaProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMateriaProfesorActionPerformed(evt);
            }
        });
        getContentPane().add(txtMateriaProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 217, 162, -1));

        jScrollPane1.setViewportView(lstProfesores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/profesores1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -6, 260, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMateriaProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMateriaProfesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMateriaProfesorActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    public void Listar(){
        javax.swing.DefaultListModel modelo;
        modelo = new javax.swing.DefaultListModel<>();
        
        for (int i= 0; i < biblioteca.Usuarios.size(); i++){
            
            if(biblioteca.Usuarios.get(i).getTipoPersona() == "Profesor")
            modelo.addElement(biblioteca.Usuarios.get(i).getNombre() + "  " + 
                              biblioteca.Usuarios.get(i).getApellido()+ "  " + 
                              biblioteca.Usuarios.get(i).getIdentificacion() + "  " + 
                              biblioteca.Usuarios.get(i).getMateria(0));
        }
        lstProfesores.setModel(modelo);
    }
    
    private void btnAgregarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProfesorActionPerformed
        Profesor profe = new Profesor(txtNombreProfesor.getText(), txtApellidoProfesor.getText(), Integer.parseInt(txtCedulaProfesor.getText()),txtMateriaProfesor.getText());
        biblioteca.registrarPersona(profe);
        Listar ();
    }//GEN-LAST:event_btnAgregarProfesorActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProfesor;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidoProfesor;
    private javax.swing.JLabel lblCedulaProfesor;
    private javax.swing.JLabel lblMateriaProfesor;
    private javax.swing.JLabel lblNombreProfesor;
    private javax.swing.JList lstProfesores;
    private javax.swing.JTextField txtApellidoProfesor;
    private javax.swing.JTextField txtCedulaProfesor;
    private javax.swing.JTextField txtMateriaProfesor;
    private javax.swing.JTextField txtNombreProfesor;
    // End of variables declaration//GEN-END:variables
}
