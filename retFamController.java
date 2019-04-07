package GrandKidsFestival;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class retFamController {
    //Stub so it would compile

    @FXML
    private void drawMainMenu(ActionEvent e){
        showMain(e);
    }

    public void showMain(ActionEvent e){
        System.out.println("Test");
        try{
            Parent root = FXMLLoader.load(getClass().getResource("mainPage.fxml"));
            Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
            window.setScene(new Scene(root, 700, 400));
        }catch(Exception ex){System.out.println(ex);}

    }
}
