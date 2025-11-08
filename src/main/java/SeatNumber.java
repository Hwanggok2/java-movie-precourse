
public class SeatNumber {
    private String seatNumber;
    private String grade;
    private int price;

    public SeatNumber(int row, int col){
        char rowChar = (char) ('A' + row);
        this.seatNumber = String.valueOf(rowChar) + (col + 1);
        
        SeatGrade seatGrade = new SeatGrade();
        this.grade = seatGrade.getGrade(row);

        this.price = getPrice(this.grade);
    }
    int getPrice(String grade) {
        if (grade.equals("S"))
            return 18000;
        if (grade.equals("A"))
            return 15000;
        return 12000;
    }
    public String getGrade() {
        return grade;
    }
    public String getSeatNumber() {
        return seatNumber;
    }
    public int getPrice() {
        return price;
    }
}