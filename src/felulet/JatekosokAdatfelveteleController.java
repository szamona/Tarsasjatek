package felulet;

import jatek.Jatekos;
import jatekTartozekok.Babu;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class JatekosokAdatfelveteleController implements Initializable {

    public Button btnJatekInditasa;
    public TextField txtJatekosEgyNev;
    public TextField txtJatekosHaromNev;
    public TextField txtJatekosKettoNev;
    public TextField txtJatekosNegyNev;


    public ImageView imgBabu1;
    public ImageView imgBabu2;
    public ImageView imgBabu3;
    public ImageView imgBabu4;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


    public void JatekInditas(ActionEvent actionEvent)
    {

        try{

            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("Tabla.fxml"));
            Parent root1 =  (Parent) fxmlLoader.load();
            TablaController controller = fxmlLoader.getController();
            controller.getJatekosNev(txtJatekosEgyNev.textProperty().get(),
                                     txtJatekosKettoNev.textProperty().get(),
                                     txtJatekosHaromNev.textProperty().get(),
                                     txtJatekosNegyNev.textProperty().get());

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

