import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class ChartComponent extends JComponent
{
   ArrayList<String> labels;
   ArrayList<Integer> lengths;
   
   public ChartComponent()
   {
      labels = new ArrayList<String>();
      lengths = new ArrayList<Integer>();
   }
   
   public void addLabel(String label, int length)
   {
      labels.add(label);
      lengths.add(length);
      repaint();
   }
   
   public void paintComponent(Graphics g)
   {
      for(int i = 0; i < labels.size(); i++)
      {
         final int GAP = 5;
         final int BAR_HEIGHT = 14;
         g.setColor(Color.BLACK);
         g.fillRect(0, 4 + (BAR_HEIGHT + GAP) * i, lengths.get(i), BAR_HEIGHT);
         g.setColor(Color.WHITE);
         g.drawString(labels.get(i), 0, 15 + (BAR_HEIGHT + GAP) * i);
      }
   }
}
