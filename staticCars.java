package introductionToJava;

public class staticCars {
    private String name;
    private String horsePowers;
    public static int numberOfCars;

    public staticCars(String name, String horsePowers){
        this.name=name;
        this.horsePowers=horsePowers;
        numberOfCars++;
    }
}
