package epam.coreProject;

import epam.coreProject.actions.Actions;

/**
 *
 */
public class App
{
    public static void main( String[] args ){
        Actions actions = new Actions();
        actions.costAllPark();
        actions.sortByFuelConsumption();
        actions.searchByParameters("Bus", 1022156, 14, 10);
        actions.transportList();
    }
}
