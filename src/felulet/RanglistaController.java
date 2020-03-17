package felulet;

import adatbazis.Kapcsolat;
import jatek.Jatekos;
import jatekTartozekok.Vegeredmeny;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class RanglistaController implements Initializable {
    public TableView tableRanglista;

    public Kapcsolat db = new Kapcsolat();
    public TableColumn tb1 ;
    public TableColumn tb2 ;
    public TableColumn tb3;
    public TableColumn tb4 ;

    public List<String> elsok;
    public List<String> masodikok;
    public List<String> harmadikok;
    public List<String> negyedikek;

    public void initialize(URL url, ResourceBundle resourceBundle) {
        tb1 = new TableColumn<String, Vegeredmeny>();
        tb2 = new TableColumn<String, Vegeredmeny>();
        tb3 = new TableColumn<String, Vegeredmeny>();
        tb4 = new TableColumn<String, Vegeredmeny>();
        tb1.setCellValueFactory(new PropertyValueFactory<>("elso"));
        tb2.setCellValueFactory(new PropertyValueFactory<>("masodik"));
        tb3.setCellValueFactory(new PropertyValueFactory<>("harmadik"));
        tb4.setCellValueFactory(new PropertyValueFactory<>("negyedik"));
    }


    public void Kiir(){
       elsok = db.selectElsok();
       masodikok = db.selectMasodikok();
       harmadikok = db.selectHarmadikok();
       negyedikek = db.selectNegyedikek();

        for (int i = 0; i < elsok.size() ; i++) {
            Vegeredmeny v = new Vegeredmeny( elsok.get(i),
                                             masodikok.get(i),
                                             harmadikok.get(i),
                                             negyedikek.get(i));
            tableRanglista.getItems().add(v);
        }
    }
}
