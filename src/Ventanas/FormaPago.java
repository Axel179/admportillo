/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Ventanas;

import Clases.Fondo;
import Clases.ImagenBoton;
import Clases.Imagenes;
import Clases.Validaciones;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;

/**
 *
 * @author harolD
 */
public class FormaPago extends javax.swing.JDialog {

    /**
     * Creates new form FormaPago
     */
    public FormaPago(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        Fondo fondo = new Fondo("Fondo_Dialogos.jpg");
        this.setContentPane(fondo);
        this.setUndecorated(true);
        initComponents();
        new ImagenBoton("cerrar.png", JBotonCerrar, JBotonCerrar.getBounds().width, JBotonCerrar.getBounds().height);
        Shape p = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 30, 30);
        this.setShape(p);
        new Imagenes("efectivo.png", jLabelEfectivo);
        new Imagenes("tarjeta-de-debito.png", jLabelCredito);
        new Imagenes("codigo-qr.png", jLabelQr);
        setTitle("Forma de Pago");
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldEfectivo = new javax.swing.JTextField();
        efectivo = new javax.swing.JButton();
        credito = new javax.swing.JButton();
        QR = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCambio = new javax.swing.JTextField();
        jLabelEfectivo = new javax.swing.JLabel();
        jLabelQr = new javax.swing.JLabel();
        jLabelCredito = new javax.swing.JLabel();
        JBotonCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText(" Efectivo:");

        jTextFieldEfectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldEfectivoKeyReleased(evt);
            }
        });

        efectivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        efectivo.setText("Efectivo");
        efectivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                efectivoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                efectivoMouseExited(evt);
            }
        });
        efectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efectivoActionPerformed(evt);
            }
        });

        credito.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        credito.setText("Credito");
        credito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                creditoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                creditoMouseExited(evt);
            }
        });
        credito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditoActionPerformed(evt);
            }
        });

        QR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        QR.setText("Pago QR");
        QR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QRMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                QRMouseExited(evt);
            }
        });
        QR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QRActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Cambio");

        jTextFieldCambio.setEditable(false);

        jLabelEfectivo.setText("jLabel3");

        jLabelQr.setText("jLabel3");

        jLabelCredito.setText("jLabel3");

        JBotonCerrar.setBorder(null);
        JBotonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(jTextFieldCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(efectivo)
                    .addComponent(jLabelEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(credito)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QR)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelQr, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBotonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBotonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(efectivo)
                    .addComponent(credito)
                    .addComponent(QR))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelQr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void efectivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_efectivoMouseEntered
efectivo.setBackground(Color.green);
    }//GEN-LAST:event_efectivoMouseEntered

    private void efectivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_efectivoMouseExited
efectivo.setBackground(new Color(78,80,82));
    }//GEN-LAST:event_efectivoMouseExited

    private void creditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditoActionPerformed
        Ventas.venta("Credito", Double.parseDouble(jTextFieldCambio.getText()), Double.parseDouble(jTextFieldEfectivo.getText()));
        Ventas.detalleVenta();
        dispose();
    }//GEN-LAST:event_creditoActionPerformed

    private void creditoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditoMouseEntered
   credito.setBackground(Color.green);
    }//GEN-LAST:event_creditoMouseEntered

    private void creditoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditoMouseExited
credito.setBackground(new Color(78,80,82));        // TODO add your handling code here:
    }//GEN-LAST:event_creditoMouseExited

    private void QRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QRMouseEntered
QR.setBackground(Color.green);        // TODO add your handling code here:
    }//GEN-LAST:event_QRMouseEntered

    private void QRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QRMouseExited
    QR.setBackground(new Color(78,80,82));
    }//GEN-LAST:event_QRMouseExited

    private void efectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efectivoActionPerformed
        double cambio = Double.parseDouble(jTextFieldCambio.getText());
        double efecty = Double.parseDouble(jTextFieldEfectivo.getText());
        Ventas.venta("Efectivo",cambio,efecty);
        Ventas.detalleVenta();
        dispose();
    }//GEN-LAST:event_efectivoActionPerformed

    private void QRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QRActionPerformed
       Ventas.venta("Pago Qr", Double.parseDouble(jTextFieldCambio.getText()), Double.parseDouble(jTextFieldEfectivo.getText()));
        Ventas.detalleVenta();
        dispose();
    }//GEN-LAST:event_QRActionPerformed
public static boolean m=true;
    private void JBotonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonCerrarActionPerformed
        Object[] opc = new Object[]{"SI", "NO"};
        int i = JOptionPane.showOptionDialog(null, "¿Desea cancelar la Venta?", "salir", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opc, opc[0]);
        if (i == 0) {
            m=false;
            this.dispose();
        }
    }//GEN-LAST:event_JBotonCerrarActionPerformed

    private void jTextFieldEfectivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEfectivoKeyReleased
         if (!Validaciones.validarString(evt)){
           double efectivo = Double.parseDouble(jTextFieldEfectivo.getText());
           double total = Double.parseDouble(Ventas.jTextFieldTotal.getText());
           jTextFieldCambio.setText(""+(efectivo-total));
       }else {
           getToolkit().beep();
            evt.consume();
       }
    }//GEN-LAST:event_jTextFieldEfectivoKeyReleased

  
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBotonCerrar;
    private javax.swing.JButton QR;
    private javax.swing.JButton credito;
    private javax.swing.JButton efectivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCredito;
    private javax.swing.JLabel jLabelEfectivo;
    private javax.swing.JLabel jLabelQr;
    private javax.swing.JTextField jTextFieldCambio;
    private javax.swing.JTextField jTextFieldEfectivo;
    // End of variables declaration//GEN-END:variables
}
