import java.util.ArrayList;

public class JellyFish extends Fish {


    private boolean isToxic;

//    public JellyFish(boolean testToxic) {
//        this();
//        this.isToxic
//    }

    public JellyFish(
            final boolean isFemale, final boolean isAlive,
            final int identificationNumber, final boolean isToxic) {
        super("Chrysaora", "JellyFish", isFemale, isAlive, identificationNumber);
        this.isToxic = isToxic;
    }


    @Override
    void makeSound() {
        System.out.println("Bloop");
    }


    @Override
    public int compareTo(Object o) {
        if (super.getIdentificationNumber() > ((Fish) o).getIdentificationNumber()) {
            return 1;
        } else {
            return -1;
        }

    }
}