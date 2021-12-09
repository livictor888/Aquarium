public abstract class Fish implements Comparable {

    private String genus;
    private String species;
    private boolean isFemale;
    private boolean isAlive;
    private int identificationNumber;


    public Fish(String genus, String species, boolean isFemale, boolean isAlive, int identificationNumber) {
        this.genus = genus;
        this.species = species;
        this.isFemale = isFemale;
        this.isAlive = isAlive;
        this.identificationNumber = identificationNumber;
    }

    //getters, setters,
    //hashcode, equals, tostring

    public void setAlive(final boolean alive) {
        isAlive = alive;
    }

    abstract void makeSound();

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "genus='" + genus + '\'' +
                ", species='" + species + '\'' +
                ", isFemale=" + isFemale +
                ", isAlive=" + isAlive +
                ", identificationNumber=" + identificationNumber +
                '}';
    }
}