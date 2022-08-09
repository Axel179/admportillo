package Ventanas;

import Clases.Hash;
import Clases.Imagenes;
import java.sql.*;
import Clases.Conexion;
import Clases.Fondo;
import java.awt.HeadlessException;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public static int idUsuario;
    String usuario = "";
    String contraseña = "";

    /**
     * Creates new form Login
     */
    public Login() {
        Fondo fondo = new Fondo("Fondo.jpg");
        this.setContentPane(fondo);
        this.setUndecorated(true);
        initComponents();
        Shape p = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 30, 30);
        this.setShape(p);
        setTitle("Iniciar Sesion");
        setLocationRelativeTo(null);
        setSize(400, 600);
        setResizable(false);

        new Imagenes("icons8-client-management-80.png", jLabelUsuario);
        new Imagenes("Contraseña.png", jLabelContraseña);
        this.repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabelContraseña = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonEntrar = new javax.swing.JButton();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelCerrarPrograma1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jLabelContraseña.setBackground(new java.awt.Color(204, 255, 255));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("2022 version 1.0");

        jLabelUsuario.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 102, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Contraseña");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Creado por Corporación Portillo ");

        jLabel1.setBackground(new java.awt.Color(0, 102, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Usuario");

        jButtonEntrar.setBackground(new java.awt.Color(0, 102, 255));
        jButtonEntrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });

        jPasswordFieldContraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordFieldContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldContraseñaKeyPressed(evt);
            }
        });

        jTextFieldUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldUsuarioKeyPressed(evt);
            }
        });

        jLabelCerrarPrograma1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelCerrarPrograma1.setForeground(new java.awt.Color(255, 102, 153));
        jLabelCerrarPrograma1.setText("x");
        jLabelCerrarPrograma1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarPrograma1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1)
                        .addGap(60, 60, 60)
                        .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jPasswordFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel3)))
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelCerrarPrograma1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCerrarPrograma1)
                .addGap(152, 152, 152)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jPasswordFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(jLabel3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed

        iniciarsesion();
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jPasswordFieldContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseñaKeyPressed
        char enter = evt.getKeyChar();
        if (enter == KeyEvent.VK_ENTER) {
            iniciarsesion();
        }
    }//GEN-LAST:event_jPasswordFieldContraseñaKeyPressed

    private void jTextFieldUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioKeyPressed
        char enter = evt.getKeyChar();
        if (enter == KeyEvent.VK_ENTER) {
            jPasswordFieldContraseña.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldUsuarioKeyPressed

    int xm, ym;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xm = evt.getX();
        ym = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xm, y - ym);
    }//GEN-LAST:event_formMouseDragged

    private void jLabelCerrarPrograma1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarPrograma1MouseClicked
        int i = JOptionPane.showConfirmDialog(null, "¿Cerrar Programa?", "Cerrar Programa", JOptionPane.YES_NO_OPTION);
        if (i == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_jLabelCerrarPrograma1MouseClicked
    public void iniciarsesion() {
        usuario = jTextFieldUsuario.getText().trim();
        contraseña = Hash.hash24(new String(jPasswordFieldContraseña.getPassword()));
        System.out.println(contraseña);
        if (!usuario.equals("") || !contraseña.equals("")) {
            try {
                Connection cn = Conexion.Conexion();
                PreparedStatement pre = cn.prepareStatement("select idusuarios,cargo from usuarios where usuario = ? and contraseña = ?");
                pre.setString(1, usuario);
                pre.setString(2, contraseña);
                ResultSet rs = pre.executeQuery();

                if (rs.next()) {
                    String cargo = rs.getString("cargo");
                    idUsuario = rs.getInt("idusuarios");
                    switch (cargo) {
                        case "Administrador" -> {
                            dispose();
                            new Administrador().setVisible(true);
                        }
                        case "Vendedor" -> {
                            dispose();
                            new Vendedor().setVisible(true);
                        }
                        default ->
                            JOptionPane.showMessageDialog(null, "No tiene un cargo con la empresa");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Datos incorrectos");
                }

            } catch (HeadlessException | SQLException e) {
                System.err.println("Error al iniciar sesion " + e);
                JOptionPane.showMessageDialog(null, "¡Error al iniciar sesion!. Contacte al soporte Corporacion Portillo.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos, porfavor.");
        }
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCerrarPrograma1;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
