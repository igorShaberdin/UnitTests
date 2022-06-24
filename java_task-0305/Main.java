import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(1997, Calendar.MAY, 17);
            Date date = calendar.getTime();
            System.out.println(date);
        }
    }
