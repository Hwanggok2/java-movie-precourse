import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

class MoviedayTest {

    @ParameterizedTest
    @CsvSource(value = {
        "10, true",  
        "20, true",  
        "30, true",  
        "15, false", 
        "31, false", 
        "1, false"   
    })
    void a(int day, String expectedResultString) {
        
        boolean expectedResult = Boolean.parseBoolean(expectedResultString); 
        Movieday movieDayChecker = new Movieday();

        boolean actualResult = movieDayChecker.isMovieDay(day);

        assertThat(actualResult).isEqualTo(expectedResult);
    }
}