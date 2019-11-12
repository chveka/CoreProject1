package epam.coreProject.transport;

public class Trolleybus {
    private int transportId;
    private int transportCost;
    private int mass;
    private int maxSpeed;
    private Integer energyConsumption;
    private int passengers;

    public Trolleybus(int transportId, int transportCost, int mass, int maxSpeed, Integer energyConsumption, int passengers) {
        this.transportId = transportId;
        this.transportCost = transportCost;
        this.mass = mass;
        this.maxSpeed = maxSpeed;
        this.energyConsumption = energyConsumption;
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

    public Integer getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(Integer energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Trolleybus{" +
                "transportId=" + transportId +
                ", transportCost=" + transportCost +
                ", mass=" + mass +
                ", maxSpeed=" + maxSpeed +
                ", energyConsumption=" + energyConsumption +
                ", passengers=" + passengers +
                '}';
    }
}
