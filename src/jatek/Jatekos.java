package jatek;

import jatekTartozekok.Babu;

public class Jatekos
{
    private String nev;
    private Babu babu;

    public Jatekos(String nev) { this.nev = nev; }

    public String getNev() { return nev; }
    public void setBabu(Babu babu) { this.babu = babu; }

    public Babu getBabu() {
        return babu;
    }
}
