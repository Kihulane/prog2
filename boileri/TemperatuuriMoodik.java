public class TemperatuuriMoodik implements Boiler{
    float algtemp=20;
    public void lisa(float temperatuur){
        if (algtemp + temperatuur < 0) {
            algtemp = 0;
        } else {
            algtemp += temperatuur;
        }
    }   
    public float kysiTemperatuur(){
        return algtemp;
    }    
    public void maaraTemperatuur(float uusTemperatuur){
        algtemp = uusTemperatuur;
    }    
}