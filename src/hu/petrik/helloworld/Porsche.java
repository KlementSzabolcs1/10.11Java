package hu.petrik.helloworld;

public class Porsche implements Auto{
    private double sebesseg;

    private double Porsche(double sebesseg) {
        this.sebesseg = sebesseg;
        return sebesseg;
    };




    @Override
    public void gyorsul() {
        sebesseg += 10;
    }

    @Override
    public double getSebesseg() {
        return sebesseg;
    }


}
