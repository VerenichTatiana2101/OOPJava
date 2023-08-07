import java.util.List;

public class GenericBox<T extends Fruit> implements Comparable<GenericBox<? extends Fruit>>{  //public class GenericBox<T extends Fruit> {  будут фрукуты
    private List<T> listOfItems;

    public GenericBox(List<T> listOfItems) {
        this.listOfItems = listOfItems;
    }

    public List<T> getListOfItems() {
        return listOfItems;
    }

    public void addItem(T item) {
        this.listOfItems.add(item);
    }

    public double getBoxWeight(){
        double weightBox = 0;
        for (T item : listOfItems) {
            weightBox += item.getWeight();
        }
        return weightBox;
    }

    public int compareTo(GenericBox<? extends Fruit> otherBox){
        return (int) (getBoxWeight() - otherBox.getBoxWeight());
    }

    @Override
    public String toString() {
        return "GenericBox: " + "listOfItems" + listOfItems;
    }

    
}
