package config;
import java.sql.*;

/**
 *
 * @author USER
 */
public class koneksi {
    private Connection koneksi;
    public Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Koneksi Berhasil");
        } 
        catch (ClassNotFoundException ex) {
            System.out.println("Koneksi Gagal"+ex);
        }
        String url = "jdbc:mysql://localhost/aplikasi_smartphone";
        try {
            koneksi = DriverManager.getConnection(url,"root","");
            System.out.println("Berhasil Koneksi Ke Database");
        }
        catch (SQLException ex) {
            System.out.println("Gagal Koneksi Ke Database"+ex);
        }
        return koneksi;
    }
}
