public class MeetingTime {
    
    private String id; //the  day mw , tr, sw,sm
    //private String time;
    private String day;
    private String startingTime;

    private String endTime;

    public MeetingTime(String id, String day,String startingTime,String endTime) {
        this.id = id;
        this.startingTime = startingTime;
        this.day = day;
        this.endTime = endTime;
    }

     public String getid() {
        return id;
    }
    public String getStartingTime() {
        return startingTime;
    }

    public String getendTime() {
        return endTime;
    }
    public String day() {
        return day;
    }


    
}
