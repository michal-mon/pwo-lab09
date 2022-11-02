package pwo.lab09.composite;

public class Tap extends WaterSystem{

    public void fill() {
        super.fill();
        System.out.println("Kran odkręcony");
    }

    public void afterFill() {
        super.afterFill();
        System.out.println("Kran zakręcony");
    }

    public void drain() {
        super.drain();
    }

    public void afterDrain() {
        super.afterDrain();
    }
    
    public void removeCover() {
        super.removeCover();
    }
    
    public void setCover() {
        super.setCover();
    }
}