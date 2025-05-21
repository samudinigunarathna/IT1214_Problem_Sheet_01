class Vehicle{
    private String licensePlate;
    private String ownerName;
    private int hoursParked;

    void Vehicle(String licensePlate, String ownerName, int hoursParked){
      this.licensePlate=licensePlate;
      this.ownerName=ownerName;
      this.hoursParked=hoursParked;  
    }

    String getLicensePlate() {
        return licensePlate;
    }

    String getOwnerName() {
        return ownerName;
    }

    int getHoursParked(){
        return hoursParked;
    }

    void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    void setHoursParked(int hoursParked) {
        this.hoursParked = hoursParked;
    }

    String displayVehicle() {
        return "License Plate: " + licensePlate + ", Owner: " + ownerName + ", Hours Parked: " + hoursParked;
    }
}

class ParkingLot {
    private Vehicle[] vehicles;
    private int vehicleCount;

    public ParkingLot() {
        vehicles = new Vehicle[5];
        vehicleCount = 0;
    }

     public void parkVehicle(Vehicle v) {
        if (vehicleCount < vehicles.length) {
            vehicles[vehicleCount] = v;
            vehicleCount++;
        } else {
            System.out.println("Parking lot is full. Cannot park new vehicle.");
        }
    }

    public void removeVehicle(String licensePlate) {
       
        for (int i = 0; i < vehicleCount; i++) {
            if (vehicles[i].getLicensePlate().equals(licensePlate)) {
                for (int j = i; j < vehicleCount - 1; j++) {
                    vehicles[j] = vehicles[j + 1];
                }

                vehicles[vehicleCount - 1] = null;
                vehicleCount;
                System.out.println("Vehicle with license plate " + licensePlate + " removed.");
                break;
            }
        }
        if (!found) {
            System.out.println("Vehicle with license plate " + licensePlate + " not found.");
        }
    }

    public void displayVehicles() {
        System.out.println("\nVehicles currently parked:");
        for (int i = 0; i < vehicleCount; i++) {
            System.out.println(vehicles[i]);
        }
    }
}

class App{
    public static void main(String[] args){
        ParkingLot lot = new ParkingLot();
        lot.parkVehicle(new Vehicle("ABC123", "John Doe", 2));
        lot.parkVehicle(new Vehicle("XYZ789", "Jane Smith", 4));
        lot.parkVehicle(new Vehicle("LMN456", "Bob Brown", 1));
        
        lot.removeVehicle("XYZ789");

        lot.displayVehicles();
    }
}
