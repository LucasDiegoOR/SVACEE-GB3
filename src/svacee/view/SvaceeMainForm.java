package svacee.view;
// @author Ana Letícia, Lucas Diego e Matheus Quilles

public class SvaceeMainForm extends javax.swing.JFrame {

    public SvaceeMainForm() {
        initComponents();
        jbObterDadosCSV.setToolTipText("Obter dados de arquivo CSV");
        jbSair.setToolTipText("Sair do programa");
        jbTabelaDados.setToolTipText("Obter dados da tabela");
        jbGraficoConsumo.setToolTipText("Obter dados do gráfico");
        jbSobre.setToolTipText("Sobre o programa");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPainel = new javax.swing.JPanel();
        jtbBarraFerramentas = new javax.swing.JToolBar();
        jbObterDadosCSV = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jbTabelaDados = new javax.swing.JButton();
        jbGraficoConsumo = new javax.swing.JButton();
        jbSobre = new javax.swing.JButton();
        jlImg = new javax.swing.JLabel();
        jmbMenu = new javax.swing.JMenuBar();
        jmArquivo = new javax.swing.JMenu();
        jmiObterDadosCSV = new javax.swing.JMenuItem();
        jmiSair = new javax.swing.JMenuItem();
        jmVisualizar = new javax.swing.JMenu();
        jmiTabelaDados = new javax.swing.JMenuItem();
        jmiGraficoConsumo = new javax.swing.JMenuItem();
        jmAjuda = new javax.swing.JMenu();
        jmiSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Inicial");

        jtbBarraFerramentas.setFloatable(false);
        jtbBarraFerramentas.setRollover(true);
        jtbBarraFerramentas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jbObterDadosCSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/lista24.png"))); // NOI18N
        jbObterDadosCSV.setFocusable(false);
        jbObterDadosCSV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbObterDadosCSV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbBarraFerramentas.add(jbObterDadosCSV);

        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/sair24.png"))); // NOI18N
        jbSair.setFocusable(false);
        jbSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        jtbBarraFerramentas.add(jbSair);

        jbTabelaDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/tabela24.png"))); // NOI18N
        jbTabelaDados.setFocusable(false);
        jbTabelaDados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbTabelaDados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbBarraFerramentas.add(jbTabelaDados);

        jbGraficoConsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/grafico24.png"))); // NOI18N
        jbGraficoConsumo.setFocusable(false);
        jbGraficoConsumo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbGraficoConsumo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbBarraFerramentas.add(jbGraficoConsumo);

        jbSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/sobre24.png"))); // NOI18N
        jbSobre.setFocusable(false);
        jbSobre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSobre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbBarraFerramentas.add(jbSobre);

        jlImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/graficohome.jpg"))); // NOI18N

        javax.swing.GroupLayout jPainelLayout = new javax.swing.GroupLayout(jPainel);
        jPainel.setLayout(jPainelLayout);
        jPainelLayout.setHorizontalGroup(
            jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtbBarraFerramentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jlImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPainelLayout.setVerticalGroup(
            jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelLayout.createSequentialGroup()
                .addComponent(jtbBarraFerramentas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPainel, java.awt.BorderLayout.CENTER);

        jmbMenu.setBackground(new java.awt.Color(66, 127, 226));

        jmArquivo.setText("Arquivo");
        jmArquivo.setFont(new java.awt.Font("Noto Sans", 0, 13)); // NOI18N

        jmiObterDadosCSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/lista.png"))); // NOI18N
        jmiObterDadosCSV.setText("Obter Dados de CSV");
        jmiObterDadosCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiObterDadosCSVActionPerformed(evt);
            }
        });
        jmArquivo.add(jmiObterDadosCSV);

        jmiSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/sair.png"))); // NOI18N
        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jmArquivo.add(jmiSair);

        jmbMenu.add(jmArquivo);

        jmVisualizar.setText("Visualizar");
        jmVisualizar.setFont(new java.awt.Font("Noto Sans", 0, 13)); // NOI18N

        jmiTabelaDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/tabela.png"))); // NOI18N
        jmiTabelaDados.setText("Tabela de Dados");
        jmiTabelaDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTabelaDadosActionPerformed(evt);
            }
        });
        jmVisualizar.add(jmiTabelaDados);

        jmiGraficoConsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/grafico.png"))); // NOI18N
        jmiGraficoConsumo.setText("Gráfico de Consumo");
        jmVisualizar.add(jmiGraficoConsumo);

        jmbMenu.add(jmVisualizar);

        jmAjuda.setText("Ajuda");
        jmAjuda.setFont(new java.awt.Font("Noto Sans", 0, 13)); // NOI18N

        jmiSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/sobre.png"))); // NOI18N
        jmiSobre.setText("Sobre");
        jmAjuda.add(jmiSobre);

        jmbMenu.add(jmAjuda);

        setJMenuBar(jmbMenu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiTabelaDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTabelaDadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiTabelaDadosActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jmiObterDadosCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiObterDadosCSVActionPerformed

    }//GEN-LAST:event_jmiObterDadosCSVActionPerformed

//    public void obterDadosCSV (método para ser usado em mais de um lugar)
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
            java.util.logging.Logger.getLogger(SvaceeMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SvaceeMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SvaceeMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SvaceeMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SvaceeMainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPainel;
    private javax.swing.JButton jbGraficoConsumo;
    private javax.swing.JButton jbObterDadosCSV;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSobre;
    private javax.swing.JButton jbTabelaDados;
    private javax.swing.JLabel jlImg;
    private javax.swing.JMenu jmAjuda;
    private javax.swing.JMenu jmArquivo;
    private javax.swing.JMenu jmVisualizar;
    private javax.swing.JMenuBar jmbMenu;
    private javax.swing.JMenuItem jmiGraficoConsumo;
    private javax.swing.JMenuItem jmiObterDadosCSV;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JMenuItem jmiSobre;
    private javax.swing.JMenuItem jmiTabelaDados;
    private javax.swing.JToolBar jtbBarraFerramentas;
    // End of variables declaration//GEN-END:variables
}
