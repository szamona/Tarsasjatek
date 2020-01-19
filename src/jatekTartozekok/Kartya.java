package jatekTartozekok;

import java.util.Random;

public class Kartya
{
    Random randomSzam= new Random();
    public Kartya() { }

    public  int Sorsolas(){ return randomSzam.nextInt(6-1)+1;}
}
