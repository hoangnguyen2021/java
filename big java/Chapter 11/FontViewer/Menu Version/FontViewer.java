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
   private Label label;
   private String face = "Serif";
   private FontWeight weight = FontWeight.NORMAL;
   private FontPosture posture = FontPosture.REGULAR;
   private double size = 24;
   
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
      MenuBar bar = new MenuBar();
      Menu fileMenu = new Menu("File");
      Menu fontMenu = new Menu("Font");
      bar.getMenus().addAll(fileMenu, fontMenu);
      
      // file menu
      MenuItem exitItem = new MenuItem("Exit");
      exitItem.setOnAction(event -> System.exit(0));
      fileMenu.getItems().add(exitItem);
      
      // font menu
      Menu faceMenu = new Menu("Face");
      Menu sizeMenu = new Menu("Size");
      Menu styleMenu = new Menu("Style");
      fontMenu.getItems().addAll(faceMenu, sizeMenu, styleMenu);
      
      faceMenu.getItems().addAll(createFace("Serif"), createFace("SansSerif"), createFace("Monospaced"));
      sizeMenu.getItems().addAll(createSize("Small"), createSize("Medium"), createSize("Large"));
      styleMenu.getItems().addAll(createStyle("Plain"), createStyle("Bold"), createStyle("Italic"), createStyle("Bold Italic"));
      label = new Label("Big Java");
      label.setMinSize(300, 200);
      update();
      
      VBox root = new VBox(10, bar, label);
      
      return root;
   }
   
   //create face item
   private MenuItem createFace(String aFace)
   {
      MenuItem menuItem = new MenuItem(aFace);
      menuItem.setOnAction(event ->
         {
           face = aFace;
           update();
         });
      return menuItem;
   }
   
   //create size item
   private MenuItem createSize(String aSize)
   {
      MenuItem menuItem = new MenuItem(aSize);
      menuItem.setOnAction(event ->
         {
           if (aSize.equals("Small")) { size = 24; }
           else if (aSize.equals("Medium")) { size = 36; }
           else if (aSize.equals("Large")) { size = 48; }
           update();
         });
      return menuItem;
   }
   
   //create style item
   private MenuItem createStyle(String aStyle)
   {
      MenuItem menuItem = new MenuItem(aStyle);
      menuItem.setOnAction(event ->
         {
           if (aStyle.equals("Plain")) { weight = FontWeight.NORMAL; posture = FontPosture.REGULAR; }
           else if (aStyle.equals("Bold")) { weight = FontWeight.BOLD; posture = FontPosture.REGULAR; }
           else if (aStyle.equals("Italic")) { weight = FontWeight.NORMAL; posture = FontPosture.ITALIC; }
           else if (aStyle.equals("Bold Italic")) { weight = FontWeight.BOLD; posture = FontPosture.ITALIC; }
           update();
         });
      return menuItem;
   }
   
   private void update()
   {
      label.setFont(Font.font(face, weight, posture, size));
   }
}

