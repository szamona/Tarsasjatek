package jatekTartozekok;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Babu extends ImageView
{
    protected String mezo;
    protected String kepId;


    public Babu ()
    {
        this.mezo="";
        this.kepId="";
    }


    public String getMezo() { return mezo; }

    public void setMezo(String mezo) { this.mezo = mezo; }

    public String getKepId() { return kepId; }

    public void setKepId(String kepId) { this.kepId = kepId; }
}
