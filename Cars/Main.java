package Cars;

import java.awt.*;

import static org.junit.Assert.assertEquals;

public class Main {

    public static void main(String[] args) {
        howManyDoors();
        whatEnginePower();
        superTest();

    }

    public static void howManyDoors(){
        Volvo240 vovvo = new Volvo240();
        assertEquals(4, vovvo.getNrDoors());
        Saab95 sab = new Saab95();
        assertEquals(2, sab.getNrDoors());
    }

    public static void whatEnginePower(){
        Volvo240 vovvo = new Volvo240();
        assertEquals(100, vovvo.getEnginePower());
        Saab95 sab = new Saab95();
        assertEquals(125, sab.getEnginePower());
    }

    public static void superTest(){
        Volvo240 vovvo = new Volvo240();
        vovvo.startEngine();
        for (int i = 0; i < vovvo.getEnginePower(); i++){
            vovvo.gas(1);
            System.out.println(vovvo.getCurrentSpeed());
        }
        for (int i = 0; i < vovvo.getEnginePower(); i++){
            vovvo.brake(1);
            System.out.println(vovvo.getCurrentSpeed());
        }
        Saab95 saab = new Saab95();
        saab.startEngine();
        for (int i = 0; i < saab.getEnginePower(); i++){
            saab.gas(1);
            System.out.println(saab.getCurrentSpeed());
        }
        for (int i = 0; i < saab.getEnginePower(); i++){
            saab.brake(1);
            System.out.println(saab.getCurrentSpeed());
        }

        vovvo.gas(-1);
        vovvo.brake(-1);
        vovvo.gas(4);
        vovvo.brake(4);

        saab.gas(-1);
        saab.brake(-1);
        saab.gas(4);
        saab.brake(4);

        vovvo.setColor(Color.BLUE);
        System.out.println(vovvo.getColor());
    }


}
