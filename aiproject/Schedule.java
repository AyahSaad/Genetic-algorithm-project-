
import java.util.ArrayList;

public class Schedule {
  
   private ArrayList<Class> classes;
   private int id;
   private boolean isFitnessChange = true;
   private double fitness = -1;
   private int classNumb = 0;
   private int numbOfConflicts = 0;


private Data data;
   
   public Data getData(){
   return data;
   } 
   public int getclassNumb(){
    return classNumb;
    } 

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public ArrayList<Class> classes(){
        return classes;
    }

   public Schedule(Data data) {
   this.data = data;
   classes = new ArrayList<Class>(data.getNumberOfClasses());
}

 public Schedule initialize() {
    //int instructorsIndex = data.getinstructors().indexOf(x.getInstructor());
    new ArrayList<Departement>(data.getdepartements()).forEach(dept ->{
        dept.getCourses().forEach((course -> {
            if(course.NumOfHours() != 1){
            
                Class newClass = new Class(classNumb++, dept, course,data.getmeetingTimes().get((int)(data.getmeetingTimes().size()*Math.random())),data.getmeetingLab().get((int)(data.getmeetingLab().size()*Math.random())));
                //newClass.setMeetingTime(data.getmeetingTimes().get((int)(data.getmeetingTimes().size()*Math.random())));
                //newClass.setMeetingTime((data.getmeetingTimes().get((int)(data.getmeetingTimes().size()*Math.random()))));
                //newClass.setInstructor(course.getInstructors().get((int)(course.getInstructors().size()*Math.random())));
                classes.add(newClass);
            
        }
        else{
            
                Class newClass = new Class(classNumb++, dept, course,data.getmeetingTimes().get((int)(data.getmeetingTimes().size()*Math.random())),data.getmeetingLab().get((int)(data.getmeetingLab().size()*Math.random())));
            
               //newClass.setMeetingLab(data.getmeetingLab().get((int)(data.getmeetingLab().size()*Math.random())));
               // newClass.setInstructor(course.getInstructors().get((int)(course.getInstructors().size()*Math.random())));
                   classes.add(newClass);
            }

        
        }));

    });
    return this;
    

}
public int getNumbOfConflicts() {
    return numbOfConflicts;
}
public ArrayList<Class> getClasses(){
    isFitnessChange = true;
    return classes;
}
public double getFitness(){
    if(isFitnessChange == true){
        fitness = calculateFitness();
        isFitnessChange = false;
    }
    return fitness;
}
private double calculateFitness(){
    numbOfConflicts = 0;
    classes.forEach(x -> {
        
        classes.stream().filter(y -> classes.indexOf(y) >= classes.indexOf(x)).forEach(y -> {
            //System.out.println(y.getDept().getcommonCourses().toString());
            if(x.getMeetingTime() == y.getMeetingTime() && x.getDept() != y.getDept()){
                if (y.getCommonCourse().contains(x.getCourse())){

                  if (x.getCourse().getYear() == y.getCourse().getYear()) numbOfConflicts++;
                  // System.out.println(y.getDept().getcommonCourses().toString());
                }
            }
            else if(x.getMeetingTime() == y.getMeetingTime() && x.getDept() == y.getDept()){
                if(x.getCourse().getid() == y.getCourse().getid()) numbOfConflicts++;
                if(x.getCourse().getid() != y.getCourse().getid() && x.getCourse().getInstructors() == y.getCourse().getInstructors()) numbOfConflicts++;
                if(x.getCourse().getid() != y.getCourse().getid() && x.getCourse().getYear() == y.getCourse().getYear()) numbOfConflicts++;
            }
            else if(x.getMeetingLab() == y.getMeetingLab() && x.getDept() != y.getDept()){
                if (y.getCommonCourse().contains(x.getCourse())){

                    if (x.getCourse().getYear() == y.getCourse().getYear()) numbOfConflicts++;
                    if(x.getCourse().getid() != y.getCourse().getid() && x.getCourse().getInstructors() == y.getCourse().getInstructors()) numbOfConflicts++;

                    // System.out.println(y.getDept().getcommonCourses().toString());
                  }

            }
            else if(x.getMeetingLab() == y.getMeetingLab() && x.getDept() == y.getDept()){
                if(x.getCourse().getid() == y.getCourse().getid()) numbOfConflicts++;
                if(x.getCourse().getid() != y.getCourse().getid() && x.getCourse().getInstructors() == y.getCourse().getInstructors()) numbOfConflicts++;
                if(x.getCourse().getid() != y.getCourse().getid() && x.getCourse().getYear() == y.getCourse().getYear()) numbOfConflicts++;

            }
             else if (x.getMeetingLab().getStartingTime() == y.getMeetingTime().getStartingTime() && x.getDept() == y.getDept()){
                if(x.getMeetingLab().day() == y.getMeetingTime().day() && x.getCourse().getYear() == y.getCourse().getYear())numbOfConflicts++;
                if( x.getCourse().getInstructors() == y.getCourse().getInstructors())numbOfConflicts++;
                
            }
            else if(x.getMeetingLab().getStartingTime() == y.getMeetingTime().getStartingTime() && x.getDept() != y.getDept()){
                if(x.getMeetingLab().day() == y.getMeetingTime().day() && x.getCourse().getYear() == y.getCourse().getYear())numbOfConflicts++;
                if (y.getCommonCourse().contains(x.getCourse())){

                    
                    if( x.getCourse().getInstructors() == y.getCourse().getInstructors())numbOfConflicts++;


                    // System.out.println(y.getDept().getcommonCourses().toString());
                  }


            }
        });
    });
    return  1/(double)(numbOfConflicts + 1);
}
public String toString(){
    String returnValue = new String();
    for(int x = 0; x< classes.size();x++) returnValue += classes.get(x) + ",";
    returnValue += classes.size()-1;
    return returnValue;
    
}



}
