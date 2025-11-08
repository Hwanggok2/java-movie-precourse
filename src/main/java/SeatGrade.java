
public class SeatGrade {
    public String getGrade(int i) {
        if (i < 2) {
            return "S";
        }
        if (i >= 2 && i < 5){
            return "A";
        }
        return "B";
    }
}
