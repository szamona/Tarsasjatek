package felulet;

import adatbazis.Kapcsolat;
import adatbazis.Vegeredmeny;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class RanglistaController implements Initializable {
    public TableColumn<String,Vegeredmeny> tb1;
    public TableColumn<String,Vegeredmeny>  tb2;
    public TableColumn<String,Vegeredmeny>  tb3;
    public TableColumn<String,Vegeredmeny>  tb4;
    public TableView<Vegeredmeny> tableRanglista;
    Kapcsolat db = new Kapcsolat();

    public List<String> elsok;
    public List<String> masodikok;
    public List<String> harmadikok;
    public List<String> negyedikek;
    public AnchorPane alma;
    public Button btnMenu;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        start();
        Kiir();
    }

    public void start(){

        tb1.setResizable(false);
        tb1.setPrefWidth(100);
        tb1.setText("1.helyezett");
        tb1.setCellValueFactory(new PropertyValueFactory<>("elso"));


        tb2.setResizable(false);
        tb2.setPrefWidth(100);
        tb2.setText("2.helyezett");
        tb2.setCellValueFactory(new PropertyValueFactory<>("masodik"));


        tb3.setResizable(false);
        tb3.setPrefWidth(100);
        tb3.setText("3.helyezett");
        tb3.setCellValueFactory(new PropertyValueFactory<>("harmadik"));


        tb4.setResizable(false);
        tb4.setPrefWidth(100);
        tb4.setText("4.helyezett");
        tb4.setCellValueFactory(new PropertyValueFactory<>("negyedik"));

    }

    public void Kiir() {
        elsok = db.selectElsok();
        masodikok = db.selectMasodikok();
        harmadikok = db.selectHarmadikok();
        negyedikek = db.selectNegyedikek();

        for (int i = 0; i < elsok.size(); i++) {
            tableRanglista.getItems().add(new Vegeredmeny(elsok.get(i),
                    masodikok.get(i),
                    harmadikok.get(i),
                    negyedikek.get(i)));
        }

    }
    public void menu()
    {
            try{
                FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("Menu.fxml"));
                Parent root1 =  (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setTitle("Tarsasjatek");
                stage.setScene(new Scene(root1));
                stage.show();

            }catch (IOException e){ System.err.println("Az ablakot nem lehet megnyitni!\n"+e); }

            Stage currentStage = (Stage) btnMenu.getScene().getWindow();
            currentStage.close();
    }


}



