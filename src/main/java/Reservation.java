
import java.util.Objects;

public class Reservation {
    private final String movieName;
    private final String showtime;
    private final String date;
    private final String seatNumber;
    private final String runningTime;

    public Reservation(String date, String movieName, String showtime, String seatNumber, String runningTime) {
        this.date = date;
        this.movieName = movieName;
        this.showtime = showtime;
        this.seatNumber = seatNumber;
        this.runningTime = runningTime;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        Reservation that = (Reservation) o;
        return Objects.equals(date, that.date) && Objects.equals(seatNumber, that.seatNumber);
    }
    @Override
    public int hashCode() {
        
        return Objects.hash(date, seatNumber);
    }
    
    public String getMovieName() {
        return movieName;
    }
    public String getShowtime() {
        return showtime;
    }
    public String getDate() {
        return date;
    }
    
    public String getSeatNumber() {
        return seatNumber;
    }
    public String getRunningTime() {
        return runningTime;
    }
}