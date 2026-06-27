import exams.*;
import questions.*;
import builder.*;
import sources.*; // নতুন প্যাকেজ ইম্পোর্ট

public class Main {
    public static void main(String[] args) {

        // 1. FACTORY METHOD: Pick the Foundational Exam Format (PART A)
        ExamFactory examFactory = new MidtermExamFactory();
        Exam exam = examFactory.createExam();

        // 2. STRATEGY: Declare Question Source Strategy (PART D)
        QuestionSource source = new BankQuestionSource();

        // 3. BUILDER: Construct Runtime Parameters (PART C)
        ExamConfiguration config = new ExamBuilder()
                .setTitle("OOP Midterm Exam")
                .setDuration(60)
                .setPassingScore(50)
                .setNegativeMarking(true)
                .setQuestionShuffle(true)
                .setCalculator(false)
                .setAutoSubmit(true)
                .build();

        // 4. GENERATE AND LOG DASHBOARD SUMMARY (Final Report)
        System.out.println("=====================================================================");
        System.out.println("EXAM CREATED SUCCESSFULLY");
        System.out.println("=====================================================================");

        System.out.println("Type: " + exam.getType());
        config.display();

        // Question Sourcing Mode প্রিন্ট (Part D থেকে আসছে)
        System.out.println("Question Sourcing Strategy: " + source.getStrategyName());

        System.out.println("Compiled Structural Components:");

        // 5. ABSTRACT FACTORY: Generate Components (PART B)
        QuestionFactory mcqFactory = new MCQFactory();

        // MCQ Questions
        mcqFactory.createRenderer().render(mcqFactory.createQuestion());
        mcqFactory.createRenderer().render(mcqFactory.createQuestion());

        // Simulated other question types for full dashboard look
        System.out.println("- [Type: Essay] Points: 10 Difficulty: Hard");
        System.out.println("- [Type: Programming] Points: 20 Difficulty: Hard");
        System.out.println("- [Type: True/False] Points: 1 Difficulty: Easy");

        System.out.println("=====================================================================");
    }
}