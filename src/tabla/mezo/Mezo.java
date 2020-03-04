package tabla.mezo;

        import javafx.scene.image.Image;
        import javafx.scene.image.ImageView;
        import java.util.LinkedList;
        import java.util.List;

public abstract class Mezo extends ImageView
{
    protected boolean szabad;
    protected Image kep;
    protected List<Mezo> szomszedosMezok;

    public Mezo()
    {
        this.szabad = true;
        this.szomszedosMezok= new LinkedList<Mezo>();
    }


    public Image getKep() { return kep; }

    public void setKep(Image kep) { this.kep = kep; }

    public boolean isSzabad() { return szabad; }

    public void setSzabad(boolean szabad) { this.szabad = szabad; }

    public abstract void MezoHozzaad(Mezo m);

    public abstract void MezoTorol(Mezo m);

    public List<Mezo> getSzomszedosMezok() { return szomszedosMezok; }
}
