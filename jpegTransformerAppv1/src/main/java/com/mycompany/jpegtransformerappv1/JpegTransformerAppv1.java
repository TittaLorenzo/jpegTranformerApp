/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.jpegtransformerappv1;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author loren
 */
public class JpegTransformerAppv1 extends javax.swing.JFrame {

    public String imagePath;
    public ImageIcon immagine = new ImageIcon("");

    /**
     * Creates new form JpegTransformerApp
     */
    public JpegTransformerAppv1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelImage = new javax.swing.JPanel();
        jPanelPathImage = new javax.swing.JPanel();
        jLabelPathImage = new javax.swing.JLabel();
        jButtonPathImage = new javax.swing.JButton();
        jTextFieldPathImage = new javax.swing.JTextField();
        jLabelOriginalImageText = new javax.swing.JLabel();
        jLabelModifiedImageText = new javax.swing.JLabel();
        jLabelOriginalImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelControl = new javax.swing.JPanel();
        jLabelAmpiezza = new javax.swing.JLabel();
        jTextFieldAmpiezza = new javax.swing.JTextField();
        jButtonAmpiezzaMeno = new javax.swing.JButton();
        jButtonAmpiezzaPiu = new javax.swing.JButton();
        jLabelTaglio = new javax.swing.JLabel();
        jTextFieldTaglio = new javax.swing.JTextField();
        jButtonTaglioMeno = new javax.swing.JButton();
        jButtonTaglioPiu = new javax.swing.JButton();
        jButtonElabora = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jpeg Transformer App");
        setBackground(new java.awt.Color(255, 204, 102));

        jPanelImage.setBackground(new java.awt.Color(255, 204, 153));

        jPanelPathImage.setBackground(new java.awt.Color(207, 200, 182));

        jLabelPathImage.setText("Scegli l'immagine (.bmp) da elaborare:");

