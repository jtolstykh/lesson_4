import java.util.Objects;

public class Person {

    public String name;
    public int age;
    public double money;

    public Person(String name, int age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }


    @Override
    public String toString() {
        return "Person:" +
                "name='" + name +
                ", age=" + age +
                ", money=" + money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Double.compare(person.money, money) == 0 && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, money);
    }
}
