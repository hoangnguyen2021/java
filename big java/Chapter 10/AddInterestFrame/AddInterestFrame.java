import java.awt.event.*;
import javax.swing.*;

public class AddInterestFrame extends JFrame
{
   private JButton button;
   private JLabel label1;
   private JTextField textField;
   private JTextArea textArea;
   private JScrollPane scrollPane;
   
   private static final double DEFAULT_RATE = 5;
   private double balance;
   
   public AddInterestFrame()
   {
      balance = 1000;
      
      createComponents();
      setSize(500, 300);
   }
   
   class AddInterestListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         double interestRate = Double.parseDouble(textField.getText());
         balance = balance * (1 + interestRate / 100);
         textArea.append(balance + "\n");
      }
   }

   private void createComponents()
   {
      label1 = new JLabel("Interest Rate: ");
      textField = new JTextField(10);
      button = new JButton("Add Interest");
      textArea = new JTextArea(8, 15);
      scrollPane = new JScrollPane(textArea);
      
      textField.setText("" + DEFAULT_RATE);
      button.addActionListener(new AddInterestListener());
      textArea.setText(balance + "\n");
      textArea.setEditable(false);
      
      JPanel panel = new JPanel();
      panel.add(label1);
      panel.add(textField);
      panel.add(button);
      panel.add(scrollPane);
      add(panel);
   }
}