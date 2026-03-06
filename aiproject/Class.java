import java.util.ArrayList;

public class Class { 
private int id ;
private Departement dept;
private Course course;
private Instructor instructor;
private MeetingTime  meetingTime ;
private MeetingTime meetingLab;
//private ArrayList<Course> commonCourse;

public Class (int id ,Departement dept ,Course course,MeetingTime meetingTime,MeetingTime meetingLab){
  this.id=id;
  this.course=course;
  this.dept=dept;
  this.meetingLab = meetingLab;
  this.meetingTime = meetingTime;
  //this.section = sections;

}
public void setInstructor( Instructor instructor ){this.instructor = instructor; }

public void setMeetingTime( MeetingTime meetingTime ){
  this. meetingTime = meetingTime; 
}
public void setMeetingLab( MeetingTime meetingLab ){this. meetingLab = meetingLab; }
public int getId(){return id;}
public Departement getDept(){return dept;}
public Course getCourse(){return course;}
public ArrayList <Course> getCommonCourse(){return dept.getcommonCourses();}

public Instructor getInstructor(){return instructor;}
public MeetingTime getMeetingTime(){return meetingTime;}

public MeetingTime getMeetingLab(){return meetingLab;}
@Override
public String toString() {
  if(course.NumOfHours() == 1){
    return "Class [dept=" + dept.getName() + ", course=" + course.getid() + ", instructor=" + course.getInstructors() + ", meetingTime=" + meetingLab.day() +" "+meetingLab.getStartingTime()+"-"+meetingLab.getendTime()
            + "]";
  }
  return "Class [dept=" + dept.getName() + ", course=" + course.getid() + ", instructor=" + course.getInstructors() + ", meetingTime=" + meetingTime.day() +" "+meetingTime.getStartingTime()+"-"+meetingTime.getendTime()
  + "]";

}
}
