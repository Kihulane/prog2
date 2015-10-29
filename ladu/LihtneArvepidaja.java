public class LihtneArvepidaja implements Ladu{
    float laoseis=0;
    public void lisa(float kogus){
        laoseis+=kogus;
    }   
    public float kysiKogus(){
        return laoseis;
    }    
}