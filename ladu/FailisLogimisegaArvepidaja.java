import java.io.*;
public class FailisLogimisegaArvepidaja extends FailisArvepidaja{
     public FailisLogimisegaArvepidaja(String fnimi){
         super(fnimi);
     }
     @Override
     public void kirjutaFaili(float arv){
         super.kirjutaFaili(arv);
         try{
            PrintWriter pw=new PrintWriter(new FileWriter(failinimi+".log", true));
            pw.println(arv+" "+new java.util.Date().toString());
            pw.close();
        } catch (Exception ex){ex.printStackTrace();}        
     }
}