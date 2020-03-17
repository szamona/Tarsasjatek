package jatekTartozekok;

public class Vegeredmeny {
    private String elso;
    private String masoik;
    private String harmadik;
    private String negyedik;

    public Vegeredmeny(String elso, String masoik, String harmadik, String negyedik) {
        this.elso = elso;
        this.masoik = masoik;
        this.harmadik = harmadik;
        this.negyedik = negyedik;
    }

    public String getElso() {
        return elso;
    }

    public String getMasoik() {
        return masoik;
    }

    public String getHarmadik() {
        return harmadik;
    }

    public String getNegyedik() {
        return negyedik;
    }
}
