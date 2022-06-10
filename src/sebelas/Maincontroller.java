package sebelas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Label;


public class Maincontroller extends LoginController {
    @FXML
    private Label username;
    private Crud a = new Crud();

    public void setUsername(String s){
        username.setText(s);
    }
    public void logout(ActionEvent e ) throws Exception{
        a.logout(Session.getUsernameId());
        super.backToMain(e);
    }



}
