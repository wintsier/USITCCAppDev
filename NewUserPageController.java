package GrandKidsFestival;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;

public class NewUserPageController {
    @FXML
    private ChoiceBox<String> st;
    @FXML
    private TextField fName;
    @FXML
    private TextField lName;
    @FXML
    private TextField mi;
    @FXML
    private TextField address;
    @FXML
    private TextField city;
    @FXML
    private TextField zip;
    @FXML
    private TextField phone;
    @FXML
    private TextField email;
    @FXML
    private TextField userid;
    @FXML
    private TextField password;
    @FXML
    private TextField confirmPassword;


    private String _fName;
    private String _lName;
    private String _mi;
    private String _address;
    private String _city;
    private String _state;
    private String _zip;
    private String _email;
    private String _phone;
    private String _username;
    private String _password;
    private String _password2;



    @FXML
    public void initialize() {
        st.setItems(FXCollections.observableArrayList("AL","AK","AZ","AR","CA","CO","CT","DE","DC","FL","GA","HI","ID","IL","IN","IA","KS","KY","LA","ME","MT","NE","NV","NH","NJ","NM","NY","NC","ND","OH","OK","OR","MD","MA","MI","MN","MS","MO","PA","RI","SC","SD","TN","TX","UT","VT","VA","WA","WV","WI","WY"));
    }

    @FXML
    public void drawMainMenu(ActionEvent e){
        showMain(e);
    }



    @FXML
    public void submit(ActionEvent e){
        _fName = fName.getText();
        _lName = lName.getText();
        _mi = mi.getText();
        _address = address.getText();
        _city = city.getText();
        _state = st.getValue();
        _zip = zip.getText();
        _email = email.getText();
        _phone = phone.getText();
        _username = userid.getText();
        _password = password.getText();
        _password2 = confirmPassword.getText();

        if(_fName.equals("") || _lName.equals("") || _mi.equals("") || _address.equals("") || _city.equals("") || (_state == null) || _zip.equals("") || _email.equals("") || _phone.equals("") || _username.equals("") || _password.equals("") || _password2.equals("")){
            Alert error = new Alert(Alert.AlertType.ERROR);
            error.setTitle("Input Error");
            error.setHeaderText("Invalid Input");
            error.setContentText("A text field has been left blank. Please read through your submissions and try again");
            error.showAndWait();

        }
        else if(!_email.matches("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")){
            Alert error = new Alert(Alert.AlertType.ERROR);
            error.setTitle("Input Error");
            error.setHeaderText("Invalid Email");
            error.setContentText("The email address entered is invalid. Please enter a valid email address");
            error.showAndWait();
        }
        /*
        More validaion, would time have permitted, would have gone here to throw exception before the new user was created and passed to the writer
         */
        else if(!_password.equals(_password2)){
            Alert error = new Alert(Alert.AlertType.ERROR);
            error.setTitle("Input Error");
            error.setHeaderText("Password Mismatch");
            error.setContentText("Passwords do not match");
            error.showAndWait();
        }
        else{
            userLists.addUser(_fName, _mi, _lName, _address, _city, _state, _zip, _email, _phone, _username, passHash.hashPass(_password));
            showLogin(e);
        }


    }

    public void showMain(ActionEvent e){
        System.out.println("Test");
        try{
            Parent root = FXMLLoader.load(getClass().getResource("mainPage.fxml"));
            Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
            window.setScene(new Scene(root, 700, 400));
    }catch(Exception ex){System.out.println(ex);}

    }

    public void showLogin(ActionEvent e){
        System.out.println("Test");
        try{
            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
            window.setScene(new Scene(root, 700, 400));
        }catch(Exception ex){System.out.println(ex);}

    }

}
