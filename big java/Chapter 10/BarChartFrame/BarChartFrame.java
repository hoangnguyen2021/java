import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BarChartFrame extends JFrame
{
   private JTextField textField1;
   private JTextField textField2;
   private JButton button;
   private ChartComponent chart;
   
   public BarChartFrame()
   {
      createComponents();
      setSize(400, 400);
   }
   
   
   class ClickListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         String label = textField1.getText();
         int length = Integer.parseInt(textField2.getText());
         chart.addLabel(label, length);
      }
   }

   private void createComponents()
   {
      textField1 = new JTextField(10);
      textField2 = new JTextField(10);
      button = new JButton("Add");
      chart = new ChartComponent();
      
      button.addActionListener(new ClickListener());
      chart.setPreferredSize(new Dimension(300, 300));
      
      JPanel panel = new JPanel();
      panel.add(textField1);
      panel.add(textField2);
      panel.add(button);
      panel.add(chart);
      add(panel);
   }
}