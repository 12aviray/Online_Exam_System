package questions;
import sources.QuestionSource;

public interface QuestionFactory {
    Question createQuestion();
    QuestionRenderer createRenderer();
    QuestionEvaluator createEvaluator();
}