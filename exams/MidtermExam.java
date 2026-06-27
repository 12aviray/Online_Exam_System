package exams;

public class MidtermExam implements Exam {
    @Override
    public String getType() {
        return "Midterm Exam";
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: " + getType());
        System.out.println("Rules: Single attempt, strict time limits, comprehensive configurations.");
    }
}