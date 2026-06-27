package builder;

public class ExamConfiguration {
    public String title;
    public int duration;
    public int passingScore;
    public boolean negativeMarking;
    public boolean questionShuffle;
    public boolean autoSubmit;
    public boolean calculatorAllowed;

    // print the configuration(dashboard)
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Passing Score: " + passingScore + " Marks");
        System.out.println("Configuration Profiles:");
        System.out.println((negativeMarking ? "✓" : "✗") + " Negative Marking Enabled");
        System.out.println((questionShuffle ? "✓" : "✗") + " Question Shuffle Activated");
        System.out.println((calculatorAllowed ? "✓" : "✗") + " Embedded Calculator Allowed");
        System.out.println((autoSubmit ? "✓" : "✗") + " Auto-Submit On Timeout");
    }
}