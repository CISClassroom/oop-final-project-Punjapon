/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chatc
 */
public class bill {
    int unit_p;
    int unit_w;
    int unitbill_p;
    int power;
    int unitbill_w;
    int water;
    int rent;
    int rent_1;
    int sum;
            
    
    
    public void setunit_p(int unit_p){
            this.unit_p = unit_p;
                    }
    public void setunit_w(int unit_w) {
        this.unit_w = unit_w;
    }
     public void setunitbill_p(int unitbill_p) {
        this.unitbill_p = unitbill_p;
    }
     public void setpower(int power) {
        this.power = power;
    }
    public void setunitbill_w(int unitbill_w) {
        this.unitbill_w = unitbill_w;
    }    
   public void setwater(int water) {
        this.water = water;
    }
    public void setrent(int rent) {
        this.rent = rent;
    }
     public void setrent_1(int rent_1) {
        
        this.rent_1 = rent_1;
    }
      public void setsum(int sum) {
        this.sum = sum;
    }
      public int sum_p(){
          sum = unit_p*unitbill_p;
          return sum;
      }
      public int sum_w(){
        sum = unit_w*unitbill_w;
        return sum;
      }
      
      
    
}
