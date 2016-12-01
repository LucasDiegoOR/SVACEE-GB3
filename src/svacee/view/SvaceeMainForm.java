package svacee.view;
// @author Ana Letícia, Lucas Diego e Matheus Quilles

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import svacee.ctrl.SvaceeDadoConsumoCtrl;
import svacee.entity.SvaceeDadoConsumo;

public class SvaceeMainForm extends javax.swing.JFrame {

    SvaceeDadoConsumoCtrl sdcc;
    SvaceeDadoConsumo sdc;
    String itemSelecionado;

    public SvaceeMainForm() {
        initComponents();
        sdcc = new SvaceeDadoConsumoCtrl();
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
        jbTabelaDados = new javax.swing.JButton();
        jbGraficoConsumo = new javax.swing.JButton();
        jbSobre = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jtpGuias = new javax.swing.JTabbedPane();
        jpPaginaInicial = new javax.swing.JPanel();
        jlImg = new javax.swing.JLabel();
        jpTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        jpGrafico = new javax.swing.JPanel();
        jbVisualizarGrafico = new javax.swing.JButton();
        jlInfo = new javax.swing.JLabel();
        jcbPontoColeta = new javax.swing.JComboBox<>();
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
        setTitle("Tela Inicial - SVACEE");

        jtbBarraFerramentas.setFloatable(false);
        jtbBarraFerramentas.setRollover(true);
        jtbBarraFerramentas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jbObterDadosCSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/lista24.png"))); // NOI18N
        jbObterDadosCSV.setFocusable(false);
        jbObterDadosCSV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbObterDadosCSV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbObterDadosCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbObterDadosCSVActionPerformed(evt);
            }
        });
        jtbBarraFerramentas.add(jbObterDadosCSV);

        jbTabelaDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/tabela24.png"))); // NOI18N
        jbTabelaDados.setFocusable(false);
        jbTabelaDados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbTabelaDados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbTabelaDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTabelaDadosActionPerformed(evt);
            }
        });
        jtbBarraFerramentas.add(jbTabelaDados);

        jbGraficoConsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/grafico24.png"))); // NOI18N
        jbGraficoConsumo.setFocusable(false);
        jbGraficoConsumo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbGraficoConsumo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbGraficoConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGraficoConsumoActionPerformed(evt);
            }
        });
        jtbBarraFerramentas.add(jbGraficoConsumo);

        jbSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/sobre24.png"))); // NOI18N
        jbSobre.setFocusable(false);
        jbSobre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSobre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSobreActionPerformed(evt);
            }
        });
        jtbBarraFerramentas.add(jbSobre);

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

        jlImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/graficohome.png"))); // NOI18N

        javax.swing.GroupLayout jpPaginaInicialLayout = new javax.swing.GroupLayout(jpPaginaInicial);
        jpPaginaInicial.setLayout(jpPaginaInicialLayout);
        jpPaginaInicialLayout.setHorizontalGroup(
            jpPaginaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPaginaInicialLayout.createSequentialGroup()
                .addComponent(jlImg)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpPaginaInicialLayout.setVerticalGroup(
            jpPaginaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPaginaInicialLayout.createSequentialGroup()
                .addComponent(jlImg)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jtpGuias.addTab("Página Inicial", jpPaginaInicial);

        jTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data e Hora", "Valor ID Ponto Coleta", "Valor KwH"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTabela);

        javax.swing.GroupLayout jpTabelaLayout = new javax.swing.GroupLayout(jpTabela);
        jpTabela.setLayout(jpTabelaLayout);
        jpTabelaLayout.setHorizontalGroup(
            jpTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jpTabelaLayout.setVerticalGroup(
            jpTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        jtpGuias.addTab("Tabela", jpTabela);

        jbVisualizarGrafico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/grafico256.png"))); // NOI18N
        jbVisualizarGrafico.setText("Visualizar gráfico");
        jbVisualizarGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVisualizarGraficoActionPerformed(evt);
            }
        });

        jlInfo.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        jlInfo.setText("Selecionar gráfico por equipamento:");

        jcbPontoColeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPontoColetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpGraficoLayout = new javax.swing.GroupLayout(jpGrafico);
        jpGrafico.setLayout(jpGraficoLayout);
        jpGraficoLayout.setHorizontalGroup(
            jpGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGraficoLayout.createSequentialGroup()
                .addGroup(jpGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpGraficoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jlInfo)
                        .addGap(18, 18, 18)
                        .addComponent(jcbPontoColeta, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpGraficoLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jbVisualizarGrafico)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jpGraficoLayout.setVerticalGroup(
            jpGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGraficoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jpGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlInfo)
                    .addComponent(jcbPontoColeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jbVisualizarGrafico)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jtpGuias.addTab("Visualizar Gráfico", jpGrafico);

        javax.swing.GroupLayout jPainelLayout = new javax.swing.GroupLayout(jPainel);
        jPainel.setLayout(jPainelLayout);
        jPainelLayout.setHorizontalGroup(
            jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtbBarraFerramentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpGuias, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPainelLayout.setVerticalGroup(
            jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelLayout.createSequentialGroup()
                .addComponent(jtbBarraFerramentas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtpGuias, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPainel, java.awt.BorderLayout.CENTER);

        jmbMenu.setBackground(new java.awt.Color(79, 145, 254));

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
        jmiGraficoConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGraficoConsumoActionPerformed(evt);
            }
        });
        jmVisualizar.add(jmiGraficoConsumo);

        jmbMenu.add(jmVisualizar);

        jmAjuda.setText("Ajuda");
        jmAjuda.setFont(new java.awt.Font("Noto Sans", 0, 13)); // NOI18N

        jmiSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/sobre.png"))); // NOI18N
        jmiSobre.setText("Sobre");
        jmiSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSobreActionPerformed(evt);
            }
        });
        jmAjuda.add(jmiSobre);

        jmbMenu.add(jmAjuda);

        setJMenuBar(jmbMenu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void buscarArquivoCSV() {

        try {
            sdcc.getDados().clear();
            JFileChooser jfc = new JFileChooser();
            int retorno = jfc.showOpenDialog(null);
            if (retorno == JFileChooser.APPROVE_OPTION) {
                File arq = jfc.getSelectedFile();

                sdcc.obterDadosCSV(arq);
                sdcc.preencherPontoColeta();
                preencherTabela();
                preencherComboBox();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }

    public void preencherTabela() {
        DefaultTableModel model = (DefaultTableModel) jTabela.getModel();
        model.getDataVector().removeAllElements();

        for (SvaceeDadoConsumo sdc : sdcc.getDados()) {
            model.addRow(new Object[]{sdc.getDataHora(), sdc.getIdPontoColeta(), sdc.getValorKwH()});
        }
    }

    public void preencherComboBox() {
        jcbPontoColeta.removeAllItems();

        Iterator i = sdcc.getListaPontoColeta().iterator();
        while (i.hasNext()) {
            jcbPontoColeta.addItem((String) i.next());
        }
    }

    public void criarGrafico() {
        if (sdcc.getTeste() == 2) {
            if (jtpGuias.getTabCount() == 4) {
                jtpGuias.remove(3);
            }

            JPanel grafico = createChartPanel();
            jtpGuias.add(grafico, "Gráfico de Consumo");
            jtpGuias.setSelectedComponent(grafico);
        } else {
            JOptionPane.showMessageDialog(this, "O gráfico ainda não pode ser visualizado!"
                    + "\nBusque e selecione o arquivo CSV!",
                    "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

    }

    private JPanel createChartPanel() {
        String chartTitle = "Gráfico de Consumo: " + itemSelecionado;
        String xAxisLabel = "Hora (Hora,minuto)";
        String yAxisLabel = "Valor KwH (Quilowatt-hora)";

        XYDataset dataset = createDataset();

        JFreeChart chart = ChartFactory.createXYLineChart(chartTitle,
                xAxisLabel, yAxisLabel, dataset);

        XYPlot plot = chart.getXYPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        plot.setRenderer(renderer);

        return new ChartPanel(chart);
    }

    private XYDataset createDataset() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries linha = new XYSeries(itemSelecionado);

        SimpleDateFormat formataHora = new SimpleDateFormat("HH.mm");

        for (SvaceeDadoConsumo dc : sdcc.getListaGrafico()) {
            linha.add(Double.parseDouble(formataHora.format(dc.getDataHora())), dc.getValorKwH());
        }
        dataset.addSeries(linha);

        return dataset;
    }

    private void jmiTabelaDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTabelaDadosActionPerformed
        jtpGuias.setSelectedComponent(jpTabela);
    }//GEN-LAST:event_jmiTabelaDadosActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jmiObterDadosCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiObterDadosCSVActionPerformed
        buscarArquivoCSV();
    }//GEN-LAST:event_jmiObterDadosCSVActionPerformed

    private void jmiGraficoConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGraficoConsumoActionPerformed
        jtpGuias.setSelectedComponent(jpGrafico);
    }//GEN-LAST:event_jmiGraficoConsumoActionPerformed

    private void jmiSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSobreActionPerformed
        new SvaceeSobre().setVisible(true);
    }//GEN-LAST:event_jmiSobreActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSobreActionPerformed
        new SvaceeSobre().setVisible(true);
    }//GEN-LAST:event_jbSobreActionPerformed

    private void jbGraficoConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGraficoConsumoActionPerformed
        jtpGuias.setSelectedComponent(jpGrafico);
    }//GEN-LAST:event_jbGraficoConsumoActionPerformed

    private void jbTabelaDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTabelaDadosActionPerformed
        jtpGuias.setSelectedComponent(jpTabela);
    }//GEN-LAST:event_jbTabelaDadosActionPerformed

    private void jbObterDadosCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObterDadosCSVActionPerformed
        buscarArquivoCSV();
    }//GEN-LAST:event_jbObterDadosCSVActionPerformed

    private void jbVisualizarGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVisualizarGraficoActionPerformed
        criarGrafico();
    }//GEN-LAST:event_jbVisualizarGraficoActionPerformed

    private void jcbPontoColetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPontoColetaActionPerformed
        sdcc.getListaGrafico().clear();
        String item = (String) jcbPontoColeta.getSelectedItem();
        sdcc.preencherGrafico(item);
        itemSelecionado = item;
    }//GEN-LAST:event_jcbPontoColetaActionPerformed

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
            java.util.logging.Logger.getLogger(SvaceeMainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SvaceeMainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SvaceeMainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SvaceeMainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabela;
    private javax.swing.JButton jbGraficoConsumo;
    private javax.swing.JButton jbObterDadosCSV;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSobre;
    private javax.swing.JButton jbTabelaDados;
    private javax.swing.JButton jbVisualizarGrafico;
    private javax.swing.JComboBox<String> jcbPontoColeta;
    private javax.swing.JLabel jlImg;
    private javax.swing.JLabel jlInfo;
    private javax.swing.JMenu jmAjuda;
    private javax.swing.JMenu jmArquivo;
    private javax.swing.JMenu jmVisualizar;
    private javax.swing.JMenuBar jmbMenu;
    private javax.swing.JMenuItem jmiGraficoConsumo;
    private javax.swing.JMenuItem jmiObterDadosCSV;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JMenuItem jmiSobre;
    private javax.swing.JMenuItem jmiTabelaDados;
    private javax.swing.JPanel jpGrafico;
    private javax.swing.JPanel jpPaginaInicial;
    private javax.swing.JPanel jpTabela;
    private javax.swing.JToolBar jtbBarraFerramentas;
    private javax.swing.JTabbedPane jtpGuias;
    // End of variables declaration//GEN-END:variables
}
