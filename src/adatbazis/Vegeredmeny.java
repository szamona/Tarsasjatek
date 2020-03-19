package adatbazis;

public class Vegeredmeny {
    private String elso;
    private String masodik;
    private String harmadik;
    private String negyedik;

    public Vegeredmeny(String elso, String masodik, String harmadik, String negyedik) {
        this.elso = elso;
        this.masodik = masodik;
        this.harmadik = harmadik;
        this.negyedik = negyedik;
    }

    public String getElso() {
        return elso;
    }

    public String getMasodik() {
        return masodik;
    }

    public String getHarmadik() {
        return harmadik;
    }

    public String getNegyedik() {
        return negyedik;
    }
}
