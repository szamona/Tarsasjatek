package jatekTartozekok;

import java.util.Random;

public class DoboKocka
{
    private int ertek;
    Random randomSzam = new Random();

    public DoboKocka() {
        this.ertek = 0;
    }

    public int getDobas(){ return this.ertek=randomSzam.nextInt(7-1)+1;
    }

}