        jButtonPathImage.setText("Browse");
        jButtonPathImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPathImageActionPerformed(evt);
            }
        });

        jTextFieldPathImage.setToolTipText("scegli l'immagine ...");
        jTextFieldPathImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPathImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPathImageLayout = new javax.swing.GroupLayout(jPanelPathImage);
        jPanelPathImage.setLayout(jPanelPathImageLayout);
        jPanelPathImageLayout.setHorizontalGroup(
            jPanelPathImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPathImageLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelPathImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPathImage)
                    .addGroup(jPanelPathImageLayout.createSequentialGroup()
                        .addComponent(jButtonPathImage)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldPathImage, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPathImageLayout.setVerticalGroup(
            jPanelPathImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPathImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPathImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPathImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPathImage)
                    .addComponent(jTextFieldPathImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabelOriginalImageText.setText("Immagine originale:");

        jLabelModifiedImageText.setText("Immagine modificata:");

        javax.swing.GroupLayout jPanelImageLayout = new javax.swing.GroupLayout(jPanelImage);
        jPanelImage.setLayout(jPanelImageLayout);
        jPanelImageLayout.setHorizontalGroup(
            jPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPathImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelImageLayout.createSequentialGroup()
                        .addGroup(jPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelOriginalImageText)
                            .addComponent(jLabelOriginalImage, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelImageLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabelModifiedImageText)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImageLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanelImageLayout.setVerticalGroup(
            jPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPathImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOriginalImageText)
                    .addComponent(jLabelModifiedImageText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jLabelOriginalImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanelControl.setBackground(new java.awt.Color(255, 204, 153));
        jPanelControl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelControl.setName(""); // NOI18N

        jLabelAmpiezza.setText("Scegliere ampiezza finestra:");

        jTextFieldAmpiezza.setText("1");
        jTextFieldAmpiezza.setToolTipText("");
        jTextFieldAmpiezza.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldAmpiezza.setName(""); // NOI18N
        jTextFieldAmpiezza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CheckAmpiezza(evt);
            }
        });

        jButtonAmpiezzaMeno.setText("-");
        jButtonAmpiezzaMeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAmpiezzaMenoActionPerformed(evt);
            }
        });

        jButtonAmpiezzaPiu.setText("+");
        jButtonAmpiezzaPiu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAmpiezzaPiuActionPerformed(evt);
            }
        });

        jLabelTaglio.setText("Scegliere taglio frequenza:");

        jTextFieldTaglio.setText("0");
        jTextFieldTaglio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldTaglio.setName(""); // NOI18N
        jTextFieldTaglio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTaglioActionPerformed(evt);
            }
        });
        jTextFieldTaglio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                checkTaglio(evt);
            }
        });

        jButtonTaglioMeno.setText("-");
        jButtonTaglioMeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTaglioMenoActionPerformed(evt);
            }
        });

        jButtonTaglioPiu.setText("+");
        jButtonTaglioPiu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTaglioPiuActionPerformed(evt);
            }
        });

        jButtonElabora.setText("Elaborazione");
        jButtonElabora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonElaboraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelControlLayout = new javax.swing.GroupLayout(jPanelControl);
        jPanelControl.setLayout(jPanelControlLayout);
        jPanelControlLayout.setHorizontalGroup(
            jPanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelControlLayout.createSequentialGroup()
                .addGroup(jPanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelControlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAmpiezza)
                            .addGroup(jPanelControlLayout.createSequentialGroup()
                                .addComponent(jTextFieldAmpiezza, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAmpiezzaMeno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAmpiezzaPiu))
                            .addComponent(jLabelTaglio)
                            .addGroup(jPanelControlLayout.createSequentialGroup()
                                .addComponent(jTextFieldTaglio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonTaglioMeno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonTaglioPiu))))
                    .addGroup(jPanelControlLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButtonElabora)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanelControlLayout.setVerticalGroup(
            jPanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelControlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelAmpiezza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAmpiezza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAmpiezzaMeno)
                    .addComponent(jButtonAmpiezzaPiu))
                .addGap(42, 42, 42)
                .addComponent(jLabelTaglio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTaglio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTaglioMeno)
                    .addComponent(jButtonTaglioPiu))
                .addGap(58, 58, 58)
                .addComponent(jButtonElabora)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPathImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPathImageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPathImageActionPerformed

    private void jButtonPathImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPathImageActionPerformed
        if (evt.getSource() == jButtonPathImage) {
            //codice che inserisce immagine nel textfield e nella variabile imagePath
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "BMP Images", "bmp");
            fileChooser.setFileFilter(filter);
            int response = fileChooser.showOpenDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                imagePath = fileChooser.getSelectedFile().getAbsolutePath();
                File file = new File(imagePath);
                //resize dell'immagine
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new File(imagePath));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                
                int n = Integer.parseInt(jTextFieldAmpiezza.getText());
                
                Image dimg = img.getScaledInstance(jLabelOriginalImage.getWidth(), jLabelOriginalImage.getHeight(),
                        Image.SCALE_SMOOTH);
                immagine = new ImageIcon(dimg);
                jLabelOriginalImage.setIcon(immagine);
                jTextFieldPathImage.setText(imagePath);
                //System.out.println(file);
            }
        }
    }//GEN-LAST:event_jButtonPathImageActionPerformed

    private void jButtonAmpiezzaPiuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAmpiezzaPiuActionPerformed
         jTextFieldAmpiezza.setText(Integer.toString(Integer.parseInt(jTextFieldAmpiezza.getText())+1));
    }//GEN-LAST:event_jButtonAmpiezzaPiuActionPerformed

    private void jButtonTaglioPiuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTaglioPiuActionPerformed
        if(Integer.parseInt(jTextFieldTaglio.getText()) < ((2 * (Integer.parseInt(jTextFieldAmpiezza.getText()))) - 2)){
            jTextFieldTaglio.setText(Integer.toString(Integer.parseInt(jTextFieldTaglio.getText())+1));
        }
    }//GEN-LAST:event_jButtonTaglioPiuActionPerformed

    private void jButtonElaboraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonElaboraActionPerformed
        
    }//GEN-LAST:event_jButtonElaboraActionPerformed

    private void CheckAmpiezza(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CheckAmpiezza
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_CheckAmpiezza

    private void jButtonAmpiezzaMenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAmpiezzaMenoActionPerformed
        if(Integer.parseInt(jTextFieldAmpiezza.getText()) > 0){
            jTextFieldAmpiezza.setText(Integer.toString(Integer.parseInt(jTextFieldAmpiezza.getText())-1));
        }
    }//GEN-LAST:event_jButtonAmpiezzaMenoActionPerformed

    private void jTextFieldTaglioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTaglioActionPerformed
        
    }//GEN-LAST:event_jTextFieldTaglioActionPerformed

    private void jButtonTaglioMenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTaglioMenoActionPerformed
        if(Integer.parseInt(jTextFieldTaglio.getText()) > 0){
            jTextFieldTaglio.setText(Integer.toString(Integer.parseInt(jTextFieldTaglio.getText())-1));
        }
    }//GEN-LAST:event_jButtonTaglioMenoActionPerformed

    private void checkTaglio(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkTaglio
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_checkTaglio

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
            java.util.logging.Logger.getLogger(JpegTransformerAppv1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JpegTransformerAppv1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JpegTransformerAppv1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JpegTransformerAppv1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JpegTransformerAppv1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAmpiezzaMeno;
    private javax.swing.JButton jButtonAmpiezzaPiu;
    private javax.swing.JButton jButtonElabora;
    private javax.swing.JButton jButtonPathImage;
    private javax.swing.JButton jButtonTaglioMeno;
    private javax.swing.JButton jButtonTaglioPiu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAmpiezza;
    private javax.swing.JLabel jLabelModifiedImageText;
    private javax.swing.JLabel jLabelOriginalImage;
    private javax.swing.JLabel jLabelOriginalImageText;
    private javax.swing.JLabel jLabelPathImage;
    private javax.swing.JLabel jLabelTaglio;
    private javax.swing.JPanel jPanelControl;
    private javax.swing.JPanel jPanelImage;
    private javax.swing.JPanel jPanelPathImage;
    private javax.swing.JTextField jTextFieldAmpiezza;
    private javax.swing.JTextField jTextFieldPathImage;
    private javax.swing.JTextField jTextFieldTaglio;
    // End of variables declaration//GEN-END:variables
}
