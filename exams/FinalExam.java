package exams;

public class FinalExam implements Exam {
    @Override
    public String getType() {
        return "Final Exam";
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: " + getType());
        System.out.println("Rules: Maximum security configurations, definitive high-stakes weights.");
    }
}