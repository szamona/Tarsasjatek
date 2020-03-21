package felulet;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable
{
    public Button btnJatekInditasa;
    public Button btnSzabalyzat;
    public Button btnRanglista;
    //public Button btnBeallitasok;
    public Button btnKilepes;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        
    }
    public void szabalyzat() {
        File pdfFile = new File("jatekszabaly.pdf");
        if (pdfFile.exists()) {
            if (Desktop.isDesktopSupported()) {
                try {
                    Desktop.getDesktop().open(pdfFile);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Awt Desktop is not supported!");
            }
        } else {
            System.out.println("File is not exists!");
        }
    }
    public void adatbázis(){
        try{

            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("Ranglista.fxml"));
            Parent root1 =  (Parent) fxmlLoader.load();
            RanglistaController controller = new RanglistaController();

            Stage stage = new Stage();
            stage.setTitle("Tarsasjatek");
            stage.setScene(new Scene(root1));

            //controller.start();
            stage.show();

        }catch (IOException e){ System.err.println("Az ablakot nem lehet megnyitni!\n"+e); }

        Stage currentStage = (Stage) btnRanglista.getScene().getWindow();
        currentStage.close();
    }


    public void Indit(ActionEvent actionEvent)
    {
      try{

          FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("JatekosSzamKivalasztas.fxml"));
          Parent root1 =  (Parent) fxmlLoader.load();
          Stage stage = new Stage();
          stage.setTitle("Tarsasjatek");
          stage.setScene(new Scene(root1));
          stage.show();

      }catch (IOException e){ System.err.println("Az ablakot nem lehet megnyitni!\n"+e); }

        Stage currentStage = (Stage) btnJatekInditasa.getScene().getWindow();
        currentStage.close();
    }

    public void Bezar(ActionEvent actionEvent)
    {
        Stage currentStage = (Stage) btnJatekInditasa.getScene().getWindow();
        currentStage.close();
    }
}
