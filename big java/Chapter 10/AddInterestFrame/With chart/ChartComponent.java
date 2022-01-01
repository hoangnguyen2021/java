import java.awt.Graphics;
import javax.swing.*;
import java.util.ArrayList;

public class ChartComponent extends JComponent
{
   private ArrayList<Double> values;
   
   public ChartComponent()
   {
      values = new ArrayList<Double>();
   }
   
   public void displayChart(double value)
   {
      values.add(value);
      repaint();
   }
   
   public void paintComponent(Graphics g)
   {
      int y = 5;
      for (double value : values)
      {
         int barWidth = (int) (getWidth() * value / 3000);
         g.fillRect(0, y, barWidth, 10);
         y = y + 15;
      }
   }
}