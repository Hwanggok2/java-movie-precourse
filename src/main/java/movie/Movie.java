package movie;
public class Movie {
    private final String title;
    private final int runningTime;

    public Movie(String title, int runningTime) {
        this.title = title;
        this.runningTime = runningTime;
    }

    public String getTitle() {
        return title;
    }   

    public int getRunningTime() {
        return runningTime;
    }
}
