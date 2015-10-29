public class Skoop2{
	int a=1;
	static int b=2;
	void suurenda(){
		int a=5;
		int b=7;
		a++;
		this.a--;
		Skoop2.b--;
	}
    public static void main(String[] arg){
		Skoop2 s=new Skoop2();
		System.out.println(Skoop2.b);
		if(arg==null){Skoop2.main(new String[]{"Juku", "Kati"});}
	}
}