import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Data {
    private ArrayList<Instructor> instructors;
    private ArrayList<Course> courses;
    private ArrayList<Departement> departements;
    private ArrayList<MeetingTime> meetingTimes;
    private ArrayList<MeetingTime> meetingLab;
    private ArrayList<Course> commonCourse;
    
    private int numberOfClasses = 0;
    public Data(){
        initialize();
    }
    private Data initialize(){
        Instructor inst1 = new Instructor("Jamal Seyam");
        Instructor inst2 = new Instructor("Ibrahim Nemer");
        Instructor inst3 = new Instructor("Ismail khater");
        Instructor inst4 = new Instructor("Adnan Yahya");
        Instructor inst5 = new Instructor("Khader Mohammad");
        Instructor inst6 = new Instructor("Bilal Karaki");
        Instructor inst7 = new Instructor("Mohammed Hussein");
        Instructor inst8 = new Instructor("Anjad Badran");
        Instructor inst9 = new Instructor("Ali Abdo");
        Instructor inst10 = new Instructor("Abualseoud Hanani");
        Instructor inst11 = new Instructor("Mohammad Jubran");
        Instructor inst12 = new Instructor("Aziz Qaroush");
        Instructor inst13 = new Instructor("Adballatif Abuissa");
        Instructor inst14 = new Instructor("Abdalkrim Awad");
        Instructor inst15 = new Instructor("Mohammed Helal");
        Instructor inst16 = new Instructor("Yazan AbuFarha");
        Instructor inst17 = new Instructor("Bashar Tahayna");
        Instructor inst18 = new Instructor("Ayman Hroub");
        Instructor inst19 = new Instructor("Wasel Ghanem");
        Instructor inst20 = new Instructor("Abdel Salam Sayyad");
        Instructor inst21 = new Instructor("Alhareth Zyoud");
        Instructor inst22 = new Instructor("Qadri Mayyala");
        Instructor inst23 = new Instructor("Ahmad Alsadeh");
        Instructor inst24 = new Instructor("Hanna Bullata");
        Instructor inst25 = new Instructor("Ashraf Al-Rimawi");
        Instructor inst26 = new Instructor("Wael Hashlamoun");
        Instructor inst27 = new Instructor("Iyad Tumar");
        Instructor inst28 = new Instructor("Jaser Sa'ed");
        Instructor inst29 = new Instructor("Mohammad Al-ju'beh");
        Instructor inst30 = new Instructor("Nasser Ismail");
        Instructor inst31 = new Instructor("Hakam Shehadeh");
        Instructor inst32 = new Instructor("Muhammad Khaizaran");
        Instructor inst33 = new Instructor("Hussein Zeitawi");
        Instructor inst34 = new Instructor("Mahran Quraan");
        instructors= new ArrayList<Instructor>(Arrays.asList(inst1,inst2,inst3,inst4,inst5,inst6,inst7,inst8,inst9,
        inst10,inst11,inst12,inst13,inst14,inst15,inst16,inst17,inst18,inst19,inst20,inst21,inst22,inst23,inst24,
        inst25,inst26,inst27,inst28,inst29,inst30,inst31,inst32,inst33,inst34));

        MeetingTime meet1 = new MeetingTime("00", "SW", "8:00" ,"9:50");
        MeetingTime meet2= new MeetingTime("01", "SW", "10:00" ,"11:15");
        MeetingTime meet3 = new MeetingTime("02", "SW" ,"11:25","12:40");
        MeetingTime meet4 = new MeetingTime("03", "SW", "12:50" ,"2:05");
        MeetingTime meet5 = new MeetingTime("04", "S" , "2:15" , "16:55");
        MeetingTime meet6 = new MeetingTime("05", "SM" ,"8:00" , "9:50");
        MeetingTime meet7 = new MeetingTime("06", "SM", "10:00" , "11:15");
        MeetingTime meet8 = new MeetingTime("07", "SM" ,"11:25" , "12:40");
        MeetingTime meet9 = new MeetingTime("08", "SM", "12:50" , "2:05");
        MeetingTime meet10 = new MeetingTime("09", "M" ,"2:15"  ,"16:55");
        MeetingTime meet11 = new MeetingTime("10", "MW" ,"8:00" ,"9:50");
        MeetingTime meet12 = new MeetingTime("11", "MW", "10:00",  "11:15");
        MeetingTime meet13 = new MeetingTime("12", "MW" ,"11:25","12:40");
        MeetingTime meet14 = new MeetingTime("13", "MW", "12:50", "2:05");
        MeetingTime meet15 = new MeetingTime("14", "W", "2:15" , "16:55");
        MeetingTime meet16 = new MeetingTime("15", "TR", "8:00", "9:50");
        MeetingTime meet17 = new MeetingTime("16", "TR","10:00" , "11:15");
        MeetingTime meet18 = new MeetingTime("17", "TR", "11:25" ,"12:40");
        MeetingTime meet19 = new MeetingTime("18", "TR", "12:50" , "2:05");
        MeetingTime meet20 = new MeetingTime("19", "T","2:15" , "16:55");
        MeetingTime meet21 = new MeetingTime("20", "R" ,"2:15","16:55");
        MeetingTime meet22 = new MeetingTime("21", "R", "11:25" , "14:05");
        MeetingTime meet23 = new MeetingTime("22", "R" ,"8:00", "10:40");
        MeetingTime meet24 = new MeetingTime("23", "T", "8:00" , "10:40");
        MeetingTime meet25 = new MeetingTime("24", "T","11:25" ,"14:05");
        MeetingTime meet26 = new MeetingTime("25", "W", "8:00 ", "10:40");
        MeetingTime meet27 = new MeetingTime("26", "W" ,"11:25" ,"14:05");
        MeetingTime meet28 = new MeetingTime("27", "M" ,"8:00"  ,"10:40");
        MeetingTime meet29 = new MeetingTime("28", "M","11:25" ,"14:05");
        MeetingTime meet30 = new MeetingTime("29", "S", "8:00" , "10:40");
        MeetingTime meet31 = new MeetingTime("30", "S","11:25", "14:05");

       
        meetingTimes = new ArrayList<MeetingTime>(Arrays.asList(meet1,meet2,meet3,meet4,meet6,meet7,meet8,meet9,
        meet11,meet12,meet13,meet14,meet16,meet17,meet18,meet19));
        meetingLab = new ArrayList<MeetingTime>(Arrays.asList(meet5,meet10,meet15,meet20,meet21,meet22,meet23,meet24,meet25,meet26,meet27,meet28,meet29,meet30,meet31));
   
        
        Course course1 = new Course("ENEE2101","BASIC ELECTRICAL ENGINEERING LAB",2,new ArrayList<Instructor>(Arrays.asList(inst28)),1,1);
        Course course2 = new Course("ENEE2102","CIRCUITS LAB",2,new ArrayList<Instructor>(Arrays.asList(inst28)),1,1);
        Course course3 = new Course("ENEE2103","CIRCUITS AND ELECTRONICS LABORATORY",2,new ArrayList<Instructor>(Arrays.asList(inst29)),1,1);
        Course course4 = new Course("ENEE2103","CIRCUITS AND ELECTRONICS LABORATORY",2,new ArrayList<Instructor>(Arrays.asList(inst29)),3,1);
        Course course5 = new Course("ENEE2103","CIRCUITS AND ELECTRONICS LABORATORY",2,new ArrayList<Instructor>(Arrays.asList(inst30)),2,1);
        Course course6 = new Course("ENEE2304","CIRCUIT ANALYSIS",2,new ArrayList<Instructor>(Arrays.asList(inst28)),1,3);
        Course course7 = new Course("ENEE2304","CIRCUIT ANALYSIS",2,new ArrayList<Instructor>(Arrays.asList(inst31)),2,3);
        Course course8 = new Course("ENEE2307","PROBABILITY AND ENGINEERING STATISTICS",2,new ArrayList<Instructor>(Arrays.asList(inst11)),1,3);
        Course course9 = new Course("ENEE2307","PROBABILITY AND ENGINEERING STATISTICS",2,new ArrayList<Instructor>(Arrays.asList(inst11)),3,3);
        Course course10 = new Course("ENEE2307","PROBABILITY AND ENGINEERING STATISTICS",2,new ArrayList<Instructor>(Arrays.asList(inst21)),2,3);
        Course course11 = new Course("ENEE2307","PROBABILITY AND ENGINEERING STATISTICS",2,new ArrayList<Instructor>(Arrays.asList(inst21)),4,3);
        Course course12 = new Course("ENEE2307","PROBABILITY AND ENGINEERING STATISTICS",2,new ArrayList<Instructor>(Arrays.asList(inst28)),5,3);
        Course course13 = new Course("ENEE2311","NETWORK ANALYSIS 1",2,new ArrayList<Instructor>(Arrays.asList(inst21)),1,3);
        Course course14 = new Course("ENEE2311","NETWORK ANALYSIS 1",2,new ArrayList<Instructor>(Arrays.asList(inst9)),2,3);
        Course course15= new Course("ENEE2312","SIGNALS AND SYSTEMS",2,new ArrayList<Instructor>(Arrays.asList(inst1)),1,3);
        Course course16= new Course("ENEE2312","SIGNALS AND SYSTEMS",2,new ArrayList<Instructor>(Arrays.asList(inst1)),2,3);
        Course course17 = new Course("ENEE2360","ANALOG ELECTRONICS",2,new ArrayList<Instructor>(Arrays.asList(inst30)),1,3);
        Course course18 = new Course("ENEE2360","ANALOG ELECTRONICS",2,new ArrayList<Instructor>(Arrays.asList(inst30)),3,3);
        Course course19 = new Course("ENEE2360","ANALOG ELECTRONICS",2,new ArrayList<Instructor>(Arrays.asList(inst29)),2,3);
        Course course20 = new Course("ENEE3101","ELECTRICAL MACHINES LAB",3,new ArrayList<Instructor>(Arrays.asList(inst9)),1,1);
        Course course21 = new Course("ENEE3101","ELECTRICAL MACHINES LAB",3,new ArrayList<Instructor>(Arrays.asList(inst9)),2,1);
        Course course22 = new Course("ENEE3103","ANALOG ELECTRONICS LAB",3,new ArrayList<Instructor>(Arrays.asList(inst29)),1,1);
        Course course23 = new Course("ENEE3112","ELECTRONICS LAB",3,new ArrayList<Instructor>(Arrays.asList(inst30)),1,1);
        Course course24 = new Course("ENEE3112","ELECTRONICS LAB",3,new ArrayList<Instructor>(Arrays.asList(inst29)),2,1);
        Course course25 = new Course("ENEE3302","CONTROL SYSTEMS",3,new ArrayList<Instructor>(Arrays.asList(inst1)),1,3);
        Course course26 = new Course("ENEE3304","ELECTRONICS 2",3,new ArrayList<Instructor>(Arrays.asList(inst29)),1,3);
        Course course27 = new Course("ENEE3305","POWER ELECTRONICS",3,new ArrayList<Instructor>(Arrays.asList(inst32)),1,3);
        Course course28 = new Course("ENEE3307","LIGHTING AND ACOUSTICS ENGINEERING",3,new ArrayList<Instructor>(Arrays.asList(inst33)),1,3);
        Course course29 = new Course("ENEE3307","LIGHTING AND ACOUSTICS ENGINEERING",3,new ArrayList<Instructor>(Arrays.asList(inst31)),2,3);
        Course course30 = new Course("ENEE3308","ELECTROMECHANICAL PRINCIPLES AND APPLICATIONS",3,new ArrayList<Instructor>(Arrays.asList(inst31)),1,3);
        Course course31 = new Course("ENEE3309","COMMUNICATION SYSTEMS",3,new ArrayList<Instructor>(Arrays.asList(inst22)),4,3);
        Course course32 = new Course("ENEE3309","COMMUNICATION SYSTEMS",3,new ArrayList<Instructor>(Arrays.asList(inst25)),2,3);
        Course course33 = new Course("ENEE3309","COMMUNICATION SYSTEMS",3,new ArrayList<Instructor>(Arrays.asList(inst26)),1,3);
        Course course34 = new Course("ENEE3309","COMMUNICATION SYSTEMS",3,new ArrayList<Instructor>(Arrays.asList(inst25)),3,3);
        Course course35 = new Course("ENEE3318","ELECTROMAGNETICS",3,new ArrayList<Instructor>(Arrays.asList(inst25)),1,3);
        Course course36 = new Course("ENEE4102","FUNDAMENTALS OF ELECTRICAL MACHINES LAB",4,new ArrayList<Instructor>(Arrays.asList(inst32)),1,1);
        Course course37 = new Course("ENEE4102","FUNDAMENTALS OF ELECTRICAL MACHINES LAB",4,new ArrayList<Instructor>(Arrays.asList(inst9)),2,1);
        Course course38 = new Course("ENEE4104","ENGINEERING SIMULATION LAB",4,new ArrayList<Instructor>(Arrays.asList(inst1)),1,1);
        Course course39 = new Course("ENEE4105","CONTROL AND POWER ELECTRONICS LAB",4,new ArrayList<Instructor>(Arrays.asList(inst31)),1,1);
        Course course40 = new Course("ENEE4113","COMMUNICATIONS LAB",4,new ArrayList<Instructor>(Arrays.asList(inst21)),1,1);
        Course course41 = new Course("ENEE4113","COMMUNICATIONS LAB",4,new ArrayList<Instructor>(Arrays.asList(inst25)),2,1);
        Course course42 = new Course("ENEE4113","COMMUNICATIONS LAB",4,new ArrayList<Instructor>(Arrays.asList(inst25)),5,1);
        Course course43 = new Course("ENEE4113","COMMUNICATIONS LAB",4,new ArrayList<Instructor>(Arrays.asList(inst22)),3,1);
        Course course44 = new Course("ENEE4113","COMMUNICATIONS LAB",4,new ArrayList<Instructor>(Arrays.asList(inst22)),6,1);
        Course course45 = new Course("ENEE4113","COMMUNICATIONS LAB",4,new ArrayList<Instructor>(Arrays.asList(inst26)),4,1);
        Course course46 = new Course("ENEE2408","ELECTRICAL MACHINES",2,new ArrayList<Instructor>(Arrays.asList(inst31)),1,4);
        Course course47 = new Course("ENEE4302","CONTROL SYSTEMS 1",4,new ArrayList<Instructor>(Arrays.asList(inst1)),1,3);
        Course course48 = new Course("ENEE4303","ELECTRICAL MACHINES FUNDAMENTALS",4,new ArrayList<Instructor>(Arrays.asList(inst9)),1,3);
        Course course49 = new Course("ENEE5102","POWER LAB",5,new ArrayList<Instructor>(Arrays.asList(inst31)),1,1);
        Course course50 = new Course("ENEE5303","ELECTRICAL MACHINE DRIVES AND SPECIAL MACHINES",5,new ArrayList<Instructor>(Arrays.asList(inst34)),1,3);
        Course course51 = new Course("ENEE5304","INFORMATION AND CODING THEORY",5,new ArrayList<Instructor>(Arrays.asList(inst26)),1,3);  
        Course course52 = new Course("ENEE5307","RENEWABLE ENERGY AND PHOTOVOLTAIC POWER SYSTEMS",5,new ArrayList<Instructor>(Arrays.asList(inst30)),1,3);
        Course course53 = new Course("ENCS2110","DIGITAL ELECTRONICS AND COMPUTER ORGANIZATION LABORATORY",2,new ArrayList<Instructor>(Arrays.asList(inst1)),1,1);
        Course course54 = new Course("ENCS2110","DIGITAL ELECTRONICS AND COMPUTER ORGANIZATION LABORATORY",2,new ArrayList<Instructor>(Arrays.asList(inst2)),2,1);
        Course course55 = new Course("ENCS2110","DIGITAL ELECTRONICS AND COMPUTER ORGANIZATION LABORATORY",2,new ArrayList<Instructor>(Arrays.asList(inst3)),3,1);
        Course course56 = new Course("ENCS2110","DIGITAL ELECTRONICS AND COMPUTER ORGANIZATION LABORATORY",2,new ArrayList<Instructor>(Arrays.asList(inst4)),4,1);
        Course course57 = new Course("ENCS2110","DIGITAL ELECTRONICS AND COMPUTER ORGANIZATION LABORATORY",2,new ArrayList<Instructor>(Arrays.asList(inst3)),5,1);
        Course course58 = new Course("ENCS2110","DIGITAL ELECTRONICS AND COMPUTER ORGANIZATION LABORATORY",2,new ArrayList<Instructor>(Arrays.asList(inst4)),6,1);
        Course course59 = new Course("ENCS2110","DIGITAL ELECTRONICS AND COMPUTER ORGANIZATION LABORATORY",2,new ArrayList<Instructor>(Arrays.asList(inst5)),7,1);
        Course course60 = new Course("ENCS2110","DIGITAL ELECTRONICS AND COMPUTER ORGANIZATION LABORATORY",2,new ArrayList<Instructor>(Arrays.asList(inst6)),8,1);
        Course course61 = new Course("ENCS2340","DIGITAL SYSTEMS",2,new ArrayList<Instructor>(Arrays.asList(inst3)),1,3);
        Course course62 = new Course("ENCS2340","DIGITAL SYSTEMS",2,new ArrayList<Instructor>(Arrays.asList(inst3)),2,3);
        Course course63 = new Course("ENCS2340","DIGITAL SYSTEMS",2,new ArrayList<Instructor>(Arrays.asList(inst7)),3,3);
        Course course64 = new Course("ENCS2340","DIGITAL SYSTEMS",2,new ArrayList<Instructor>(Arrays.asList(inst6)),4,3);
        Course course65 = new Course("ENCS2340","DIGITAL SYSTEMS",2,new ArrayList<Instructor>(Arrays.asList(inst8)),5,3);
        Course course66 = new Course("ENCS2340","DIGITAL SYSTEMS",2,new ArrayList<Instructor>(Arrays.asList(inst2)),6,3);
        Course course67 = new Course("ENCS2340","DIGITAL SYSTEMS",2,new ArrayList<Instructor>(Arrays.asList(inst9)),7,3);
        Course course68 = new Course("ENCS2340","DIGITAL SYSTEMS",2,new ArrayList<Instructor>(Arrays.asList(inst8)),8,3);
        Course course69 = new Course("ENCS2380","COMPUTER ORGANIZATION AND MICROPROCESSOR",2,new ArrayList<Instructor>(Arrays.asList(inst10)),1,3);
        Course course70 = new Course("ENCS2380","COMPUTER ORGANIZATION AND MICROPROCESSOR",2,new ArrayList<Instructor>(Arrays.asList(inst10)),2,3);
        Course course71 = new Course("ENCS311","ASSEMBLY LANGUAGE LABORATORY",3,new ArrayList<Instructor>(Arrays.asList(inst10)),1,1);
        Course course72 = new Course("ENCS3130"," LINUX LABORATORY",3,new ArrayList<Instructor>(Arrays.asList(inst11)),1,1);
        Course course73 = new Course("ENCS3130"," LINUX LABORATORY",3,new ArrayList<Instructor>(Arrays.asList(inst11)),2,1);
        Course course74 = new Course("ENCS3130"," LINUX LABORATORY",3,new ArrayList<Instructor>(Arrays.asList(inst5)),3,1);
        Course course75 = new Course("ENCS3130"," LINUX LABORATORY",3,new ArrayList<Instructor>(Arrays.asList(inst12)),4,1);
        Course course76 = new Course("ENCS3130"," LINUX LABORATORY",3,new ArrayList<Instructor>(Arrays.asList(inst11)),5,1);
        Course course77 = new Course("ENCS3310","ADVANCED DIGITAL SYSTEMS DESIGN",3,new ArrayList<Instructor>(Arrays.asList(inst13)),1,3);
        Course course78 = new Course("ENCS3310","ADVANCED DIGITAL SYSTEMS DESIGN",3,new ArrayList<Instructor>(Arrays.asList(inst13)),2,3);
        Course course79 = new Course("ENCS3320","COMPUTER NETWORKS",3,new ArrayList<Instructor>(Arrays.asList(inst14)),1,3);
        Course course80 = new Course("ENCS3320","COMPUTER NETWORKS",3,new ArrayList<Instructor>(Arrays.asList(inst2)),2,3);
        Course course81 = new Course("ENCS3320","COMPUTER NETWORKS",3,new ArrayList<Instructor>(Arrays.asList(inst14)),3,3);
        Course course82 = new Course("ENCS3330","DIGITAL INTEGRATED CIRCUITS",3,new ArrayList<Instructor>(Arrays.asList(inst5)),1,3);
        Course course83 = new Course("ENCS3330","DIGITAL INTEGRATED CIRCUITS",3,new ArrayList<Instructor>(Arrays.asList(inst5)),2,3);
        Course course84 = new Course("ENCS3340","ARTIFICIAL INTELLIGENCE",3,new ArrayList<Instructor>(Arrays.asList(inst12)),1,3);
        Course course85 = new Course("ENCS3340","ARTIFICIAL INTELLIGENCE",3,new ArrayList<Instructor>(Arrays.asList(inst12)),2,3);
        Course course86 = new Course("ENCS3341","EMBEDDED SYSTEMS",3,new ArrayList<Instructor>(Arrays.asList(inst15)),1,3);
        Course course87 = new Course("ENCS336","COMPUTER ORGANIZATION AND ASSEMBLY LANGUAGE",3,new ArrayList<Instructor>(Arrays.asList(inst15)),1,3);
    Course course88 = new Course("ENCS336","COMPUTER ORGANIZATION AND ASSEMBLY LANGUAGE",3,new ArrayList<Instructor>(Arrays.asList(inst15)),2,3);
    
    Course course89 = new Course("ENCS3390","OPERATING SYSTEMS",3,new ArrayList<Instructor>(Arrays.asList(inst16)),1,3);
    Course course90 = new Course("ENCS3390","OPERATING SYSTEMS",3,new ArrayList<Instructor>(Arrays.asList(inst16)),2,3);
    Course course91 = new Course("ENCS3390","OPERATING SYSTEMS",3,new ArrayList<Instructor>(Arrays.asList(inst17)),3,3);
    Course course92 = new Course("ENCS3390","OPERATING SYSTEMS",3,new ArrayList<Instructor>(Arrays.asList(inst17)),4,3);

    Course course93 = new Course("ENCS411","COMPUTER DESIGN LAB",4,new ArrayList<Instructor>(Arrays.asList(inst13)),1,1);
    Course course94 = new Course("ENCS411","COMPUTER DESIGN LAB",4,new ArrayList<Instructor>(Arrays.asList(inst13)),2,1);

    Course course95 = new Course("ENCS4110","COMPUTER DESIGN LABORATORY",4,new ArrayList<Instructor>(Arrays.asList(inst10)),1,1);
    Course course96 = new Course("ENCS4110","COMPUTER DESIGN LABORATORY",4,new ArrayList<Instructor>(Arrays.asList(inst10)),2,1);
    Course course97 = new Course("ENCS4110","COMPUTER DESIGN LABORATORY",4,new ArrayList<Instructor>(Arrays.asList(inst18)),3,1);
    Course course98 = new Course("ENCS4110","COMPUTER DESIGN LABORATORY",4,new ArrayList<Instructor>(Arrays.asList(inst18)),4,1);
    Course course99 = new Course("ENCS4110","COMPUTER DESIGN LABORATORY",4,new ArrayList<Instructor>(Arrays.asList(inst10)),5,1);

    Course course100 = new Course("ENCS412","INTERFACING LABORATORY",4,new ArrayList<Instructor>(Arrays.asList(inst1)),1,1);
    Course course101 = new Course("ENCS412","INTERFACING LABORATORY",4,new ArrayList<Instructor>(Arrays.asList(inst19)),2,1);
    Course course102 = new Course("ENCS412","INTERFACING LABORATORY",4,new ArrayList<Instructor>(Arrays.asList(inst19)),3,1);

    Course course103 = new Course("ENCS4130","COMPUTER NETWORK LABORATORY",4,new ArrayList<Instructor>(Arrays.asList(inst2)),1,1);
    Course course104 = new Course("ENCS4130","COMPUTER NETWORK LABORATORY",4,new ArrayList<Instructor>(Arrays.asList(inst2)),2,1);
    Course course105 = new Course("ENCS4130","COMPUTER NETWORK LABORATORY",4,new ArrayList<Instructor>(Arrays.asList(inst17)),3,1);
    Course course106 = new Course("ENCS4130","COMPUTER NETWORK LABORATORY",4,new ArrayList<Instructor>(Arrays.asList(inst3)),4,1);
    Course course107 = new Course("ENCS4130","COMPUTER NETWORK LABORATORY",4,new ArrayList<Instructor>(Arrays.asList(inst15)),5,1);
    Course course108 = new Course("ENCS4130","COMPUTER NETWORK LABORATORY",4,new ArrayList<Instructor>(Arrays.asList(inst2)),6,1);
    Course course109 = new Course("ENCS4130","COMPUTER NETWORK LABORATORY",4,new ArrayList<Instructor>(Arrays.asList(inst14)),7,1);
    Course course110 = new Course("ENCS4130","COMPUTER NETWORK LABORATORY",4,new ArrayList<Instructor>(Arrays.asList(inst15)),8,1);
    Course course111 = new Course("ENCS4130","COMPUTER NETWORK LABORATORY",4,new ArrayList<Instructor>(Arrays.asList(inst3)),9,1);
 
    Course course112 = new Course("ENCS4310","DIGITAL SIGNAL PROCESSING",4,new ArrayList<Instructor>(Arrays.asList(inst21)),1,3);
    Course course113 = new Course("ENCS4310","DIGITAL SIGNAL PROCESSING",4,new ArrayList<Instructor>(Arrays.asList(inst22)),2,3);
    Course course114 = new Course("ENCS4310","DIGITAL SIGNAL PROCESSING",4,new ArrayList<Instructor>(Arrays.asList(inst22)),3,3);

    Course course115 = new Course("ENCS4320","APPLIED CRYPTOGRAPHY",4,new ArrayList<Instructor>(Arrays.asList(inst23)),1,3);
    Course course116 = new Course("ENCS4320","APPLIED CRYPTOGRAPHY",4,new ArrayList<Instructor>(Arrays.asList(inst23)),2,3);
    Course course117 = new Course("ENCS4320","APPLIED CRYPTOGRAPHY",4,new ArrayList<Instructor>(Arrays.asList(inst23)),3,3);

    Course course118 = new Course("ENCS4330","REAL-TIME APPLICATIONS AND EMBEDDED SYSTEMS",4,new ArrayList<Instructor>(Arrays.asList(inst24)),1,3);
    Course course119 = new Course("ENCS4330","REAL-TIME APPLICATIONS AND EMBEDDED SYSTEMS",4,new ArrayList<Instructor>(Arrays.asList(inst24)),2,3);

    Course course120 = new Course("ENCS4370","COMPUTER ARCHITECTURE",4,new ArrayList<Instructor>(Arrays.asList(inst18)),1,3);
    Course course121 = new Course("ENCS4370","COMPUTER ARCHITECTURE",4,new ArrayList<Instructor>(Arrays.asList(inst12)),2,3);
    Course course122 = new Course("ENCS4370","COMPUTER ARCHITECTURE",4,new ArrayList<Instructor>(Arrays.asList(inst18)),3,3);

    Course course123 = new Course("ENCS4380","INTERFACING TECHNIQUES",4,new ArrayList<Instructor>(Arrays.asList(inst19)),1,3);
    Course course124 = new Course("ENCS4380","INTERFACING TECHNIQUES",4,new ArrayList<Instructor>(Arrays.asList(inst19)),2,3);

    Course course125 = new Course("ENCS514","REAL-TIME SYSTEMS LAB",5,new ArrayList<Instructor>(Arrays.asList(inst24)),1,1);
    Course course126 = new Course("ENCS514","REAL-TIME SYSTEMS LAB",5,new ArrayList<Instructor>(Arrays.asList(inst12)),2,1);
    Course course127 = new Course("ENCS514","REAL-TIME SYSTEMS LAB",5,new ArrayList<Instructor>(Arrays.asList(inst24)),3,1);
    Course course128 = new Course("ENCS514","REAL-TIME SYSTEMS LAB",5,new ArrayList<Instructor>(Arrays.asList(inst24)),4,1);
    Course course129 = new Course("ENCS5150","ADVANCED COMPUTER SYSTEMS ENGINEERING LABORATORY",5,new ArrayList<Instructor>(Arrays.asList(inst16)),1,1);
    Course course130= new Course("ENCS5150","ADVANCED COMPUTER SYSTEMS ENGINEERING LABORATORY",5,new ArrayList<Instructor>(Arrays.asList(inst16)),3,1);
    Course course131 = new Course("ENCS5150","ADVANCED COMPUTER SYSTEMS ENGINEERING LABORATORY",5,new ArrayList<Instructor>(Arrays.asList(inst7)),2,1);
    Course course132 = new Course("ENCS5150","ADVANCED COMPUTER SYSTEMS ENGINEERING LABORATORY",5,new ArrayList<Instructor>(Arrays.asList(inst7)),4,1);                              
    Course course133 = new Course("ENCS5322","NETWORK SECURITY PROTOCOLS",5,new ArrayList<Instructor>(Arrays.asList(inst23)),1,3);
    Course course134 = new Course("ENCS5332","VLSI DESIGN",5,new ArrayList<Instructor>(Arrays.asList(inst5)),1,3);
    Course course135 = new Course("ENCS5341","MACHINE LEARNING AND DATA SCIENCE",5,new ArrayList<Instructor>(Arrays.asList(inst16)),1,3);
    Course course136 = new Course("ENCS5399","VERIFICATION AND VALIDATION OF HARDWARE",5,new ArrayList<Instructor>(Arrays.asList(inst18)),1,3);
    Course course137 = new Course("ENEE4403","POWER SYSTEM",4,new ArrayList<Instructor>(Arrays.asList(inst28)),1,3);
        courses = new ArrayList<Course>(Arrays.asList(course1,course2,course3,course4,course5,course6,course7,course8,course9,course10,course11,course12,course13,course14,course15,course16,course17,course18,
        course19,course20,course21,course22,course23,course24,course25,course26,course27,course28,course29,course30,course31,course32,course33,course34,course35,course36,course37,course38,course39,course40,
        course41,course42,course43,course44,course45,course46,course47,course48,course49,course50,course51,course52,course53,course54,course55,course56,course57,course58,course59,course60,course61,course62,course63,
        course64,course65,course66,course67,course68,course69,course70,course71,course72,course73,course74,course75,course76,course77,course78,course79,course80,course81,course82,course83,course84,course85,course86,course87,course88,course89,course90,
        course91,course92,course93,course94,course95,course96,course97,course98,course99,course100,course101,course102,course103,course104,course105,course106,course107,course108,course109,course110,course111,course112,course113,course114,course115,course116,
        course117,course118,course119,course120,course121,course122,course123,course124,course125,course126,course127,course128,course129,course130,course131,course132,course133,course134,course135,course136,course137));
        Departement depar1 = new Departement("Computer Engineering",new ArrayList<Course>(Arrays.asList(course53,course54,course55,course56,course57,course58,course59,course60,course61,course62,course63,
        course64,course65,course66,course67,course68,course69,course70,course71,course72,course73,course74,course75,course76,course77,course78,course79,course80,course81,course82,course83,course84,course85,course86,course87,course88,course89,course90,
        course91,course92,course93,course94,course95,course96,course97,course98,course99,course100,course101,course102,course103,course104,course105,course106,course107,course108,course109,course110,course111,course112,course113,course114,course115,course116,
        course117,course118,course119,course120,course121,course122,course123,course124,course125,course126,course127,course128,course129,course130,course131,course132,course133,course134,course135,course136)),new ArrayList<Course>(Arrays.asList(course8,course9,course10,course11,course12,course13,
        course6,course7,course15,course16,course17,course18,
        course19,course3,course4,course5,course40,course41,course42,course43,course44,course45 )));




        Departement depar2 = new Departement("Electrical Engineering", new ArrayList<Course>(Arrays.asList(course1,course2,course3,course4,course5,course6,course7,course8,course9,course10,course11,course12,course13,course14,course15,course16,course17,course18,
        course19,course20,course21,course22,course23,course24,course25,course26,course27,course28,course29,course30,course31,course32,course33,course34,course35,course36,course37,course38,course39,course40,
        course41,course42,course43,course44,course45,course46,course47,course48,course49,course50,course51,course52,course137)),new ArrayList<Course>(Arrays.asList(course53,course54,course55,course56,course57,course58,course59,course60,course61,course62,course63,
        course64,course65,course66,course67,course68,course69,course70)));
        departements = new ArrayList<Departement>(Arrays.asList(depar1,depar2));
        departements.forEach(x -> numberOfClasses += x.getCourses().size());



        
        




       

        return this;
        
       
    }
    public ArrayList<Instructor> getinstructors(){
        return instructors;
    }
    public ArrayList<Course> getcourses(){
        return courses;
    }
    public ArrayList<Departement> getdepartements(){
        return departements;
    }
    public ArrayList<MeetingTime> getmeetingTimes(){
        return meetingTimes;
    }
    public ArrayList<MeetingTime> getmeetingLab(){
        return meetingLab;
    }
   
    public int getNumberOfClasses(){
        return this.numberOfClasses;
    }

    
}
