import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    
    private static Stage stage ;
    @Override
    public void start(Stage primaryStage) throws IOException {
       
        stage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("LoginInterface.fxml"));
        Scene scene = new Scene(root);
       
    
      primaryStage.setTitle("Login");
      primaryStage.setScene(scene);
      primaryStage.show();
  }

  public void changeScene(String fxml) throws IOException {
    Parent pane = FXMLLoader.load(getClass().getResource(fxml));
    stage.getScene().setRoot(pane);
  }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
