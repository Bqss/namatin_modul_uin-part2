package sembilan;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.swing.*;
import java.net.URL;
import java.sql.ResultSet;
import java.util.*;


public class Controller implements Initializable {

    @FXML
    private TextField tfid;
    @FXML
    private TextField tfnama;
    @FXML
    private TextField tfalamat;
    @FXML
    private TableView<Crud> tabel;
    @FXML
    private TableColumn<Crud,String>id_inp;
    @FXML
    private TableColumn<Crud,String>nama_inp;
    @FXML
    private TableColumn<Crud,String>alamat_inp;

    ResultSet hasil ;

    Crud aa = new Crud();
    String id , nama , alamat  ;



    public void submit(){


            try{
                id = tfid.getText();
                if(id.equals("")){
                    JOptionPane.showMessageDialog(null,"tolong masukkan id anda !!");
                }else{
                    aa.setId(id);
                }
                nama = tfnama.getText();
                if(nama.equals("")){
                    JOptionPane.showMessageDialog(null,"tolong masukkan nama anda !!");
                }else{
                    aa.setNama(nama);
                }
                alamat = tfalamat.getText();
                if(alamat.equals("")){
                    JOptionPane.showMessageDialog(null,"tolong masukkan id anda !!");
                }else {
                    aa.setAlamat(alamat);
                }

                aa.saveData(id, nama , alamat);

            }catch (Exception e){
                e.printStackTrace();
            }
            addToTable();
    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        id_inp.setCellValueFactory(new PropertyValueFactory<Crud,String>("id"));
        nama_inp.setCellValueFactory(new PropertyValueFactory<Crud,String>("nama"));
        alamat_inp.setCellValueFactory(new PropertyValueFactory<Crud,String>("alamat"));
        hasil = aa.getData();
        ObservableList<Crud> data = FXCollections.observableArrayList();

        try{
            while(hasil.next()) {
                aa.setId(hasil.getString("id"));
                aa.setNama(hasil.getString("nama"));
                aa.setAlamat(hasil.getString("alamat"));
                data.add(new Crud(aa.getId(),aa.getNama(),aa.getAlamat()));

            }
            tabel.setItems(data);


        }catch(Exception e){
            System.out.println("data kosong"+e);
        }
    }
    private void addToTable(){
        Crud a = new Crud(
                tfid.getText(),tfnama.getText(),tfalamat.getText()
        );
        ObservableList<Crud> mahasiswa = tabel.getItems();
        mahasiswa.add(a);
        tabel.setItems(mahasiswa);
    }

    public void removeFromTable(){
        int selectedindex = tabel.getSelectionModel().getSelectedIndex();
        tabel.getItems().remove(selectedindex);
        aa.deleteData(tabel.getItems().get(selectedindex-1).getId());
    }
    public void update(){
        int selectedindex = tabel.getSelectionModel().getSelectedIndex();
        tabel.getItems().set(selectedindex,new Crud(tfid.getText(),tfnama.getText(),tfalamat.getText()));
        aa.updateData(tabel.getItems().get(selectedindex).getId(),tfnama.getText(),tfalamat.getText());
    }
    public void hapus(){
        tfalamat.setText("");
        tfid.setText("");
        tfnama.setText("");
    }
    public void updateForm(){
        int selectedindex = tabel.getSelectionModel().getSelectedIndex();
        Crud a = tabel.getItems().get(selectedindex);
        tfid.setText(a.getId());
        tfnama.setText(a.getNama());
        tfalamat.setText(a.getAlamat());

    }






}
