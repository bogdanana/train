package train;
import java.text.SimpleDateFormat;
import java.util.Date;
class train2 {
    public static String date2;
    public static  void logDate(){
        System.out.println(date2);
    }
    public static String setDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyyHHmmss");
        Date currentDate = new Date();
        return date2 = dateFormat.format(currentDate);
    }
}
