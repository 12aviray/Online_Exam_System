package questions;
import sources.QuestionSource;

public class MCQFactory implements QuestionFactory {
    private QuestionSource source;

    public MCQFactory(QuestionSource source) {
        this.source = source;
    }

    @Override
    public Question createQuestion() {
        String text = source.getQuestionData("MCQ");
        return new Question() {
            @Override public String getType() { return "MCQ"; }
            @Override public String getText() { return text; }
        };
    }

    @Override
    public QuestionRenderer createRenderer() {
        return q -> System.out.println("[Rendering MCQ] " + q.getText());
    }

    @Override
    public QuestionEvaluator createEvaluator() {
        return (q, answer) -> answer.equalsIgnoreCase("A") ? 2 : 0; // MCQ points: 2
    }
}