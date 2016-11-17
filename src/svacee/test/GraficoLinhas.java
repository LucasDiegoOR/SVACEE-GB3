package svacee.test;
// @author Ana Letícia, Lucas Diego e Matheus Quilles

import java.text.SimpleDateFormat;
import javax.swing.JDialog;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.time.Month;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;

public class GraficoLinhas extends JDialog {

    public static void main(String[] args) {
        GraficoLinhas grafico = new GraficoLinhas();
        grafico.pack();
        grafico.setVisible(true);
    }

    public GraficoLinhas() {
        ChartPanel chartPanel = createPanel();
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 300));
        super.setContentPane(chartPanel);
        super.setTitle("Exemplo de Grafico");
    }

    public static ChartPanel createPanel() {
        TimeSeries series1 = new TimeSeries("Series 1");
        series1.add(new Month(1, 2013), 55);
        series1.add(new Month(2, 2013), 41);
        series1.add(new Month(3, 2013), 32);
        series1.add(new Month(4, 2013), 30);
        series1.add(new Month(5, 2013), 25);
        series1.add(new Month(6, 2013), 20);
        series1.add(new Month(7, 2013), 22);
        series1.add(new Month(8, 2013), 17);
        series1.add(new Month(9, 2013), 10);

        TimeSeries series2 = new TimeSeries("Series 2");
        series2.add(new Month(1, 2013), 10);
        series2.add(new Month(2, 2013), 17);
        series2.add(new Month(3, 2013), 22);
        series2.add(new Month(4, 2013), 20);
        series2.add(new Month(5, 2013), 25);
        series2.add(new Month(6, 2013), 30);
        series2.add(new Month(7, 2013), 32);
        series2.add(new Month(8, 2013), 41);
        series2.add(new Month(9, 2013), 55);

        TimeSeriesCollection dataset = new TimeSeriesCollection();
        dataset.addSeries(series1);
        dataset.addSeries(series2);

        JFreeChart chart = createChart(dataset);
        return new ChartPanel(chart);
    }

    private static JFreeChart createChart(XYDataset dataset) {
        JFreeChart chart = ChartFactory.createTimeSeriesChart("Exemplo de Gráfico", "Eixo X", "Eixo Y", dataset, true, true, false);
        XYPlot plot = (XYPlot) chart.getPlot();
        XYItemRenderer r = plot.getRenderer();
        if (r instanceof XYLineAndShapeRenderer) {
            XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer) r;
            renderer.setBaseShapesVisible(true);
            renderer.setBaseShapesFilled(true);
        }
        DateAxis axis = (DateAxis) plot.getDomainAxis();
        axis.setDateFormatOverride(new SimpleDateFormat("MMM-yyyy"));
        return chart;
    }

}
