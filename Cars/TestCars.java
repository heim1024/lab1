package Cars;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCars {
    public Volvo240 vovvo;
    public Saab95 saab;
    @Before
    public void setUp(){
        vovvo = new Volvo240();
        saab = new Saab95();
    }

    @Test
    public void doorsTest() {
        assertEquals(4, vovvo.getNrDoors());
        assertEquals(2, saab.getNrDoors());
    }

    @Test
    public void engineTest(){
        assertEquals(100, vovvo.getEnginePower());
        assertEquals(125, saab.getEnginePower());
    }

    @Test
    public void moveTest(){
        //Volvo240
        vovvo.startEngine();
        assertTrue(vovvo.isMoving());
        //Saab95
        saab.startEngine();
        assertTrue(saab.isMoving());
    }

    @Test
    public void gasTest(){
        //Volvo240
        vovvo.startEngine();
        for(int i = 0; i < 500; i++){
            vovvo.gas(1);
        }
        assertTrue(vovvo.getEnginePower() >= vovvo.getCurrentSpeed());

        //Saab95
        saab.startEngine();
        for(int i = 0; i < 500; i++){
            saab.gas(1);
        }
        assertTrue(saab.getEnginePower() >= saab.getCurrentSpeed());
    }

    @Test
    public void brakeTest(){
        //Volvo240
        for(int i = 0; i < 500; i++){
            vovvo.brake(1);
        }
        assertTrue(0 <= vovvo.getCurrentSpeed());

        //Saab95
        for(int i = 0; i < 500; i++){
            saab.brake(1);
        }
        assertTrue(0 <= saab.getCurrentSpeed());
    }

    @Test
    public void turnTest(){
        //Volvo240
        vovvo.turnLeft();
        assertSame(vovvo.getDirection(), Car.Direction.left);
        vovvo.turnRight();
        assertSame(vovvo.getDirection(), Car.Direction.right);
        vovvo.move();
        assertSame(vovvo.getDirection(), Car.Direction.forward);

        //Saab95
        saab.turnLeft();
        assertSame(saab.getDirection(), Car.Direction.left);
        saab.turnRight();
        assertSame(saab.getDirection(), Car.Direction.right);
        saab.move();
        assertSame(saab.getDirection(), Car.Direction.forward);
    }

    @Test
    public void speedFactorTest(){
        assertEquals(1.25, vovvo.speedFactor(), 0.0);
        saab.setTurboOn();
        assertEquals(1.625, saab.speedFactor(), 0.0);
    }

}
