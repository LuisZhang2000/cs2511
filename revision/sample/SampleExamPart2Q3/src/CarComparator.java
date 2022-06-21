import java.util.Comparator;

/**
 * TODO: Complete this class
 *
 */

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car c1, Car c2) {
        int diff = c1.getManufacturer().compareTo(c2.getManufacturer());
        if (diff == 0)
            return c1.getAge() - c2.getAge();
        else
            return diff;
    }

}