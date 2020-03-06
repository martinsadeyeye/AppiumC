import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {

        Date date = new Date();
        String currentDate = date.toString();
        //System.out.println(currentDate);

//https://www.tutorialspoint.com/java/java_date_time.htm
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("M/dd/yyyy");
        System.out.println(simpleDateFormat.format(date));
        //System.out.println(date.toString());



        //Calendar date
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDFormat = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
        System.out.println(simpleDFormat.format(calendar.getTime()));




    }
}
