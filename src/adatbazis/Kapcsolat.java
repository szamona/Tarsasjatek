package adatbazis;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Kapcsolat {

    public static void createNewDatabase() {

        String url = "jdbc:sqlite:adatok.db";

        try {
            Connection conn = DriverManager.getConnection(url);
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

      public static void createNewTable() {
        String url = "jdbc:sqlite:adatok.db";
          String sql = "CREATE TABLE IF NOT EXISTS ranglista (\n" +
                " id integer PRIMARY KEY,\n" +
                " elso text NOT NULL,\n" +
                " masodik text NOT NULL,\n" +
                " harmadik text NOT NULL,\n" +
                " negyedik text NOT NULL\n" +
                ");";
        try {
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:adatok.db";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }
        return conn;
    }
    public void insert(String elso,String masodik,String harmadik,String negyedik) {
        String sql = "INSERT INTO ranglista(elso,masodik,harmadik,negyedik) VALUES(?,?,?,?)";

        try (Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, elso);
            pstmt.setString(2, masodik);
            pstmt.setString(3, harmadik);
            pstmt.setString(4, negyedik);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            createNewDatabase();
            createNewTable();
        }
    }

    public  List<String> selectElsok(){
        List<String> elsok = new ArrayList<>();
        String sql = "SELECT elso FROM ranglista ORDER BY elso DESC ";

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            while (rs.next()) {
                elsok.add(rs.getString("elso"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            createNewDatabase();
            createNewTable();
        }
        return elsok;
    }

    public  List<String> selectMasodikok(){
        List<String> masodikok = new ArrayList<>();
        String sql = "SELECT masodik FROM ranglista ORDER BY masodik DESC ";

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            while (rs.next()) {
                masodikok.add(rs.getString("masodik"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            createNewDatabase();
            createNewTable();
        }
        return masodikok;
    }

    public  List<String> selectHarmadikok(){
        List<String> harmadikok = new ArrayList<>();
        String sql = "SELECT harmadik FROM ranglista ORDER BY harmadik DESC";

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            while (rs.next()) {
                harmadikok.add(rs.getString("harmadik"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            createNewDatabase();
            createNewTable();
        }
        return harmadikok;
    }
    public  List<String> selectNegyedikek(){
        List<String> negyedikek = new ArrayList<>();
        String sql = "SELECT negyedik FROM ranglista ORDER BY negyedik DESC";

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            while (rs.next()) {
                negyedikek.add(rs.getString("negyedik"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            createNewDatabase();
            createNewTable();
        }
        return negyedikek;
    }

}
