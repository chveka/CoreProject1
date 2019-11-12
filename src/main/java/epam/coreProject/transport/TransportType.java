package epam.coreProject.transport;

public enum TransportType {
    ROUTE_01(1, "Bus", 1022156, 3026, 160, 14, null,150),
    ROUTE_02(2, "Taxibus", 604000, 2500, 180, 12, null, 30),
    ROUTE_03(3, "Taxibus", 604000, 2500, 180, 12, null, 30),
    ROUTE_04(4, "Bus", 1250000, 4250, 140, 15, null, 170),
    ROUTE_05(5, "Taxibus", 735000, 2500, 180, 13, null, 28),
    ROUTE_06(6, "Trolleybus", 800000, 3500, 120, null, 120, 140),
    ROUTE_07(7, "Bus", 1250000, 4250, 140, 15, null, 170),
    ROUTE_08(8, "Taxibus", 604000, 2500, 180, 12, null, 19),
    ROUTE_09(9, "Bus", 1250000, 4250, 140, 15, null, 170),
    ROUTE_10(10, "Taxibus", 604000, 2500, 180, 12, null, 19),
    ROUTE_11(11, "Trolleybus", 800000, 3500, 120, null, 120, 140),
    ROUTE_12(12, "Bus", 1022156, 3026, 160, 14, null,150),
    ROUTE_13(13, "Trolleybus", 800000, 3500, 120, null, 120, 140),
    ROUTE_14(14, "Taxi", 430000, 1950, 220, 9, null, 4),
    ROUTE_15(15, "Taxi", 430000, 1950, 220, 9, null, 4),
    ROUTE_16(16, "Bus", 1250000, 4250, 140, 15, null, 170),

    ;
    private int transportId;
    private String typeTransport;
    private int transportCost;
    private int mass;
    private int maxSpeed;
    private Integer fuelConsumption;
    private Integer energyConsumption;
    private int passengers;

    TransportType(int transportId, String typeTransport, int transportCost, int mass, int maxSpeed, Integer fuelConsumption,
                  Integer energyConsumption, int passengers) {
        this.transportId = transportId;
        this.typeTransport = typeTransport;
        this.transportCost = transportCost;
        this.mass = mass;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.energyConsumption = energyConsumption;
        this.passengers = passengers;
    }

    public int getTransportId() {
        return transportId;
    }

    public void setTransportId(int transportId) {
        this.transportId = transportId;
    }

    public String getTypeTransport() {
        return typeTransport;
    }

    public void setTypeTransport(String typeTransport) {
        this.typeTransport = typeTransport;
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
        String consumption;
        Integer consumptionNumber;
        if (fuelConsumption != null){
            consumption = "fuelConsumption";
            consumptionNumber = fuelConsumption;
        } else {
            consumption = "energyConsumption";
            consumptionNumber = energyConsumption;
        }
        return "TransportType{" +
                "transportId=" + transportId +
                ", typeTransport='" + typeTransport + '\'' +
                ", transportCost=" + transportCost +
                ", mass=" + mass +
                ", maxSpeed=" + maxSpeed +
                ", " + consumption + "=" + consumptionNumber +
                ", passengers=" + passengers +
                '}';
    }
}
