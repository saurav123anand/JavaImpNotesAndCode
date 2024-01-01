import java.util.List;
import java.util.function.*;
import java.util.logging.Filter;

public class Main {
    private int field;
    public List<Hotel> testLambda(){
        int PRICE=2000;
        HotelService hotelService=new HotelService();
        FilteringCondition lambda=hotel -> {
           // this.field=345; // here this represents Main class object
           // PRICE++ // we can't do this--> variable should be final
            return hotel.getPricePerNight()<=PRICE;
        };
        return hotelService.filterHotels(lambda);

    }
    public static void main(String[] args) {
       HotelService hotelService=new HotelService();
//       List<Hotel> hotels=hotelService.filterHotels(new FilteringCondition() {
//           @Override
//           public boolean test(Hotel hotel) {
//               return hotel.getPricePerNight()<=2000;
//           }
//       });

        // using lambda
//        List<Hotel> hotels=hotelService.filterHotels((Hotel hotel)->{
//            return hotel.getPricePerNight()<=2000;
//        });
//        System.out.println("List of hotels price less than 2000 "+hotels);
//
//        List<Hotel> fiveStars=hotelService.filterHotels(new FilteringCondition() {
//            @Override
//            public boolean test(Hotel hotel) {
//                return hotel.getHotelType()==HotelType.FIVE_STAR;
//            }
//        });
//        System.out.println(fiveStars);

        // Types of functional interface *************

//        Predicate<Integer> predicate=(val)->val%2==0;
//        System.out.println(predicate.test(7));
//
//        BiPredicate<Integer,Integer> predicate2=(val1,val2)->val1%val2==0;
//        System.out.println(predicate2.test(14,7));

//          List<Integer> list=List.of(1,2,3,4,7);
//          Consumer<Integer> consumer=a-> System.out.println(a);
//          consumer.accept(5);
//          list.forEach(consumer);

//        Supplier<String> supplier=()->"Hello I'm supplier";
//        System.out.println(supplier.get());

        Function<Integer,String> function=(val)->"String value is "+String.valueOf(val);
        System.out.println(function.apply(6));

    }
}