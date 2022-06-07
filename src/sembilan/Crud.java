package sembilan;

import java.sql.*;

public class Crud {
    private String id ;
    private String nama;
    private String alamat;
    private Connection appKoneksi;
    private Statement appStt ;
    private PreparedStatement appPstt;
    private ResultSet appRes;
    private String dbQuery;

    public Crud(){
        Koneksidatabase a = new Koneksidatabase();
        try{
            appKoneksi = a.getKoneksi();
        }catch (Exception b){
            System.out.println(b);
        }
    }

    public Crud(String id , String nama , String alamat){
        this.alamat = alamat;
        this.id = id ;
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void saveData(String id , String nama , String alamat){
        dbQuery = "insert into mahasiswa values(?,?,?)";
        try{
            appPstt = appKoneksi.prepareStatement(dbQuery);
            appPstt.setString(1,id);
            appPstt.setString(2,nama);
            appPstt.setString(3,alamat);
            appPstt.executeUpdate();
            System.out.println("berhasil simpan data");

        }catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void deleteData(String id ){
        dbQuery = "delete from mahasiswa where id=?";
        try{
            appPstt = appKoneksi.prepareStatement(dbQuery);
            appPstt.setString(1,id);
            appPstt.executeUpdate();

        }catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void updateData(String id , String nama , String alamat){
        dbQuery = "update  mahasiswa set nama=? , alamat=? where id=?" ;
        try{
            appPstt = appKoneksi.prepareStatement(dbQuery);
            appPstt.setString(1,nama);
            appPstt.setString(2,alamat);
            appPstt.setString(3,id);
            appPstt.executeUpdate();

        }catch (SQLException e) {
            System.out.println(e);
        }
    }

    public ResultSet getData(){
        dbQuery = "select * from mahasiswa";
        try{
            appStt = appKoneksi.createStatement();
            appRes = appStt.executeQuery(dbQuery);
        }catch (SQLException e){
            System.out.println(e);
        }
        return appRes;
    }




}

