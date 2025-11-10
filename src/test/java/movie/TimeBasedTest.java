package movie;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.assertj.core.api.Assertions.assertThat;
import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TimeBasedTest {
    @Test
    void 할인_시간대인지_확인하는_메서드() {
        var time = LocalTime.of(20, 5, 0);
        TimeBased timeBased = new TimeBased(time);
        boolean isDiscountTime = timeBased.isDiscountTime();
        assertThat(isDiscountTime).isTrue();
    }
    @Test
    void 시간_할인은_2000원 (){
        int originalPrice = 20000;
        int discount = 2000;
        int expectedPrice = originalPrice - discount;
        TimeBased timeBased = new TimeBased(LocalTime.of(19, 5, 0)); 
        int actualPrice = timeBased.applyDiscount(originalPrice);
        assertThat(actualPrice).isEqualTo(expectedPrice);
    }
}

