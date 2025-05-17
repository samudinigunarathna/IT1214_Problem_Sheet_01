class Student{
    private int studentid;
    private String name;
    private int dayAttended;

    void Student(int studentid, String name, int dayAttended){
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

    void Display(){
        System.out.println("StudentID: "+studentid+" Name: "+name+" Days Attended: "+dayAttended);
    }
}

class Classroom{
    Student[] student=new Student[10]; 
}

class Main{
    public static void main(String[] args){
        Student st=new Student();
        st.Display();
    }
}