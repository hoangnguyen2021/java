import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

//change class name
public class Sample extends Application
{
   private Button button;
   private Label label;
   
   //add instance variables here
   
   public void start(Stage stage1)
   {    
      Pane root = createRootPane();

      Scene scene1 = new Scene(root);
      stage1.setScene(scene1);
      stage1.setTitle("");
      stage1.show();
   }
   
   private Pane createRootPane()
   {
      button = new Button("");
      button.setOnAction(event ->
         {
           //actions performed after clicking the button
         });
     
      label = new Label("");
      label.relocate(0, 50);
      
      Pane root = new Pane(button, label);
      root.setMinSize(300, 400);
      return root;
   }
}