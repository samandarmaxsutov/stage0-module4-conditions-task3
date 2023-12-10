package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {

        String season;
        if (month==1||month==2||month==12){
            season="Winter";
        } else if (month>=3&&month<=5) {
            season="Spring";
        } else if (month>=6&&month<=7) {
            season="Summer";
        }else if (month>=8&&month<=9) {
            season="Autumn";
        }else season= "wrong number!";

        System.out.println(season);

    }
}
