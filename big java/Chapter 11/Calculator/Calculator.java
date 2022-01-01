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
   private double lastValue;
   private String lastOperator;
   private boolean startNewValue;
   private TextField display;
   
   public void start(Stage stage1)
   {
      lastValue = 0;
      lastOperator = "=";
      startNewValue = true;
      
      Pane root = createRootPane();
      Scene scene1 = new Scene(root);
      stage1.setScene(scene1);
      stage1.setTitle("Calculator");
      stage1.show();
   }
   
   public Pane createRootPane()
   {
      // create a grid pane
      GridPane pane = new GridPane();
      pane.setHgap(10);
      pane.setVgap(10);
      pane.setPadding(new Insets(10));
      
      // adjust column width
      ColumnConstraints col1 = new ColumnConstraints();
      col1.setPercentWidth(25);
      ColumnConstraints col2 = new ColumnConstraints();
      col2.setPercentWidth(25);
      ColumnConstraints col3 = new ColumnConstraints();
      col3.setPercentWidth(25);
      ColumnConstraints col4 = new ColumnConstraints();
      col4.setPercentWidth(25);
      pane.getColumnConstraints().addAll(col1, col2, col3, col4);
      
      // add text field to grid pane
      display = new TextField("");
      pane.add(display, 0, 0, 4, 1);
      
      // add buttons to grid pane
      String[] labels = { "7", "8", "9", "/", "4", "5", "6", "*",
                        "1", "2", "3", "-", "0", ".", "=", "+" };
      int row = 1;
      int column = 0;
      for (String label : labels)
      {
         Button b = new Button(label);
         b.setMaxWidth(Double.MAX_VALUE);
         pane.add(b, column, row);
         GridPane.setHalignment(b, HPos.CENTER);
         column++;
         if (column == 4) { column = 0; row++; }
         
         // add actions to buttons
         if ("+-*/=".contains(label))
         {
            b.setOnAction(event ->
            {
               calculate(lastOperator);
               lastOperator = label;
               startNewValue = true;
            });
         }
         else
         {
            b.setOnAction(event -> addToValue(label));
         }
      }
      
      // create a check box
      CheckBox radianCheckBox = new CheckBox("Radian");
      
      // create 3 radio buttons
      RadioButton baseeButton = new RadioButton("e");
      RadioButton base10Button = new RadioButton("10");
      RadioButton base2Button = new RadioButton("2");
      
      ToggleGroup baseButtonGroup = new ToggleGroup();
      baseeButton.setToggleGroup(baseButtonGroup);
      base10Button.setToggleGroup(baseButtonGroup);
      base2Button.setToggleGroup(baseButtonGroup);
      baseeButton.setSelected(true);
      
      // create a choice box
      ChoiceBox<String> mathOpChoice = new ChoiceBox<>();
      mathOpChoice.getItems().addAll("sin", "cos", "tan", "log", "exp");
      mathOpChoice.getSelectionModel().select(0);
      Button mathOpButton = new Button("Apply");   // create "Apply" button
      
      // add check box, radio buttons, and choice box to an HBox, add this HBox to grid pane
      HBox bottomBox = new HBox(5, radianCheckBox, new Label("Log base"),
                                baseeButton, base10Button, base2Button,
                                mathOpChoice, mathOpButton);
      pane.add(bottomBox, 0, 5, 4, 1);
      
      // add action to "Apply" button
      mathOpButton.setOnAction(event ->
      {
         boolean radian = radianCheckBox.isSelected();
         double base = Math.E;
         if (base10Button.isSelected()) { base = 10; }
         else if (base2Button.isSelected()) { base = 2; }
         String functionName = mathOpChoice.getSelectionModel().getSelectedItem();
         computeMathFunction(functionName, radian, base);
      });
      
      return pane;
   }
   
   public void setValue(double value)
   {
      display.setText("" + value);
      lastValue = value;
      startNewValue = true;
   }
   
   public void addToValue(String ch)
   {
      if (startNewValue)
      {
         display.setText(ch);
         startNewValue = false;
      }
      else
      {
         display.setText(display.getText() + ch);
      }
   }
   
   public void calculate(String op)
   {
      if (!startNewValue)
      {
         double value = Double.parseDouble(display.getText());
         double result = value;
         if (op.equals("+"))
         {
            result = lastValue + value;
         }
         else if (op.equals("-"))
         {
            result = lastValue - value;
         }
         else if (op.equals("*"))
         {
            result = lastValue * value;
         }
         else if (op.equals("/"))
         {
            result = lastValue / value;
         }
         setValue(result);
      }
   }
   
   public void computeMathFunction(String functionName, boolean radian, double base)
   {
      double value = Double.parseDouble(display.getText());
      
      if (!radian && (functionName.equals("sin") || functionName.equals("cos") || functionName.equals("tan")))
      {
         value = Math.toRadians(value);
      }
      double result = value;
      if (functionName.equals("sin"))
      {
         result = Math.sin(value);
      }
      else if (functionName.equals("cos"))
      {
         result = Math.cos(value);
      }
      else if (functionName.equals("tan"))
      {
         result = Math.tan(value);
      }
      else if (functionName.equals("log"))
      {
         result = Math.log(value) / Math.log(base);
      }
      else if (functionName.equals("exp"))
      {
         result = Math.pow(base, value);
      }
      setValue(result);
   }
}