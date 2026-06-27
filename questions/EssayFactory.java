package questions;
import sources.QuestionSource;

public class EssayFactory implements QuestionFactory {
    private QuestionSource source;
    public EssayFactory(QuestionSource source) { this.source = source; }

    @Override
    public Question createQuestion() {
        String text = source.getQuestionData("Essay");
        return new Question() {
            @Override public String getType() { return "Essay"; }
            @Override public String getText() { return text; }
        };
    }

    @Override
    public QuestionRenderer createRenderer() {
        return q -> System.out.println("[Rendering Essay] Write long answer for: " + q.getText());
    }

    @Override
    public QuestionEvaluator createEvaluator() {
        return (q, answer) -> answer.length() > 50 ? 10 : 2; // Essay points: Max 10
    }
}