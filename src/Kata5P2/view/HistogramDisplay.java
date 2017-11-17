/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kata5P2.view;

import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

import Kata5P2.model.Histogram;

/**
 *
 * @author Marcos
 */
public class HistogramDisplay extends ApplicationFrame{
    
    private final Histogram<String> histogram;
    public  HistogramDisplay(Histogram<String> histogram){
        super("Histograma");
        this.histogram = histogram;
        setContentPane(createPanel());
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    
    public JPanel createPanel(){
        ChartPanel chartpanel = new ChartPanel(createChart(createDataset()));
        chartpanel.setPreferredSize(new Dimension(500, 400));
        return chartpanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart(
                "Histograma de emails", 
                "dominios email", 
                "nº de emails recibidos", 
                dataSet, 
                PlotOrientation.VERTICAL,
                false,
                rootPaneCheckingEnabled,
                rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        for (String key : histogram.keySet()) {
            dataSet.addValue(histogram.get(key), "", key);
        }
        return dataSet;
    }
    public static void CreateChart(){} 
    public static void CreateDataset(){}  
    
}