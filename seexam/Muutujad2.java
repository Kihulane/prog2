import java.awt.Point;
public class Muutujad2{
  public static void main(String[] arg){
	int a=3;
	int b=a;
	a=5;
	System.out.println(b); //3;
	Point p1=new Point(3, 5);
	Point p2=p1;
	p1.setLocation(4, 6);
	System.out.println(p2);
	Point p3=new Point(p1);
	p1.setLocation(5, 7);
	System.out.println(p3);
	
	//Tehke sarnane näide massiividega:
	//Looge massiiv paari väärtusega, omistage massiiv teisele muutujale.
	//Muutke massivi elemendi väärtust ühe muutuja kaudu ning trükkige välja teise muutuja kaudu.
  }
}

/*

jaagup@tigu:~/public_html/15/prog215/seexam$ java Muutujad2
3
java.awt.Point[x=4,y=6]

*/