/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exploradorfinal.img;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author mmart
 */
public class telasLoreUm extends javax.swing.JFrame {

    /**
     * Creates new form telasLoreUm
     */
    public telasLoreUm() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                int x = JOptionPane.showConfirmDialog(null, "Você realmente deseja sair?", "AVISO", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if(x == JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
            
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        textoFeedback = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        labelImageira = new javax.swing.JLabel();
        labelFundilhos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setToolTipText("");
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        textoFeedback.setEditable(false);
        textoFeedback.setBackground(new java.awt.Color(0, 0, 0));
        textoFeedback.setColumns(20);
        textoFeedback.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        textoFeedback.setForeground(new java.awt.Color(255, 255, 255));
        textoFeedback.setRows(5);
        textoFeedback.setText("Você gira os cubos e os coloca na posição da resposta: \"1234\", \ntorcendo para ter acertado na conta dos ossos presentes naquela\ncâmara de morte.\n\nO monolito emite um barulho profundo, as engrenagens ocultas se\nmovendo nas profundezas do recinto. Os olhos da caveira se\nacendem e finalmente o monolito começa a descer, tornando-se\nparte do solo.\n\nO portão range com o esforço e se abre, revelando um novo\ncorredor.");
        jScrollPane2.setViewportView(textoFeedback);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 510, 250));

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGame/forward-arrow_icon-icons.com_72749.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 130, 70));

        labelImageira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImageira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGame/dungeonArt.jpeg"))); // NOI18N
        labelImageira.setText("jLabel2");
        getContentPane().add(labelImageira, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 380, 230));

        labelFundilhos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGame/fundoIndi.png"))); // NOI18N
        getContentPane().add(labelFundilhos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new telasFeedbackPositivo().setVisible(true); // Serve apenas como descrição em caso positivo, redireciona para feedPositivo.
        this.dispose(); // O ideal seria apenas uma tela, com um código para setar o texto de acordo com a tela origem
    }//GEN-LAST:event_jButton1ActionPerformed
      
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
            java.util.logging.Logger.getLogger(telasLoreUm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telasLoreUm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telasLoreUm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telasLoreUm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telasLoreUm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelFundilhos;
    private javax.swing.JLabel labelImageira;
    private javax.swing.JTextArea textoFeedback;
    // End of variables declaration//GEN-END:variables
}
