package movie;
public class Seat {
    private final SeatNumber seatNumber;
    private final SeatGrade seatGrade;

    public Seat(SeatNumber seatNumber, SeatGrade seatGrade) {
        this.seatNumber = seatNumber;
        this.seatGrade = seatGrade;
    }

    public SeatNumber getSeatNumber() {
        return seatNumber;
    }

    public SeatGrade getSeatGrade() {
        return seatGrade;
    }
}
