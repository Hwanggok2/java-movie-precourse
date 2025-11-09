package movie;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.assertj.core.api.Assertions.assertThat;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MovieDayTest {
    @Test
    void 무비데이는_10일_20일_30일이_아니면_예외가_발생한다(){
        var day = LocalDate.of(2025, 11, 11);
        assertThrows(IllegalArgumentException.class, () -> {
            new MovieDay(day);
        });
    }

    @ValueSource(ints = {10, 20, 30})
    @ParameterizedTest 
    void 무비데이_할인은_10퍼센트_적용한다(int dayOfMonth){
        int originalPrice = 18000;
        double discountRate = 0.1;
        int expectedPrice = (int)(originalPrice * (1 - discountRate));
        MovieDay movieDay = new MovieDay(LocalDate.of(2025, 11, dayOfMonth)); 
        int actualPrice = movieDay.applyDiscount(originalPrice);
        assertThat(actualPrice).isEqualTo((int)expectedPrice);
    }
}

