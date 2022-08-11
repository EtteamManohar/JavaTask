
import java.util.*;
public class Holiday
{
    private String name;
    private int day;
    private String month;

    public Holiday(String n, int d, String m)
    {
        name = n;
        day = d;
        month = m;
    }

    public  boolean inSameMonth(Holiday holiday) {
        return this.month.equals(holiday.month);
    }

    public  double avgDate(Holiday[] holiday) {
        int sum = 0;
        for (int i = 0; i < holiday.length; i++) {
            sum = sum + holiday[i].day;
        }
        return ((double) sum) / holiday.length;
    }

    public static void main(String[] args)
    {
        Holiday holiday = new Holiday("Independence Day", 4, "July");
        System.out.print("Value :"+holiday.inSameMonth(holiday));
        Holiday[] k = new Holiday[1];
        k[0].day=1;
        k[0].month="july";
        k[0].name="Ramzan";
        System.out.print("Value :"+holiday.avgDate(k));


    }
}
