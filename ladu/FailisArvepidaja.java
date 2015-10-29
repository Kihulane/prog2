import java.io.*;
public class FailisArvepidaja implements Ladu{
    String failinimi;
    public FailisArvepidaja(String fnimi){
        failinimi=fnimi;
        kirjutaFaili(0);
    }
    public void lisa(float kogus){
        kirjutaFaili(loeFailist()+kogus);
    }
    public float kysiKogus(){
        return loeFailist();
    }
    public void kirjutaFaili(float arv){
        try{
            PrintWriter pw=new PrintWriter(new FileWriter(failinimi));
            pw.println(arv);
            pw.close();
        } catch (Exception ex){ex.printStackTrace();}
    }
    public float loeFailist(){
        try{
            BufferedReader br=new BufferedReader(new FileReader(failinimi));
            float arv=Float.parseFloat(br.readLine());
            br.close();
            return arv;
        } catch (Exception ex){ex.printStackTrace();}
        return -1;
    }
}