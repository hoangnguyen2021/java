import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.util.*;

public class CrossWordFrame extends JFrame
{
   private static final int FRAME_WIDTH = 400;
   private static final int FRAME_HEIGHT = 400;
   private ArrayList<JTextField> fields;
   private JPanel mainPanel;
   private JPanel fieldPanel;
   private JButton addButton;
   private JButton removeButton;
   private JButton searchButton;
   private JTextArea textArea;
   private JScrollPane scrollPane;
   
   public CrossWordFrame()
   {
      mainPanel = new JPanel();
      createFields();
      createButtons();
      createTextArea();
      add(mainPanel);
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
   }
   
   class AddFieldListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         JTextField field = new JTextField(1);
         fields.add(field);
         fieldPanel.add(field);
         revalidate();
      }
   }
   
   class RemoveFieldListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         JTextField field = fields.remove(fields.size() - 1);
         fieldPanel.remove(field);
         revalidate();
      }
   }
   
   class SearchListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         textArea.setText("");
         String input = read();
         search(input);
      }
   }
   
   private void createFields()
   {
      fields = new ArrayList<JTextField>();
      fieldPanel = new JPanel();
      for (int i = 0; i < 5; i++)
      {
         JTextField field = new JTextField(1);
         fields.add(field);
         fieldPanel.add(field);
      }
      mainPanel.add(fieldPanel);
   }
   
   private void createButtons()
   {
      addButton = new JButton("+");
      removeButton = new JButton("-");
      searchButton = new JButton("Search");
      
      addButton.addActionListener(new AddFieldListener());
      removeButton.addActionListener(new RemoveFieldListener());
      searchButton.addActionListener(new SearchListener());
      
      mainPanel.add(addButton);
      mainPanel.add(removeButton);
      mainPanel.add(searchButton);
   }
   
   private void createTextArea()
   {
      textArea = new JTextArea(10, 20);
      scrollPane = new JScrollPane(textArea);
      mainPanel.add(scrollPane);
   }

   private String read()
   {
      String input = "";
      for (JTextField field : fields)
      {
         if (field.getText().equals(""))
         {
            input = input + "?";
         }
         else
         {
            input = input + field.getText();
         }
      }
      return input;
   }
   
   private void search(String input)
   {
      try (Scanner in = new Scanner(new File("words")))
      {
         while (in.hasNextLine())
         {
            String line = in.nextLine();
            if (compare(input, line))
            {
               textArea.append(line + "\n");
            }
         }
      }
      
      catch (FileNotFoundException exception)
      {
         System.out.println("File not found");
      }
   }
   
   private boolean compare(String input, String line)
   {
      if (input.length() != line.length()) { return false; }
      else
      {
         for (int i = 0; i < input.length(); i++)
         {
            if (input.charAt(i) != '?' && input.charAt(i) != line.charAt(i))
            {
               return false;
            }
         }
         return true;
      }
   }
}