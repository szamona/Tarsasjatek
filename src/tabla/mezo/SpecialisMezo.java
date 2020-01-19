package tabla.mezo;

import java.util.List;

public abstract class SpecialisMezo extends Mezo
{
    protected  Allapotok allapot = Allapotok.ELSO;

    public SpecialisMezo(String mezoId, List<Mezo> szomszedosMezok)
    {
        super(mezoId);
        super.szomszedosMezok=szomszedosMezok;
    }

    public abstract void allapotValtas();
}

