package questions;

class MCQ implements Question { public String getType() { return "MCQ"; } }

class MCQRenderer implements QuestionRenderer {
    public void render(Question q) { System.out.println("- [Type: " + q.getType() + "] Points: 2 Difficulty: Medium"); }
}

class MCQEvaluator implements QuestionEvaluator {
    public int evaluate(Question q, String answer) { return 2; }
}

public class MCQFactory implements QuestionFactory {
    public Question createQuestion() { return new MCQ(); }
    public QuestionRenderer createRenderer() { return new MCQRenderer(); }
    public QuestionEvaluator createEvaluator() { return new MCQEvaluator(); }
}