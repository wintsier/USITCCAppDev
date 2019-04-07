package GrandKidsFestival;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class loginController {
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;


    @FXML
    private void drawMainMenu(ActionEvent e){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("mainPage.fxml"));
            Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
            window.setScene(new Scene(root, 700, 400));
        }catch(Exception ex){System.out.println(ex);}
    }

    @FXML
    private void login(ActionEvent e){
        int ret = userLists.findUser(username.getText(), passHash.hashPass(password.getText()));
        if(ret == -1){
            Alert error = new Alert(Alert.AlertType.ERROR);
            error.setTitle("Input Error");
            error.setHeaderText("User Not Found");
            error.setContentText("User not found. Please check username");
            error.showAndWait();
        }
        else if(ret == 0){
            Alert error = new Alert(Alert.AlertType.ERROR);
            error.setTitle("Input Error");
            error.setHeaderText("Password Mismatch");
            error.setContentText("Invalid password. Please try again.");
            error.showAndWait();
        }
        else{
            drawPage(e);
        }
    }

    private void drawPage(ActionEvent e){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("returningFamily.fxml"));
            Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
            window.setScene(new Scene(root, 700, 400));
        }catch(Exception ex){System.out.println(ex);}
    }
}
