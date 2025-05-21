class Student {
    private String name;
    private int exam1;
    private int exam2;
    private int exam3;
    
    private void validateMarks(int marks) throws IllegalArgumentException {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Exam scores must be between 0 and 100.");
        }
    }
    
    Student() {
        this.name = "";
        this.exam1 = 0;
        this.exam2 = 0;
        this.exam3 = 0;
    }
    
    Student(String name, int e1, int e2, int e3) throws IllegalArgumentException {
        this.name = name;
        validateMarks(e1);
        validateMarks(e2);
        validateMarks(e3);
        this.exam1 = e1;
        this.exam2 = e2;
        this.exam3 = e3;
    }
    
    String getName() {
        return name;
    }
    
    int getExam1() {
        return exam1;
    }
    
    int getExam2() {
        return exam2;
    }
    
    int getExam3() {
        return exam3;
    }
    
    double calculateAverage() {
        return (exam1 + exam2 + exam3) / 3.0;
    }
}

class StudentDemo {
    public static void main(String[] args) {
        try {
           
            Student s1 = new Student("John", 75, 110, -90);
            
            System.out.println("Name of the Student 1 is " + s1.getName());
            System.out.println("Marks of the Student 1 for exam1 is " + s1.getExam1());
            System.out.println("Marks of the Student 1 for exam2 is " + s1.getExam2());
            System.out.println("Marks of the Student 1 for exam3 is " + s1.getExam3());
            System.out.printf("Average score: %.2f%n", s1.calculateAverage());
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Error creating student: " + e.getMessage());
        }
        
        try {
            
            Student s2 = new Student("Adam", 99, 88, 75);
            
            System.out.println("\nName of the Student 2 is " + s2.getName());
            System.out.println("Marks of the Student 2 for exam1 is " + s2.getExam1());
            System.out.println("Marks of the Student 2 for exam2 is " + s2.getExam2());
            System.out.println("Marks of the Student 2 for exam3 is " + s2.getExam3());
            System.out.printf("Average score: %.2f%n", s2.calculateAverage());
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Error creating student: " + e.getMessage());
        }
    }
}