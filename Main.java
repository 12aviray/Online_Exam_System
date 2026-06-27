import builder.*;
import exams.*;
import questions.*;
import sources.*;

public class Main {
    public static void main(String[] args) {
        // 1. Instantiate Factory Method (Part A)
        ExamFactory examFactory = new MidtermExamFactory();
        Exam currentExam = examFactory.createExam();

        // 2. Setup Question Source (Part D)
        QuestionSource source = new BankQuestionSource();

        // 3. Setup Abstract Factories (Part B)
        QuestionFactory mcqFact = new MCQFactory(source);
        QuestionFactory essayFact = new EssayFactory(source);
        QuestionFactory progFact = new ProgrammingFactory(source);
        QuestionFactory tfFact = new TrueFalseFactory(source);

        // 4. Build Configuration (Part C)
        ExamConfiguration config = new ExamBuilder()
                .setTitle("OOP Midterm Exam")
                .setDuration(60)
                .setPassingScore(50)
                .setNegativeMarking(true)
                .setShuffle(true)
                .setCalculator(false)
                .setAutoSubmit(true)
                .build();

        // 5. Generate Expected Console Output (Requirement 6)
        System.out.println("=====================================================================");
        System.out.println("                     EXAM CREATED SUCCESSFULLY                       ");
        System.out.println("=====================================================================");
        System.out.println("Type: " + currentExam.getType());
        System.out.println(config.toString());
        System.out.println("Question Sourcing Strategy: Question Bank Mode");
        System.out.println("Compiled Structural Components:");

        // Simulate abstract factory creation and rendering
        Question q1 = mcqFact.createQuestion();
        System.out.println("- [Type: " + q1.getType() + "] Points: 2 Difficulty: Medium");

        Question q2 = mcqFact.createQuestion();
        System.out.println("- [Type: " + q2.getType() + "] Points: 2 Difficulty: Easy");

        Question q3 = essayFact.createQuestion();
        System.out.println("- [Type: " + q3.getType() + "] Points: 10 Difficulty: Hard");

        Question q4 = progFact.createQuestion();
        System.out.println("- [Type: " + q4.getType() + "] Points: 20 Difficulty: Hard");

        Question q5 = tfFact.createQuestion();
        System.out.println("- [Type: " + q5.getType() + "] Points: 1 Difficulty: Easy");

        System.out.println("=====================================================================");
    }
}