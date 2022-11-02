package pwo.lab09.composite;

import java.util.List;
import java.util.ArrayList;

public class WaterSystem implements WaterSystemInterface {

    protected final List<WaterSystemInterface>elements = new ArrayList<>();

    public final void addComponent(WaterSystem element){
        elements.add(element);
    }
    
    public void removeCover() {
        elements.forEach(element -> element.removeCover());
    }
    
    public void setCover() {
        elements.forEach(element -> element.setCover());
    }

    public void fill(){
        elements.forEach(element -> element.fill());
    }

    public void afterFill(){
        elements.forEach(element -> element.afterFill());
    }

    public void drain() {
        elements.forEach(element -> element.drain());
    }

    public void afterDrain() {
        elements.forEach(element -> element.afterDrain());
    }

}