
interface ParkingCharge {
    double calculateCharge();
    void displayParkingDetails();
}


class VehicleParking {
    protected String vehicleNumber;
    protected String vehicleType;
    protected double parkingHours;

    public VehicleParking(String vehicleNumber, String vehicleType, double parkingHours) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.parkingHours = parkingHours;
    }
}


class TwoWheeler extends VehicleParking implements ParkingCharge {
    public TwoWheeler(String vehicleNumber, double parkingHours) {
        super(vehicleNumber, "Two Wheeler", parkingHours);
    }

    @Override
    public double calculateCharge() {
        if (parkingHours <= 2) {
            return parkingHours * 20;
        } else {
            return (2 * 20) + ((parkingHours - 2) * 10);
        }
    }

    @Override
    public void displayParkingDetails() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type   : " + vehicleType);
        System.out.println("Parking Hours  : " + parkingHours + " hrs");
        System.out.println("Total Charge   : Rs. " + calculateCharge());
        System.out.println("----------------------------------------");
    }
}


class FourWheeler extends VehicleParking implements ParkingCharge {
    public FourWheeler(String vehicleNumber, double parkingHours) {
        super(vehicleNumber, "Four Wheeler", parkingHours);
    }

    @Override
    public double calculateCharge() {
        if (parkingHours <= 2) {
            return parkingHours * 50;
        } else {
            return (2 * 50) + ((parkingHours - 2) * 30);
        }
    }

    @Override
    public void displayParkingDetails() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type   : " + vehicleType);
        System.out.println("Parking Hours  : " + parkingHours + " hrs");
        System.out.println("Total Charge   : Rs. " + calculateCharge());
        System.out.println("----------------------------------------");
    }
}


public class ParkingSystemMain {
    public static void main(String[] args) {
        
        ParkingCharge parkingRef;

        System.out.println("--- Two Wheeler Parking Details ---");
        parkingRef = new TwoWheeler("KA-05-AB-1234", 4.5);
        parkingRef.displayParkingDetails();

        System.out.println("--- Four Wheeler Parking Details ---");
        parkingRef = new FourWheeler("KA-01-MJ-5678", 5.0);
        parkingRef.displayParkingDetails();
    }
}