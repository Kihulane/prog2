import java.io.*;
public class FailisArvepidaja implements Boiler{
    public FailisArvepidaja(String fnimi){
        failinimi = fnimi;
        kirjutaFaili(20);
    }

    public void lisa(float temperatuur){
        if (loeFailist() + temperatuur < 0) {
            kirjutaFaili(0);
        } else {
             kirjutaFaili(loeFailist() + temperatuur);
        }
       
    }   
    public float kysiTemperatuur(){
       return loeFailist();
    }    
    public void maaraTemperatuur(float uusTemperatuur){
        kirjutaFaili(uusTemperatuur);
    } 

    String failinimi;
public float loeFailist(){
  try{
   BufferedReader br = new BufferedReader(new FileReader(failinimi));
   float arv = Float.parseFloat(br.readLine());
   br.close();
   return arv;
  } catch (Exception ex){ex.printStackTrace();}
  return -1; //annab -1, kui faili kätte ei saa
 }

    public void kirjutaFaili(float arv){
        try{
            PrintWriter pw=new PrintWriter(new FileWriter(failinimi));
            pw.println(arv);
            pw.close();
        } catch (Exception ex){ex.printStackTrace();}
    }
}