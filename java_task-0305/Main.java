import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        String d = " ";
        calendar(d);

    }
    public static void calendar(String l) {
        Calendar calendar = new GregorianCalendar(1997, Calendar.MAY, 17);
        Date date = calendar.getTime();
        l = String.valueOf(date);
        System.out.print(l);
    }
}
//05
