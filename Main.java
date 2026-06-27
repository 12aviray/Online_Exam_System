import exams.*;

public class Main {
    public static void main(String[] args) {
        // Step 1: Factory Method implementation
        ExamFactory midtermFactory = new MidtermExamFactory();
        Exam midterm = midtermFactory.createExam();

        System.out.println("Exam Created: " + midterm.getType());
        midterm.displayInfo();
    }
}