package epam.coreProject.actions;

import epam.coreProject.transport.Bus;
import epam.coreProject.transport.Car;
import epam.coreProject.transport.TransportType;
import epam.coreProject.transport.Trolleybus;

import java.util.*;

public class Actions {
    private int counter;
    private int lengthArray = TransportType.values().length;

    public void costAllPark() {
        int costPark = 0;
        for (counter = 0; counter < lengthArray; counter++) {
            costPark += TransportType.values()[counter].getTransportCost();
        }
        System.out.println("The cost of the park = " + costPark);
        System.out.println("\n");
    }

    public void sortByFuelConsumption() {
        List<Integer> dublicateList = new ArrayList<>();
        List<Integer> fuelList = new ArrayList<>();
        List<TransportType> transports = new ArrayList<>();
        int counterFuelList = 0;
        for (counter = 0; counter < lengthArray; counter++) {
            dublicateList.add(TransportType.values()[counter].getFuelConsumption());
        }
        dublicateList.removeAll(Collections.singleton(null));
        Collections.sort(dublicateList, Collections.reverseOrder());
        fuelList.add(dublicateList.get(0));
        for (counter = 0; counter < dublicateList.size(); counter++) {
            if (fuelList.get(counterFuelList) != dublicateList.get(counter)) {
                fuelList.add(dublicateList.get(counter));
                counterFuelList++;
            }
        }
        for (counter = 0; counter < fuelList.size(); counter++) {
            for (int counterTransport = 0; counterTransport < lengthArray; counterTransport++) {
                if (fuelList.get(counter) == TransportType.values()[counterTransport].getFuelConsumption()) {
                    transports.add(TransportType.values()[counterTransport]);
                }
            }
        }
        System.out.println("Sorting by fuel consumption per 100 km");
        for (int counterTransport = 0; counterTransport < transports.size(); counterTransport++) {
            System.out.println(transports.get(counterTransport));
        }
        System.out.println("\n");
    }

    public void searchByParameters(String typeTransport, Integer transportCost, Integer fuelConsumption,
                                   Integer energyConsumption) {
        System.out.println("Sort by parameters:\n Transport type - "
                + typeTransport
                + "\n Transport cost - " + transportCost + " Rub"
                + "\n Transport fuel consumption - " + fuelConsumption + " liters/100 km"
                + "\n Transport energy consumption - " + energyConsumption + " kV/100 km\n");
        List<TransportType> transportByParameters = new ArrayList<>();
        for (counter = 0; counter < lengthArray; counter++) {
            if (TransportType.values()[counter].getTypeTransport().equals(typeTransport)
                    && transportCost == TransportType.values()[counter].getTransportCost()
                    && (fuelConsumption == TransportType.values()[counter].getFuelConsumption()
                    || energyConsumption == TransportType.values()[counter].getEnergyConsumption())) {
                transportByParameters.add(TransportType.values()[counter]);
            }
        }
        for (counter = 0; counter < transportByParameters.size(); counter++) {
            System.out.println(transportByParameters.get(counter));
        }
        System.out.println("\n");
    }

    public void transportList() {
        TransportContainer transportContainer = new TransportContainer<Object>();
        List<Bus> busList = new ArrayList<>();
        List<Car> carList = new ArrayList<>();
        List<Trolleybus> trolleybusList = new ArrayList<>();
        for (counter = 0; counter < lengthArray; counter++) {
            if (TransportType.values()[counter].getTypeTransport().equals("Bus")
                    || TransportType.values()[counter].getTypeTransport().equals("Taxibus")) {
                busList.add(new Bus(TransportType.values()[counter].getTransportId(),
                        TransportType.values()[counter].getTransportCost(),
                        TransportType.values()[counter].getMass(),
                        TransportType.values()[counter].getMaxSpeed(),
                        TransportType.values()[counter].getFuelConsumption(),
                        TransportType.values()[counter].getPassengers()));
            } else if (TransportType.values()[counter].getTypeTransport().equals("Taxi")) {
                carList.add(new Car(TransportType.values()[counter].getTransportId(),
                        TransportType.values()[counter].getTransportCost(),
                        TransportType.values()[counter].getMass(),
                        TransportType.values()[counter].getMaxSpeed(),
                        TransportType.values()[counter].getFuelConsumption(),
                        TransportType.values()[counter].getPassengers()));
            } else if (TransportType.values()[counter].getTypeTransport().equals("Trolleybus")) {
                trolleybusList.add(new Trolleybus(TransportType.values()[counter].getTransportId(),
                        TransportType.values()[counter].getTransportCost(),
                        TransportType.values()[counter].getMass(),
                        TransportType.values()[counter].getMaxSpeed(),
                        TransportType.values()[counter].getEnergyConsumption(),
                        TransportType.values()[counter].getPassengers()));
            } else {
                System.out.println("Inappropriate type of transport");
            }
        }
        System.out.println("Transport in park:");
        transportContainer.transports(busList);
        transportContainer.transports(carList);
        transportContainer.transports(trolleybusList);
    }
}

