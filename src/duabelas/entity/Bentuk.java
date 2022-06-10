package duabelas.entity;

import duabelas.util.Crud;
import koneksi.KoneksiDB;
import sebelas.Session;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Bentuk  implements Crud {
    protected double a,b,c;
    protected String luas;
    KoneksiDB db = new KoneksiDB("bab12","root","");
    Connection koneksi;

    public Bentuk() {

    }
    public Bentuk(String a){
        try{
            koneksi = db.getKoneksi();
        }catch(SQLException e){
            System.out.println("gagal manyambungkan ke database");
        }
    }
    protected double getA() {
        return a;
    }


    protected double getB() {
        return b;
    }

    protected double getC() {
        return c;
    }

    protected void setC(double c) {

    }

    public String cetak() {
        return luas;
    }


    @Override
    public void logAktifitas(String hasil)  {


        PreparedStatement prstt ;
        String query = "insert into log_aktifitas values (?,?,?)";
        try{

            prstt = koneksi.prepareStatement(query);
            prstt.setString(1,"basofi");
            prstt.setString(2,"Luas Bentuk");
            prstt.setString(3, hasil);
            prstt.executeUpdate();
        }catch(Exception e){
            System.out.println("query salah "+e);
        }


    }
}
