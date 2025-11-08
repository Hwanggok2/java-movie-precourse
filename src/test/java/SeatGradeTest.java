
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

class SeatGradeTest {

    @ParameterizedTest
    @CsvSource(value = {
        "0, S",  
        "1, S",  
        "2, A",  
        "4, A",  
        "5, B",  
        "9, B"   
    })
    void grade_good(int rowIndex, String expectedGrade) {
        
        SeatGrade grader = new SeatGrade();

        String actualGrade = grader.getGrade(rowIndex);

        assertThat(actualGrade).isEqualTo(expectedGrade);
    }
}