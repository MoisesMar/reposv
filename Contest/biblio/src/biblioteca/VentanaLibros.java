package biblioteca;

// @author Alejandro

public class VentanaLibros extends javax.swing.JDialog {
    
    Biblioteca biblioteca;
    public VentanaLibros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public VentanaLibros(java.awt.Frame parent, boolean modal, Biblioteca biblioteca) {
        super(parent, modal);
        this.biblioteca = biblioteca;
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarLibro = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtTituloLibro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstLibros = new javax.swing.JList();
        jblMaximoDias = new javax.swing.JLabel();
        txtMaximoDias = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarLibro.setText("Agregar Libro");
        btnAgregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLibroActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 11, -1, -1));

        jLabel1.setText("ISBN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 74, -1, -1));

        jLabel2.setText("Autor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 106, 44, -1));

        jLabel3.setText("Titulo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 144, 44, 24));
        getContentPane().add(txtISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 68, 179, -1));

        txtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorActionPerformed(evt);
            }
        });
        getContentPane().add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 106, 179, -1));
        getContentPane().add(txtTituloLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 146, 179, -1));

        jScrollPane1.setViewportView(lstLibros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 290, 80));

        jblMaximoDias.setText("Maximo Dias");
        getContentPane().add(jblMaximoDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        getContentPane().add(txtMaximoDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 170, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/libro3.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 300, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public void Listar(){
        javax.swing.DefaultListModel modelo;
        modelo = new javax.swing.DefaultListModel<>();
        
        for (int i= 0; i < biblioteca.Libros.size(); i++){
            
            
            modelo.addElement(  biblioteca.Libros.get(i).getIsbn()+ " " + 
                                biblioteca.Libros.get(i).getAutor()+ " " + 
                                biblioteca.Libros.get(i).getTitulo()+ " " + 
                                biblioteca.Libros.get(i).getMaximoDias());
            
        }
        lstLibros.setModel(modelo);
    }
    
    
    private void btnAgregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLibroActionPerformed
       
         ESTA ES LA PARTE DONDE DEL BOTON AGRAGAR O REGISTRAR LIBRO 
        
         biblioteca.registrarLibro(txtISBN.getText(), txtAutor.getText(), txtTituloLibro.getText(), Integer.parseInt(txtMaximoDias.getText()));
         

    }//GEN-LAST:event_btnAgregarLibroActionPerformed

   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarLibro;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblMaximoDias;
    private javax.swing.JList lstLibros;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtMaximoDias;
    private javax.swing.JTextField txtTituloLibro;
    // End of variables declaration//GEN-END:variables
}
