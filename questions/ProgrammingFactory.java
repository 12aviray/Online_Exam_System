package questions;
import sources.QuestionSource;

public class ProgrammingFactory implements QuestionFactory {
    private QuestionSource source;
    public ProgrammingFactory(QuestionSource source) { this.source = source; }

    @Override
    public Question createQuestion() {
        String text = source.getQuestionData("Programming");
        return new Question() {
            @Override public String getType() { return "Programming"; }
            @Override public String getText() { return text; }
        };
    }

    @Override
    public QuestionRenderer createRenderer() {
        return q -> System.out.println("[Code Editor UI] Solve: " + q.getText());
    }

    @Override
    public QuestionEvaluator createEvaluator() {
        return (q, answer) -> answer.contains("public static void main") ? 20 : 0; // Max 20
    }
}