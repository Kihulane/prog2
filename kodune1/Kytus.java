public class Kytus {
	public static void tryki(AutoPaak[] m){
		for(int i=0; i<m.length; i++){
			System.out.println(i+". Paagis on "+m[i].maht+" liitrit kytust");
		}
	}
	
	public static void main(String[] args){
		AutoPaak[] paagid = new AutoPaak[2]; //lisab massiivi 2 uut paaki
		paagid[0] = new AutoPaak(); 
		paagid[1] = new AutoPaak();
		System.out.println("Kontroll");
		for(AutoPaak mahuti: paagid){
			System.out.println(mahuti);
		}
		for(AutoPaak mahuti: paagid){
			mahuti.T2ida();
		}
		tryki(paagid);
	}
}