package adatbazis;

import java.sql.*;

public class Kapcsolat {

    /*public static void createNewDatabase() {

        String url = "jdbc:sqlite:E:/Tananyag/Szakdoga/Tarsasjatek/src/adatbazis/adatok.sqlite";

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }*/

    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite://E:/Tananyag/Szakdoga/Tarsasjatek/src/adatbazis/adatok.sqlite";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public void insert(String elso,String masodik,String harmadik,String negyedik) {
        if (elso.equals(null)){
            elso="-";
        }
        if (masodik.equals(null)){
            masodik="-";
        }
        if (harmadik.equals(null)){
            harmadik="-";
        }
        if (negyedik.equals(null)){
            negyedik="-";
        }
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
        }
    }

    public void selectAll(){
        String sql = "SELECT * FROM ranglista";

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getString("elso") + "\t" +
                        rs.getString("masodik") + "\t" +
                        rs.getString("harmadik") + "\t" +
                        rs.getString("negyedik"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
