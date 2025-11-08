
public class Reservation_no {
    private static String[] reservations = new String[100]; 
    private static int reservationCount = 0;

    String movieName;
    String showtimes;
    String date;
    String seat_number;

    public Reservation_no(String date, String movieName, String showtimes, String seat_number) {
        this.date = date;
        this.movieName = movieName;
        this.showtimes = showtimes;
        this.seat_number = seat_number;
       
    }
    public boolean isDuplicateReservation(String[] reservations, String newReservation) {
        for (int i = 0; i < reservationCount; i++) {
            if (reservations[i] != null && reservations[i].equals(newReservation)) {
                return true; 
            }
        }
        return false; 
    }
    public void create_reservation(String newReservation) {
        if (isDuplicateReservation(reservations, newReservation)) {
            System.out.println("failed");
            return;
        }
        if (reservationCount >= reservationCount) {
            System.out.println("failed");
            return;
        }
        reservations[reservationCount] = newReservation;
        reservationCount++;
        System.out.println("reservations success"+newReservation);
    }
}

