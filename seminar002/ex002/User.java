package seminar002.ex002;
import seminar001.task001.HotDrinks;
import seminar001.task001.Product;
import seminar002.ex002.Comporators.PriceComparator;
import seminar002.ex002.Comporators.QuantityComporator;
import seminar002.ex002.Comporators.TemperatureComporator;
import seminar002.ex002.Comporators.VolumeComporator;

import java.util.List;
import java.util.Scanner;

public class User {

    @Override
    public String toString() {
        return "User []";
    }

    public int userCh(int userCh) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a number from 1 to 4.");
            while (!input.hasNextInt()) {
                System.out.println("Error! Please, enter a number.");
                input.next();
            }
            int userChoise = input.nextInt();
            return userChoise;
        }
    }

    public void choise() {
        System.out.println("Choose what criteria you want to sort products by:\n"
                + "1 - sort by cost\n"
                + "2 - sort by quantity\n"
                + "3 - sort hot drinks by volume\n"
                + "4 - sort hot drinks by temperature\n");
    }

    public void comparingChoise(int userChoise, List<Product> myList, List<HotDrinks> myList2) {
        switch (userChoise) {
            case 1:
                myList.sort(new PriceComparator());
                System.out.println(myList);
                break;
            case 2:
                myList.sort(new QuantityComporator());
                System.out.println(myList);
                break;

            case 3:
                myList2.sort(new VolumeComporator());
                System.out.println(myList2);
                break;
            case 4:
                myList2.sort(new TemperatureComporator());
                System.out.println(myList2);
                break;
            default:
                System.out.println("Error! Please, enter a number from 1 to 4.");
        }
    }

    

}
