import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

class SeatNumberTest {

    @ParameterizedTest
    @CsvSource(value = {
        "0, 0, A1, S, 18000",   
        "0, 1, A2, S, 18000",  
        "4, 5, E6, A, 15000",  
        "9, 9, J10, B, 12000"   
    })
    void seat_precison(
        int rowIndex, int colIndex, String expectedNumber, String expectedGrade, int expectedPrice) {
        
      
        SeatNumber seat = new SeatNumber(rowIndex, colIndex);

        assertThat(seat.getGrade()).isEqualTo(expectedGrade);
        assertThat(seat.getPrice()).isEqualTo(expectedPrice);
        assertThat(seat.getSeatNumber()).isEqualTo(expectedNumber);

    }
}