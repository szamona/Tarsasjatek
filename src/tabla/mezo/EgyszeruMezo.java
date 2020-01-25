package tabla.mezo;

import javafx.scene.image.Image;

public class EgyszeruMezo extends Mezo
{

    public EgyszeruMezo() { }

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
