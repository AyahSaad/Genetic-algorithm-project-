import java.util.ArrayList;

public class Sections {
    private int number; //number pf sections for each instructor
    private String courseId;
    private ArrayList<Instructor> instructor;
    public Sections(int number, String courseId, ArrayList<Instructor> instructor) {
        this.number = number;
        this.courseId = courseId;
        this.instructor = instructor;
    }


  

    
    public int getNumber() {
        return number;
    }
  
    public String getCourseId() {
        return courseId;
    }  
    public ArrayList<Instructor> getInstructor() {
        return instructor;
    }  
}
