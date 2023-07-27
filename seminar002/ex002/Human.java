package seminar002.ex002;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import seminar001.task001.Automat;
import seminar001.task001.Beverages;
import seminar001.task001.Food;
import seminar001.task001.Product;

public class Human extends Actor {
    private double money;
    private Automat nearesAutomat;

    public Human(String name, boolean isMakeOrder, boolean isTakeOrder, double money) {
        super(name, isMakeOrder, isTakeOrder);
        this.money = money;
    }

    @Override
    public void setMakeOrder(boolean isMade) {

    }

    @Override
    public void setTakeOrder(boolean isTook) {

    }

    @Override
    public boolean getTookOrder() {
        return false;
    }

    @Override
    public boolean getMadeOrder() {
        return false;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Automat getNearesAutomat() {
        return nearesAutomat;
    }

    public void findNearesAutomat() {
        List<Product> myList = new ArrayList<>();
        myList.add(new Food("twix", 2, 5, new GregorianCalendar(2023, 8, 19), 25.5));
        myList.add(new Food("baunty", 3, 4, new GregorianCalendar(2023, 9, 14), 100.5));
        myList.add(new Food("sneck", 4, 2, new GregorianCalendar(2023, 11, 25), 75));
        myList.add(new Beverages("cola", 3, 1, new GregorianCalendar(2024, 9, 14), 0.5));
        
        Automat automat = new Automat(); 
        automat.initProducts(myList);
        this.nearesAutomat = automat;
    }

    @Override
    public Order makeOrder(List <String> deList) {
        ArrayList<Product> shoppingList = new ArrayList<>();
        Product shoppingProduct;
        for (String nameProduct : deList) {
            shoppingProduct = nearesAutomat.getProduct(nameProduct);
            if(shoppingProduct != null){
                shoppingList.add(shoppingProduct);
            }
        }
        setMakeOrder(true);
        return nearesAutomat.createOrderList(shoppingList); 
    }
    
}
