import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class logincontroller {

    @FXML
    private Button GoToRegisterBTN;

    @FXML
    private Button LogInBTN;

    @FXML
    void GoToRegisterBTNClicked(ActionEvent event) throws IOException {

        App app = new App();

        app.changeScene("RegisterInterface.fxml");

    }

    @FXML
    void LogInBTNClicked(ActionEvent event) {

    }

}




