package seminar002.ex002;

import java.util.ArrayList;

import seminar001.task001.Product;

public class Order {
    private ArrayList<Product> list;
    private Human man;
    public ArrayList<Product> getList() {
        return list;
    }

    public Human getMan() {
        return man;
    }

    public void setList(ArrayList<Product> list) {
        this.list = list;
    }
    
    public void setMan(Human man) {
        this.man = man;
    }
}
