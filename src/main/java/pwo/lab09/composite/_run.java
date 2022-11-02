package pwo.lab09.composite;

public class _run {
    public static void main(String[] args) {

        WaterSystem waterSystem = new WaterSystem();
        waterSystem.addComponent(new Tank());
        waterSystem.addComponent(new Tap());
        waterSystem.addComponent(new Cover());

        System.out.println("Napełnienie:");
        waterSystem.removeCover();
        waterSystem.fill();
        waterSystem.afterFill();
        waterSystem.setCover();
        
        System.out.println("\nOpróżnienie:");
        waterSystem.removeCover();
        waterSystem.drain();
        waterSystem.afterDrain();
        waterSystem.setCover();
    }
}