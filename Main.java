import exams.*;      // Part A
import questions.*;  // Part B
import builder.*;    // Part C

public class Main {
    public static void main(String[] args) {

        // ==========================================================
        // 1. Factory Method Pattern (PART A): Pick the Exam Format
        // ==========================================================
        ExamFactory examFactory = new MidtermExamFactory(); // Midterm Exam সিলেক্ট করা হলো
        Exam exam = examFactory.createExam();

        // ==========================================================
        // 2. Builder Pattern (PART C): Setup Exam Configurations
        // ==========================================================
        ExamConfiguration config = new ExamBuilder()
                .setTitle("OOP Midterm Exam")
                .setDuration(60)
                .setPassingScore(50)
                .setNegativeMarking(true)
                .setQuestionShuffle(true)
                .setCalculator(false)
                .setAutoSubmit(true)
                .build();

        // ==========================================================
        // 3. System Dashboard Output (Target Format)
        // ==========================================================
        System.out.println("=====================================================================");
        System.out.println("EXAM CREATED SUCCESSFULLY");
        System.out.println("=====================================================================");

        // Exam Type প্রিন্ট (Part A থেকে আসছে)
        System.out.println("Type: " + exam.getType());

        // Configuration Details প্রিন্ট (Part C থেকে আসছে)
        config.display();

        // Question Sourcing Strategy (Part D তে এটি আরও ডায়নামিক হবে)
        System.out.println("Question Sourcing Strategy: Manual Mode");

        System.out.println("Compiled Structural Components:");

        // ==========================================================
        // 4. Abstract Factory Pattern (PART B): Adding Questions
        // ==========================================================
        // MCQ Factory ব্যবহার করে প্রশ্ন এবং রেন্ডারার তৈরি
        QuestionFactory mcqFactory = new MCQFactory();

        // প্রথম প্রশ্ন
        Question q1 = mcqFactory.createQuestion();
        QuestionRenderer renderer1 = mcqFactory.createRenderer();
        renderer1.render(q1);

        // দ্বিতীয় প্রশ্ন (একইভাবে)
        Question q2 = mcqFactory.createQuestion();
        renderer1.render(q2);

        //Placeholder for other question types (Essay, Programming)
        System.out.println("- [Type: Essay] Points: 10 Difficulty: Hard");
        System.out.println("- [Type: Programming] Points: 20 Difficulty: Hard");

        System.out.println("=====================================================================");
    }
}