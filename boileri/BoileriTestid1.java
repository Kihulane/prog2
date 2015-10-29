import org.junit.*;
import static org.junit.Assert.*;
public class BoileriTestid1{     
    Boiler boiler;
    @Before
    public void alusta(){
        boiler=new TemperatuuriMoodik();       
    }
    @Test
    public void arvutus1(){
        assertEquals(20, boiler.kysiTemperatuur(), 0.01); //kontrollib kas näitab temperatuuri
    }
    @Test
    public void arvutus2(){  //kontrollib kas temperatuuri lisamise funktsioon töötab
    	boiler.lisa(5.5f);
        assertEquals(25.5, boiler.kysiTemperatuur(), 0.01);
        boiler.lisa(-5.5f);
        assertEquals(20, boiler.kysiTemperatuur(), 0.01);
        boiler.lisa(-35.5f);
        assertEquals(0, boiler.kysiTemperatuur(), 0.01);
    }
    @Test
    public void arvutus3(){//kontrollib kas saab ise temperatuuri määrata
        boiler.maaraTemperatuur(100);
        assertEquals(100, boiler.kysiTemperatuur(), 0.01); 
    }
}