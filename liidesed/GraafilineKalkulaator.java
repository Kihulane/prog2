import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class GraafilineKalkulaator extends Applet{
    TextField tf=new TextField();
    Button n1=new Button("1");
    Button n2=new Button("2");
    Button n3=new Button("3");
    Button nC=new Button("C");
    public GraafilineKalkulaator(){
        setLayout(new BorderLayout());
        add(tf, BorderLayout.NORTH);
        Panel nupud=new Panel(new GridLayout(4, 1));
        nupud.add(n1);
        nupud.add(n2);
        nupud.add(n3);
        nupud.add(nC);
        add(nupud, BorderLayout.CENTER);
    }  
    public static void main(String[] arg){
        Frame f=new Frame("Kalkulaator");
        f.add(new GraafilineKalkulaator());
        f.setSize(500, 400);
        f.setVisible(true);
    }
}