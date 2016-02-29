
package calculator;

public class add implements Operation{

    public int perform(int x, int y){
        return x+y;
    }
    
    public String getDesc(){
        return ("Add");
    }

}