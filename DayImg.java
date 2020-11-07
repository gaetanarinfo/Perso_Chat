import java.util.Calendar;
import java.util.Date;

public class DayImg {

    public static String DayByImg(){

        Date DateDuJour = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(DateDuJour);

            String resultmonth;

            switch (calendar.get(Calendar.MONTH)) {
                case 0:  resultmonth = "0";
                         break;
                case 1:  resultmonth = "1";
                         break;
                case 2:  resultmonth = "2";
                         break;
                case 3:  resultmonth = "3";
                         break;
                case 4:  resultmonth = "4";
                         break;
                case 5:  resultmonth = "5";
                         break;
                case 6:  resultmonth = "6";
                         break;
                case 7:  resultmonth = "7";
                         break;
                case 8:  resultmonth = "8";
                         break;
                case 9: resultmonth = "9";
                         break;
                case 10: resultmonth = "10";
                         break;
                case 11: resultmonth = "11";
                         break;
                default: resultmonth = "0";
                         break;
            }

    return resultmonth;
    }
}
