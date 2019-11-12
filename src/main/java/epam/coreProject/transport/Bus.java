package epam.coreProject.transport;

public class Bus {
    private int transportId;
    private int transportCost;
    private int mass;
    private int maxSpeed;
    private Integer fuelConsumption;
    private int passengers;

    public Bus(int transportId, int transportCost, int mass, int maxSpeed, Integer fuelConsumption, int passengers) {
        this.transportId = transportId;
        this.transportCost = transportCost;
        this.mass = mass;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.passengers = passengers;
    }

    public int getTransportId() {
        return transportId;
    }

    public void setTransportId(int transportId) {
        this.transportId = transportId;
    }

    public int getTransportCost() {
        return transportCost;
    }

    public void setTransportCost(int transportCost) {
        this.transportCost = transportCost;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Integer getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(Integer fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "transportId=" + transportId +
                ", transportCost=" + transportCost +
                ", mass=" + mass +
                ", maxSpeed=" + maxSpeed +
                ", fuelConsumption=" + fuelConsumption +
                ", passengers=" + passengers +
                '}';
    }
}
