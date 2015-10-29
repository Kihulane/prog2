import org.junit.*;
import static org.junit.Assert.*;
public class KalkulaatoriTestid{
	 KalkulaatoriArvutus k;
     @Before
     public void alusta(){
         k=new GerdiArvutus();
     }
     @Test
     public void sisestus1(){
		 assertEquals("1", k.vajutus("1"));
		 assertEquals("11", k.vajutus("1"));
		 assertEquals("113", k.vajutus("3"));
	 }	 
     @Test
     public void sisestus2(){
		 assertEquals("1", k.vajutus("1"));
		 assertEquals("0", k.vajutus("C"));          
		 assertEquals("2", k.vajutus("2"));          
		 assertEquals("25", k.vajutus("5"));          
     }
}