//Alec Maroon
//AP comp sci period 1
//Zoo Manager
//specific constructors and behaviors for Turtles
import java.util.*;

public class Turtle extends Reptile {

public enum ShellType {HardFlat, HardRidged, Leathery };
public enum Diet {Carnivore, Vegetarian, Omnivore};

//fields
   private int cage;
   private ShellType shell;
   private Diet diet;


// constructors
   public Turtle(String name, Gender gender, Calendar lastVisit) {
      super(name,gender,lastVisit);
      diet = Diet.Omnivore;    
   }
   public Turtle(int cageNumber, int weight, int age){
      super(cageNumber, weight, age);
   }
   

// methods
   public ShellType getShellType() {
      return shell;
   } //getScaleType
         
   public Calendar calcNextVisit(){
      Calendar nextVisit = (Calendar) getLastVisit().clone();
      nextVisit.add(Calendar.DATE, 21);
      return nextVisit;
   }   
   
   public void eatVeggies(){
      System.out.println("Delcious Lettuce");
   }
   
   public void eatFruit(){
      System.out.println("yummy pear");
   }
   

} // Turtle