package builder;

public class ExamConfiguration {
    public String title;
    public int duration;
    public int passingScore;
    public boolean negativeMarking;
    public boolean questionShuffle;
    public boolean autoSubmit;
    public boolean calculatorAllowed;

    @Override
    public String toString() {
        return "Title: " + title + "\n" +
                "Duration: " + duration + " minutes\n" +
                "Passing Score: " + passingScore + " Marks\n" +
                "Configuration Profiles:\n" +
                (negativeMarking ? " ✓" : " ✗") + " Negative Marking Enabled\n" +
                (questionShuffle ? " ✓" : " Question Shuffle Activated\n") +
                (calculatorAllowed ? " ✓" : " ✗") + " Embedded Calculator Allowed\n" +
                (autoSubmit ? " ✓" : " ✗") + " Auto-Submit On Timeout";
    }
}