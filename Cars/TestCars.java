package Cars;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestCars {
    public Volvo240 vovvo;
    public Saab95 saab;
    public ScaniaP124 scania;
    public Scania114L300 scani;
    @Before
    public void setUp(){
        vovvo = new Volvo240();
        saab = new Saab95();
        scania = new ScaniaP124();
        scani = new Scania114L300();
    }

    @Before
    public void init(){

    }

    @Test
    public void doorsTest() {
        assertEquals(4, vovvo.getNrDoors());
        assertEquals(2, saab.getNrDoors());
        assertEquals(2, scania.getNrDoors());
    }

    @Test
    public void engineTest(){
        assertEquals(100, vovvo.getEnginePower());
        assertEquals(125, saab.getEnginePower());
        assertEquals(310, scania.getEnginePower());
    }

    @Test
    public void driveTest(){

    }

}
