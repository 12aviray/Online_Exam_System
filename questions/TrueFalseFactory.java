package questions;
import sources.QuestionSource;

public class TrueFalseFactory implements QuestionFactory {
    private QuestionSource source;
    public TrueFalseFactory(QuestionSource source) { this.source = source; }

    @Override
    public Question createQuestion() {
        String text = source.getQuestionData("True/False");
        return new Question() {
            @Override public String getType() { return "True/False"; }
            @Override public String getText() { return text; }
        };
    }

    @Override
    public QuestionRenderer createRenderer() {
        return q -> System.out.println("[Rendering T/F] " + q.getText());
    }

    @Override
    public QuestionEvaluator createEvaluator() {
        return (q, answer) -> answer.equalsIgnoreCase("True") ? 1 : 0;
    }
}