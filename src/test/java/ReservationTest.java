import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ReservationTest {

    @Test
    void daydu() {
        Reservation res1 = new Reservation("2025-12-10", "MovieA", "14:00", "A1", "120");
        Reservation res2 = new Reservation("2025-12-10", "MovieB", "15:00", "A1", "90"); 

        assertThat(res1.equals(res2)).isTrue();
        assertThat(res1.hashCode()).isEqualTo(res2.hashCode());
    }
    
    @Test
    void day_notdu() {
        Reservation res1 = new Reservation("2025-12-10", "MovieA", "14:00", "A1", "100");
        Reservation res2 = new Reservation("2025-12-11", "MovieA", "14:00", "A1", "100"); 

        assertThat(res1.equals(res2)).isFalse();
    }
}