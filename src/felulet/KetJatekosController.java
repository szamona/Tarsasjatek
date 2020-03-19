package felulet;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class KetJatekosController implements Initializable {
    public Button btnJatekInditasa;
    public TextField txtJatekosEgyNev;
    public TextField txtJatekosKettoNev;

    public ImageView imgBabu1;
    public ImageView imgBabu2;


    public Pane paneKarakterek;
    public ImageView imgKarakter1;
    public ImageView imgKarakter2;
    public ImageView imgKarakter3;
    public ImageView imgKarakter4;
    public ImageView imgKarakter5;
    public ImageView imgKarakter6;
    public ImageView imgKarakter7;
    public ImageView imgKarakter8;
    public Button btnVissza;

    public Image kep;
    public int jatekos;
    public ImageView[] beallitottak = new ImageView[2];
    public String[] veglegesKarakterek = new String[2];;
    public List<ImageView> karakterek;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        jatekos = 0;
        beallitottak = new ImageView[2];
        veglegesKarakterek = new String[2];
        karakterek = new ArrayList<>();

        karakterek.add(imgKarakter1);
        karakterek.add(imgKarakter2);
        karakterek.add(imgKarakter3);
        karakterek.add(imgKarakter4);
        karakterek.add(imgKarakter5);
        karakterek.add(imgKarakter6);
        karakterek.add(imgKarakter7);
        karakterek.add(imgKarakter8);
    }


    public void JatekInditas(ActionEvent actionEvent)
    {
    if(txtJatekosEgyNev.textProperty().get().equals("")||
       txtJatekosKettoNev.textProperty().get().equals("")||
        imgBabu1.getImage().equals(null)||
        imgBabu2.getImage().equals(null)){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Hiba");
        alert.setHeaderText(null);
        alert.setContentText("Mindenkinek ki kell választania egy karaktert és minden játékosnak meg kell adnia a nevét!");

        alert.showAndWait();

    }
    else {
            try {

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Tabla.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                TablaController controller = fxmlLoader.getController();
                controller.getJatekos2(txtJatekosEgyNev.textProperty().get(),
                        txtJatekosKettoNev.textProperty().get(),
                        imgBabu1.getImage(),
                        imgBabu2.getImage());
                controller.getKarakter2(veglegesKarakterek[0], veglegesKarakterek[1]);
                Stage stage = new Stage();
                stage.setTitle("Tarsasjatek");
                stage.setMaximized(true);
                stage.setFullScreen(true);
                stage.setScene(new Scene(root1));
                stage.show();

            } catch (IOException e) {
                System.err.println("Az ablakot nem lehet megnyitni!\n" + e);
            }

            Stage currentStage = (Stage) btnJatekInditasa.getScene().getWindow();
            currentStage.close();
            }
    }

    public void Bezar(ActionEvent actionEvent)
    {
        Stage currentStage = (Stage) btnJatekInditasa.getScene().getWindow();
        currentStage.close();
    }


    public void karakterKivalaszt(MouseEvent mouseEvent) {
        paneKarakterek.setVisible(true);
        if (mouseEvent.getSource().equals(imgBabu1)){
            jatekos=1;
        }
        else {
            jatekos=2;
        }
    }


    public void ikonKivalaszt(MouseEvent mouseEvent) {

        int i=jatekos-1;


        if (mouseEvent.getSource()==imgKarakter1){
            kep= new Image(getClass().getResourceAsStream("resources/ikon1.jpg"));
            beallitottak[i]=imgKarakter1;
            veglegesKarakterek[i]="imgKarakter1";
        }
        else if (mouseEvent.getSource()==imgKarakter2){
            kep=new Image(getClass().getResourceAsStream("resources/ikon2.jpg"));
            beallitottak[i]=imgKarakter2;
            veglegesKarakterek[i]="imgKarakter2";
        }
        else if (mouseEvent.getSource()==imgKarakter3){
            kep=new Image(getClass().getResourceAsStream("resources/ikon3.jpg"));
            beallitottak[jatekos-1]=imgKarakter3;
            veglegesKarakterek[i]="imgKarakter3";
        }
        else if (mouseEvent.getSource()==imgKarakter4){
            kep=new Image(getClass().getResourceAsStream("resources/ikon4.jpg"));
            beallitottak[i]=imgKarakter4;
            veglegesKarakterek[i]="imgKarakter4";
        }
        else if (mouseEvent.getSource()==imgKarakter5){
            kep=new Image(getClass().getResourceAsStream("resources/ikon5.jpg"));
            beallitottak[i]=imgKarakter5;
            veglegesKarakterek[i]="imgKarakter5";
        }
        else if (mouseEvent.getSource()==imgKarakter6){
            kep=new Image(getClass().getResourceAsStream("resources/ikon6.jpg"));
            beallitottak[i]=imgKarakter6;
            veglegesKarakterek[i]="imgKarakter6";
        }
        else if (mouseEvent.getSource()==imgKarakter7){
            kep=new Image(getClass().getResourceAsStream("resources/ikon7.jpg"));
            beallitottak[i]=imgKarakter7;
            veglegesKarakterek[i]="imgKarakter7";
        }
        else{
            kep=new Image(getClass().getResourceAsStream("resources/ikon8.jpg"));
            beallitottak[i]=imgKarakter8;
            veglegesKarakterek[i]="imgKarakter8";
        }
        beallit();
        enegedelyez();
        kitakar();
    }

    public void beallit(){

        if (jatekos==1){
            imgBabu1.setImage(kep);
        }
        else{
            imgBabu2.setImage(kep);
        }
        paneKarakterek.setVisible(false);
    }

    public void enegedelyez() {

        for (var v:karakterek)
        {
            if (v.equals(beallitottak[0])||v.equals(beallitottak[1])){
                v.setDisable(true);
            }
            else {
                v.setDisable(false);
            }
        }
    }

    public void kitakar(){
        boolean b;
        GaussianBlur gaussianBlur = new GaussianBlur();
        gaussianBlur.setRadius(14);
        for (var k :karakterek)
        {
            b = false;
            for (int i = 0; i < beallitottak.length; i++) {
                if (k.equals(beallitottak[i])){
                    b=true;
                }
            }
            if(b){
                k.setEffect(gaussianBlur);

            }
            else {
                k.setEffect(null);
            }
        }
    }

    public void panelBezar(ActionEvent actionEvent) {
        paneKarakterek.setVisible(false);
    }

    public void vissza(ActionEvent actionEvent)
    {
        try{

            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("Menu.fxml"));
            Parent root1 =  (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Tarsasjatek");
            stage.setScene(new Scene(root1));
            stage.show();

        }catch (IOException e){ System.err.println("Az ablakot nem lehet megnyitni!\n"+e); }

        Stage currentStage = (Stage) btnVissza.getScene().getWindow();
        currentStage.close();
    }
}
