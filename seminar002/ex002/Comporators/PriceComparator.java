package seminar002.ex002.Comporators;

import java.util.Comparator;

import seminar001.task001.Product;

public class PriceComparator implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
    
}