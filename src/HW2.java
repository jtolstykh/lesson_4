public class HW2 {
    /*
Создать два класса Tree и Bush, наследующиеся от класса Plant
    У обоих классов будут конструкторы работающие так же, как и конструктор Plant
    Метод grow в классе Tree будет увеличивать поле с высотой на 0.9
    Метод grow в классе Bush будет увеличивать поле с шириной на 0.05
В psvm создать объекты Tree и Bush, вывести их поля, вызвать метод grow и вывести поля ещё раз
Задание со "звездочкой":
    Создать массив с типом данных Plant, поместить туда созданные ранее объекты классов Tree и Bush
    С помощью цикла for получить каждое растение и вызвать у него метод grow()
 */
    public static void main(String[] args) {

        Tree tree = new Tree(8.5,2.1);
        System.out.println(tree.toString());
        tree.grow();
        System.out.println(tree.toString());

        Bush bush = new Bush(10.25,5.4);
        System.out.println(bush.toString());
        bush.grow();
        System.out.println(bush.toString());

        Plant [] plants = new Plant[]{tree,bush};
        for (int i = 0; i < plants.length; i++){
            System.out.println(plants[i]);
            plants[i].grow();
            System.out.println(plants[i]);
        }

    }
}
