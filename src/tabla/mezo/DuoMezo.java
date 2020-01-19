package tabla.mezo;

import java.util.List;

public class DuoMezo extends SpecialisMezo
{
    List<Mezo> masodikAllapotMezok;

    public DuoMezo(String mezoId, List<Mezo> elsoAllapotMezok,List<Mezo> masodikAllapotMezok)
    {
        super(mezoId,elsoAllapotMezok);
        this.masodikAllapotMezok=masodikAllapotMezok;
    }

    @Override
    public void allapotValtas()
    {
        allapot = allapot.equals(Allapotok.ELSO) ? Allapotok.MASODIK : Allapotok.ELSO;
    }

    @Override
    public List<Mezo> getSzomszedosMezok()
    {
        if (allapot.equals(Allapotok.ELSO))
        {
            return super.getSzomszedosMezok();
        }
        else
        {
            return masodikAllapotMezok;
        }
    }

    @Override
    public void MezoHozzaad(Mezo m)
    {
        throw new UnsupportedOperationException("Ennek a mezonek fix listaja van amit nem lehet módosítani.");
    }

    @Override
    public void MezoTorol(Mezo m)
    {
        throw new UnsupportedOperationException("Ennek a mezonek fix listaja van amit nem lehet módosítani.");
    }

}
