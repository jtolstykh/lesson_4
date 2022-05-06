public class Duck implements CanFly, CanSwim{
    @Override
    public void fly() {
        System.out.println("Кря, летаю");

    }

    @Override
    public void swim() {
        System.out.println("Кря, плаваю");
    }
}
