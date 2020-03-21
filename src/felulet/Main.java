package felulet;

import adatbazis.Kapcsolat;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        primaryStage.setTitle("Menu");
        primaryStage.setScene(new Scene(root, 275, 300));
        primaryStage.show();
        Kapcsolat db = new Kapcsolat();
        db.createNewDatabase();
        db.createNewTable();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
