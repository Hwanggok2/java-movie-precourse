
public class Movie { 
    String movie_name;
    int runningTime = 120;
    int showTimes; // 8~10, 11~13, 13~15, 17~19, 20~22, 23~01, 02~04, 05~07
                        // 9~11, 12~14, 15~17, 19~21, 22~00, 01~03, 04~05, 07~09
    int theater_close_time = 23;
    
    public Movie(String movie_name, int runningTime, int showTimes) {
        this.runningTime = runningTime;
        this.showTimes = showTimes;
        this.movie_name = movie_name;
    }
}