package sources;

public class FakerQuestionSource implements QuestionSource {
    @Override
    public String getQuestionData(String type) {
        return "[FAKE/AUTO] Randomly generated question for " + type;
    }
}