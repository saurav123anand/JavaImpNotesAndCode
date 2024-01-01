import java.util.ArrayList;
import java.util.List;

public class HotelService {
    List<Hotel> hotels=new ArrayList<>();
    public HotelService(){
        hotels.add(new Hotel(2000,2,HotelType.THREE_STAR));
        hotels.add(new Hotel(1000,1,HotelType.THREE_STAR));
        hotels.add(new Hotel(10000,4,HotelType.FOUR_STAR));
        hotels.add(new Hotel(20000,5,HotelType.FIVE_STAR));
        hotels.add(new Hotel(5000,3,HotelType.FOUR_STAR));
    }
//    public List<Hotel> filterHotelsLessThan(int price){
//        List<Hotel> filteredHotels=new ArrayList<>();
//        for (Hotel hotel:hotels){
//            if (isPriceLessThan(hotel,price))
//                filteredHotels.add(hotel);
//        }
//        return filteredHotels;
//    }
//    public List<Hotel> filterHotelsBy5Star(){
//        List<Hotel> filteredHotels=new ArrayList<>();
//        for (Hotel hotel:hotels){
//            if (isHotel5Star(hotel))
//                filteredHotels.add(hotel);
//        }
//        return filteredHotels;
//    }
//
//    private boolean isHotel5Star(Hotel hotel) {
//        return hotel.getHotelType()==HotelType.FIVE_STAR;
//    }
//
//    public boolean isPriceLessThan(Hotel hotel,int price){
//        return hotel.getPricePerNight()<=price;
//    }

    public List<Hotel> filterHotels(FilteringCondition filteringCondition){
        List<Hotel> filteredHotels=new ArrayList<>();
        for (Hotel hotel:hotels){
            if (filteringCondition.test(hotel))
                filteredHotels.add(hotel);
        }
        return filteredHotels;
    }
}
