import org.junit.*;
import static org.junit.Assert.*;
public class LaoTestid1{    
    Ladu ladu;
    @Before
    public void alusta(){
        ladu=new LihtneArvepidaja();        
    }
    @Test
    public void arvutus1(){
        assertEquals(0, ladu.kysiKogus(), 0.01);
    }
}