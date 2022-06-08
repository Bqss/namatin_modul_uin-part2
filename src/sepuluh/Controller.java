package sepuluh;

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
import java.sql.SQLException;
import java.util.ResourceBundle;


public class Controller implements Initializable,FormListener{
    @FXML
    private TextField tf1;
    @FXML
    private TextField tf2;
    @FXML
    private TextField tf3;
    @FXML
    private TextField tf4;
    @FXML
    private TableView<Siswa> tabel;
    @FXML
    private TableColumn<Siswa, String> id_col;
    @FXML
    private TableColumn<Siswa, String> nama_col;
    @FXML
    private TableColumn<Siswa, String> alamat_col;
    ResultSet hasil ;


    private Crud aa  = new Crud();
    private Siswa a = new Siswa();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<Siswa> data = FXCollections.observableArrayList();
        id_col.setCellValueFactory(new PropertyValueFactory<Siswa,String>("id"));
        nama_col.setCellValueFactory(new PropertyValueFactory<Siswa,String>("nama"));
        alamat_col.setCellValueFactory(new PropertyValueFactory<Siswa,String>("alamat"));
        hasil = aa.getData();
        try{
            while(hasil.next()){
                data.add(
                  new Siswa(hasil.getString("id"),hasil.getString("nama"),hasil.getString("alamat"))
                );
            }
            tabel.setItems(data);
        }catch(Exception e){
            System.out.println("data tidak ditemukan "+e);
        }

    }
    @Override
    public void saveData() {
        try{

            if(checkDuplicate(tf1.getText())){
                    JOptionPane.showMessageDialog(null,"Tidak bisa menambahkan data dengan id yang sama");
                    return;
            }else{
                if(!tf1.getText().equals("")){
                    a.setId(tf1.getText());
                }else {
                    JOptionPane.showMessageDialog(null,"Tolong masukkan id !!");
                    return;
                }
                if(!tf2.getText().equals("")){
                    a.setNama(tf2.getText());

                }else{
                    JOptionPane.showMessageDialog(null,"Tolong masukkan nama !!");
                    return;
                }
                if(!tf3.getText().equals("")){
                    a.setAlamat(tf3.getText());
                }else{
                    JOptionPane.showMessageDialog(null,"Tolong masukkan alamat !!");
                    return;

                }
            }




            aa.saveData(a);
            addToTable();
            System.out.println("berhasil menambahkan data");
            clear();
        }catch(Exception e){
            System.out.println("gagal menambahkan"+e);
        }
    }

    @Override
    public void updateData() {
        int currentIndex = tabel.getSelectionModel().getSelectedIndex();
        Siswa baru= new Siswa(tf1.getText(), tf2.getText(),tf3.getText());
        Siswa old = tabel.getItems().get(currentIndex);
        if(baru.getId().equals(old.getId())){
            try{
                aa.updateData(old,baru);
                tabel.getItems().set(currentIndex , baru);
                JOptionPane.showMessageDialog(null ,"berhasil mengupdate data");
            }catch(Exception e){
                System.out.println("gagal mengupdate"+e);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Maaf id user tidak dapat diubah");
        }

    }

    @Override
    public void deleteData() {
        int currentIndex = tabel.getSelectionModel().getSelectedIndex();
        Siswa a = tabel.getItems().get(currentIndex);
        aa.deleteData(tabel.getItems().get(currentIndex).getId());
        tabel.getItems().remove(currentIndex);
        clear();
    }

    @Override
    public void clear() {
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");

    }

    @Override
    public void search() {
        if(!tf4.getText().equals("")){
            hasil = aa.search(tf4.getText());
            ObservableList<Siswa> data = FXCollections.observableArrayList();
            try{
                while(hasil.next()){
                    data.add(new Siswa(
                            hasil.getString("id"),
                            hasil.getString("nama"),
                            hasil.getString("alamat")
                    ));
                }
                tabel.setItems(data);
            }catch(SQLException e){
                System.out.println("gagal bsq"+e);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Tolong masukkan clue");
        }
    }

    @Override
    public void getAllData(){
        ObservableList<Siswa> data= FXCollections.observableArrayList();
        hasil = aa.getData();
        try{
            while(hasil.next()){
                data.add(new Siswa(hasil.getString("id"),hasil.getString("nama"),hasil.getString("alamat")));
            }
            tabel.setItems(data);
        }catch(SQLException e){

        }

    }

    @Override
    public void exit() {

        System.exit(0);
    }
    public void load(){
        int currentIndex = tabel.getSelectionModel().getSelectedIndex();
        if(currentIndex != -1){
            Siswa a = tabel.getItems().get(currentIndex);
            tf1.setText(a.getId());
            tf2.setText(a.getNama());
            tf3.setText(a.getAlamat());
        }
    }
    public void addToTable(){
        ObservableList<Siswa> data = tabel.getItems();
        data.add(new Siswa(tf1.getText(),tf2.getText(),tf3.getText()));
        tabel.setItems(data);
        JOptionPane.showMessageDialog(null,"berhasil menambahkan data");
    }
    public void checkNull(){
        if(tf1.getText() != null){
            a.setNama(tf1.getText());
        }
        if(tf1.getText() != null){
            a.setNama(tf2.getText());
        }
        if(tf1.getText() != null){
            a.setNama(tf3.getText());
        }
    }
    public boolean checkDuplicate(String id){
        ObservableList<Siswa> data = tabel.getItems() ;
        for ( Siswa s : data){
            if (s.getId().equals(id)){
                return true;
            }
        }
        return false ;
    }

}
