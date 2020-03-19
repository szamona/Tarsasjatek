package felulet;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class JatekosSzamKivalasztasaController {

    public ImageView imgKetto;
    public ImageView imgHarom;
    public ImageView imgNegy;
    public Button btnVissza;

    public void vissza(MouseEvent mouseEvent) {

            try{

                FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("fxmlFajlok/Menu.fxml"));
                Parent root1 =  (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setTitle("Tarsasjatek");
                stage.setScene(new Scene(root1));
                stage.show();

            }catch (IOException e){ System.err.println("Az ablakot nem lehet megnyitni!\n"+e); }

            Stage currentStage = (Stage) btnVissza.getScene().getWindow();
            currentStage.close();

    }

    public void negyJatekos(MouseEvent mouseEvent) {

        try{

            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("NegyJatekos.fxml"));
            Parent root1 =  (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Tarsasjatek");
            stage.setScene(new Scene(root1));
            stage.show();

        }catch (IOException e){ System.err.println("Az ablakot nem lehet megnyitni!\n"+e); }

        Stage currentStage = (Stage) imgNegy.getScene().getWindow();
        currentStage.close();
    }

    public void haromJatekos(MouseEvent mouseEvent) {
        try{

            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("HaromJatekos.fxml"));
            Parent root1 =  (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Tarsasjatek");
            stage.setScene(new Scene(root1));
            stage.show();

        }catch (IOException e){ System.err.println("Az ablakot nem lehet megnyitni!\n"+e); }

        Stage currentStage = (Stage) imgHarom.getScene().getWindow();
        currentStage.close();
    }

    public void ketJatekos(MouseEvent mouseEvent) {
        try{

            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("KetJatekos.fxml"));
            Parent root1 =  (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Tarsasjatek");
            stage.setScene(new Scene(root1));
            stage.show();

        }catch (IOException e){ System.err.println("Az ablakot nem lehet megnyitni!\n"+e); }

        Stage currentStage = (Stage) imgKetto.getScene().getWindow();
        currentStage.close();
    }
}
