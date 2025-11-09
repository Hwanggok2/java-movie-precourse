package movie;

import java.time.LocalDate;

public class MovieDay {
    public MovieDay(LocalDate date) {
        int dayOfMonth = date.getDayOfMonth();
        if (dayOfMonth != 10 && dayOfMonth != 20 && dayOfMonth != 30) {
            throw new IllegalArgumentException("무비데이는 매월 10일, 20일, 30일입니다.");
        }
    }
    public int applyDiscount(int originalPrice) {
        double discountRate = 0.1;
        return (int)(originalPrice * (1 - discountRate));
    }
}