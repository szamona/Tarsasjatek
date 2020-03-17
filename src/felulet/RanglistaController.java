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
    public TableView<Vegeredmeny> tableRanglista;

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

        tb1= new TableColumn<String,Vegeredmeny>();
        tb1.setResizable(false);
        tb1.setPrefWidth(100);
        tb1.setText("1.helyezett");
        tb1.setCellValueFactory(new PropertyValueFactory<>("elso"));

        tb2= new TableColumn<String,Vegeredmeny>();
        tb2.setResizable(false);
        tb2.setPrefWidth(100);
        tb2.setText("2.helyezett");
        tb2.setCellValueFactory(new PropertyValueFactory<>("masodk"));

        tb3= new TableColumn<String,Vegeredmeny>();
        tb3.setResizable(false);
        tb3.setPrefWidth(100);
        tb3.setText("3.helyezett");
        tb3.setCellValueFactory(new PropertyValueFactory<>("harmadik"));

        tb4= new TableColumn<String,Vegeredmeny>();
        tb4.setResizable(false);
        tb4.setPrefWidth(100);
        tb4.setText("4.helyezett");
        tb4.setCellValueFactory(new PropertyValueFactory<>("negyedik"));

        tableRanglista.getColumns().addAll(tb1,tb2,tb3,tb4);
    }


    public void Kiir(){
       elsok = db.selectElsok();
       masodikok = db.selectMasodikok();
       harmadikok = db.selectHarmadikok();
       negyedikek = db.selectNegyedikek();

        for (int i = 0; i < elsok.size() ; i++) {
            tableRanglista.getItems().add(new Vegeredmeny( elsok.get(i),
                                                            masodikok.get(i),
                                                            harmadikok.get(i),
                                                            negyedikek.get(i)));
        }
    }
}
