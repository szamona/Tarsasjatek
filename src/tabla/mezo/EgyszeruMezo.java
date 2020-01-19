package tabla.mezo;

public class EgyszeruMezo extends Mezo
{

    public EgyszeruMezo(String mezoId) { super(mezoId); }

    @Override
    public void MezoHozzaad(Mezo m)
    {
        if (m != null && !szomszedosMezok.contains(m))
        {
            szomszedosMezok.add(m);
        }
    }

    @Override
    public void MezoTorol(Mezo m)
    {
        if (m != null)
        {
            szomszedosMezok.remove(m);
        }
    }
}
