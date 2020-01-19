package jatekTartozekok;

public class Babu
{
    private String szin;
    private String mezo;
    private String kepId;

    public Babu(String szin)
    {
        this.szin=szin;
        this.mezo="";
        this.kepId="";
    }

    public String getSzin() { return szin; }

    public String getMezo() { return mezo; }

    public void setMezo(String mezo) { this.mezo = mezo; }

    public String getKepId() { return kepId; }

    public void setKepId(String kepId) { this.kepId = kepId; }
}
