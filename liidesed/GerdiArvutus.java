public class GerdiArvutus implements KalkulaatoriArvutus{
    private String paneel="";
    @Override 
    public String vajutus(String sisend){
        if(sisend.equals("C")){
            paneel="0";
            return paneel;
        }
        if(paneel.equals("0")){
            paneel=sisend;
        } else {
          paneel+=sisend;
        }
        return paneel;
    }
}