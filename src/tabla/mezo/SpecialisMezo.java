package tabla.mezo;

import javafx.scene.image.Image;

import java.util.List;

public abstract class SpecialisMezo extends Mezo
{
    protected  Allapotok allapot = Allapotok.ELSO;

    public SpecialisMezo( List<Mezo> szomszedosMezok)
    {
        super.szomszedosMezok=szomszedosMezok;
    }
    public Allapotok getAllapot(){return this.allapot;}

    public abstract void allapotValtas();
}

