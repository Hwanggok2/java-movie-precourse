package movie;
public enum Column {
    ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5);
    
    private final int number;
    
    Column(int number) {
        this.number = number;
    }
    
    public int getNumber() {
        return number;
    }
}
