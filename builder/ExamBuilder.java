package builder;

public class ExamBuilder {
    private ExamConfiguration config = new ExamConfiguration();

    public ExamBuilder setTitle(String title) {
        config.title = title;
        return this;
    }

    public ExamBuilder setDuration(int minutes) {
        config.duration = minutes;
        return this;
    }

    public ExamBuilder setPassingScore(int score) {
        config.passingScore = score;
        return this;
    }

    public ExamBuilder setNegativeMarking(boolean b) {
        config.negativeMarking = b;
        return this;
    }

    public ExamBuilder setQuestionShuffle(boolean b) {
        config.questionShuffle = b;
        return this;
    }

    public ExamBuilder setAutoSubmit(boolean b) {
        config.autoSubmit = b;
        return this;
    }

    public ExamBuilder setCalculator(boolean b) {
        config.calculatorAllowed = b;
        return this;
    }

    public ExamConfiguration build() {
        return config;
    }
}