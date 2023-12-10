package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        String day=switch (month) {
            case 2->"28";
            case 1,12,3,5,7,8,10->"31";
            case 4,6,9,11->"30";
            default -> "wrong number!";
        };
        System.out.println(day);
    }
}
