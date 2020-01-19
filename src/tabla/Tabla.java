package tabla;

import tabla.mezo.Mezo;

import java.util.LinkedList;
import java.util.List;

public class Tabla
{
    private List<Mezo> tablaMezoi;

    public Tabla()
    {
        this.tablaMezoi= new LinkedList<Mezo>();
    }

    public void mezoHozzaad(Mezo m){this.tablaMezoi.add(m);}
    public List<Mezo> getTablaMezoi() { return tablaMezoi; }
    public void setTablaMezoi(List<Mezo> tablaMezoi) { this.tablaMezoi = tablaMezoi; }
}
