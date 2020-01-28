/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import codigo.formas.Circulo2;
import codigo.formas.Cuadrado;
import codigo.formas.Estrella;
import codigo.formas.Forma;
import java.awt.BasicStroke;
import codigo.formas.Pentagono;
import codigo.formas.Pincel;
import codigo.formas.Spray;
import codigo.formas.TiraLineas;
import codigo.formas.Triangulo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author Javier
 */
public class VentanaPaint extends javax.swing.JFrame {

    //Este buffer acelera la memoria para que podamos dibujar
    BufferedImage buffer, buffer2 = null;

    //Permite dibujar, una para el buufer y otra para el panel
    Graphics2D bufferGraphics, bufferGraphics2, jPanelGraphics = null;

    //Aqui guardamos x e y para hacer líneas
    int xLinea, yLinea;

    Forma miForma = null;
    Pincel miPincel = null;
    TiraLineas miTiraLineas = null;
    Spray miSpray = null;

    /**
     * Creates new form VentanaPaint
     */
    public VentanaPaint() {
        initComponents();
        inicializaBuffers();
        jDialog2.setSize(640,450);

    }

    //Enlaza buffergraphics con jpanel
    private void inicializaBuffers() {
        //Creo una imagen del mismo ancho y alto que el Jpanel       
        buffer = (BufferedImage) jPanel1.createImage(jPanel1.getWidth(), jPanel1.getHeight());
        buffer2 = (BufferedImage) jPanel1.createImage(jPanel1.getWidth(), jPanel1.getHeight());
        //Creo una imagn moficable
        bufferGraphics = buffer.createGraphics();
        bufferGraphics2 = buffer2.createGraphics();
        //Inicializo el buffer para que se pinte de blanco entero, sirve para borrar todo
        bufferGraphics.setColor(Color.white);
        bufferGraphics.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());

        bufferGraphics2.setColor(Color.white);
        bufferGraphics2.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());

        //Enlazamos el jPanel1 con el jPanelGraphics
        jPanelGraphics = (Graphics2D) jPanel1.getGraphics();

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //pinto el buffer sobre el jpanel
        jPanelGraphics.drawImage(buffer, 0, 0, null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog2 = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        aceptarColor = new javax.swing.JButton();
        cancelarColor = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        panelColores = new codigo.panelColores();
        ventanaHerramientas1 = new codigo.VentanaHerramientas();
        jLabelCoordenadas = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        aceptarColor.setText("Aceptar");
        aceptarColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarColorActionPerformed(evt);
            }
        });

        cancelarColor.setText("Cancelar");
        cancelarColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarColorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(aceptarColor)
                        .addGap(118, 118, 118)
                        .addComponent(cancelarColor)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarColor)
                    .addComponent(cancelarColor))
                .addGap(23, 23, 23))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 876, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(ventanaHerramientas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(jLabelCoordenadas, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(ventanaHerramientas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(panelColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabelCoordenadas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(38, 38, 38))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Este metodo actua cuando arrastras el raton habiendo pulsado y hasta que sueltas
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged

        //Para que aparezcan las coordenadas mientras se usan herramientas
        //Provoca un parpadeo extraño
        //jLabelCoordenadas.setText(evt.getX() + " , " + evt.getY());
        //Esto es lo que se dibuja sobre la pantalla
        bufferGraphics.drawImage(buffer2, 0, 0, null);

        switch (ventanaHerramientas1.formaElegida) {

            //HAce una lina de un punto a otro
            case 0:
                miTiraLineas.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;
            //HAce un triángulo
            case 3:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;

            //Hace un cuadrado
            case 4:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;
            //Hace un pentágono
            case 5:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;
            //Hace un círculo
            case 1:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;

            //Hace línes  
            case 11:
                miPincel.dibujate(bufferGraphics2, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;

            //Efecto spray
            case 12:
                miSpray = new Spray(evt.getX(), evt.getY(), panelColores.colorSeleccionado);
                miSpray.dibujate(bufferGraphics2, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;

            //Hace la estrella
            case 256:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;

        }
        //Refresca la pantalla y pone lo pintado
        repaint(0, 0, 1, 1);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        switch (ventanaHerramientas1.formaElegida) {

            case 0:
                miTiraLineas = new TiraLineas(evt.getX(), evt.getY(), panelColores.colorSeleccionado);
                miTiraLineas.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;
            case 3:
                miForma = new Triangulo(evt.getX(), evt.getY(), 4, panelColores.colorSeleccionado, ventanaHerramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;

            case 4:
                miForma = new Cuadrado(evt.getX(), evt.getY(), 4, panelColores.colorSeleccionado, ventanaHerramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;

            case 5:
                miForma = new Pentagono(evt.getX(), evt.getY(), 5, panelColores.colorSeleccionado, ventanaHerramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;

            case 1:
                miForma = new Circulo2(evt.getX(), evt.getY(), 100, panelColores.colorSeleccionado, ventanaHerramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;

            //Este caso sirve de pincel y de goma
            case 11:
                if (ventanaHerramientas1.goma) {
                    miPincel = new Pincel(evt.getX(), evt.getY(), panelColores.colorSeleccionadoGoma);
                } else {
                    miPincel = new Pincel(evt.getX(), evt.getY(), panelColores.colorSeleccionado);
                }

                miPincel.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;

            case 12:

                miSpray = new Spray(evt.getX(), evt.getY(), panelColores.colorSeleccionado);
                miSpray.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;

            case 256:
                miForma = new Estrella(evt.getX(), evt.getY(), panelColores.colorSeleccionado, ventanaHerramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
                break;
        }
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased

        if ((ventanaHerramientas1.formaElegida > 0 && ventanaHerramientas1.formaElegida <= 5) || ventanaHerramientas1.formaElegida == 256) {//Para que no dé error cuando no pintemos formas
            miForma.dibujate(bufferGraphics2, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
        } else if (ventanaHerramientas1.formaElegida == 0) {
            miTiraLineas.dibujate(bufferGraphics2, evt.getX(), evt.getY(), ventanaHerramientas1.grosorLinea);
        }
    }//GEN-LAST:event_jPanel1MouseReleased

    //Señala las coordenadas en las que están el ratón
    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved

        jLabelCoordenadas.setText(evt.getX() + " , " + evt.getY());
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jDialog2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void aceptarColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aceptarColorActionPerformed

    private void cancelarColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarColorActionPerformed
        jDialog2.setVisible(false);
    }//GEN-LAST:event_cancelarColorActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPaint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarColor;
    private javax.swing.JButton cancelarColor;
    private javax.swing.JButton jButton1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabelCoordenadas;
    private javax.swing.JPanel jPanel1;
    private codigo.panelColores panelColores;
    private codigo.VentanaHerramientas ventanaHerramientas1;
    // End of variables declaration//GEN-END:variables

}
