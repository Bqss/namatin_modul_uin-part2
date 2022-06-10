package sebelas;

import koneksi.KoneksiDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Crud {

    Connection koneksi ;
    PreparedStatement prstt;
    String query,pesan;
    ResultSet dataset;


    public Crud(){
        KoneksiDB  a= new KoneksiDB("bab11","root","");

        try{
            koneksi = a.getKoneksi();
        }catch(SQLException  e){
            System.out.println(e);
        }
    }
    public String cekLogin(String userID , String password){
        query = "select nama from user where id_user=? and password=?";
        try{
            System.out.println(userID);
            System.out.println(password);
            prstt = koneksi.prepareStatement(query);
            prstt.setString(1,userID);
            prstt.setString(2,password);
            dataset = prstt.executeQuery();

            if(dataset.next()){

                System.out.println("ada");
                Session.setUsernameId(userID);
                Session.setNama(dataset.getString("nama"));
                Session.setStatusLogin("aktif");

                query = "insert into log_login (id_user) values (?)";
                try{
                    prstt = koneksi.prepareStatement(query);
                    prstt.setString(1,userID);
                    prstt.executeUpdate();
                    prstt.close();
                    pesan = "berhasil login";


                }catch(SQLException e){
                    pesan = "gagal simpan log login";
                }
            }else{

                pesan = "gagal login";

            }
        }catch(SQLException e){
            pesan = "query error";
            System.out.println(e);
        }

        return pesan ;
    }

    public void logout(String userID) {
        query = "update log_login set waktu_logout= current_timestamp() where id_user =? ORDER BY id DESC LIMIT 1 ";
        try{
            prstt = koneksi.prepareStatement(query);
            prstt.setString(1,userID);
            prstt.executeUpdate();
            prstt.close();

            Session.setStatusLogin(null);
            Session.setNama(null);
            Session.setUsernameId(null);


        }catch(SQLException  e){
            System.out.println(e);
        }

    }



}
