package Commands;

import BaseClasses.Route;

import java.util.Collection;
import java.util.Vector;


public class Commands implements DAO{
    private static int availableId = 1;
    private final Vector <Route> routeCollection = new Vector<>();

    @Override
    public int add(Route route) {
        routeCollection.add(route);
        new GenerationID(routeCollection, route);
        return availableId++;
    }

    @Override
    public void update(Route route) {
        Route existedRoute = get(route.getId());


    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Route get(int id) {
        return null;
    }

    @Override
    public Collection<Route> getAll() {
        return null;
    }
}
