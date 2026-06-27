import exams.*;

public class Main {
    public static void main(String[] args) {
        // Factory Method Demonstration
        ExamFactory factory = new MidtermExamFactory();
        Exam midterm = factory.createExam();
        midterm.displayInfo();
    }
}