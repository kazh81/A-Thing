//Alec Maroon
//AP comp sci period 1
//Zoo Manager
//specific constructors and behaviors for snakes
import java.util.*;
public class Snake extends Reptile {

public enum ScaleType {Cycloid, Granular, Keeled };
public enum Diet {Carnivore, Vegetarian, Omnivore};

//fields
   private ScaleType scale;
   private Diet diet;


// constructors
   public Snake(String name, Gender gender, Calendar lastVisit) {
      super(name,gender,lastVisit);
      diet = Diet.Carnivore;
      
   }
   public Snake(int cageNumber, int weight, int age){
      super(cageNumber, weight, age);
   }
   


// methods   
   public ScaleType getScaleType() {
      return scale;
   } //getScaleType
   
   public void eatMeat(){
      System.out.println("Tasty Rat");
   }
   
   public void eatFish(){
      System.out.println("Yummy Anchovie");
   }
   
   
} // Snake