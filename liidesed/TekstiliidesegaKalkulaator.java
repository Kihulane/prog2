import java.io.*;
public class TekstiliidesegaKalkulaator{
    public static void main(String[] arg) throws IOException{
        KalkulaatoriArvutus k=new JaagupiArvutus();
        BufferedReader lugeja=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Sisesta kalkulaatori klahve:");
        String rida=lugeja.readLine();
        while(rida.length()>0){
            System.out.println(k.vajutus(rida));
            rida=lugeja.readLine();
        }
    }    
}