

// public class Seat {
//     private String[][] seatType = new String[10][10];
    
//     public String seat_type(int i) {
//         String currentType = "B";

//         if (i < 2) {
//             currentType = "S";
//         }
//         if (i >= 2 && i < 5){
//             currentType = "A";
//         }
//         return currentType;
//     }
//     public void seat_create() {
        
//         for (int i = 0; i < 10; i++) {
//             char rowChar = (char) ('A' + i);
//             String currentType = seat_type(i);

//             for (int j = 0; j < 10; j++) {
//                 String seat_number = String.valueOf(rowChar) + (j+1);
//                 seatType[i][j] = currentType;
//                 System.out.printf("%s ", seat_number);
//             }
//             System.out.println();
//         }
//     }
// }
