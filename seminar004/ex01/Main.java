import java.util.Arrays;
import seminar002.ex001.Cat;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(Arrays.asList(new Apple(1.6), new Orange(0.8), new Cat()));

        System.out.println(box);

        GenericBox<Apple> genBox = new GenericBox<>(Arrays.asList(new Apple(1.5)));
        System.out.println(genBox);

        GenericBox<Orange> genBox1 = new GenericBox<>(Arrays.asList(new Orange(2.5)));
        System.out.println(genBox1);

        GenericBox<Orange> genBox2 = new GenericBox<>(Arrays.asList(new Orange(0.5)));
        System.out.println(genBox2);  //при GenericBox<T extends Fruit> котиков мы уже не добавим

        System.out.println(genBox1.compareTo(genBox));
    }
}
