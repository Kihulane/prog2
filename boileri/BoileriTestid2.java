import org.junit.*;
import static org.junit.Assert.*;
public class BoileriTestid2 extends BoileriTestid1{
	@Override
	public void alusta(){
		boiler = new FailisArvepidaja("boileritestid2.txt");
	}
 }