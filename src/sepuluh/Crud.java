package sepuluh;

import sembilan.Koneksidatabase;

import java.sql.*;

public class Crud {

    private Connection conection;
    private ResultSet result;
    private String query ;
    private PreparedStatement prstt ;

    public Crud(){
        Koneksidatabase a = new Koneksidatabase();
        try{
            conection = a.getKoneksi();
        }catch(SQLException d){
            System.out.println("menyambung gagal");
        }
    }

    public void saveData(Siswa siswa){
        query = "insert into mahasiswa values(?,?,?)";
        try{

            prstt = conection.prepareStatement(query);
            prstt.setString(1,siswa.getId());
            prstt.setString(2,siswa.getNama());
            prstt.setString(3,siswa.getAlamat());
            prstt.executeUpdate();

        }catch(SQLException e){
            System.out.println(e);
        }
    }

    public void updateData(Siswa old , Siswa baru){
        query = "update mahasiswa set nama=?,alamat=? where id=? ";
        try{
            prstt = conection.prepareStatement(query);
            prstt.setString(1,baru.getNama());
            prstt.setString(2,baru.getAlamat());
            prstt.setString(3, old.getId());
            prstt.executeUpdate();

        }catch(SQLException e){
            System.out.println(e);
        }
    }

    public ResultSet getData(){
        query = "select * from mahasiswa ";
        try{
            Statement stt = conection.createStatement();
           result = stt.executeQuery(query);

        }catch(SQLException e){
            System.out.println(e);
        }
        return result;
    }

    public void deleteData(String id){
        query = "delete from mahasiswa where id=?";
        try{
            prstt = conection.prepareStatement(query);
            prstt.setString(1,id);
            prstt.executeUpdate();
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public ResultSet search(String clue){
        query ="SELECT * FROM mahasiswa WHERE nama LIKE ? ";
        try{
            prstt = conection.prepareStatement(query);
            prstt.setString(1,"%"+clue+"%");
            result = prstt.executeQuery();
        }catch(SQLException e){
            System.out.println(e);
        }
        return result;
    }
}
