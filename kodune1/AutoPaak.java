public class AutoPaak {
	boolean t2is = false; //true vıi false v‰‰rtus 
	int maxMaht = 120;  //maximum 10 
	int maht = 0;

	public AutoPaak(){
		
	}
	public void T2ida() {  //t‰idab paagi
		if (maht < maxMaht) {
			for(int i=0; i<maxMaht; i++){
			maht = maht + 1;}
		} else {
			System.out.println("Paak on t2is!");
			t2is = true;

		}
	}
	
	public void Tyhjenda(){  //t¸hjendab paagi
		maht = 0;
		t2is = false;
		System.out.println("Auto paak on tyhi!");
		
	}
	
	
}