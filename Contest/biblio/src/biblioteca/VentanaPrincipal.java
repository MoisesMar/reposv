package biblioteca;

// author Alejandro

import javax.swing.ImageIcon;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    Biblioteca biblioteca;
    VentanaEstudiantes ventanaEstudiantes;
    VentanaProfesores ventanaProfesores;
    VentanaPrestamos ventanaPrestamos;
    
    public VentanaPrincipal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../Imagenes/fondo.jpg")).getImage());
    }

    public VentanaPrincipal(Biblioteca biblioteca) {
        initComponents();
        this.biblioteca = biblioteca;
        setIconImage(new ImageIcon(getClass().getResource("../Imagenes/fondo.jpg")).getImage());
        System.out.println(biblioteca);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonProfesores = new javax.swing.JButton();
        jButtonEstudiantes = new javax.swing.JButton();
        jButtonLibros = new javax.swing.JButton();
        jButtonPrestamo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonProfesores.setText("Profesores");
        jButtonProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProfesoresActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonProfesores, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 83, 120, 30));

        jButtonEstudiantes.setText("Estudiantes");
        jButtonEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstudiantesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 120, 30));

        jButtonLibros.setText("Libros");
        jButtonLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLibrosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 83, 120, 30));

        jButtonPrestamo.setText("Prestamos");
        jButtonPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrestamoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 110, 130, 30));

        jButton1.setText("Informes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 223, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProfesoresActionPerformed
        if(ventanaProfesores == null){
            ventanaProfesores = new VentanaProfesores(new javax.swing.JFrame(), true, biblioteca);
            ventanaProfesores.setLocationRelativeTo(null);
            ventanaProfesores.setTitle(" Profesores ");
        }
        ventanaProfesores.setVisible(true);
        
    }//GEN-LAST:event_jButtonProfesoresActionPerformed

    private void jButtonEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstudiantesActionPerformed

         if(ventanaEstudiantes == null){
             ventanaEstudiantes = new VentanaEstudiantes(new javax.swing.JFrame(), true, biblioteca);
             ventanaEstudiantes.setLocationRelativeTo(null);
             ventanaEstudiantes.setTitle(" Estudiantes ");
         }
         
         ventanaEstudiantes.setVisible(true);
    }//GEN-LAST:event_jButtonEstudiantesActionPerformed

    private void jButtonLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLibrosActionPerformed
        VentanaLibros dialog = new VentanaLibros(new javax.swing.JFrame(), true);
        dialog.setLocationRelativeTo(null);
        dialog.setTitle(" Libros ");
        dialog.setVisible(true);
    }//GEN-LAST:event_jButtonLibrosActionPerformed

    private void jButtonPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrestamoActionPerformed
        ventanaPrestamos = new VentanaPrestamos(new javax.swing.JFrame(), true, biblioteca);
        ventanaPrestamos.setLocationRelativeTo(null);
        ventanaPrestamos.setTitle(" Prestamos ");
        ventanaPrestamos.setVisible(true);
    }//GEN-LAST:event_jButtonPrestamoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VentanaInformes dialog = new VentanaInformes(new javax.swing.JFrame(), true);
        dialog.setLocationRelativeTo(null);
        dialog.setTitle(" Prestamos ");
        dialog.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

   //ImageIcon imagen = new ImageIcon( new ImageIcon(getClass().getResource("/imagenes/biblioteca")).getImage());

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEstudiantes;
    private javax.swing.JButton jButtonLibros;
    private javax.swing.JButton jButtonPrestamo;
    private javax.swing.JButton jButtonProfesores;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

