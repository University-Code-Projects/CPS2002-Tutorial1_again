
package calculator;

public class multiply implements Operation{
    public int perform(int x,int y) {
        return x * y; 
    }

    public String getDesc(){
        return ("Multiply");
    }
    
}