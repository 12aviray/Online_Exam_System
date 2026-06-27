import exams.*;
import questions.*;

public class Main {
    public static void main(String[] args) {
        // Part A: Factory Method (Exam Format)
        ExamFactory examFactory = new MidtermExamFactory();
        Exam exam = examFactory.createExam();
        System.out.println("Exam Created: " + exam.getType());

        // Part B: Abstract Factory (Question Subsystem)
        System.out.println("Compiled Structural Components:");

        QuestionFactory mcqFactory = new MCQFactory();
        Question q = mcqFactory.createQuestion();
        QuestionRenderer renderer = mcqFactory.createRenderer();

        renderer.render(q); // - Type: MCQ] Points: 2 Difficulty: Medium
    }
}