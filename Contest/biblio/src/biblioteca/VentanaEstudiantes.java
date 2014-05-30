package biblioteca;

 // @author Alejandro

public class VentanaEstudiantes extends javax.swing.JDialog {
    Biblioteca biblioteca;
    
    
    java.util.ArrayList<Persona> Usuarios;
    public VentanaEstudiantes(java.awt.Frame parent, boolean modal,Biblioteca biblioteca) {
        super(parent, modal);
        Usuarios = new java.util.ArrayList();

        initComponents();
        this.biblioteca = biblioteca;
        System.out.println("Desde VentanaEstudiantes");
        System.out.println(biblioteca);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAgregarestudiante = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblNombreEstudiante = new javax.swing.JLabel();
        lblApellidoEstudiante = new javax.swing.JLabel();
        lblCedulaEstudiante = new javax.swing.JLabel();
        lblGradoEstudiante = new javax.swing.JLabel();
        txtNombreEstudiante = new javax.swing.JTextField();
        txtApellidoEstudiante = new javax.swing.JTextField();
        txtCedulaEstudiante = new javax.swing.JTextField();
        txtGradoEstudiante = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstEstudiantes = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estudiantes2.jpg"))); // NOI18N

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel6.setText("jLabel6");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estudiantes2.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estudiantes2.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estudiantes");
        setBackground(new java.awt.Color(0, 0, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Algerian", 0, 10)); // NOI18N
        setForeground(new java.awt.Color(0, 0, 255));
        setIconImage(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarestudiante.setText("Agregar Estudiante");
        btnAgregarestudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarestudianteActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarestudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 200, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 90, 20));

        lblNombreEstudiante.setText("Nombre");
        getContentPane().add(lblNombreEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, -1, -1));

        lblApellidoEstudiante.setText("Apellido");
        getContentPane().add(lblApellidoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 108, -1, -1));

        lblCedulaEstudiante.setText("Cedula");
        getContentPane().add(lblCedulaEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 151, -1, -1));

        lblGradoEstudiante.setText("Grado");
        getContentPane().add(lblGradoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 192, -1, -1));
        getContentPane().add(txtNombreEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 65, 210, -1));

        txtApellidoEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(txtApellidoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 105, 210, -1));
        getContentPane().add(txtCedulaEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 148, 210, -1));
        getContentPane().add(txtGradoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 189, 210, -1));

        jScrollPane3.setViewportView(lstEstudiantes);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 280, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estudiantes2.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 300, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoEstudianteActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed
    
    public void Listar(){
        javax.swing.DefaultListModel modelo;
        modelo = new javax.swing.DefaultListModel<>();
        
        for (int i= 0; i < biblioteca.Usuarios.size(); i++){
            
            if(biblioteca.Usuarios.get(i).getTipoPersona()=="Estudiante")
            modelo.addElement(  biblioteca.Usuarios.get(i).getNombre() + " " + 
                                biblioteca.Usuarios.get(i).getApellido() + " " + 
                                biblioteca.Usuarios.get(i).getIdentificacion() + " " + 
                                biblioteca.Usuarios.get(i).getGrado());
            
        }
        lstEstudiantes.setModel(modelo);
    }
    
    
    private void btnAgregarestudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarestudianteActionPerformed

        Estudiante estudiante = new Estudiante(txtNombreEstudiante.getText(), txtApellidoEstudiante.getText(), Integer.parseInt(txtCedulaEstudiante.getText()), Integer.parseInt(txtGradoEstudiante.getText()));
        biblioteca.registrarPersona(estudiante);
        Listar();
        
    }//GEN-LAST:event_btnAgregarestudianteActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarestudiante;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblApellidoEstudiante;
    private javax.swing.JLabel lblCedulaEstudiante;
    private javax.swing.JLabel lblGradoEstudiante;
    private javax.swing.JLabel lblNombreEstudiante;
    private javax.swing.JList lstEstudiantes;
    private javax.swing.JTextField txtApellidoEstudiante;
    private javax.swing.JTextField txtCedulaEstudiante;
    private javax.swing.JTextField txtGradoEstudiante;
    private javax.swing.JTextField txtNombreEstudiante;
    // End of variables declaration//GEN-END:variables
}
