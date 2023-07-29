package seminar002.ex002;

import java.util.List;

import seminar001.task001.Product;

public class Order {
    private List<Product> list;
    private Human buyer;
    private int check;

    public int getCost() {
        return check;
    }

    public void setCheck(int check) {
        this.check = check;
    }

    public List<Product> getList() {
        return list;
    }

    public Human getMan() {
        return buyer;
    }

    public void setList(List<Product> shoppingList) {
        this.list = shoppingList;
    }

    public void setMan(Human buyer) {
        this.buyer = buyer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Human: ").append(buyer).append("\nProduct list:\n");
        for (Product product : list) {
            sb.append("Product: " + product.getName()).append("Quantity: " + product.getQuantity()).append("\n");
        }
        sb.append("Check amount: ").append(check);
        return sb.toString();
    }
}
