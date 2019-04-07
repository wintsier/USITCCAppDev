package GrandKidsFestival;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class mainController {
    @FXML
    public void returningUserButton(ActionEvent e){

        try{
            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
            window.setScene(new Scene(root, 700, 400));
        }catch(Exception ex){System.out.println(ex);}

    }

    @FXML
    public void newUserButton(ActionEvent e){

        try{
            Parent root = FXMLLoader.load(getClass().getResource("newUserPage.fxml"));
            Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
            window.setScene(new Scene(root, 700, 400));
        }catch(Exception ex){System.out.println(ex);}

    }
}
