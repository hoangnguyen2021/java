import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimationDemo extends Application
{
   public void start(Stage primaryStage)
   {
      Pane root = createRootPane();
      Scene scene1 = new Scene(root);
      primaryStage.setScene(scene1);
      primaryStage.setTitle("AnimationDemo");
      primaryStage.show();
   }

   public Pane createRootPane()
   {
      Circle ball = new Circle(25, 50, 25);

      Pane ballPane = new Pane(ball);
      ballPane.setMinSize(200, 200);

      Button keyFrames = new Button("Key frames");
      Button sequential = new Button("Sequential");
      Button cycling = new Button("Cycling");
      Button nonlinear = new Button("Nonlinear");

      VBox root = new VBox(10, ballPane, keyFrames, sequential, cycling, nonlinear);
      root.setPadding(new Insets(10));

      /*
      This animation simultaneously moves the circle diagonally
      within 5 seconds and shrinks the circle within 10 seconds.
      */
      keyFrames.setOnAction(event ->
         {
            ball.setCenterX(25);
            ball.setCenterY(50);
            ball.setRadius(25);
            
            KeyFrame frame1 = new KeyFrame(Duration.seconds(5),
            new KeyValue(ball.centerXProperty(), 175),
            new KeyValue(ball.centerYProperty(), 175));
            KeyFrame frame2 = new KeyFrame(Duration.seconds(10),
            new KeyValue(ball.radiusProperty(), 5));
            Timeline animation = new Timeline(frame1, frame2);
            animation.play();
         });

      /*
      This animation moves the circle diagonally within 5 seconds
      and then shrinks the circle within 10 seconds.
      */
      sequential.setOnAction(event ->
         {
            ball.setCenterX(25);
            ball.setCenterY(50);
            ball.setRadius(25);
            
            KeyFrame frame1 = new KeyFrame(Duration.seconds(5),
            new KeyValue(ball.centerXProperty(), 175),
            new KeyValue(ball.centerYProperty(), 175));
            KeyFrame frame2 = new KeyFrame(Duration.seconds(10),
            new KeyValue(ball.radiusProperty(), 5));
            Timeline timeline1 = new Timeline(frame1);
            Timeline timeline2 = new Timeline(frame2);
            SequentialTransition animation = new SequentialTransition(timeline1, timeline2);
            animation.play();
         });

      /*
      This animation moves the circle to the right, then reverses
      so that it moves back to the left, for a total of ten cycles.
      */
      cycling.setOnAction(event ->
         {
            ball.setCenterX(25);
            ball.setCenterY(50);
            ball.setRadius(25);
            
            KeyFrame frame1 = new KeyFrame(Duration.seconds(1),
            new KeyValue(ball.centerXProperty(), 175));
            Timeline animation = new Timeline(frame1);
            animation.setCycleCount(10);
            animation.setAutoReverse(true);
            animation.play();
         });

      /*
      This animation simulates a ball falling under gravity.
      */
      nonlinear.setOnAction(event ->
         {
            ball.setCenterX(25);
            ball.setCenterY(50);
            ball.setRadius(25);

            long start = System.currentTimeMillis();                 // current time in ms
            KeyFrame frame1 = new KeyFrame(Duration.millis(10),      // contruct a key frame that has a very short duration and no properties to update
               e -> {                                                // add an action event handler that is called when the key frame has completed
                  double t = System.currentTimeMillis() - start;     
                  ball.setCenterY(50 + t * t / 100000);
               });
            Timeline animation = new Timeline(frame1);               // put the key frame into a timeline 
            animation.setCycleCount(500);                            // that is repeated many times
            animation.play();
         });

      return root;
   }
}