package felulet;

import adatbazis.Kapcsolat;
import jatek.Jatekos;
import jatekTartozekok.Babu;
import jatekTartozekok.DoboKocka;
import jatekTartozekok.Kartya;
import jatekTartozekok.Sarkany;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.Timeline;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import tabla.Tabla;
import tabla.mezo.*;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class TablaController implements Initializable {
    public List<Jatekos> jatekosok = new LinkedList<Jatekos>();

    public EgyszeruMezo start;
    public EgyszeruMezo cel;
    public EgyszeruMezo mezo2;
    public EgyszeruMezo mezo3;
    public EgyszeruMezo mezo4;
    public EgyszeruMezo mezo5;
    public EgyszeruMezo mezo17;
    public EgyszeruMezo mezoD1;
    public EgyszeruMezo mezo6;
    public EgyszeruMezo mezoD2;
    public EgyszeruMezo mezoD4;
    public EgyszeruMezo mezo18;
    public EgyszeruMezo kerdojel1;
    public EgyszeruMezo mezo22;
    public EgyszeruMezo mezo23;
    public EgyszeruMezo mezo24;
    public EgyszeruMezo mezo25;
    public EgyszeruMezo mezo26;
    public EgyszeruMezo mezo27;
    public EgyszeruMezo mezo30;
    public EgyszeruMezo mezo29;
    public EgyszeruMezo mezo28;
    public EgyszeruMezo mezo31;
    public EgyszeruMezo mezoT11;
    public EgyszeruMezo mezoT33;
    public EgyszeruMezo mezoT22;
    public EgyszeruMezo mezo32;
    public EgyszeruMezo mezo33;
    public EgyszeruMezo kerdojel2;
    public EgyszeruMezo kerdojel3;
    public EgyszeruMezo mezo40;
    public EgyszeruMezo mezo41;
    public EgyszeruMezo mezo42;
    public EgyszeruMezo kerdojel4;
    public EgyszeruMezo mezoD11;
    public EgyszeruMezo mezo34;
    public EgyszeruMezo mezo39;
    public EgyszeruMezo mezoD22;
    public EgyszeruMezo mezo35;
    public EgyszeruMezo mezo36;
    public EgyszeruMezo kerdojel5;
    public EgyszeruMezo mezo61;
    public EgyszeruMezo mezo7;
    public EgyszeruMezo mezo8;
    public EgyszeruMezo kerdojel6;
    public EgyszeruMezo mezo9;
    public EgyszeruMezo mezo10;
    public EgyszeruMezo mezoT1;
    public EgyszeruMezo kerdojel8;
    public EgyszeruMezo mezoT2;
    public EgyszeruMezo kerdojel11;
    public EgyszeruMezo mezo11;
    public EgyszeruMezo mezo12;
    public EgyszeruMezo mezo13;
    public EgyszeruMezo mezo14;
    public EgyszeruMezo mezoT3;
    public EgyszeruMezo mezo21;
    public EgyszeruMezo mezo20;
    public EgyszeruMezo kerdojel7;
    public EgyszeruMezo mezo19;
    public EgyszeruMezo mezo54;
    public EgyszeruMezo mezo37;
    public EgyszeruMezo mezo38;
    public EgyszeruMezo kerdojel9;
    public EgyszeruMezo mezo15;
    public EgyszeruMezo mezo16;
    public EgyszeruMezo kerdojel10;
    public EgyszeruMezo mezo53;
    public EgyszeruMezo mezo51;
    public EgyszeruMezo mezo52;
    public EgyszeruMezo mezo50;
    public EgyszeruMezo mezo49;
    public EgyszeruMezo mezoD33;
    public EgyszeruMezo mezo45;
    public EgyszeruMezo mezo46;
    public EgyszeruMezo mezoD44;
    public EgyszeruMezo mezo43;
    public EgyszeruMezo mezo44;
    public EgyszeruMezo kerdojel12;
    public EgyszeruMezo mezo58;
    public EgyszeruMezo mezo55;
    public EgyszeruMezo mezo56;
    public EgyszeruMezo mezo48;
    public EgyszeruMezo mezo47;
    public EgyszeruMezo mezo57;
    public EgyszeruMezo mezo59;
    public EgyszeruMezo mezo60;
    public EgyszeruMezo mezoD3;

    public DuoMezo folyo;
    public DuoMezo duo1;
    public DuoMezo duo2;
    public TriMezo tri1;
    public TriMezo tri2;
    public ImageView imgKocka;
    public MenuItem menuFomenu;
    public MenuButton btnMenu;
    public Label lblKartya;
    public Button btnOk;
    public Pane paneKartya;
    public EgyszeruMezo tojas;

    Tabla tabla=new Tabla();

    public DoboKocka kocka=new DoboKocka();
    public ImageView imgBabu1;
    public ImageView imgBabu2;
    public ImageView imgBabu3;
    public ImageView imgBabu4;

    public Label lblJatekos1;
    public Label lblJatekos2;
    public Label lblJatekos3;
    public Label lblJatekos4;

    public Babu babu1;
    public Babu babu2;
    public Babu babu3;
    public Babu babu4;

    public Jatekos jatekos1;
    public Jatekos jatekos2;
    public Jatekos jatekos3;
    public Jatekos jatekos4;
    public Jatekos aktivJatekos;
    public Babu csereJatekos;
    public Mezo cseremezo;

    public Kartya kartya=new Kartya();
    Sarkany sarkany;
    public AnchorPane apaneTabla;
    public int dobas;
    public EgyszeruMezo mezo1;
    public Random randomSzam =new Random();
    public List<Mezo> lepesek;
    public List<Mezo> specialisMezok= new ArrayList<>();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void adatbázis(){
        Kapcsolat k = new Kapcsolat();
        k.selectAll();
    }
    public void getJatekos4(String text1,String text2, String text3, String text4,Image kep1,Image kep2,Image kep3,Image kep4) {
        babu1 = new Babu();
        babu2 = new Babu();
        babu3 = new Babu();
        babu4 = new Babu();

        babu1.setMezo(start);
        babu2.setMezo(start);
        babu3.setMezo(start);
        babu4.setMezo(start);

        jatekos1 = new Jatekos(text1);
        jatekos1.setBabu(babu1);

        jatekos2 = new Jatekos(text2);
        jatekos2.setBabu(babu2);

        jatekos3 = new Jatekos(text3);
        jatekos3.setBabu(babu3);

        jatekos4 = new Jatekos(text4);
        jatekos4.setBabu(babu4);

        lblJatekos1.setText(text1);
        lblJatekos2.setText(text2);
        lblJatekos3.setText(text3);
        lblJatekos4.setText(text4);

        jatekosok.add(jatekos1);
        jatekosok.add(jatekos2);
        jatekosok.add(jatekos3);
        jatekosok.add(jatekos4);

        imgBabu1.setImage(kep1);
        imgBabu2.setImage(kep2);
        imgBabu3.setImage(kep3);
        imgBabu4.setImage(kep4);

        aktivJatekos=jatekosok.get(randomSzam.nextInt(4));
        sarkany();
        tablaFeltolt();

    }
    public void getJatekos3(String text1,String text2, String text3,Image kep1,Image kep2,Image kep3) {
        babu1 = new Babu();
        babu2 = new Babu();
        babu3 = new Babu();


        babu1.setMezo(start);
        babu2.setMezo(start);
        babu3.setMezo(start);


        jatekos1 = new Jatekos(text1);
        jatekos1.setBabu(babu1);

        jatekos2 = new Jatekos(text2);
        jatekos2.setBabu(babu2);

        jatekos3 = new Jatekos(text3);
        jatekos3.setBabu(babu3);


        lblJatekos1.setText(text1);
        lblJatekos2.setText(text2);
        lblJatekos3.setText(text3);

        jatekosok.add(jatekos1);
        jatekosok.add(jatekos2);
        jatekosok.add(jatekos3);

        imgBabu1.setImage(kep1);
        imgBabu2.setImage(kep2);
        imgBabu3.setImage(kep3);

        aktivJatekos=jatekosok.get(randomSzam.nextInt(3));
        sarkany();
        tablaFeltolt();

    }
    public void getJatekos2(String text1,String text2,Image kep1,Image kep2) {
        babu1 = new Babu();
        babu2 = new Babu();


        babu1.setMezo(start);
        babu2.setMezo(start);


        jatekos1 = new Jatekos(text1);
        jatekos1.setBabu(babu1);

        jatekos2 = new Jatekos(text2);
        jatekos2.setBabu(babu2);


        lblJatekos1.setText(text1);
        lblJatekos2.setText(text2);

        jatekosok.add(jatekos1);
        jatekosok.add(jatekos2);


        imgBabu1.setImage(kep1);
        imgBabu2.setImage(kep2);


        aktivJatekos=jatekosok.get(randomSzam.nextInt(3));
        sarkany();
        tablaFeltolt();

    }
    public void sarkany(){
        Image kep = new Image(getClass().getResourceAsStream("resources/Sarkany.png"));
        sarkany = new Sarkany();
        apaneTabla.getChildren().add(sarkany);
        sarkany.setFitHeight(180);
        sarkany.setFitWidth(180);
        sarkany.setLayoutX(1650);
        sarkany.setLayoutY(465);
        sarkany.setImage(kep);
        sarkany.setMezo(tojas);

    }
    public void getKarakter4(String k1,String k2 ,String k3, String k4){
                DropShadow arnyek=new DropShadow();
                arnyek.setColor(Color.WHITE);
                arnyek.setHeight(20);
                arnyek.setWidth(20);

                babu1.setImage(vizsgalatKarakter(k1));
                apaneTabla.getChildren().add(babu1);
                babu1.setFitHeight(210);
                babu1.setFitWidth(110);
                babu1.setLayoutY(start.getLayoutY()-100);
                babu1.setLayoutX(start.getLayoutX());
                babu1.setEffect(arnyek);
                babu1.setOnMouseClicked(this::babuCsere);

                babu2.setImage(vizsgalatKarakter(k2));
                apaneTabla.getChildren().add(babu2);
                babu2.setFitHeight(210);
                babu2.setFitWidth(110);
                babu2.setLayoutY(babu1.getLayoutY());
                babu2.setLayoutX(babu1.getLayoutX()+75);
                babu2.setEffect(arnyek);
                babu2.setOnMouseClicked(this::babuCsere);

                babu3.setImage(vizsgalatKarakter(k3));
                apaneTabla.getChildren().add(babu3);
                babu3.setFitHeight(210);
                babu3.setFitWidth(110);
                babu3.setLayoutY(babu2.getLayoutY());
                babu3.setLayoutX(babu2.getLayoutX()+75);
                babu3.setEffect(arnyek);
                babu3.setOnMouseClicked(this::babuCsere);

                babu4.setImage(vizsgalatKarakter(k4));
                apaneTabla.getChildren().add(babu4);
                babu4.setFitHeight(210);
                babu4.setFitWidth(110);
                babu4.setLayoutY(babu3.getLayoutY());
                babu4.setLayoutX(babu3.getLayoutX()+75);
                babu4.setEffect(arnyek);
                babu4.setOnMouseClicked(this::babuCsere);

        jatek();
    }
    public void getKarakter3(String k1,String k2 ,String k3){
        DropShadow arnyek=new DropShadow();
        arnyek.setColor(Color.WHITE);
        arnyek.setHeight(20);
        arnyek.setWidth(20);

        babu1.setImage(vizsgalatKarakter(k1));
        apaneTabla.getChildren().add(babu1);
        babu1.setFitHeight(210);
        babu1.setFitWidth(110);
        babu1.setLayoutY(start.getLayoutY()-100);
        babu1.setLayoutX(start.getLayoutX());
        babu1.setEffect(arnyek);
        babu1.setOnMouseClicked(this::babuCsere);

        babu2.setImage(vizsgalatKarakter(k2));
        apaneTabla.getChildren().add(babu2);
        babu2.setFitHeight(210);
        babu2.setFitWidth(110);
        babu2.setLayoutY(babu1.getLayoutY());
        babu2.setLayoutX(babu1.getLayoutX()+75);
        babu2.setEffect(arnyek);
        babu2.setOnMouseClicked(this::babuCsere);

        babu3.setImage(vizsgalatKarakter(k3));
        apaneTabla.getChildren().add(babu3);
        babu3.setFitHeight(210);
        babu3.setFitWidth(110);
        babu3.setLayoutY(babu2.getLayoutY());
        babu3.setLayoutX(babu2.getLayoutX()+75);
        babu3.setEffect(arnyek);
        babu3.setOnMouseClicked(this::babuCsere);

        jatek();
    }
    public void getKarakter2(String k1,String k2 ){
        DropShadow arnyek=new DropShadow();
        arnyek.setColor(Color.WHITE);
        arnyek.setHeight(20);
        arnyek.setWidth(20);

        babu1.setImage(vizsgalatKarakter(k1));
        apaneTabla.getChildren().add(babu1);
        babu1.setFitHeight(210);
        babu1.setFitWidth(110);
        babu1.setLayoutY(start.getLayoutY()-100);
        babu1.setLayoutX(start.getLayoutX());
        babu1.setEffect(arnyek);
        babu1.setOnMouseClicked(this::babuCsere);

        babu2.setImage(vizsgalatKarakter(k2));
        apaneTabla.getChildren().add(babu2);
        babu2.setFitHeight(210);
        babu2.setFitWidth(110);
        babu2.setLayoutY(babu1.getLayoutY());
        babu2.setLayoutX(babu1.getLayoutX()+75);
        babu2.setEffect(arnyek);
        babu2.setOnMouseClicked(this::babuCsere);


        jatek();
    }
    public void specialisMezok(){
        Image kep= new Image(getClass().getResourceAsStream("resources/triUt1.png"));
        tri1.setImage(kep);
        apaneTabla.getChildren().add(tri1);
        tri1.setId("tri1");
        tri1.setFitHeight(150);
        tri1.setFitWidth(200);
        tri1.setLayoutX(135);
        tri1.setLayoutY(813);
        tri1.setOnMouseClicked(this::specialisLepes);

        kep= new Image(getClass().getResourceAsStream("resources/triUt3.png"));
        tri2.setImage(kep);
        apaneTabla.getChildren().add(tri2);
        tri2.setId("tri2");
        tri2.setFitHeight(150);
        tri2.setFitWidth(200);
        tri2.setLayoutX(1455);
        tri2.setLayoutY(273);
        tri2.setOnMouseClicked(this::specialisLepes);

        kep= new Image(getClass().getResourceAsStream("resources/duoHid2.png"));
        duo1.setImage(kep);
        apaneTabla.getChildren().add(duo1);
        duo1.setId("duo1");
        duo1.setFitHeight(150);
        duo1.setFitWidth(200);
        duo1.setLayoutX(1192);
        duo1.setLayoutY(732);
        duo1.setOnMouseClicked(this::specialisLepes);

        kep= new Image(getClass().getResourceAsStream("resources/duoHid1.png"));
        duo2.setImage(kep);
        apaneTabla.getChildren().add(duo2);
        duo2.setId("duo2");
        duo2.setFitHeight(150);
        duo2.setFitWidth(200);
        duo2.setLayoutX(179);
        duo2.setLayoutY(369);
        duo2.setOnMouseClicked(this::specialisLepes);

        kep= new Image(getClass().getResourceAsStream("resources/folyo1.png"));
        folyo.setImage(kep);
        apaneTabla.getChildren().add(folyo);
        folyo.setId("folyo");
        folyo.setFitHeight(208);
        folyo.setFitWidth(499);
        folyo.setLayoutX(1102);
        folyo.setLayoutY(459);
        folyo.setOnMouseClicked(this::specialisLepes);


    }
    public void kartyalap(Mezo m){

        kartya.Sorsolas();
        DropShadow shadow = new DropShadow();
        shadow.setColor(Color.YELLOW);
        shadow.setWidth(50);
        shadow.setHeight(50);
        paneKartya.toFront();
        paneKartya.setVisible(true);
        if(kartya.getSzam()==1){

            aktivJatekos.getBabu().setLayoutX((double) (start).getLayoutX()+150);
            aktivJatekos.getBabu().setLayoutY((double) (start).getLayoutY()-150);
            aktivJatekos.getBabu().setMezo(start);
            lblKartya.setText("A kalandorodat elátkozták.Visszakerülsz a startmezőre!");
            kartya.setSzam(0);
            jatek();
        }
        if(kartya.getSzam()==2){
            aktivJatekos.setLephete(false);
            lblKartya.setText("A kalandorod csapdába esett! Kimaradsz egy körből!");
            kartya.setSzam(0);
            jatek();

        }
        if (kartya.getSzam()==3){
            csereJatekos=new Babu();
            csereJatekos.setLayoutX(aktivJatekos.getBabu().getLayoutX());
            csereJatekos.setLayoutY(aktivJatekos.getBabu().getLayoutY());
            cseremezo=aktivJatekos.getBabu().getMezo();

            for (var v: jatekosok) {
                if(!v.equals(aktivJatekos)){

                    v.getBabu().setEffect(shadow);
                }
            }
            lblKartya.setText("Találtál egy teleportáló varázslatot! Cseréld ki a kalandorod helyét egy másik kalandoréval.");
        }
        if(kartya.getSzam()==4){
            dobas=10;
            lepesek=lehetsegesLepesek(dobas,m,m);
            for (var v: lepesek )
            {
                v.setEffect(null);
                v.setEffect(shadow);
            }
            lblKartya.setText("Lépj 10 mezőt!");
            kartya.setSzam(0);
        }
        if(kartya.getSzam()==5){
            specialisMezok.add(tri1);
            specialisMezok.add(tri2);
            specialisMezok.add(duo1);
            specialisMezok.add(duo2);
            specialisMezok.add(folyo);

            for (var v: specialisMezok )
            {
                v.setEffect(null);
                v.setEffect(shadow);
            }
            lblKartya.setText("Változtasd meg az egyik speciális mezőt!");
        }
        if(kartya.getSzam()==6){
            lepesek=new ArrayList<>();
            int db;

            for (var v:tabla.getTablaMezoi()) {
                db=0;
                for (var b:jatekosok) {
                    if(v.equals(b.getBabu().getMezo())){
                       db++;
                    }
                }
                if (db==0){
                    lepesek.add(v);
                    v.setEffect(shadow);
                }

            }
            shadow.setColor(Color.RED);
            sarkany.setEffect(shadow);
            lblKartya.setText("Lépj a sárkánnyal!");
        }

    }
    public void okButton(){
        paneKartya.setVisible(false);
    }
    public SpecialisMezo allapotvaltas(SpecialisMezo m){
        for (var v : m.getSzomszedosMezok()) {
            v.MezoTorol(m);
        }
        m.allapotValtas();

        for (var v:m.getSzomszedosMezok()) {
            v.MezoHozzaad(m);
        }
        kartya.setSzam(0);
        for (var v:specialisMezok) {
            v.setEffect(null);
        }
        return m;
    }
    public void specialisLepes(MouseEvent mouseEvent){
        if (kartya.getSzam()==5){
           SpecialisMezo m = allapotvaltas((SpecialisMezo) mouseEvent.getSource());
           specialisKepvaltas(m);

           jatek();
        }
        else {
            lepes(mouseEvent);
        }
    }
    public void specialisKepvaltas(SpecialisMezo m){
        if (m.equals(tri1)||m.equals(tri2)){
            tri(m);
        }
        else if(m.equals(duo1)||m.equals(duo2)){
            duo(m);
        }
        else {
            folyo(m);
        }
    }
    public void tri(SpecialisMezo m){
        Image kep;
        if (m.getAllapot().equals(Allapotok.ELSO)){
            kep= new  Image(getClass().getResourceAsStream("resources/triUt1.png"));
        }
        else if(m.getAllapot().equals(Allapotok.MASODIK)){
            kep= new  Image(getClass().getResourceAsStream("resources/triUt2.png"));
        }
        else {
            kep= new  Image(getClass().getResourceAsStream("resources/triUt3.png"));
        }

        if(m==tri1){
            tri1.setImage(kep);
        }
        else {
            tri2.setImage(kep);
        }
    }
    public void duo(SpecialisMezo m){
        Image kep;
        if (m.getAllapot().equals(Allapotok.ELSO)){
            kep= new  Image(getClass().getResourceAsStream("resources/duoHid1.png"));
        }
        else{
            kep= new  Image(getClass().getResourceAsStream("resources/duoHid2.png"));
        }
        if(m==duo1){
            duo1.setImage(kep);
        }
        else {
            duo2.setImage(kep);
        }
    }
    public void folyo(SpecialisMezo m){
        Image kep;
        if (m.getAllapot().equals(Allapotok.ELSO)){
            kep= new  Image(getClass().getResourceAsStream("resources/folyo1.png"));
        }
        else{
            kep= new  Image(getClass().getResourceAsStream("resources/folyo2.png"));
        }
        folyo.setImage(kep);
    }
    public void babuCsere(MouseEvent mouseEvent){
        if(kartya.getSzam()==3) {
            DropShadow shadow = new DropShadow();
            shadow.setColor(Color.WHITE);
            Babu babu = ((Babu) mouseEvent.getSource());
            aktivJatekos.getBabu().setLayoutX(babu.getLayoutX());
            aktivJatekos.getBabu().setLayoutY(babu.getLayoutY());
            aktivJatekos.getBabu().setMezo(babu.getMezo());

            ((Babu) mouseEvent.getSource()).setLayoutX(csereJatekos.getLayoutX());
            ((Babu) mouseEvent.getSource()).setLayoutY(csereJatekos.getLayoutY());
            ((Babu) mouseEvent.getSource()).setMezo(cseremezo);
            for (var v:jatekosok) {
                if(!v.equals(aktivJatekos)){
                    v.getBabu().setEffect(null);
                    v.getBabu().setEffect(shadow);
                }
            }
            kartya.setSzam(0);
            jatek();
        }
    }
    public Image vizsgalatKarakter(String id){
        Image kep;
        if (id.equals("imgKarakter1")){
            kep = new  Image(getClass().getResourceAsStream("resources/karakter1.png"));
        }
        else if (id.equals("imgKarakter2")){
            kep = new  Image(getClass().getResourceAsStream("resources/karakter2.png"));
        }
        else if (id.equals("imgKarakter3")){
            kep = new  Image(getClass().getResourceAsStream("resources/karakter3.png"));
        }
        else if (id.equals("imgKarakter4")){
            kep = new  Image(getClass().getResourceAsStream("resources/karakter4.png"));
        }
        else if (id.equals("imgKarakter5")){
            kep = new  Image(getClass().getResourceAsStream("resources/karakter5.png"));
        }
        else if (id.equals("imgKarakter6")){
            kep = new  Image(getClass().getResourceAsStream("resources/karakter6.png"));
        }
        else if (id.equals("imgKarakter7")){
            kep = new  Image(getClass().getResourceAsStream("resources/karakter7.png"));
        }
        else{
            kep = new  Image(getClass().getResourceAsStream("resources/karakter8.png"));
        }
        return kep;
    }
    public void jatek(){
        dobas=0;
       DropShadow shadow = new DropShadow();
       shadow.setColor(Color.YELLOW);
       shadow.setWidth(50);
       shadow.setHeight(50);
       aktivJatekos=kovetkezoJatekos(aktivJatekos);
       aktivJatekos.getBabu().setEffect(shadow);

    }
    public void mezokJelzese(){
        lepesek= new ArrayList<>();
        DropShadow shadow = new DropShadow();
        shadow.setColor(Color.YELLOW);
        shadow.setWidth(50);
        shadow.setHeight(50);
        lepesek=lehetsegesLepesek(dobas,aktivJatekos.getBabu().getMezo(),aktivJatekos.getBabu().getMezo());
       for (var v: lepesek )
       {
           v.setEffect(shadow);
       }
    }
    public void kerdojelLepes(MouseEvent mouseEvent){
        if(lepesek.contains((Mezo) mouseEvent.getSource())&&dobas!=0){
            DropShadow shadow = new DropShadow();
            shadow.setColor(Color.WHITE);
            shadow.setWidth(50);
            shadow.setHeight(50);
            aktivJatekos.getBabu().setMezo((Mezo) mouseEvent.getSource());
            aktivJatekos.getBabu().setLayoutX((double) ((Mezo) mouseEvent.getSource()).getLayoutX()+20);
            aktivJatekos.getBabu().setLayoutY((double) ((Mezo) mouseEvent.getSource()).getLayoutY()-100);
            aktivJatekos.getBabu().setEffect(shadow);
            for (var v: lepesek){
                v.setEffect(null);
            }
            kartyalap((Mezo) mouseEvent.getSource());
        }
    }
    public void sarkanyLepes(MouseEvent mouseEvent){
        sarkany.toFront();
        sarkany.getMezo().setSzabad(true);

        if (lepesek.contains((Mezo) mouseEvent.getSource())) {
            sarkany.setMezo((Mezo) mouseEvent.getSource());
            if (((Mezo) mouseEvent.getSource()).getId().contains("mezo")) {
                sarkany.setLayoutX((double) ((Mezo) mouseEvent.getSource()).getLayoutX() - 20);
                sarkany.setLayoutY((double) ((Mezo) mouseEvent.getSource()).getLayoutY() - 130);

            } else if (((Mezo) mouseEvent.getSource()).getId().contains("tri")) {
                sarkany.setLayoutX((double) ((Mezo) mouseEvent.getSource()).getLayoutX() + 50);
                sarkany.setLayoutY((double) ((Mezo) mouseEvent.getSource()).getLayoutY() - 140);
            } else if (((Mezo) mouseEvent.getSource()).getId().contains("duo")) {
                sarkany.setLayoutX((double) ((Mezo) mouseEvent.getSource()).getLayoutX() + 50);
                sarkany.setLayoutY((double) ((Mezo) mouseEvent.getSource()).getLayoutY() - 120);

            } else if (((Mezo) mouseEvent.getSource()).getId().contains("folyo")) {
                sarkany.setLayoutX((double) ((Mezo) mouseEvent.getSource()).getLayoutX() + 370);
                sarkany.setLayoutY((double) ((Mezo) mouseEvent.getSource()).getLayoutY() - 50);

            } else if (((Mezo) mouseEvent.getSource()).getId().contains("start")) {
                sarkany.setLayoutX((double) ((Mezo) mouseEvent.getSource()).getLayoutX() + 150);
                sarkany.setLayoutY((double) ((Mezo) mouseEvent.getSource()).getLayoutY() - 150);
            }
            for (var v : lepesek) {
                v.setEffect(null);
            }
            sarkany.getMezo().setSzabad(false);
            sarkany.setEffect(null);
            kartya.setSzam(0);
            jatek();
        }
    }
    public void lepes(MouseEvent mouseEvent) {
        if(kartya.getSzam()==6){
            sarkanyLepes(mouseEvent);
        }
        else {
            if (lepesek.contains((Mezo) mouseEvent.getSource()) && dobas != 0) {
                DropShadow shadow = new DropShadow();
                shadow.setColor(Color.WHITE);
                aktivJatekos.getBabu().setMezo((Mezo) mouseEvent.getSource());
                if (((Mezo) mouseEvent.getSource()).getId().contains("mezo")) {
                    aktivJatekos.getBabu().setLayoutX((double) ((Mezo) mouseEvent.getSource()).getLayoutX() - 25);
                    aktivJatekos.getBabu().setLayoutY((double) ((Mezo) mouseEvent.getSource()).getLayoutY() - 170);


                } else if (((Mezo) mouseEvent.getSource()).getId().contains("tri")) {
                    aktivJatekos.getBabu().setLayoutX((double) ((Mezo) mouseEvent.getSource()).getLayoutX() + 50);
                    aktivJatekos.getBabu().setLayoutY((double) ((Mezo) mouseEvent.getSource()).getLayoutY() - 140);


                } else if (((Mezo) mouseEvent.getSource()).getId().contains("duo")) {
                    aktivJatekos.getBabu().setLayoutX((double) ((Mezo) mouseEvent.getSource()).getLayoutX() + 50);
                    aktivJatekos.getBabu().setLayoutY((double) ((Mezo) mouseEvent.getSource()).getLayoutY() - 120);


                } else if (((Mezo) mouseEvent.getSource()).getId().contains("folyo")) {
                    if(folyo.getAllapot().equals(Allapotok.ELSO)){
                        aktivJatekos.getBabu().setLayoutX((double) ((Mezo) mouseEvent.getSource()).getLayoutX() + 370);
                        aktivJatekos.getBabu().setLayoutY((double) ((Mezo) mouseEvent.getSource()).getLayoutY() - 50);

                    }
                    else {
                        aktivJatekos.getBabu().setLayoutX((double) ((Mezo) mouseEvent.getSource()).getLayoutX() + 100);
                        aktivJatekos.getBabu().setLayoutY((double) ((Mezo) mouseEvent.getSource()).getLayoutY() - 50);

                    }

                } else if (((Mezo) mouseEvent.getSource()).getId().contains("cel")) {
                    aktivJatekos.getBabu().setLayoutX((double) ((Mezo) mouseEvent.getSource()).getLayoutX());
                    aktivJatekos.getBabu().setLayoutY((double) ((Mezo) mouseEvent.getSource()).getLayoutY());


                } else if (((Mezo) mouseEvent.getSource()).getId().contains("start")) {
                    aktivJatekos.getBabu().setLayoutX((double) ((Mezo) mouseEvent.getSource()).getLayoutX() + 150);
                    aktivJatekos.getBabu().setLayoutY((double) ((Mezo) mouseEvent.getSource()).getLayoutY() - 150);

                }
                aktivJatekos.getBabu().setMezo((Mezo) mouseEvent.getSource());
                aktivJatekos.getBabu().setEffect(shadow);
                for (var v : lepesek) {
                    v.setEffect(null);
                }

                jatek();
            }
        }
    }
    public Jatekos kovetkezoJatekos(Jatekos j){
            if(jatekosok.get(jatekosok.size()-1).equals(j))
            {
                j=jatekosok.get(0);
            }
            else
            {
                int i=0;
                while (!jatekosok.get(i).equals(j))
                {
                    i++;
                }
                j=jatekosok.get(i+1);
            }

            if(j.getBabu().getMezo().equals(cel)||j.isLephete()==false){
                j.setLephete(true);
                return kovetkezoJatekos(j);
            }
            else{
                return j;
            }

    }
    public List<Mezo> lehetsegesLepesek(int lepes, Mezo aktualisMezo,Mezo elozo){
        List<Mezo> lehetsegesMezok = new ArrayList<>();
        List<Mezo> ut = aktualisMezo.getSzomszedosMezok();

        if(lepes>0)
        {
            for (Mezo mezo : ut)
            {
                if(!mezo.equals(aktualisMezo)&&!mezo.equals(elozo)&&mezo.isSzabad())
                {

                    lehetsegesMezok.addAll(lehetsegesLepesek(lepes-1,mezo,aktualisMezo));
                }
            }
        }
        else
        {
            lehetsegesMezok.add(aktualisMezo);
        }

        return lehetsegesMezok;
    }
    public List<Mezo> specialis(Mezo m1,Mezo m2) {
        List<Mezo> mezok= new LinkedList<>();
        mezok.add(m1);
        mezok.add(m2);
        return mezok;
    }
    public void tablaFeltolt(){


        mezoD1.MezoHozzaad(mezo17);
        mezoD3.MezoHozzaad(mezo7);mezoD3.MezoHozzaad(mezo18);
        duo1=new DuoMezo(specialis(mezoD2,mezoD4),specialis(mezoD1,mezoD3));
        duo1.allapotValtas();

        mezoD22.MezoHozzaad(mezo39);
        mezoD44.MezoHozzaad(mezo43);
        duo2=new DuoMezo(specialis(mezoD22,mezoD44),specialis(mezoD11,mezoD33));

        kerdojel6.MezoHozzaad(mezo8);
        mezo9.MezoHozzaad(mezo10);
        folyo=new DuoMezo(specialis(kerdojel6,mezo9),specialis(mezo61,mezo19));

        mezoT11.MezoHozzaad(kerdojel2);mezoT11.MezoHozzaad(mezo31);
        kerdojel2.MezoHozzaad(mezoT11);
        mezoT22.MezoHozzaad(mezo32);
        tri1=new TriMezo(specialis(mezoT11,mezoT22),specialis(mezoT22,mezoT33),specialis(mezoT33,mezoT11));

        mezoT1.MezoHozzaad(mezo10);mezoT1.MezoHozzaad(kerdojel8);
        mezoT3.MezoHozzaad(mezo21);
        tri2=new TriMezo(specialis(mezoT1,mezoT2),specialis(mezoT2,mezoT3),specialis(mezoT1,mezoT3));
        tri2.allapotValtas();
        tri2.allapotValtas();

        kerdojel6.MezoHozzaad(mezo8);
        mezo9.MezoHozzaad(mezo10);
        folyo=new DuoMezo(specialis(mezo9,kerdojel6),specialis(mezo61,mezo19));

     start.MezoHozzaad(mezo1);start.MezoHozzaad(mezo30);
     mezo1.MezoHozzaad(mezo2);mezo1.MezoHozzaad(start);
     mezo2.MezoHozzaad(mezo3);mezo2.MezoHozzaad(mezo1);
     mezo3.MezoHozzaad(mezo4);mezo3.MezoHozzaad(mezo2);
     mezo4.MezoHozzaad(mezo5);mezo4.MezoHozzaad(mezo3);
     mezo5.MezoHozzaad(mezo4);mezo5.MezoHozzaad(mezo6);mezo5.MezoHozzaad(mezo17);
     mezo17.MezoHozzaad(mezoD1);mezo17.MezoHozzaad(mezo5);
     mezoD1.MezoHozzaad(duo1);
     mezoD2.MezoHozzaad(mezo6);
     mezoD3.MezoHozzaad(duo1);
     mezo6.MezoHozzaad(mezo5);mezo6.MezoHozzaad(mezoD2);
     mezo7.MezoHozzaad(mezo8);mezo7.MezoHozzaad(mezoD3);
     mezo8.MezoHozzaad(kerdojel6);mezo8.MezoHozzaad(mezo7);
     kerdojel6.MezoHozzaad(folyo);
     mezo9.MezoHozzaad(folyo);
     mezo10.MezoHozzaad(mezoT1);mezo10.MezoHozzaad(mezo9);
     kerdojel8.MezoHozzaad(mezoT1);
     mezoT1.MezoHozzaad(tri2);
     mezoT2.MezoHozzaad(kerdojel11);
     kerdojel11.MezoHozzaad(mezoT2);kerdojel11.MezoHozzaad(mezo11);
     mezo11.MezoHozzaad(mezo12);mezo11.MezoHozzaad(kerdojel11);
     mezo12.MezoHozzaad(mezo13);mezo12.MezoHozzaad(mezo11);
     mezo13.MezoHozzaad(mezo14);mezo13.MezoHozzaad(mezo12);mezo13.MezoHozzaad(kerdojel9);
     mezo14.MezoHozzaad(mezo15);mezo14.MezoHozzaad(mezo13);
     mezo15.MezoHozzaad(mezo16);mezo15.MezoHozzaad(mezo14);
     mezo16.MezoHozzaad(cel);mezo16.MezoHozzaad(mezo15);
     mezo18.MezoHozzaad(mezoD3);mezo18.MezoHozzaad(mezo22);
     mezo22.MezoHozzaad(mezo61);mezo22.MezoHozzaad(kerdojel1);mezo22.MezoHozzaad(mezo18);
     mezo61.MezoHozzaad(mezo22);
     mezo19.MezoHozzaad(kerdojel7);
     kerdojel7.MezoHozzaad(mezo20); kerdojel7.MezoHozzaad(mezo19); kerdojel7.MezoHozzaad(mezo38);
     mezo20.MezoHozzaad(kerdojel7);mezo20.MezoHozzaad(mezo21);
     mezo21.MezoHozzaad(mezoT3);mezo21.MezoHozzaad(mezo20);
     mezoT3.MezoHozzaad(tri2);
     kerdojel1.MezoHozzaad(mezoD4);kerdojel1.MezoHozzaad(mezo22);kerdojel1.MezoHozzaad(mezo23);
     mezoD4.MezoHozzaad(kerdojel1);
     mezo23.MezoHozzaad(mezo24);mezo23.MezoHozzaad(kerdojel1);
     mezo24.MezoHozzaad(mezo25);mezo24.MezoHozzaad(mezo23);
     mezo25.MezoHozzaad(mezo26);mezo25.MezoHozzaad(mezo24);
     mezo26.MezoHozzaad(mezo27);mezo26.MezoHozzaad(mezo25);
     mezo27.MezoHozzaad(mezo28);mezo27.MezoHozzaad(mezo26);mezo27.MezoHozzaad(mezo31);
     mezo28.MezoHozzaad(mezo29);mezo28.MezoHozzaad(mezo27);
     mezo29.MezoHozzaad(mezo30);mezo29.MezoHozzaad(mezo28);
     mezo30.MezoHozzaad(start);mezo30.MezoHozzaad(mezo29);
     mezo31.MezoHozzaad(mezoT11);mezo31.MezoHozzaad(mezo27);
     mezoT11.MezoHozzaad(tri1);
     mezoT22.MezoHozzaad(tri1);
     mezo32.MezoHozzaad(mezo33);mezo32.MezoHozzaad(mezoT22);
     mezo33.MezoHozzaad(kerdojel3);mezo33.MezoHozzaad(mezo32);
     kerdojel3.MezoHozzaad(mezo34);kerdojel3.MezoHozzaad(mezo33);
     mezo34.MezoHozzaad(mezo35);mezo34.MezoHozzaad(kerdojel3);mezo34.MezoHozzaad(mezo39);
     mezo35.MezoHozzaad(mezo36);mezo35.MezoHozzaad(mezo34);
     mezo36.MezoHozzaad(kerdojel5);mezo36.MezoHozzaad(mezo35);
     kerdojel5.MezoHozzaad(mezo36);kerdojel5.MezoHozzaad(mezo37);
     mezo37.MezoHozzaad(mezo38);mezo37.MezoHozzaad(kerdojel5);
     mezo38.MezoHozzaad(mezo37);mezo38.MezoHozzaad(kerdojel7);
     mezo39.MezoHozzaad(mezoD22);mezo39.MezoHozzaad(mezo34);
     mezoD22.MezoHozzaad(duo2);

     mezoT33.MezoHozzaad(mezo40);
     mezo40.MezoHozzaad(mezo41); mezo40.MezoHozzaad(mezoT33);
     mezo41.MezoHozzaad(mezo42);mezo41.MezoHozzaad(mezo40);
     mezo42.MezoHozzaad(kerdojel4);mezo42.MezoHozzaad(mezo41);
     kerdojel4.MezoHozzaad(mezo42);kerdojel4.MezoHozzaad(mezoD11);
     mezoD11.MezoHozzaad(kerdojel4);
     mezoD22.MezoHozzaad(mezo39);
     mezoD44.MezoHozzaad(duo2);
     mezo43.MezoHozzaad(mezo44);mezo43.MezoHozzaad(mezoD44);
     mezo44.MezoHozzaad(kerdojel12);mezo44.MezoHozzaad(mezo43);
     kerdojel12.MezoHozzaad(mezo45);kerdojel12.MezoHozzaad(mezo44);
     mezo45.MezoHozzaad(mezo46);mezo45.MezoHozzaad(mezoD33);mezo45.MezoHozzaad(kerdojel12);
     mezoD33.MezoHozzaad(mezo45);mezoD33.MezoHozzaad(mezo55);
     mezo46.MezoHozzaad(mezo47);mezo46.MezoHozzaad(mezo45);
     mezo47.MezoHozzaad(mezo48);mezo47.MezoHozzaad(mezo46);
     mezo48.MezoHozzaad(mezo49);mezo48.MezoHozzaad(mezo56);mezo48.MezoHozzaad(mezo57);mezo48.MezoHozzaad(mezo47);
     mezo49.MezoHozzaad(mezo50);mezo49.MezoHozzaad(mezo48);
     mezo50.MezoHozzaad(kerdojel10);mezo50.MezoHozzaad(mezo49);
     kerdojel10.MezoHozzaad(mezo50);kerdojel10.MezoHozzaad(mezo51);
     mezo51.MezoHozzaad(kerdojel10);mezo51.MezoHozzaad(mezo52);
     mezo52.MezoHozzaad(mezo53);mezo52.MezoHozzaad(mezo51);
     mezo53.MezoHozzaad(mezo54);mezo53.MezoHozzaad(mezo52);
     mezo54.MezoHozzaad(kerdojel9);mezo54.MezoHozzaad(mezo53);
     kerdojel9.MezoHozzaad(mezo13);kerdojel9.MezoHozzaad(mezo54);
     mezo55.MezoHozzaad(mezo56);mezo55.MezoHozzaad(mezoD33);
     mezo56.MezoHozzaad(mezo48);mezo56.MezoHozzaad(mezo55);
     mezo57.MezoHozzaad(mezo58);mezo57.MezoHozzaad(mezo48);
     mezo58.MezoHozzaad(mezo57);mezo58.MezoHozzaad(mezo59);
     mezo59.MezoHozzaad(mezo60);mezo59.MezoHozzaad(mezo58);
     mezo60.MezoHozzaad(cel);mezo60.MezoHozzaad(mezo59);
     tojas.MezoHozzaad(start);


        tabla.mezoHozzaad(start);
        tabla.mezoHozzaad(cel);
        tabla.mezoHozzaad(mezo1);
        tabla.mezoHozzaad(mezo2);
        tabla.mezoHozzaad(mezo3);
        tabla.mezoHozzaad(mezo4);
        tabla.mezoHozzaad(mezo5);
        tabla.mezoHozzaad(mezo6);
        tabla.mezoHozzaad(mezo7);
        tabla.mezoHozzaad(mezo8);
        tabla.mezoHozzaad(mezo9);
        tabla.mezoHozzaad(mezo10);
        tabla.mezoHozzaad(mezo11);
        tabla.mezoHozzaad(mezo12);
        tabla.mezoHozzaad(mezo13);
        tabla.mezoHozzaad(mezo14);
        tabla.mezoHozzaad(mezo15);
        tabla.mezoHozzaad(mezo16);
        tabla.mezoHozzaad(mezo17);
        tabla.mezoHozzaad(mezo18);
        tabla.mezoHozzaad(mezo19);
        tabla.mezoHozzaad(mezo20);
        tabla.mezoHozzaad(mezo21);
        tabla.mezoHozzaad(mezo22);
        tabla.mezoHozzaad(mezo23);
        tabla.mezoHozzaad(mezo24);
        tabla.mezoHozzaad(mezo25);
        tabla.mezoHozzaad(mezo26);
        tabla.mezoHozzaad(mezo27);
        tabla.mezoHozzaad(mezo28);
        tabla.mezoHozzaad(mezo29);
        tabla.mezoHozzaad(mezo30);
        tabla.mezoHozzaad(mezo31);
        tabla.mezoHozzaad(mezo32);
        tabla.mezoHozzaad(mezo33);
        tabla.mezoHozzaad(mezo34);
        tabla.mezoHozzaad(mezo35);
        tabla.mezoHozzaad(mezo36);
        tabla.mezoHozzaad(mezo37);
        tabla.mezoHozzaad(mezo38);
        tabla.mezoHozzaad(mezo39);
        tabla.mezoHozzaad(mezo40);
        tabla.mezoHozzaad(mezo41);
        tabla.mezoHozzaad(mezo42);
        tabla.mezoHozzaad(mezo43);
        tabla.mezoHozzaad(mezo44);
        tabla.mezoHozzaad(mezo45);
        tabla.mezoHozzaad(mezo46);
        tabla.mezoHozzaad(mezo47);
        tabla.mezoHozzaad(mezo48);
        tabla.mezoHozzaad(mezo49);
        tabla.mezoHozzaad(mezo50);
        tabla.mezoHozzaad(mezo51);
        tabla.mezoHozzaad(mezo52);
        tabla.mezoHozzaad(mezo53);
        tabla.mezoHozzaad(mezo54);
        tabla.mezoHozzaad(mezo55);
        tabla.mezoHozzaad(mezo56);
        tabla.mezoHozzaad(mezo57);
        tabla.mezoHozzaad(mezo58);
        tabla.mezoHozzaad(mezo59);
        tabla.mezoHozzaad(mezo60);
        tabla.mezoHozzaad(mezo61);
        tabla.mezoHozzaad(kerdojel1);
        tabla.mezoHozzaad(kerdojel2);
        tabla.mezoHozzaad(kerdojel3);
        tabla.mezoHozzaad(kerdojel4);
        tabla.mezoHozzaad(kerdojel5);
        tabla.mezoHozzaad(kerdojel6);
        tabla.mezoHozzaad(kerdojel7);
        tabla.mezoHozzaad(kerdojel8);
        tabla.mezoHozzaad(kerdojel9);
        tabla.mezoHozzaad(kerdojel10);
        tabla.mezoHozzaad(kerdojel11);
        tabla.mezoHozzaad(kerdojel12);
        tabla.mezoHozzaad(mezoT1);
        tabla.mezoHozzaad(mezoT2);
        tabla.mezoHozzaad(mezoT3);
        tabla.mezoHozzaad(mezoT11);
        tabla.mezoHozzaad(mezoT22);
        tabla.mezoHozzaad(mezoT33);
        tabla.mezoHozzaad(mezoD1);
        tabla.mezoHozzaad(mezoD2);
        tabla.mezoHozzaad(mezoD3);
        tabla.mezoHozzaad(mezoD4);
        tabla.mezoHozzaad(mezoD11);
        tabla.mezoHozzaad(mezoD22);
        tabla.mezoHozzaad(mezoD33);
        tabla.mezoHozzaad(mezoD44);
        tabla.mezoHozzaad(duo1);
        tabla.mezoHozzaad(duo2);
        tabla.mezoHozzaad(folyo);
        tabla.mezoHozzaad(tri1);
        tabla.mezoHozzaad(tri2);

        specialisMezok();
    }
    public void animation(){
        if(dobas==0) {
            Image kep = new Image(getClass().getResourceAsStream("resources/kocka1.png"));
            Image kep2 = new Image(getClass().getResourceAsStream("resources/kocka2.png"));
            Image kep3 = new Image(getClass().getResourceAsStream("resources/kocka3.png"));
            Image kep4 = new Image(getClass().getResourceAsStream("resources/kocka4.png"));
            Image kep5 = new Image(getClass().getResourceAsStream("resources/kocka5.png"));
            Image kep6 = new Image(getClass().getResourceAsStream("resources/kocka6.png"));
            dobas = kocka.getDobas();
            Timeline timeline = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(imgKocka.imageProperty(), kep)),
                    new KeyFrame(Duration.millis(50), new KeyValue(imgKocka.imageProperty(), kep2)),
                    new KeyFrame(Duration.millis(100), new KeyValue(imgKocka.imageProperty(), kep3)),
                    new KeyFrame(Duration.millis(150), new KeyValue(imgKocka.imageProperty(), kep4)),
                    new KeyFrame(Duration.millis(200), new KeyValue(imgKocka.imageProperty(), kep5)),
                    new KeyFrame(Duration.millis(250), new KeyValue(imgKocka.imageProperty(), kep6)),
                    new KeyFrame(Duration.millis(300), new KeyValue(imgKocka.imageProperty(), Kocka(dobas)))
            );
            timeline.play();
            mezokJelzese();
        }
    }
    public Image Kocka(int szam){
        Image kep;
      if(szam==1){ kep=new Image(getClass().getResourceAsStream("resources/kocka1.png")); }
      else if(szam==2){ kep= new Image(getClass().getResourceAsStream("resources/kocka2.png")); }
      else if(szam==3){ kep=new Image(getClass().getResourceAsStream("resources/kocka3.png"));}
      else if(szam==4){ kep=new Image(getClass().getResourceAsStream("resources/kocka4.png"));}
      else if(szam==5){ kep=new Image(getClass().getResourceAsStream("resources/kocka5.png"));}
      else{ kep=new Image(getClass().getResourceAsStream("resources/kocka6.png"));}
      
      return kep;
    }
    public void fomenu (){
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
    public void bezar (){
       Stage currentStage = (Stage) btnMenu.getScene().getWindow();
       currentStage.close();
   }
}




