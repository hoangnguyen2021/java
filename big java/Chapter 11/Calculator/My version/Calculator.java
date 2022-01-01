import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Calculator extends Application
{
   private TextField textField;
   private boolean startNewValue;
   private double previous;
   private String previousOperator;
   
   public void start(Stage stage1)
   {    
      startNewValue = true;
      previous = 0;
      previousOperator = "=";
      Pane root = createRootPane();

      Scene scene1 = new Scene(root);
      stage1.setScene(scene1);
      stage1.setTitle("Calculator");
      stage1.show();
   }
   
   private Pane createRootPane()
   {
      // create a grid pane
      GridPane pane = new GridPane();
      pane.setHgap(10);
      pane.setVgap(10);
      pane.setPadding(new Insets(10));
      pane.setMinSize(200, 200);
      
      // adjust the column width
      ColumnConstraints col1 = new ColumnConstraints();
      col1.setPercentWidth(25);
      ColumnConstraints col2 = new ColumnConstraints();
      col2.setPercentWidth(25);
      ColumnConstraints col3 = new ColumnConstraints();
      col3.setPercentWidth(25);
      ColumnConstraints col4 = new ColumnConstraints();
      col4.setPercentWidth(25);
      pane.getColumnConstraints().addAll(col1, col2, col3, col4);

      // create display
      textField = new TextField("0");
      textField.setEditable(false);
      pane.add(textField, 0, 0, 4, 1);
      
      // create buttons
      String[] labels = {"DEL", "AC", "7", "8", "9", "/", "4", "5", "6",
                         "*", "1", "2", "3", "-", "0", ".", "=", "+"};
      int row = 1;
      int column = 2;
      for (String label : labels)
      {
         Button button = new Button(label);
         button.setMaxWidth(Double.MAX_VALUE);
         pane.add(button, column, row);
         column++;
         if (column == 4) { column = 0; row++; }
         
         // set actions to buttons
         if ("+-*/=".contains(label))
         {
            button.setOnAction(event ->
            {
               double result = calculate(previousOperator);
               textField.setText("" + result);
               previous = result;               // update previous
               previousOperator = label;        // update previousOperator
               startNewValue = true;            // update startNewValue
            });
         }
         else if (label.equals("DEL"))          // this button removes the last character on display
         {
            button.setOnAction(event ->
            {
               String text = textField.getText();
               if (!text.isEmpty()) { textField.setText(text.substring(0, text.length() - 1)); }
            });
         }
         else if (label.equals("AC"))           // this button removes everything on display
         {
            button.setOnAction(event ->
            {
               textField.setText("");
               previous = 0;
               startNewValue = true;
            });
         }
         else
         {
            button.setOnAction(event ->
            {
               enter(label);
            });
         }
      }
      
      return pane;
   }
   
   /*
      There are two cases that happen when a number/a dot is clicked:
      display the new value or append to the current display.
   */
   public void enter(String ch)
   {
      if (startNewValue)
      {
         textField.setText(ch);
         startNewValue = false;
      }
      else
      {
         textField.appendText(ch);
      }
   }
   
   /*
      previous is operand 1, current is operand 2, operator is
      last operator
   */
   public double calculate(String operator)
   {
      double current = Double.parseDouble(textField.getText());
      if (startNewValue || operator.equals("="))                 // this is to prevent display error in case
      {                                                          // the user clicks many operators in a row
         return current;
      }  
      else
      {
         if (operator.equals("+"))
         {
            return previous + current;
         }
         else if (operator.equals("-"))
         {
            return previous - current;
         }
         else if (operator.equals("*"))
         {
            return previous * current;
         }
         else
         {
            return previous / current;
         }
      }
   }
}