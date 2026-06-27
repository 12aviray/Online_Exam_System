package sources;

public class BankQuestionSource implements QuestionSource {
    @Override
    public String getQuestionData(String type) {
        return switch (type) {
            case "MCQ" -> "Identify the correct Design Pattern in this scenario.";
            case "True/False" -> "Is Java purely object-oriented?";
            case "Essay" -> "Explain the Open/Closed Principle with examples.";
            case "Programming" -> "Write a Java program to implement a Singleton class.";
            default -> "General Question text from Bank.";
        };
    }
}