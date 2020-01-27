package felulet;

import jatek.Jatekos;
import jatekTartozekok.Babu;
import jatekTartozekok.DoboKocka;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import tabla.Tabla;
import tabla.mezo.EgyszeruMezo;
import tabla.mezo.Mezo;
import tabla.mezo.DuoMezo;
import tabla.mezo.SpecialisMezo;
import tabla.mezo.TriMezo;
import tabla.mezo.Allapotok;

import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

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
    public ImageView imgTri1;

    Tabla tabla=new Tabla();

    public DoboKocka kocka=new DoboKocka();
    public ImageView mj1;
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

    public  Jatekos jatekos1;
    public Jatekos jatekos2;
    public Jatekos jatekos3;
    public Jatekos jatekos4;

    public AnchorPane apaneTabla;
    public int dobas;
    public EgyszeruMezo mezo1;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void getJatekos(String text1,String text2, String text3, String text4,Image kep1,Image kep2,Image kep3,Image kep4)
    {
        babu1 = new Babu();
        babu2 = new Babu();
        babu3 = new Babu();
        babu4 = new Babu();

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

        tablaFeltolt();

    }

    public void getKarakter(String k1,String k2 ,String k3, String k4){
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

                babu2.setImage(vizsgalatKarakter(k2));
                apaneTabla.getChildren().add(babu2);
                babu2.setFitHeight(210);
                babu2.setFitWidth(110);
                babu2.setLayoutY(babu1.getLayoutY());
                babu2.setLayoutX(babu1.getLayoutX()+75);
                babu2.setEffect(arnyek);

                babu3.setImage(vizsgalatKarakter(k3));
                apaneTabla.getChildren().add(babu3);
                babu3.setFitHeight(210);
                babu3.setFitWidth(110);
                babu3.setLayoutY(babu2.getLayoutY());
                babu3.setLayoutX(babu2.getLayoutX()+75);
                babu3.setEffect(arnyek);

                babu4.setImage(vizsgalatKarakter(k4));
                apaneTabla.getChildren().add(babu4);
                babu4.setFitHeight(210);
                babu4.setFitWidth(110);
                babu4.setLayoutY(babu3.getLayoutY());
                babu4.setLayoutX(babu3.getLayoutX()+75);
                babu4.setEffect(arnyek);


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

    public void Jatek(){
        
    }

    public Jatekos kovetkezoJatekos(Jatekos j)
    {
        if(jatekosok.get(jatekosok.size()-1)==j)
        {
            j=jatekosok.get(0);
        }
        else
        {
            int i=0;
            while (jatekosok.get(i)!=j)
            {
                i++;
            }
            j=jatekosok.get(i);
        }
        return j;
    }

    public List<Mezo> lehetsegesLepesek(int lepes, Mezo aktualisMezo)
    {
        List<Mezo> lehetsegesMezok = new ArrayList<>();
        List<Mezo> ut = aktualisMezo.getSzomszedosMezok();
        if(lepes>0)
        {
            for (Mezo mezo : ut)
            {
                if(mezo!=aktualisMezo)
                {
                    lehetsegesMezok.addAll(lehetsegesLepesek(lepes-1,mezo));
                }
            }
        }
        else
        {
            lehetsegesMezok.add(aktualisMezo);
        }

        return lehetsegesMezok;
    }

    public void tablaFeltolt(){
        List<Mezo> lista = new LinkedList<>();
        List<Mezo> lista2 = new LinkedList<>();
        List<Mezo> lista3 = new LinkedList<>();



     start.MezoHozzaad(mezo1);start.MezoHozzaad(mezo30);
     mezo1.MezoHozzaad(mezo2);mezo1.MezoHozzaad(start);
     mezo2.MezoHozzaad(mezo3);mezo2.MezoHozzaad(mezo1);
     mezo3.MezoHozzaad(mezo4);mezo3.MezoHozzaad(mezo2);
     mezo4.MezoHozzaad(mezo5);mezo4.MezoHozzaad(mezo3);
     mezo5.MezoHozzaad(mezo4);mezo5.MezoHozzaad(mezo6);mezo5.MezoHozzaad(mezo17);
     mezo17.MezoHozzaad(mezoD1);mezo17.MezoHozzaad(mezo5);
     mezoD1.MezoHozzaad(duo1);mezoD1.MezoHozzaad(mezo17);
     mezoD3.MezoHozzaad(duo1);mezoD3.MezoHozzaad(mezo7);mezoD3.MezoHozzaad(mezo18);
     mezo6.MezoHozzaad(mezo5);
     mezo7.MezoHozzaad(mezo8);mezo7.MezoHozzaad(mezoD3);
     mezo8.MezoHozzaad(kerdojel6);mezo8.MezoHozzaad(mezo7);
     kerdojel6.MezoHozzaad(folyo);kerdojel6.MezoHozzaad(mezo8);
     mezo9.MezoHozzaad(folyo);mezo9.MezoHozzaad(mezo10);
     mezo10.MezoHozzaad(mezoT1);mezo10.MezoHozzaad(mezo9);
     mezoT1.MezoHozzaad(tri2);mezoT1.MezoHozzaad(mezo10);
     mezoT2.MezoHozzaad(kerdojel1);
     kerdojel11.MezoHozzaad(mezoT2);kerdojel11.MezoHozzaad(mezo11);
     mezo11.MezoHozzaad(mezo12);mezo11.MezoHozzaad(kerdojel1);
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
     mezoT3.MezoHozzaad(tri2);mezoT3.MezoHozzaad(mezo21);
     kerdojel1.MezoHozzaad(mezoD4);kerdojel1.MezoHozzaad(mezo22);kerdojel1.MezoHozzaad(mezo23);
     mezoD4.MezoHozzaad(kerdojel1);
     mezo23.MezoHozzaad(mezo24);mezo23.MezoHozzaad(kerdojel1);
     mezo24.MezoHozzaad(mezo25);mezo24.MezoHozzaad(mezo23);
     mezo25.MezoHozzaad(mezo26);mezo25.MezoHozzaad(mezo24);
     mezo26.MezoHozzaad(mezo27);mezo26.MezoHozzaad(mezo25);
     mezo27.MezoHozzaad(mezo28);mezo27.MezoHozzaad(mezo26);mezo27.MezoHozzaad(mezo31);
     mezo28.MezoHozzaad(mezo29);mezo28.MezoHozzaad(mezo27);
     mezo29.MezoHozzaad(mezo30);mezo29.MezoHozzaad(mezo28);
     mezo30.MezoHozzaad(cel);mezo30.MezoHozzaad(mezo29);
     mezo31.MezoHozzaad(mezoT11);mezo31.MezoHozzaad(mezo27);
     mezoT11.MezoHozzaad(kerdojel2);mezoT11.MezoHozzaad(mezo31);mezoT11.MezoHozzaad(tri1);
     mezoT22.MezoHozzaad(tri1);mezoT22.MezoHozzaad(mezo32);
     mezo32.MezoHozzaad(mezo33);mezo32.MezoHozzaad(kerdojel3);
     kerdojel3.MezoHozzaad(mezo34);kerdojel3.MezoHozzaad(mezo33);
     mezo34.MezoHozzaad(mezo35);mezo34.MezoHozzaad(kerdojel3);
     mezo35.MezoHozzaad(mezo36);mezo35.MezoHozzaad(mezo34);
     mezo36.MezoHozzaad(kerdojel5);mezo36.MezoHozzaad(mezo35);
     kerdojel5.MezoHozzaad(mezo36);kerdojel5.MezoHozzaad(mezo37);
     mezo37.MezoHozzaad(mezo38);mezo37.MezoHozzaad(kerdojel5);
     mezo39.MezoHozzaad(mezoD22);mezo39.MezoHozzaad(mezo34);
     mezoD22.MezoHozzaad(duo2);mezoD22.MezoHozzaad(mezo39);

     mezoT33.MezoHozzaad(mezo40);
     mezo40.MezoHozzaad(mezo41); mezo40.MezoHozzaad(mezoT33);
     mezo41.MezoHozzaad(mezo42);mezo41.MezoHozzaad(mezo40);
     mezo42.MezoHozzaad(kerdojel4);mezo42.MezoHozzaad(mezo41);
     kerdojel4.MezoHozzaad(mezo42);kerdojel4.MezoHozzaad(mezoD22);
     mezoD22.MezoHozzaad(kerdojel4);
     mezoD44.MezoHozzaad(duo2);mezoD44.MezoHozzaad(mezo43);
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


        lista.add(mezoD1);
        lista.add(mezoD3);
        lista2.add(mezoD2);
        lista2.add(mezoD4);
        duo1=new DuoMezo(lista,lista2);
        lista.clear();lista2.clear();

        lista.add(mezoD11);
        lista.add(mezoD33);
        lista2.add(mezoD22);
        lista2.add(mezoD44);
        duo2=new DuoMezo(lista,lista2);
        lista.clear();lista2.clear();

        lista.add(kerdojel6);
        lista.add(mezo9);
        lista2.add(mezo61);
        lista2.add(mezo19);
        folyo=new DuoMezo(lista,lista2);
        lista.clear();lista2.clear();

        lista.add(mezoT11);
        lista.add(mezoT22);
        lista2.add(mezoT22);
        lista2.add(mezoT33);
        lista3.add(mezoT33);
        lista.add(mezoT11);
        tri1=new TriMezo(lista,lista2,lista3);
        lista.clear();lista2.clear();lista3.clear();

        lista.add(mezoT1);
        lista.add(mezoT2);
        lista2.add(mezoT2);
        lista2.add(mezoT3);
        lista3.add(mezoT3);
        lista.add(mezoT1);
        tri2=new TriMezo(lista,lista2,lista3);
        lista.clear();lista2.clear();lista3.clear();

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
        tabla.mezoHozzaad(duo1);
        tabla.mezoHozzaad(duo2);
        tabla.mezoHozzaad(folyo);
        tabla.mezoHozzaad(tri1);
        tabla.mezoHozzaad(tri2);
    }

    public void animation(){
        Image kep = new  Image(getClass().getResourceAsStream("resources/kocka1.png"));
        Image kep2 = new  Image(getClass().getResourceAsStream("resources/kocka2.png"));
        Image kep3 = new  Image(getClass().getResourceAsStream("resources/kocka3.png"));
        Image kep4 = new  Image(getClass().getResourceAsStream("resources/kocka4.png"));
        Image kep5 = new  Image(getClass().getResourceAsStream("resources/kocka5.png"));
        Image kep6 = new  Image(getClass().getResourceAsStream("resources/kocka6.png"));
        dobas=kocka.getDobas();
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
}




