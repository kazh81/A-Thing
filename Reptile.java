//Alec Maroon
//AP comp sci period 1
//Zoo Manager
//super class for all reptiles
import java.util.*;
public class Reptile extends Animal{
   public enum SubSpecies{Boa, Mamba, Coral, Corn, Cobra, Sea, Snapping, Leatherback, Green, Musk};
   //fields
   private SubSpecies subSpecies;
   
   public Reptile(String name, Gender gender, Calendar lastVisit){
      super(name,gender,lastVisit);
   }
   public Reptile(int cageNumber, int weight, int age){
      super(cageNumber, weight, age);
   }
   
   //behaviors
   public void setSubSpecies(SubSpecies subSpecies) {
      this.subSpecies = subSpecies;
   } //setSubSpecies
   
    public Calendar calcNextVisit(){
      Calendar nextVisit = (Calendar) getLastVisit().clone();
      nextVisit.add(Calendar.MONTH, 3);
      return nextVisit;
   }   
}