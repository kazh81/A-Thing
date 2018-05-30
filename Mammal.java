//Alec Maroon
//AP comp sci period 1
//Zoo Manager
//super class for all mammals
import java.util.*;
public class Mammal extends Animal{
   public enum FurType {Dense, Sparse};
   public enum SubSpecies {Black, Brown, Sun, Polar};
   //fields
   private FurType fur;
   private SubSpecies subSpecies;
   //constructors
   public Mammal(String name, Gender gender, Calendar lastVisit){
      super(name,gender,lastVisit);
 
   }
   public Mammal(int cageNumber, int weight, int age, FurType fur){
      super(cageNumber, weight, age);
      this.fur = fur;
   }

       //behaviors
    public void setSubSpecies(SubSpecies subSpecies) {
      this.subSpecies = subSpecies;
   } //setSubSpecies
   
   
   
   public Calendar calcNextVisit(){
      Calendar nextVisit = (Calendar) getLastVisit().clone();
      nextVisit.add(Calendar.MONTH, 6);
      return nextVisit;
   }   
}