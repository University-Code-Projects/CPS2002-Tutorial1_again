/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author userElise
 */
public class Subtract implements Operation{
    
    public int perform(int x, int y){
        return x - y;
    }
    
    public String getDesc(){
        return ("Subtract");
    }
}
