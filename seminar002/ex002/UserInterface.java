package seminar002.ex002;

import java.util.List;

import seminar001.task001.Product;

public interface UserInterface {
    int userCh();
    void choise();
    void comparingChoise(int userChoise, Product list);
    List<Product> compareToPrice(List<Product> myList);
    List<Product> compareToQuantity(List<Product> myList);
    List<Product> compareToWeight(List<Product> myList);
}
