//specific constructors and behaviors for Rhinos
import java.util.*;
public class Rhino extends Mammal {


//fields
   private boolean hornIntact;
   private boolean isAggressive;



// constructors
   public Rhino(String name, Gender gender, Calendar lastVisit) {
     super(name,gender, lastVisit);
   }
   
   public Rhino(int cageNumber, int weight, int age, boolean horn, FurType fur) {
      super(cageNumber, weight, age, FurType.Sparse);
      hornIntact = horn;
   }

// methods
   //accessors
   public boolean getHornStatus() {
      return hornIntact;
   }//getHornStatus
   public boolean getAggressive() {
      return isAggressive;
   }//determine if aggressive 
 
 public void eatVeggies(){
      System.out.println("Delcious Broccoli");
   }
   
   public void eatFruit(){
      System.out.println("yummy Orange");
   }

 
 
 } // Rhino