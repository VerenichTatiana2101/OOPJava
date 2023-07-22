package seminar001.task001;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
/**
 * В класс Beverage добавить поле объем (double volume), а в класс Food - масса (double weight), 
 * добавить заполнение в конструктор, добавтиь их в вывод toString()
 * Создать наследника класса Beverage ГорячийНапиток с дополнительным полем int температура.
 * Создать класс ГорячихНапитковАвтомат наследник от класса ТорговыйАвтомат и 
 * реализовать перегруженный метод getProduct(String name, int volume, int temperature), 
 * выдающий продукт соответствующий имени, объёму и температуре
 * В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и 
 * воспроизвести логику, заложенную в программе
 */

public class Program {
    public static void main(String[] args) {
        
        Product twix = new Food("twix", 2, 5, new GregorianCalendar(2023, 8, 19), 25.5);
        Product baunty = new Food("baunty", 3, 4, new GregorianCalendar(2023, 9, 14), 100.5);
        Product sneck = new Food("sneck", 4, 2, new GregorianCalendar(2023, 11, 25), 75);
        Product cola = new Beverages("cola", 3, 1, new GregorianCalendar(2024, 9, 14), 0.5);
        Product coffee = new HotDrinks("d'ore", 4, 2, new GregorianCalendar(2023, 8, 25), 250, 75);
        Product tea = new HotDrinks("lipton", 1, 2, new GregorianCalendar(2023, 7, 28), 250, 80);
        Product hotChocolate = new HotDrinks("white hot chocolate", 2, 1, new GregorianCalendar(2023, 7, 27), 300, 75);
        
        Automat list = new Automat();
        List<Product> myList = new ArrayList<>();
        myList.add(twix);
        myList.add(baunty);
        myList.add(sneck);
        myList.add(cola);
        list.initProducts(myList);

        String name = "sneck";
        System.out.println(list.getProduct(name).toString());

        HotDrinksAutomat list2 = new HotDrinksAutomat();
        List<HotDrinks> myList2 = new ArrayList<>();
        myList2.add((HotDrinks)coffee);
        myList2.add((HotDrinks)tea);
        myList2.add((HotDrinks)hotChocolate);

        list2.initHotDrinks(myList2);
        System.out.println(list2.getProduct("d'ore", 250, 75));

    }
}
