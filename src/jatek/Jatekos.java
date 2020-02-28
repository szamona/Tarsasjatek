package jatek;

import jatekTartozekok.Babu;

public class Jatekos
{
    private String nev;
    private Babu babu;
    private boolean lephete;

    public Jatekos(String nev) {
        this.nev = nev;
        this.lephete=true;
    }

    public String getNev() { return nev; }
    public void setBabu(Babu babu) { this.babu = babu; }

    public boolean isLephete() {
        return lephete;
    }

    public void setLephete(boolean lephete) {
        this.lephete = lephete;
    }

    public Babu getBabu() {
        return babu;
    }
}
