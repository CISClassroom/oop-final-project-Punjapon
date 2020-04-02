/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chatc
 */
public class total extends bill{
    public int sumtotal(){
      sum = power+water+rent+rent_1;
      return sum;
    }
    public void check1 (String input)throws exceptionclass{
        if (input.equals("")){
            throw new exceptionclass("");
        }
    }
    public void check2(String input)throws exceptionclass{
          for(int i =0; i < input.length(); i++){
           char c = input.charAt(i);
          if(!Character.isDigit(c)){throw new exceptionclass("");
    
}    
}
}
}