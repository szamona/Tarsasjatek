package tabla.mezo;

import java.util.LinkedList;
import java.util.List;

public abstract class Mezo
{
    protected String mezoId;
    protected String kepId;
    protected boolean szabad;
    protected List<Mezo> szomszedosMezok;

    public Mezo(String mezoId)
    {
        this.mezoId = mezoId;
        this.szabad = true;
        this.kepId ="";
        this.szomszedosMezok= new LinkedList<Mezo>();
    }

    public boolean isSzabad() { return szabad; }

    public void setSzabad(boolean szabad) { this.szabad = szabad; }

    public void kepHozzaad(String id){ this.kepId=id; }

    public abstract void MezoHozzaad(Mezo m);

    public abstract void MezoTorol(Mezo m);

    public List<Mezo> getSzomszedosMezok() { return szomszedosMezok; }
}
