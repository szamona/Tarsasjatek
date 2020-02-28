package jatekTartozekok;

import jatek.Jatekos;

import java.util.Random;

public class Kartya
{
    Random randomSzam= new Random();
    private int szam;
    public Kartya() {
        szam=0;
    }

    public int getSzam() {
        return szam;
    }

    public void setSzam(int szam) {
        this.szam = szam;
    }

    public  int Sorsolas(){
        szam=randomSzam.nextInt(7-1)+1;
        return szam;
    }
}
