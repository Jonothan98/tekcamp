package template;

import java.util.ArrayList;
import java.util.Random;

public class RandomSentence extends Template{
    @Override
    public String getLocation() {

        ArrayList<String> possibleLocations = new ArrayList<>();
        possibleLocations.add("library");
        possibleLocations.add("grocery store");
        possibleLocations.add("car");
        possibleLocations.add("gym");
        possibleLocations.add("school");

        int location = new Random().nextInt(5);



        return possibleLocations.get(location);
    }

    @Override
    public String getQuantity() {
        return String.valueOf(new Random().nextInt(50));
    }
}
