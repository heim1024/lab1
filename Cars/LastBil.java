package Cars;

import java.awt.*;
import java.util.ArrayList;

public class LastBil extends Car{
    private boolean flakUp = true;
    public LastBil(int nrDoors, int enginePower, Color color, String modelName, double startX, double startY, Direction startDir, boolean flakUp) {
        super(nrDoors, enginePower, color, modelName, startX, startY, startDir);
    }

    public boolean getFlak(){
        return flakUp;
    }
    public void setFlak(boolean flak){
        if(!isMoving()){
            if(flak){
                flakUp = true;
            }
            else{
                flakUp = false;
            }
        }
        else{
            System.out.println("stanna innan du justerar flaket!");
        }
    }



}


