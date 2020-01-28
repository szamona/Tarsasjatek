package jatekTartozekok;
import tabla.mezo.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Babu extends ImageView
{
    protected Mezo mezo;
    protected String kepId;


    public Babu ()
    {
        this.kepId="";
    }


    public Mezo getMezo() {
        return mezo;
    }

    public void setMezo(Mezo mezo) {
        this.mezo = mezo;
    }

    public String getKepId() { return kepId; }

    public void setKepId(String kepId) { this.kepId = kepId; }
}
