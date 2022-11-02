package pwo.lab09.composite;

public class Cover extends WaterSystem{

    public void fill() {
        super.fill();
    }

    public void afterFill() {
        super.afterFill();
    }

    public void drain() {
        super.drain();
    }

    public void afterDrain() {

        super.afterDrain();
    }

    @Override
    public void removeCover() {
       System.out.println("Otwieram pokrywę");
       super.removeCover();
    }
    
    @Override
    public void setCover() {
       System.out.println("Zamykam pokrywę");
       super.setCover();
    }
}