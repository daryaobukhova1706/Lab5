import BaseClasses.Route;

import java.util.Collection;
public interface DAO {
    int create (Route route);
    void update (Route route);
    void delete( int id);
    Route get (int id);
    Collection<Route> getAll();
}
