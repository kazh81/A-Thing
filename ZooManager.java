//Alec Maroon
//AP comp sci period 1
//Zoo Manager
//calculates date for next visit for each animal
import java.util.*;
public class ZooManager{
   private String vetList[][] = new String[8][2];
   private ArrayList<Animal> zoo;
   private ArrayList<Calendar> calDates;
   private Calendar cal1;
   private Calendar cal2;
   private Calendar cal3;
   private Calendar cal4;
   private Calendar cal5;
   private Calendar cal6;
   private Calendar cal7;
   private Calendar cal8;
   public ZooManager(){
      cal1 = Calendar.getInstance();
      cal2 = Calendar.getInstance();
      cal3 = Calendar.getInstance();
      cal4 = Calendar.getInstance();
      cal5 = Calendar.getInstance();
      cal6 = Calendar.getInstance();
      cal7 = Calendar.getInstance();
      cal8 = Calendar.getInstance();
      calDates = new ArrayList<>();
      zoo = new ArrayList<>();
      cal1.set(2018,4,25);
      calDates.add(cal1);
      zoo.add(new Bear("Bearman", Gender.Male, calDates.get(0)));
      cal2.set(2018,2,12);
      calDates.add(cal2);
      zoo.add(new Bear("Bearwomen", Gender.Female, calDates.get(1)));
      cal3.set(2018,2,21);
      calDates.add(cal3);
      zoo.add(new Snake("Snak", Gender.Male, calDates.get(2)));
      cal4.set(2018,2,1);
      calDates.add(cal4);
      zoo.add(new Snake("Shnake", Gender.Male, calDates.get(3)));
      cal5.set(2017,11,22);
      calDates.add(cal5);
      zoo.add(new Rhino("Ramsey", Gender.Male, calDates.get(4)));
      cal6.set(2017,10,3);
      calDates.add(cal6);
      zoo.add(new Rhino("Roxanne", Gender.Female, calDates.get(5)));
      cal7.set(2012,3,13);
      calDates.add(cal7);
      zoo.add(new Turtle("Ticondaroga", Gender.Male, calDates.get(6)));
      cal8.set(2018,4,1);
      calDates.add(cal8);
      zoo.add(new Turtle("Tess", Gender.Female, calDates.get(7)));

   }//create arraylist of animals with name, gender, and last visit date
      
   public void vetVisitList(){
      for(int i = 0; i <= zoo.size() - 1; i++){
         String name = zoo.get(i).getName();
         vetList[i][0] = name;
         String nextVisit = zoo.get(i).getNextVisit();
         vetList[i][1] = nextVisit;
      }
      for(int i = 0; i < vetList.length; i++){
         for(int k = 0; k < vetList[0].length; k++){
            System.out.println(vetList[i][k]);
         }
      }//print out array to see if it calculated correctly
   }
}//goes through each animal and calculates their next visit, then adds their name and date for next visit
 //to a two dimensional array

