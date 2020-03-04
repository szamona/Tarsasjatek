package felulet;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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
