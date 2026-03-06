
import java.util.ArrayList;

public class Course {
   private String id = null;
   private String name = null;
   private int year;  // num of year
   private int NumOfSec;
   private int NumOfHours;
   private ArrayList<Instructor> instructors;

   public Course(String id, String name,int year, ArrayList<Instructor> instructors,int NumOfSec,int NumOfHours){
   this.id = id;
   this.name =name;
   this.year=year;
   this.instructors = instructors;
   this.NumOfSec = NumOfSec;
   this.NumOfHours = NumOfHours;
   
}
   public String getid() {
    return id;
}
public String getName() {
    return name;
}
public int  getYear() {
    return year;
}

public ArrayList<Instructor> getInstructors(){
      return instructors;
}

public int NumOfSec(){
    return NumOfSec;
}
public int NumOfHours(){
    return NumOfHours;
}

public String toString(){
    return name;
     }  

}