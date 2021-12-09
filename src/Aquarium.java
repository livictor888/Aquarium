import java.util.ArrayList;
import java.util.Comparator;

public class Aquarium {

    static ArrayList<Fish> myFish = new ArrayList<>();

    private Aquarium() {
    }

    static void populateAquarium(int population) {
        for (int i = 0; i < population; i++) {
            JellyFish temp = new JellyFish(true, true, i, true);
            myFish.add(temp);
        }
    }

    void printAquariumFishID() {

    }

//    public static <E> ArrayList<Fish> getListOfFish(E data) {
//
//    } how to create a generic method in a non generic function


    public static void main(final String[] args) {
        Aquarium.populateAquarium(10);
        myFish
                .stream()
                .sorted(Comparator.comparingInt(Fish::getIdentificationNumber))
                .forEach(System.out::println);
    }

}