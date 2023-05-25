import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;

public class Temp {
    public static void main(String[] args) {

        Year y = Year.of(2015);
        LocalDate ld = y.atMonthDay(MonthDay.of(4, 30));
        System.out.println(ld);
    }




}
