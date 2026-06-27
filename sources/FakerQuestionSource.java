package sources;

public class FakerQuestionSource implements QuestionSource {
    @Override
    public String getStrategyName() {
        return "Auto/Faker Mode";
    }
}