class Student{
    private int studentid;
    private String name;
    private int dayAttended;

    void StudentDetails(int studentid, String name, int dayAttended){
        this.studentid=studentid;
        this.name=name;
        this.dayAttended=dayAttended;
    }

    void SetStudentid(int studentid){
        this.studentid=studentid;
    }
    void SetName(String name){
        this.name=name;
    }
    void SetDayAttended(int dayAttended){
        this.dayAttended=dayAttended;
    }
    
    int Studentid(){
        return studentid;
    }
    String Name(){
        return name;
    }
    int DayAttended(){
        return dayAttended;
    }

    String StudentInfo(){
        return "Student ID "+studentid+" Name "+name+" No of days Attended "+dayAttended;
    }

    void Display(){
        System.out.println("StudentID: "+studentid+" Name: "+name+" Days Attended: "+dayAttended);
    }
}

class Classroom{
    
    private Student[] students; 
    private int studentCount;

    Classroom(){
        students[]=new Student[10];
        studentCount=0;
        }

    void addStudent(Student studentDetails){
       if(studentCount<students.length){
           students[studentCount]=studentDetails;
           studentCount++
       } 
        else{
            System.out.println("Class is full");
        }
    }

    void attendance(int studentid, int dayAttended){
        
    }

    void DisplayList(){
        System.out.println("Student List: ");
        for(int i=0; i<studentCount; i++){
            System.out.println(students[i].StudentInfo());
        }
    }
}

class Main{
    public static void main(String[] args){
        Classroom classroom=new Classroom();

        classroom.addStudent(new Student(101,"Alice Smith",12));
        classroom.addStudent(new Student(102,"Bob Jones",15));
        classroom.addStudent(new Student(103, "Carol Lee", 10));

        classroom.attendance(104,5);

        classroom.DisplayList();
    }
}
