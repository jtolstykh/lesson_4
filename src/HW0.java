public class HW0 {
    /* HW0
        Создать интерфейсы СanSwim, СanFly с методами void swim() и void fly() соответственно
        Создать класс Duck, который реализует оба интерфейса
        и при плавании выводит "Кря, плаваю", при полете "Кря, летаю"
        Создать класс Plane, который реализует интерфейс canFly
        и при полете выводит "Сжигаю керосин"
        В psvm создать объекты классов Duck и Plane и вызвать у них доступные методы
         */
    public static void main(String[] args) {
        Duck duck = new Duck();
        Plane plane = new Plane();

        plane.fly();
        duck.swim();
        duck.fly();
    }

}
