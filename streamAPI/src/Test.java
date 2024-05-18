import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        ZoneId zoneId=ZoneId.of("America/New_York");
//        LocalDate localDate=LocalDate.now(zoneId);
//        System.out.println("start date is "+startDate(localDate));
//        System.out.println("end date is "+endDate(localDate));

        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(14);
        int val=list.remove((list.size()-1)/2);
        System.out.println(list);
        System.out.println(val);
    }
//   public static String startDate(LocalDate localDate){
//       int year;
//       int month;
//       int day=1;
//       if (localDate.getMonthValue()<=6){
//           year = localDate.getYear() - 1;
//           month = 7;
//       }
//       else{
//           year = localDate.getYear();
//           month = 1;
//       }
//       return year+"-0"+month+"-0"+day;
//   }
//
//    public static String endDate(LocalDate localDate){
//        if (localDate.getMonthValue()<=6){
//            int year=localDate.getYear()-1;
//            int month=12;
//            int day=31;
//            return year+"-"+month+"-"+day;
//        }
//        else{
//            int year=localDate.getYear();
//            int month=6;
//            int day=30;
//            return year+"-0"+month+"-"+day;
//        }
//    }
}
