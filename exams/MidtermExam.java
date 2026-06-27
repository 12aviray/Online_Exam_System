package exams;

public class MidtermExam implements Exam {
    @Override
    public String getType() { return "Midterm Exam"; }
    @Override
    public void displayInfo() { System.out.println("Strict time limits, single attempt."); }
}