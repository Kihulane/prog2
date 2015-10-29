import org.junit.*;
import static org.junit.Assert.*;
public class KoduneArvutus{
	@Test
    public void kylgetombejoud(){   //maakülgetõmbejoud kehale  F = jõud m=mass , g =raskuskiirendus
		assertEquals(2.940, proovTest.joud(300, 9.8), 0.01);
		
	}	
	@Test
	public void kiirus(){   //keha ühtlane liikumine  V=kiirus (km/h , ) s=nihe(meetrites) , t=aeg
		assertEquals(5, proovTest.kiirus(25, 5), 0.01);  // V=s/t 
	}
}
/*
jaagup@tigu:~/public_html/15/prog215/testid$ javac -cp .:junit-4.12.jar KoduneArvutus.java
jaagup@tigu:~/public_html/15/prog215/testid$ java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore KoduneArvutus
JUnit version 4.12
*/
