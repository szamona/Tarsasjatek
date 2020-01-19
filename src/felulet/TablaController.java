package felulet;

import jatek.Jatekos;
import jatekTartozekok.Babu;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import tabla.Tabla;
import tabla.mezo.Mezo;

import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

public class TablaController implements Initializable {
    public List<Jatekos> jatekosok = new LinkedList<Jatekos>();
    Tabla tabla=new Tabla();

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



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void getJatekosNev(String text1,String text2, String text3, String text4)
    {
        jatekos1 = new Jatekos(text1);
        babu1 = new Babu("Piros");
        jatekos1.setBabu(babu1);

        jatekos2 = new Jatekos(text2);
        babu2 = new Babu("Sárga");
        jatekos2.setBabu(babu2);

        jatekos3 = new Jatekos(text3);
        babu3 = new Babu("Kék");
        jatekos3.setBabu(babu3);

        jatekos4 = new Jatekos(text4);
        babu4 = new Babu("Zöld");
        jatekos4.setBabu(babu4);

        lblJatekos1.setText(text1);
        lblJatekos2.setText(text2);
        lblJatekos3.setText(text3);
        lblJatekos4.setText(text4);

        jatekosok.add(jatekos1);
        jatekosok.add(jatekos2);
        jatekosok.add(jatekos3);
        jatekosok.add(jatekos4);

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


}
