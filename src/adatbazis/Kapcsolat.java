package adatbazis;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
        String url = "jdbc:sqlite:src/adatbazis/adatok.sqlite";
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

    public  List<String> selectElsok(){
        List<String> elsok = new ArrayList<>();
        String sql = "SELECT elso FROM ranglista";

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            while (rs.next()) {
                elsok.add(rs.getString("elso"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return elsok;
    }

    public  List<String> selectMasodikok(){
        List<String> masodikok = new ArrayList<>();
        String sql = "SELECT masodik FROM ranglista";

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            while (rs.next()) {
                masodikok.add(rs.getString("masodik"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return masodikok;
    }

    public  List<String> selectHarmadikok(){
        List<String> harmadikok = new ArrayList<>();
        String sql = "SELECT harmadik FROM ranglista";

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            while (rs.next()) {
                harmadikok.add(rs.getString("harmadik"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return harmadikok;
    }
    public  List<String> selectNegyedikek(){
        List<String> negyedikek = new ArrayList<>();
        String sql = "SELECT negyedik FROM ranglista";

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            while (rs.next()) {
                negyedikek.add(rs.getString("negyedik"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return negyedikek;
    }

   /* public void selectAll(TableView tabla,TableColumn tb1,TableColumn tb2,TableColumn tb3,TableColumn tb4){
        String sql = "SELECT * FROM ranglista";

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            while (rs.next()) {
                String elso = rs.getString("elso");
                String masodik = rs.getString("masodik");
                String harmadik = rs.getString("harmadik");
                String negyedik = rs.getString("negyedik");

                tb1.setCellValueFactory(c -> new SimpleStringProperty(new String("elso")));
                tb2.setCellValueFactory(c -> new SimpleStringProperty(new String("masodik")));
                tb3.setCellValueFactory(c -> new SimpleStringProperty(new String("harmadik")));
                tb4.setCellValueFactory(c -> new SimpleStringProperty(new String("negyedik")));

                tabla.getItems().add(tb1);
               /* System.out.println(rs.getString("elso") + "\t" +
                        rs.getString("masodik") + "\t" +
                        rs.getString("harmadik") + "\t" +
                        rs.getString("negyedik"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }*/

}
