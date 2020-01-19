package tabla.mezo;

import java.util.List;

public class TriMezo extends SpecialisMezo
{
    List<Mezo> masodikAllapotMezok;
    List<Mezo> harmadikAllapotMezok;

    public TriMezo(String mezoID ,List<Mezo> elsoAllapotMezok, List<Mezo> masodikAllapotMezok, List<Mezo> harmadikAllapotMezok)
    {
        super(mezoID,elsoAllapotMezok);
        this.masodikAllapotMezok = masodikAllapotMezok;
        this.harmadikAllapotMezok = harmadikAllapotMezok;
    }

    @Override
    public void allapotValtas()
    {
        if (allapot.equals(Allapotok.ELSO))
        {
            allapot = Allapotok.MASODIK;
        }
        else if (allapot.equals(Allapotok.MASODIK))
        {
            allapot = Allapotok.HARMADIK;
        }
        else
        {
            allapot = Allapotok.ELSO;
        }
    }

    @Override
    public List<Mezo> getSzomszedosMezok()
    {
        if (allapot.equals(Allapotok.ELSO))
        {
            return super.getSzomszedosMezok();
        }
        else if (allapot.equals(Allapotok.MASODIK))
        {
            return masodikAllapotMezok;
        }
        else {
            return harmadikAllapotMezok;
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
