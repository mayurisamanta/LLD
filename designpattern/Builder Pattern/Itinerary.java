public class Itinerary {

    private String flight;

    private String hotel;

    private String stay;

    private String tour;

    private String insurance;

    private Boolean carRental;

    private Itinerary(ItineraryBuilder builder) {
        this.flight = builder.flight;
        this.hotel = builder.hotel;
        this.stay = builder.stay;
        this.tour = builder.tour;
        this.insurance = builder.insurance;
        this.carRental = builder.carRental;
    }

    @Override
    public String toString() {
        return "Itinerary{" +
                "flight='" + flight + '\'' +
                ", hotel='" + hotel + '\'' +
                ", stay='" + stay + '\'' +
                ", tour='" + tour + '\'' +
                ", insurance='" + insurance + '\'' +
                ", carRental=" + carRental +
                '}';
    }

    public static class ItineraryBuilder {

        private String flight;

        private String hotel;

        private String stay;

        private String tour;

        private String insurance;

        private Boolean carRental;

        public ItineraryBuilder setFlight(String flight) {
            this.flight = flight;
            return this;
        }

        public ItineraryBuilder setHotel(String hotel) {
            this.hotel = hotel;
            return this;
        }

        public ItineraryBuilder setStay(String stay) {
            this.stay = stay;
            return this;
        }

        public ItineraryBuilder setTour(String tour) {
            this.tour = tour;
            return this;
        }

        public ItineraryBuilder setInsurance(String insurance) {
            this.insurance = insurance;
            return this;
        }

        public ItineraryBuilder setCarRental(Boolean carRental) {
            this.carRental = carRental;
            return this;
        }



        public Itinerary build() {
            return new Itinerary(this);
        }

    }
}
