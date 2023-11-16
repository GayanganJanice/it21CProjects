
package Janice;


public class Flowers {
    String flower_name;
    String flower_quantity;
    
    Flowers(String flower_name, String flower_quantity){
     this.flower_name=flower_name;
     this.flower_quantity = flower_quantity;
    }
    
   void flower_Name(){
       System.out.println(flower_name+" nice");
   }
   
   void flower_Quantity(){
       System.out.println(flower_name+" daghan kaayo");
   }
}
