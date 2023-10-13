package Task6_05;

public class Worker {
    private String fullName;
    private String jobPosition;
    private int startingYear;

    @Override
    public String toString() {
        return "\nfullName: " + fullName +
                ", jobPosition: " + jobPosition +
                ", startingYear: " + startingYear;
    }

    public Worker(String fullName, String jobPosition, int startingYear) {
        this.fullName = fullName;
        this.jobPosition = jobPosition;
        this.startingYear = startingYear;
    }

    public Worker() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public int getStartingYear() {
        return startingYear;
    }

    public void setStartingYear(int startingYear) {
        this.startingYear = startingYear;
    }
}
