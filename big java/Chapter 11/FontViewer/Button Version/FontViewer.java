import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class FontViewer extends Application
{
   private Label sample;
   private CheckBox boldCheckbox;
   private CheckBox italicCheckbox;
   private RadioButton smallButton;
   private RadioButton mediumButton;
   private RadioButton largeButton;
   private ChoiceBox<String> fontChoice;
   
   public void start(Stage stage1)
   {    
      Pane root = createRootPane();
      Scene scene1 = new Scene(root);
      stage1.setScene(scene1);
      stage1.setTitle("Demo");
      stage1.show();
   }
   
   private Pane createRootPane()
   {
      sample = new Label("Big Java");
      
      boldCheckbox = new CheckBox("Bold");
      italicCheckbox = new CheckBox("Italic");
      
      fontChoice = new ChoiceBox<>();
      fontChoice.getItems().addAll("Serif", "SansSerif", "Monospaced");
      fontChoice.getSelectionModel().select("Serif");
            
      ToggleGroup group = new ToggleGroup();
      smallButton = new RadioButton("Small");
      mediumButton = new RadioButton("Medium");
      largeButton = new RadioButton("Large");
      smallButton.setToggleGroup(group);
      mediumButton.setToggleGroup(group);
      largeButton.setToggleGroup(group);
      largeButton.setSelected(true);
      
      italicCheckbox.setOnAction(event -> updateSample());
      boldCheckbox.setOnAction(event -> updateSample());
      smallButton.setOnAction(event -> updateSample());
      mediumButton.setOnAction(event -> updateSample());
      largeButton.setOnAction(event -> updateSample());
      fontChoice.setOnAction(event -> updateSample());
      
      GridPane pane = new GridPane();
      pane.add(sample, 0, 0, 3, 1);
      pane.add(italicCheckbox, 0, 1);
      pane.add(boldCheckbox, 1, 1);
      pane.add(fontChoice, 2, 1);
      pane.add(smallButton, 0, 2);
      pane.add(mediumButton, 1, 2);
      pane.add(largeButton, 2, 2);
      pane.setHgap(10);
      pane.setVgap(10);
      pane.setPadding(new Insets(10));
      sample.setMinHeight(100);
      
      updateSample();
      
      return pane;
   }
   
   private void updateSample()
   {
      String facename = fontChoice.getSelectionModel().getSelectedItem();
      FontPosture posture;
      if (italicCheckbox.isSelected())
      {
         posture = FontPosture.ITALIC;
      }
      else
      {
         posture = FontPosture.REGULAR;
      }
      FontWeight weight;
      if (boldCheckbox.isSelected())
      {
         weight = FontWeight.BOLD;
      }
      else
      {
         weight = FontWeight.NORMAL;
      }
      
      int size = 0;
      final int SMALL_SIZE = 24;
      final int MEDIUM_SIZE = 36;
      final int LARGE_SIZE = 48;
      
      if (smallButton.isSelected()) { size = SMALL_SIZE; }
      else if (mediumButton.isSelected()) { size = MEDIUM_SIZE; }
      else if (largeButton.isSelected()) { size = LARGE_SIZE; }
      
      sample.setFont(Font.font(facename, weight, posture, size));
   }
}

