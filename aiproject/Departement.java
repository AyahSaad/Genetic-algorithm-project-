import java.util.ArrayList;

public class Departement{
    private String name;
    private ArrayList<Course> courses;
    private ArrayList<Course> commonCourses;
    public Departement(String name, ArrayList<Course> courses,ArrayList<Course> commonCourses){
        this.name = name;
        this.courses = courses;
        this.commonCourses = commonCourses;
    }
    public String getName(){
        return name;
    }
    public ArrayList<Course> getCourses(){
        return courses;
    }
    public ArrayList<Course> getcommonCourses(){
        return commonCourses;

    }
    
}