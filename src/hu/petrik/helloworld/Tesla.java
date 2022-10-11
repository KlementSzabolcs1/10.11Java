package hu.petrik.helloworld;

import java.util.Random;

public class Tesla implements Auto{
    private double sebesseg;

    private double Tesla() {
        this.sebesseg = getSebesseg();
        Random rnd = new Random();
        return Math.round(Math.random() * 60);
    };


    @Override
    public void gyorsul() {
        sebesseg += (Math.random() * 15 + 5);
        
    }

    @Override
    public double getSebesseg() {
        return sebesseg;
    }
}
