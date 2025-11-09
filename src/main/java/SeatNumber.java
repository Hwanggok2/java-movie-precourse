public class SeatNumber {
    private final Row row;
    private final Column column;

    public SeatNumber(Row row, Column column) {
        this.row = row;
        this.column = column;
    }
    public Row getRow() {
        return row;
    }
    public Column getColumn() {
        return column;
    }
    public String toString() {
        return row + "-" + column;
    }
}
