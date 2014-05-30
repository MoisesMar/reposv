package biblioteca;

 // @author Alejandro
 
public class VentanaPrestamos extends javax.swing.JDialog {

    java.util.AbstractList<Prestamo> Prestamos;
    Biblioteca biblioteca;
    
    public VentanaPrestamos(java.awt.Frame parent, boolean modal, Biblioteca biblioteca) {
        super(parent, modal);
        Prestamos = new java.util.ArrayList();
        this.biblioteca=biblioteca;
        initComponents();
        //*** Se agregan las personas al combo
        for(int i=0; i<biblioteca.Usuarios.size(); i++){
            jComboBox1.addItem(biblioteca.Usuarios.get(i));
        }
        //*** Se agregan los libros al combo
        for(int i=0; i<biblioteca.Usuarios.size(); i++){
            jComboBox2.addItem(biblioteca.Libros.get(i));
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFechaSalida = new javax.swing.JTextField();
        txtFechaDevolucion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPrestamos = new javax.swing.JList();
        jComboBox1 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prestamos1.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Agregar Prestamo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 11, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 0));
        jLabel1.setText("Fecha Salida");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 158, 100, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 51));
        jLabel2.setText("Fecha Devolucion");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 209, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 0));
        jLabel3.setText("Id de Usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Codigo libro");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 122, 90, 20));
        getContentPane().add(txtFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 162, 150, -1));
        getContentPane().add(txtFechaDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 210, 150, -1));

        jScrollPane1.setViewportView(lstPrestamos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 310, 80));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 170, 20));

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 170, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void Listar(){
        javax.swing.DefaultListModel modelo;
        modelo = new javax.swing.DefaultListModel<>();
        
        modelo.addElement(jComboBox1.getSelectedIndex());
        modelo.addElement(jComboBox1.getSelectedItem());
        
        for (int i= 0; i < Prestamos.size(); i++){
            modelo.addElement(Prestamos.get(i).getIdUsuario()+ "  " + Prestamos.get(i).getCodigoLibro()+ "  " + Prestamos.get(i).getFechaSalida()+ "  " + Prestamos.get(i).getFechaDevolucion());
                       
        }
        lstPrestamos.setModel(modelo);
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Persona usuario = (Persona)jComboBox1.getSelectedItem();
        Libro libro = (Libro)jComboBox2.getSelectedItem();
        biblioteca.realizarPrestamoView(usuario,libro, Integer.parseInt(txtFechaSalida.getText()));
        System.out.println(jComboBox1.getSelectedItem().getClass());
        System.out.println(jComboBox2.getSelectedItem().getClass());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jComboBox1.addItem(biblioteca.getUsuarios().get(0));
        
    }//GEN-LAST:event_jButton3ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstPrestamos;
    private javax.swing.JTextField txtFechaDevolucion;
    private javax.swing.JTextField txtFechaSalida;
    // End of variables declaration//GEN-END:variables
}
