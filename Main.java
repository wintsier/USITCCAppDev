package GrandKidsFestival;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainPage.fxml"));
        primaryStage.setTitle("User Screen");
        primaryStage.setScene(new Scene(root, 700, 400));
        userLists.init();
        primaryStage.show();
    }




    public static void main(String[] args) {
        launch(args);
    }


}
