import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;

public class InvestmentFrame extends JFrame
{
   private JLabel label;
   private JTextField textField;
   private JButton button;
   private JTextArea textArea;
   private JScrollPane scrollPane;
   private ChartComponent chart;
   
   private double balance;
   
   public InvestmentFrame()
   {
      balance = 1000;
           
      createComponents();
      setSize(500, 500);
   }
   
   private void createComponents()
   {     
      label = new JLabel("Interest Rate: ");
      textField = new JTextField(10);
      button = new JButton("Add Interest");
      textArea = new JTextArea(8, 20);
      scrollPane = new JScrollPane(textArea);
      chart = new ChartComponent();

      textField.setText(1.0 + "");
      button.addActionListener(new AddInterestListener());
      textArea.setText(balance + "\n");
      textArea.setEditable(false);
      chart.displayChart(balance);
      chart.setPreferredSize(new Dimension(300, 300));
      
      JPanel panel = new JPanel();
      panel.add(label);
      panel.add(textField);
      panel.add(button);
      panel.add(scrollPane);
      panel.add(chart);
      add(panel);
   }
   
   class AddInterestListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         double interestRate = Double.parseDouble(textField.getText());
         balance = balance + balance * interestRate / 100;
         textArea.append(balance + "\n");
         chart.displayChart(balance);
      }
   }
}