public class Main {

    public static void main(String[] args) {

        Itinerary businessTrip = new Itinerary.ItineraryBuilder()
                .setFlight("Flight from NYC to SF")
                .setHotel("Downtown SF Hotel")
                .setStay("3 days")
                .setTour("City tour")
                .setCarRental(true)
                .build();

        System.out.println(businessTrip);

    }

}
