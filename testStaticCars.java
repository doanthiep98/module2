package introductionToJava;

public class testStaticCars {
    public static void main(String[] args) {
        staticCars Car1= new staticCars("LamborSVJ","Seven hundreds");
        System.out.println(staticCars.numberOfCars);
        staticCars Car2= new staticCars("KoenigseggRegera","Nine hundreds");
        System.out.println(staticCars.numberOfCars);

    }
}
