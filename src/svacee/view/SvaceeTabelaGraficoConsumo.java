package svacee.view;
// @author Ana Letícia, Lucas Diego e Matheus Quilles

import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
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

public class SvaceeTabelaGraficoConsumo extends javax.swing.JFrame {

    SvaceeDadoConsumoCtrl sdcc = new SvaceeDadoConsumoCtrl();
    String itemSelecionado;

//    public void abrirAbaTabela(){
//        jtpGuias.setSelectedComponent(jpGrafico);
//    }
    
    public SvaceeTabelaGraficoConsumo() {
        initComponents();
        jbSair.setToolTipText("Voltar à Tela Inicial");
    }

    public void preencherComboBox() {
        getJcbPontoColeta().removeAllItems();

        Iterator i = sdcc.getListaPontoColeta().iterator();
        while (i.hasNext()) {
            getJcbPontoColeta().addItem((String) i.next());
        }
    }
    
    public void montarGrafico() {
        JPanel grafico = createChartPanel();
        add(grafico, BorderLayout.CENTER);
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    private JPanel createChartPanel() {
        String chartTitle = "Gráfico de consumo:" + itemSelecionado;
        String xAxisLabel = "Hora (Hora.minuto)";
        String yAxisLabel = "Valor KwH";

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

        //dc = new SvaceeDadoConsumo();
        SimpleDateFormat formataHora = new SimpleDateFormat("HH.mm");
        //String formatedDate = format.format(dc.getDataHra().getTime());

        for (SvaceeDadoConsumo dc : sdcc.getListaGrafico()) {
            linha.add(Double.parseDouble(formataHora.format(dc.getDataHora())), dc.getValorKwH());
            //System.out.println(format.format(dc.getDataHra()).substring(0, 2)+"."+format.format(dc.getDataHra()).substring(1, 2));
            //System.out.println(formataHora.format(dc.getDataHra()));
        }
        dataset.addSeries(linha);

        return dataset;
    }
    
    public void setTableModel(TableModel model){
        jTabela.setModel(model);
    }
    
    public DefaultTableModel getTableModel(){
        return (DefaultTableModel) jTabela.getModel();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPainel = new javax.swing.JPanel();
        jbSair = new javax.swing.JButton();
        jlTitulo = new javax.swing.JLabel();
        jtpGuias = new javax.swing.JTabbedPane();
        jpTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        jpGrafico = new javax.swing.JPanel();
        jbVisualizarGrafico = new javax.swing.JButton();
        jlInfo = new javax.swing.JLabel();
        jcbPontoColeta = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabela de Consumo de Energia - SVACEE");

        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/sair24.png"))); // NOI18N
        jbSair.setFocusable(false);
        jbSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jlTitulo.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Tabela e Gráfico de Consumo de Energia");

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpGuias.addTab("Tabela", jpTabela);

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
                .addGap(31, 31, 31)
                .addGroup(jpGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpGraficoLayout.createSequentialGroup()
                        .addComponent(jlInfo)
                        .addGap(18, 18, 18)
                        .addComponent(jcbPontoColeta, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpGraficoLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jbVisualizarGrafico)))
                .addContainerGap(41, Short.MAX_VALUE))
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
                .addContainerGap(206, Short.MAX_VALUE))
        );

        jtpGuias.addTab("Visualizar Gráfico", jpGrafico);

        javax.swing.GroupLayout jPainelLayout = new javax.swing.GroupLayout(jPainel);
        jPainel.setLayout(jPainelLayout);
        jPainelLayout.setHorizontalGroup(
            jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtpGuias)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPainelLayout.setVerticalGroup(
            jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSair))
                .addGap(18, 18, 18)
                .addComponent(jtpGuias)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbVisualizarGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVisualizarGraficoActionPerformed
        montarGrafico();
    }//GEN-LAST:event_jbVisualizarGraficoActionPerformed

    private void jcbPontoColetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPontoColetaActionPerformed
        sdcc.getListaGrafico().clear();
        String item = (String) getJcbPontoColeta().getSelectedItem();
        sdcc.preencherGrafico(item);
        itemSelecionado = item;
    }//GEN-LAST:event_jcbPontoColetaActionPerformed

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
            java.util.logging.Logger.getLogger(SvaceeTabelaGraficoConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SvaceeTabelaGraficoConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SvaceeTabelaGraficoConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SvaceeTabelaGraficoConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SvaceeTabelaGraficoConsumo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPainel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabela;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbVisualizarGrafico;
    private javax.swing.JComboBox<String> jcbPontoColeta;
    private javax.swing.JLabel jlInfo;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JPanel jpGrafico;
    private javax.swing.JPanel jpTabela;
    private javax.swing.JTabbedPane jtpGuias;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the jcbPontoColeta
     */
    public javax.swing.JComboBox<String> getJcbPontoColeta() {
        return jcbPontoColeta;
    }

    /**
     * @param jcbPontoColeta the jcbPontoColeta to set
     */
    public void setJcbPontoColeta(javax.swing.JComboBox<String> jcbPontoColeta) {
        this.jcbPontoColeta = jcbPontoColeta;
    }
}
