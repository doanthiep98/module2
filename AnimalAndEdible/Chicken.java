package Java.AnimalAndEdible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "Chicken: cỤc TÁccc";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
