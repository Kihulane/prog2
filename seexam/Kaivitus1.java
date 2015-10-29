import java.awt.Point;
public class Kaivitus1{
	public static void main(String[] arg){
		Skoop2 s=new Skoop2();
		s.suurenda();
		System.out.println(Skoop2.b);
		Skoop2.main(null);
		Point p=new Point(3, 5);
		System.out.println(p.getX());
	}
}