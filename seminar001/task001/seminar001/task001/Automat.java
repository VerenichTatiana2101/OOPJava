package seminar001.task001;
import java.util.ArrayList;
import java.util.List;

import seminar002.ex002.Human;
import seminar002.ex002.Order;

/**
 * Реализуйте класс Товар, содержащий данные о товаре,
 * и ТорговыйАвтомат, содержащий в себе методы initProducts (List <Product>)
 * сохраняющий в себе список исходных продуктов и getProduct(String name)
 */
public class Automat {
    private List<Product> listProduct = new ArrayList<>();

    public void initProducts(List<Product> myList) {
        this.listProduct = myList;
    }

    public Product getProduct(String name) {
        for (Product product : listProduct) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }


    public Order createOrderList(List<Product> shoppingList, Human buyer) {
        int checkList = 0;
        for (Product myProduct : shoppingList) {
            if(getProduct(myProduct.getName()).getQuantity() > 0){
                checkList += getProduct(myProduct.getName()).getPrice();
            }
            else{
                shoppingList.remove(myProduct);
            }
        }
        Order order = new Order();
        order.setCheck(checkList);
        order.setMan(buyer);
        order.setList(shoppingList);
        
        return order;
    }
}
