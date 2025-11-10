package movie;

import java.time.LocalTime;

public class TimeBased {
    private final LocalTime time;

    public TimeBased(LocalTime time) {
        this.time = time;
    }
    public boolean isDiscountTime() {
        return time.isBefore(LocalTime.of(11, 1, 0))  || time.isAfter(LocalTime.of(19, 59, 0));
    }
    
    public int applyDiscount(int originalPrice) {
        return originalPrice - 2000;
    }
}
