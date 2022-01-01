import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MouseDemo extends Application
{
   public void start(Stage primaryStage)
   {
      Pane root = createRootPane();
      Scene scene1 = new Scene(root);
      primaryStage.setScene(scene1);
      primaryStage.setTitle("MouseDemo");
      primaryStage.show();
   }
   
   public Pane createRootPane()
   {
      Circle ball = new Circle(100, 50, 25);
      
      Pane root = new Pane(ball);
      root.setMinSize(200, 200);
      root.setOnMousePressed(event ->
         {
            ball.setCenterX(event.getX());
            ball.setCenterY(event.getY());
         });
         
      root.setOnMouseDragged(event ->
         {
            ball.setFill(Color.YELLOW);
            ball.setCenterX(event.getX());
            ball.setCenterY(event.getY());
         });
         
      root.setOnMouseReleased(event ->
         {
            ball.setFill(Color.BLACK);
         });
         
      return root;
   }
}