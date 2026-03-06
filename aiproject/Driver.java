/* Hala Ziq 1191637
 * Ayah Saad 1191334
 * Farha Saad 1191331
 */

import java.util.ArrayList;

public class Driver {
    public static final int PopulationSize = 20;
    public static final double MutationRate = 0.1;
    public static final double CrossoverRate = 0.9;
    public static final int Turnament_Selection_Size = 3;
    public static final int NumOfEliteSchedules = 1;
    private int scheduleNumb = 0;
    private int classNumb = 1;
    private Data data;
    public static void main(String[] args){
        Driver driver = new Driver();
        driver.data=new Data();
        int generationNumber = 0;
        //driver.printAvailableData();
        
        System.out.println("-->   Generation # "+generationNumber);
        //System.out.println("      Schedule   #                                  ");
        //System.out.println("      Classes [dept,class,instructor,meeting-time]   ");
        
        System.out.println("____________________________________________________________________________________________________________________");
        System.out.println("____________________________________________________________________________________________________________________");
        System.out.println("");
        System.out.println("");

       GenaticAlgorithm genaticAlgorithm = new GenaticAlgorithm(driver.data);
       Population population = new Population(Driver.PopulationSize, driver.data).sortByFitness();
       System.out.println(" We Make A Population with 20 Schedule (Chromosome)");
       System.out.println(" For Each Schedule (Chromosome) We Calculate The Fitness and # of Conflict");
       System.out.println(" #Schedule" + "|" + "Fitness" + "|" + "#Conflicts");

       
       population.getSchedules().forEach(Schedule -> {
        Schedule.setId(driver.scheduleNumb++);
       System.out.println("    "+Schedule.getId() + 
                                                                       " | " + 
                                                                     String.format("%.5f",Schedule.getFitness())+
                                                                     " | "+Schedule.getNumbOfConflicts());
                                                                    });
    
     
        driver.printScheduleAsTable(population.getSchedules().get(0), generationNumber);
        driver.classNumb =1;
        while (population.getSchedules().get(0).getFitness() != 1.0){
            
            System.out.println("-->   Generation # "+generationNumber);
            
        //System.out.println("      Schedule   #                                  ");
        //System.out.println("      Classes [dept,class,instructor,meeting-time]   ");
        if (generationNumber == 3){
            System.out.println(" The Best Schedule with Highest Fitness Found in "+(generationNumber)+ "Generation");
            System.out.println(" ___________________________ BYE ___________________________________");
          
            System.exit(0);
        }
        else{
        
        System.out.println("____________________________________________________________________________________________________________________");
        System.out.println("____________________________________________________________________________________________________________________");
        System.out.println("");
        System.out.println("");
        System.out.println(" #Schedule" + "|" + "Fitness" + "|" + "#Conflicts");

        
          population = genaticAlgorithm.evolve(population).sortByFitness();
           driver.scheduleNumb = 1; 
          population.getSchedules().forEach(Schedule -> {
            Schedule.setId(driver.scheduleNumb++);
        

          System.out.println ("      "+Schedule.getId() +"    | "+ " | " +
                                                                              String.format("%.5f",Schedule.getFitness())+
                                                                              " | " +Schedule.getNumbOfConflicts());
          });
                                                                            
            driver.printScheduleAsTable(population.getSchedules().get(0), generationNumber);          
         driver.classNumb =1 ;
        }
        generationNumber++;
       }

    }

    private void printScheduleAsTable(Schedule schedule, int Generation){
        ArrayList<Class> classes = schedule.getClasses();
        System.out.print("\n                   ");
        System.out.print(" #Schedule: " + schedule.getId()+ " ");

        System.out.println("Class # | \t    Dept    |  \t  Course (id)    | \t Instructor (name)  |  \t Meeting-Time (time) \n ");
        //System.out.print("                                                                       ");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        //System.out.println("-----------------------------------------------------");
        classes.forEach(x -> {
        int majorIndex = data.getdepartements().indexOf(x.getDept());
        int coursesIndex = data.getcourses().indexOf(x.getCourse());
        //int instructorsIndex = data.getinstructors().indexOf(x.getInstructor());
        int meetingTimesIndex =data.getmeetingTimes().indexOf(x.getMeetingTime());
        int meetingLabIndex = data.getmeetingLab().indexOf(x.getMeetingLab());
        System.out.print("             ");
        System.out.print(String.format("  %1$02d\t  ", classNumb) + "  | ");
        System.out.print(String.format("%1$4s\t", data.getdepartements().get(majorIndex).getName())+ "  | ");
        System.out.print(String.format("%1$21s\t", data.getcourses().get(coursesIndex).getName() +
                                              " ("+data.getcourses().get(coursesIndex).getid())+ "  | " + data.getcourses().get(coursesIndex).getInstructors()+ " | ");

        if(data.getcourses().get(coursesIndex).NumOfHours()!= 1){
       // System.out.print(String.format("%1$15s", data.getinstructors().get(instructorsIndex).getName())+ " | ");

       System.out.println(data.getmeetingTimes().get(meetingTimesIndex).day() +" "+data.getmeetingTimes().get(meetingTimesIndex).getStartingTime()+"-"+data.getmeetingTimes().get(meetingTimesIndex).getendTime());
       classNumb++;
        }
        else {
            //System.out.print(String.format("%1$15s", data.getinstructors().get(instructorsIndex).getName())+ " | ");

            System.out.println(data.getmeetingLab().get(meetingLabIndex).day() +" "+data.getmeetingLab().get(meetingLabIndex).getStartingTime()+"-"+data.getmeetingLab().get(meetingLabIndex).getendTime());
            classNumb++;

        }
        });
        if (schedule.getFitness() ==1 ) System.out.println(" --- Solution Found in " +(Generation)+"generations");
        System.out.print("-------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");
    
    } 

   private void printAvailableData(){
    System.out.println(" Available Departments --> ");
    data.getdepartements().forEach(x->System.out.println("name: "+x.getName()+" , courses: "+x.getCourses()));
    System.out.println("\n Available Courses --> ");
    data.getcourses().forEach(x->System.out.println("Course #: "+x.getid()+", name: "+x.getName()+", instructors: "+x.getInstructors()));
    //System.out.println("---- Available Sections ----");
    System.out.println("\n Available Instructors --> ");
    data.getinstructors().forEach(x->System.out.println("name: "+ x.getName()));
    System.out.println("\n Available Meeting-Times -- >");
    data.getmeetingTimes().forEach(x->System.out.println("id: "+ x.getid()+", Meeting Time: "+x.day()+" "+x.getStartingTime()+"-"+x.getendTime()));
    System.out.print("-----------------------------------------------------");
    System.out.println("-----------------------------------------------------");
}
  
}
