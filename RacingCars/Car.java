package RacingCars;

import java.util.Random;

public class Car implements Runnable{
    private static final double DISTANCE = 100 ;
    private static final int STEP = 2 ;
    private String name;

    public Car(String name){
        this.name = name;
    }

    @Override
    public void run(){
        // khoi tao diem start( start point)
        int runDistance = 0;
        // construct the time when the race begins
        long startTime = System.currentTimeMillis();

        // check if the car haven't finish the race, the car will continue running
        while (runDistance < DISTANCE){
            try {
                // random speed km per hour
                int speed = (new Random()).nextInt(20);
                // caulate the traveled distance
                runDistance += speed;
                // build result graphic
                String log= "|";
                double percentTravel = (runDistance * 100) / DISTANCE;
                for (int i = 0; i < DISTANCE; i+= STEP) {
                    if (percentTravel >= i + STEP){
                        log += "=";
                    }else if (percentTravel >= i && percentTravel < i + STEP){
                        log += "o";
                    }else {
                        log += "-";
                    }
                    log += "|";
                    System.out.println("Car" + this.name + ": " + log + Math.min(DISTANCE, runDistance) + "KM");
                    Thread.sleep(1000);

                }
            } catch (InterruptedException e){
                System.out.println("Car" + this.name + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + "Finish in" + (endTime - startTime) / 1000 + "s");
    }
}
