
import java.util.ArrayList;
import java.util.List;

public class Reservations {
    private final List<Reservation> reservations = new ArrayList<>();
 
    private final ShowTimeChecker timeChecker = new ShowTimeChecker(); 

    public void add(Reservation newReservation) {
        
       
        if (isDuplicate(newReservation)) {
         
            throw new IllegalArgumentException("이미 예약된 좌석이거나 시간이 겹치는 상영입니다.");
        }
        
        reservations.add(newReservation);
    }
    
    public boolean isDuplicate(Reservation newReservation) { 
      
        for (Reservation existingReservation : reservations) {
            
            if (existingReservation.equals(newReservation)) { 
                return true; 
            }
            
            if (timeChecker.isTimeDuplicate(existingReservation, newReservation)) { 
                return true; 
            }
        }
        
        return false;
    }

    public int size() {
        return reservations.size();
    }
}