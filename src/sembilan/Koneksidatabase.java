package sembilan;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksidatabase {
     private Connection connect ;
     private final String drivername = "com.mysql.cj.jdbc.Driver";
     private final String jdbc = "jdbc:mysql://";
     private final String host = "localhost:";
     private final String port = "3306/";
     private final String database = "bab10";
     private final String username = "root";
     private final String password = "";
     private final String url = jdbc+host+port+database;

     public Connection getKoneksi() throws SQLException {
          if(connect ==null){
               try{
                    Class.forName(drivername);
                    System.out.println("class driver ditemukan");
                    try{

                         connect = DriverManager.getConnection(url,username,password);
                         System.out.println("koneksi database ditemukan");
                    }catch(SQLException e){
                         System.out.println("koneksi database gagal "+e);
                         System.exit(0);
                    }
               }catch(ClassNotFoundException cnfe){
                    System.out.println("class driver tidak ditemukan , terjadi kesalahan pada : "+cnfe);
                    System.exit(0);
               }
          }
          return  connect;
     }
}
