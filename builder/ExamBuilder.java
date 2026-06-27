package builder;

public class ExamBuilder {
    private ExamConfiguration config = new ExamConfiguration();

    public ExamBuilder setTitle(String title) { config.title = title; return this; }
    public ExamBuilder setDuration(int duration) { config.duration = duration; return this; }
    public ExamBuilder setPassingScore(int score) { config.passingScore = score; return this; }
    public ExamBuilder setNegativeMarking(boolean val) { config.negativeMarking = val; return this; }
    public ExamBuilder setShuffle(boolean val) { config.questionShuffle = val; return this; }
    public ExamBuilder setAutoSubmit(boolean val) { config.autoSubmit = val; return this; }
    public ExamBuilder setCalculator(boolean val) { config.calculatorAllowed = val; return this; }

    public ExamConfiguration build() {
        return config;
    }
}