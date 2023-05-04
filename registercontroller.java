import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.*;

public class registercontroller {

    

    @FXML
    private Button RegisterBTN;

    @FXML
    private Button ReturnBTN;

    @FXML
    private TextField Address;

    @FXML
    private TextField Cellphone;

    @FXML
    private TextField Email;

    @FXML
    private TextField FirstName;

    @FXML
    private TextField ID;

    @FXML
    private TextField LastName;

    @FXML
    private CheckBox LibrarianType;

    @FXML
    private PasswordField Password;

    @FXML
    private CheckBox ReaderType;


    @FXML
    void RegisterBTNClicked(ActionEvent event) {
        
        String id = ID.getText(); 
        String password = Password.getText();
        String firstname = FirstName.getText();
        String lastname = LastName.getText();
        String address = Address.getText();
        String cellphone = Cellphone.getText();
        String email = Email.getText();

        if (LibrarianType.isSelected()){
            Librarian.AddUser(id , password , firstname , lastname , address , cellphone , email);
        }
        else {
            Reader.addReader(id , password , firstname , lastname , address , cellphone , email);
        }

        ID.clear();
        Password.clear();
        FirstName.clear();
        LastName.clear();
        Address.clear();
        Cellphone.clear();
        Email.clear();
        LibrarianType.setSelected(false);
        ReaderType.setSelected(false);
    }

    @FXML
    void ReturnBTNClicked(ActionEvent event) throws IOException {
        App app = new App();

        app.changeScene("LoginInterface.fxml");
    }

}
