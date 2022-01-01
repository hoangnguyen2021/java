import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//change class name, constructor
public class SampleFrame extends JFrame
{
   private static final int FRAME_WIDTH = 300;
   private static final int FRAME_HEIGHT = 300;
   private JLabel label;
   private JButton button;
   
   
   //add instance variables here
   
   public SampleFrame()
   {
      //initialize instance variables here
      
      createComponents();
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
   }
   
   
   //change listener class name
   class ClickListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         //actions performed after clicking the button
      }
   }

   private void createComponents()
   {
      label = new JLabel("Label");
      button = new JButton("Button");
      
      button.addActionListener(new ClickListener());
      
      JPanel panel = new JPanel();
      panel.add(label);
      panel.add(button);
      add(panel);
   }
}