import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ColorViewer extends Application
{
   public void start(Stage stage1)
   {    
      Pane root = createRootPane();
      Scene scene1 = new Scene(root);
      stage1.setScene(scene1);
      stage1.setTitle("Color Viewer");
      stage1.show();
   }
   
   private Pane createRootPane()
   {
      Circle ball = new Circle(150, 150, 100);
      GridPane pane = new GridPane();
      pane.setHgap(10);
      pane.setVgap(10);
      pane.setPadding(new Insets(10));
      
      pane.add(ball, 0, 0, 2, 1);
      pane.add(new Label("Red"), 0, 1);
      pane.add(new Label("Green"), 0, 2);
      pane.add(new Label("Blue"), 0, 3);
      Slider redSlider = new Slider(0, 255, 0);
      Slider greenSlider = new Slider(0, 255, 0);
      Slider blueSlider = new Slider(0, 255, 0);
      pane.add(redSlider, 1, 1);
      pane.add(greenSlider, 1, 2);
      pane.add(blueSlider, 1, 3);
      
      ball.fillProperty().bind(
         Bindings.createObjectBinding(() ->
            Color.rgb((int) redSlider.getValue(), (int) greenSlider.getValue(), (int) blueSlider.getValue()),
            redSlider.valueProperty(),
            greenSlider.valueProperty(),
            blueSlider.valueProperty()));
         
      return pane;
   }
   
}