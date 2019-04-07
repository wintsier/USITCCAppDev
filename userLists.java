package GrandKidsFestival;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class userLists {
    private static ArrayList<userClass> users = new ArrayList<>();
    private static String[] eval;
    private static String inp;

    public static void init(){
        fileInput fi = new fileInput("users.csv");

        while((inp = fi.fileReadLine()) != null){
            eval = inp.split(",");
            users.add(new userClass(eval[0], eval[1], eval[2], eval[3], eval[4], eval[5], eval[6], eval[7], eval[8], eval[9], eval[10]));
        }

        fi.fileClose();
    }

    public static void addUser(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j, String k){
        users.add(new userClass(a, b, c, d, e, f, g, h, i, j, k));
        updateFile();
    }

    public static void updateFile(){
        FileOutput fo = new FileOutput("users.csv");

        for(userClass u:users){
            fo.fileWrite(u.finalString());
        }

        fo.fileClose();
    }


    public static int findUser(String user, String hash){
        for(userClass u:users){
            if(u.getUsername().equalsIgnoreCase(user)){
                if(hash.equals(u.getUserPassword())){
                    return 1;
                }
                else{
                    return 0;
                }
            }
        }

        return -1;
    }
}
