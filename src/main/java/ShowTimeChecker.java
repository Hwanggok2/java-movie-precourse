
import java.time.LocalTime;

public class ShowTimeChecker {
    
    public boolean isTimeDuplicate(Reservation existing, Reservation newRes) {
       
        if (!existing.getDate().equals(newRes.getDate())) {
            return false;
        }
        int existingStart = timeToMinutes(existing.getShowtime());
        int existingEnd = existingStart + Integer.parseInt(existing.getRunningTime());

        int newStart = timeToMinutes(newRes.getShowtime());
        int newEnd = newStart + Integer.parseInt(newRes.getRunningTime());
        
     
        if (newStart < existingEnd && existingStart < newEnd) {
             return true;
        }
        return false;
    }

    private int timeToMinutes(String timeString) {
        LocalTime time = LocalTime.parse(timeString);
        return time.getHour() * 60 + time.getMinute();
    }
}