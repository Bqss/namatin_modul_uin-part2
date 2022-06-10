package sebelas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;

public class LoginController  {
@FXML
private TextField tfid;
@FXML
private TextField tfpw;

Crud a= new Crud();
private String pesan;


    public void login(ActionEvent event) throws Exception {
        if(tfid.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Tolong masukkan id anda","peringatan",1);
        }else if(tfpw.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Tolong masukkkan password anda","peringatan",1);

        }else{
            pesan = a.cekLogin(tfid.getText(),tfpw.getText());
            System.out.println(pesan);
            if(Session.getStatusLogin()!= null){
                JOptionPane.showMessageDialog(null,"berhasil login");
                changeToMain(event);
            }else{
                JOptionPane.showMessageDialog(null,pesan);
            }
        }
    }

    public void changeToMain(ActionEvent event) throws Exception {
            Stage stage  = (Stage)(((Node) event.getSource()).getScene().getWindow());

            FXMLLoader loader = new FXMLLoader(getClass().getResource("Mainscene.fxml"));
            Parent root = loader.load();
            Maincontroller mc = loader.getController();

            mc.setUsername(Session.getUsernameId());
            stage.setScene(new Scene(root));

    }
    public void backToMain(ActionEvent e) throws Exception{
        Stage stage  = (Stage)(((Node) e.getSource()).getScene().getWindow());

        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginScene.fxml"));
        Parent root = loader.load();
        stage.setScene(new Scene(root));
    }




}
