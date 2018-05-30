//Alec Maroon
//AP comp sci period 1
//Zoo Manager
//specific constructors and behaviors for bears
import java.util.*;
public class Bear extends Mammal{

public enum ClawCondition {Clipped, Natural};

//fields
   private ClawCondition claw;

// constructors
   public Bear(String name, Gender gender, Calendar lastVisit) {
     super(name,gender,lastVisit);
   }
   public Bear(int cageNumber, int weight, int age, FurType fur){
      super(cageNumber, weight, age, FurType.Dense);
   }


// methods
   // accessors
    public ClawCondition getClawStatus() {
      return claw;
   } //getClawStatus 
   
   public void eatVeggies(){
      System.out.println("Delcious Carrot");
   }
   
   public void eatFruit(){
      System.out.println("yummy apple");
   }
  
   public void eatMeat(){
      System.out.println("Tasty Grub");
   }
   
   public void eatFish(){
      System.out.println("Yummy Salmon");
   }

} // Bear