package calculator;

public class Divide implements Operation{

    public int perform(int x, int y){
            return x/y;

    }
    
    public String getDesc(){
        return ("Divide");
    }
}