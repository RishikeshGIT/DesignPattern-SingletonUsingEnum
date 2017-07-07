package designpatterns.singletonUsingEnum;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by kumarris on 28/12/16.
 */

//By definition there is only one instance of an ENUM constant. This helps us achieve Singleton using ENUM.
public enum ShowManager {
    showManagerInstance;

    private Set<String> availableSeats = new HashSet<>();

    private ShowManager() {
        availableSeats.add("A1");
        availableSeats.add("B1");
        availableSeats.add("B2");
        availableSeats.add("B3");
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
