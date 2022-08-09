package Ventanas;

import Clases.Conexion;
import Clases.Fondo;
import Clases.Imagenes;
import Clases.Validaciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import Ventanas.Producto;
import java.awt.HeadlessException;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.sql.SQLException;
import java.util.Locale;

/**
 *
 * @author harol
 */
public class AgregarProveedor extends javax.swing.JDialog {

    /**
     * Creates new form AgregarProveedor
     */
    public AgregarProveedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        Fondo fondo = new Fondo("Fondo_Dialogos.jpg");
        this.setContentPane(fondo);
        this.setUndecorated(true);
        this.setContentPane(fondo);
        initComponents();

        setResizable(false);
        setLocationRelativeTo(null);
        new Imagenes("disco-flexible.png", jLabelGuardar);
        new Imagenes("salida.png", jLabelSalir);
        Shape p = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 30, 30);
        this.setShape(p);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNit = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCelular = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabelGuardar = new javax.swing.JLabel();
        jLabelSalir = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jTextFieldAsesor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(346, 328));
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNitKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 172, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nit:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 172, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jTextFieldCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCelularKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 172, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Celular:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabelGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelGuardarMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 30, 30));

        jLabelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalirMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 30, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("  Direccion:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Correo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Asesor:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jTextFieldDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldDireccionKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 172, -1));

        jTextFieldCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCorreoKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 172, -1));

        jTextFieldAsesor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldAsesorKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldAsesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 172, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("AGREGAR PROVEEDOR");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 150, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNitKeyPressed
        if (!Validaciones.validarEnter(evt)) {
            jTextFieldNombre.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldNitKeyPressed

    private void jTextFieldNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyPressed
        if (!Validaciones.validarEnter(evt)) {
            jTextFieldCelular.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldNombreKeyPressed

    private void jTextFieldCelularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCelularKeyPressed
        if (!Validaciones.validarEnter(evt)) {
            jTextFieldDireccion.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldCelularKeyPressed

    private void jLabelGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelGuardarMouseClicked
        agregar();
    }//GEN-LAST:event_jLabelGuardarMouseClicked

    private void jLabelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirMouseClicked
        dispose();
        Producto.llenarProveedor();
    }//GEN-LAST:event_jLabelSalirMouseClicked

    private void jTextFieldDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDireccionKeyPressed
        if (!Validaciones.validarEnter(evt)) {
            jTextFieldCorreo.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldDireccionKeyPressed

    private void jTextFieldCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCorreoKeyPressed
        if (!Validaciones.validarEnter(evt)) {
            jTextFieldAsesor.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldCorreoKeyPressed

    private void jTextFieldAsesorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAsesorKeyPressed
        if (!Validaciones.validarEnter(evt)) {
            agregar();
        }
    }//GEN-LAST:event_jTextFieldAsesorKeyPressed

    int xm;
    int ym;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xm = evt.getX();
        ym = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xm, y-ym);
    }//GEN-LAST:event_formMouseDragged

    public void agregar() {

        if (!((jTextFieldNit.getText() + jTextFieldCelular.getText() + jTextFieldNombre.getText()).equals(""))) {
            try {
                Connection cn = Conexion.Conexion();
                PreparedStatement pre = cn.prepareStatement("INSERT INTO proveedor (idproveedor,Nit,Nombre,Celular,Direccion,Correo,Asesor) values(?,?,?,?,?,?,?)");
                pre.setInt(1, 0);
                pre.setString(2, jTextFieldNit.getText());
                pre.setString(3, jTextFieldNombre.getText());
                pre.setString(4, jTextFieldCelular.getText());
                pre.setString(5, jTextFieldDireccion.getText());
                pre.setString(6, jTextFieldCorreo.getText());
                pre.setString(7, jTextFieldAsesor.getText());

                pre.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro exitoso");
                jTextFieldNit.setText("");
                jTextFieldCelular.setText("");
                jTextFieldNombre.setText("");
                jTextFieldDireccion.setText("");
                jTextFieldAsesor.setText("");
                jTextFieldCorreo.setText("");
                dispose();
                Producto.llenarProveedor();

            } catch (HeadlessException | SQLException e) {
                System.err.println("Error al ingresar el producto " + e);
                JOptionPane.showMessageDialog(null, "¡Error al ingresar el producto!. Contacte al soporte Corporacion Portillo.");
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelGuardar;
    private javax.swing.JLabel jLabelSalir;
    public static javax.swing.JTextField jTextFieldAsesor;
    private javax.swing.JTextField jTextFieldCelular;
    public static javax.swing.JTextField jTextFieldCorreo;
    public static javax.swing.JTextField jTextFieldDireccion;
    public static javax.swing.JTextField jTextFieldNit;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
