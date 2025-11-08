
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.assertj.core.api.Assertions.assertThatThrownBy; 

class ReservationsTest {

    @Test
    void isDuplicateD() {
        // Arrange
        Reservations reservations = new Reservations();
        Reservation existingReservation = new Reservation("2025-12-10", "MovieA", "14:00", "A1", "120");
        Reservation duplicateSeat = new Reservation("2025-12-10", "MovieB", "18:00", "A1", "90"); 
        
        reservations.add(existingReservation);

        assertThatThrownBy(() -> reservations.add(duplicateSeat))
            .isInstanceOf(IllegalArgumentException.class); 
            
        assertThat(reservations.size()).isEqualTo(1);
    }
    
    @Test
    void time_du() {
        // Arrange
        Reservations reservations = new Reservations();
        
        Reservation res1 = new Reservation("2025-12-10", "MovieA", "14:00", "A1", "120");
   
        Reservation res2_overlap = new Reservation("2025-12-10", "MovieB", "15:00", "B2", "90");

        reservations.add(res1);

        // Act & Assert
        assertThatThrownBy(() -> reservations.add(res2_overlap))
            .isInstanceOf(IllegalArgumentException.class);
            
        assertThat(reservations.size()).isEqualTo(1);
    }
    @Test
    void du() {
        // Arrange
        Reservations reservations = new Reservations();
        
        Reservation res1 = new Reservation("2025-12-10", "MovieA", "14:00", "A1", "120");
       
        Reservation res2_success = new Reservation("2025-12-10", "MovieB", "16:00", "B2", "90");

        // Act
        reservations.add(res1);
        reservations.add(res2_success); 

        // Assert
        assertThat(reservations.size()).isEqualTo(2); 
    }
}