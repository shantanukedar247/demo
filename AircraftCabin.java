package alm.demo.java;

public  class AircraftCabin {

    private AircraftCabinClass cabinClass;
    private int seatsCapacity;
    private int availableSeats;
    public static final int MAX_SEATS_PER_RESERVATION = 10;

    public AircraftCabin(AircraftCabinClass cabinClass, int seatsCapacity) {
        this.cabinClass = cabinClass;
        this.seatsCapacity = seatsCapacity;
        this.availableSeats = seatsCapacity;
    }

    public AircraftCabinClass getCabinClass() {
        return cabinClass;
    }

    public int getSeatsCapacity() {
        return seatsCapacity;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    /**
     * Reserves seats in the aircraft cabin.
     *
     * @param numberOfSeats the number of seats to reserve
     * @return the number of available seats after the reservation
     * @throws Exception if the reservation fails
     */
    public int reserveSeats(int numberOfSeats) throws Exception {
        // Check if there are enough available seats
if (numberOfSeats > MAX_SEATS_PER_RESERVATION) {
    throw new Throwable("Too many seats requested. Max is " + MAX_SEATS_PER_RESERVATION + " seats.");
}

        // Check if the number of seats is too large
        if (availableSeats < numberOfSeats) {
            throw new Exception("Not enough seats available");
        }
        // Reduce the available seats by the number of seats being reserved
        availableSeats = availableSeats -  numberOfSeats;

        //return the number of available seats after the reservation
        return availableSeats;
    }























    public static void main(String[] args) {

        AircraftCabinClass cabinClass = AircraftCabinClass.BUSINESS;
        int seatsCapacity = 16;
        AircraftCabin cabin = new AircraftCabin(cabinClass, seatsCapacity);


        try {
            int availableSeatsBefore = cabin.getAvailableSeats();
            cabin.reserveSeats(5);
            int availableSeatsAfter = cabin.getAvailableSeats();
            System.out.println("After reservation available seats down by: " + (availableSeatsBefore - availableSeatsAfter));

        } catch (Exception e) {
            System.out.println("Failed to reserve seats: " + e.getMessage());
            throw new RuntimeException(e);
        }

    }


}
