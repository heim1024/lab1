package Cars;

import javax.swing.text.Position;
import java.awt.*;
import java.util.ArrayList;

public final class Scania114L300 extends LastBil {
    public Scania114L300() {
        super(2, 500, Color.MAGENTA, "Cars.Scania114L300", 40, 0, Direction.forward, true);

    }


    private int lastNr = 0;
    public ArrayList<Car> carList = new ArrayList<>(5);



    public void lastaBil(Car car){
        if(!getFlak()){
            car.
            carList.set(lastNr, car);
            lastNr++;
        }
    }

    public void lastaAvBil(){
        if(!getFlak()){
            carList.get(lastNr).avlasta(10 * lastNr);
            carList.remove(lastNr);
            lastNr--;
        }
    }
}