//Alec Maroon
//AP comp sci period 1
//Zoo Manager
//super class for all animals (reptiles and mammals)
import java.util.*; 
public class Animal{
   //fields
   
   private int age;
   private Gender gender;
   private boolean endangered;
   private Habitat habitat;
   private int cageNumber;
   private boolean bornInCaptivity;
   private int weight;
   private String name;
   private Calendar lastVisit;
   //constructors
   public Animal(String name, Gender gender, Calendar lastVisit) {
      this.name = name;
      this.gender = gender;
      this.lastVisit = lastVisit;
   }
   public Animal(int cageNumber, int weight, int age){
      this.cageNumber = cageNumber;
      this.weight = weight;
      this.age = age;
   }
   
   //behaviors
   public String getName() {
      return name;
   } //getName


   public void setGender(Gender newGender) {
      gender = newGender;
   } //setGender

   
   public Calendar calcNextVisit(){
      Calendar nextVisit = (Calendar) lastVisit.clone();
      return nextVisit;
   }   
   
   public String getNextVisit(){
      Calendar nextVisit = calcNextVisit();
      return nextVisit.get(Calendar.YEAR) + "/" + nextVisit.get(Calendar.MONTH) + "/" + nextVisit.get(Calendar.DATE);
   }
   
   public Calendar getLastVisit(){
      return lastVisit;
   }
   
}