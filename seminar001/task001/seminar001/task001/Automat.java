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

    public List<Product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(List<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public Product getProduct(String name) {
        for (Product product : listProduct) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    /**
     * Добавить проверку в Order (validateOrder()) до оформления заказа:
     * если заказано некоторого товара больше, чем есть в автомате,
     * удалить этот товар из заказа (желательно в одну проходку)
     * 
     * @param shoppingList
     * @param nearestAutomat
     * @param buyer
     * @return
     */
    public Order createOrder(List<Product> shoppingList, Automat nearestAutomat, Human buyer) {
        ArrayList<Product> validatedList = new ArrayList<>();
        Product tempProduct;
        double checkList = 0;
        for (Product myProduct : shoppingList) {
            tempProduct = nearestAutomat.getProduct(myProduct.getName());
            if (myProduct.equals(tempProduct) && nearestAutomat.getProduct(myProduct.getName()).getQuantity() > 0) {
                validatedList.add(tempProduct);
                checkList += nearestAutomat.getProduct(myProduct.getName()).getPrice();
                (nearestAutomat.getProduct(myProduct.getName()))
                        .setQuantity((nearestAutomat.getProduct(myProduct.getName())).getQuantity() - 1);
            } else if (myProduct.equals(tempProduct)
                    && nearestAutomat.getProduct(myProduct.getName()).getQuantity() == 0) {
                System.out.println(myProduct.getName() + " - отсутствует в продаже");
            } else if (myProduct.equals(tempProduct)
                    && nearestAutomat.getProduct(myProduct.getName()).getQuantity() < myProduct.getQuantity()) {
                System.out.println("В автомате недостаточно товара " + myProduct.getName());
            }
        }
        buyer.setTakeOrder(true);
        Order order = new Order(validatedList, buyer, nearestAutomat, checkList);
        buyer.setMoney(buyer.getMoney() - checkList);
        return order;
    }

    @Override
    public String toString() {
        String result = "Automat [\n";
        for (int i = 0; i < listProduct.size(); i++) {
            result += listProduct.get(i);

        }
        return result + "]";
    }
    

}
