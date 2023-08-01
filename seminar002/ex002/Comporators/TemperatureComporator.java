package seminar002.ex002.Comporators;
import java.util.Comparator;
import seminar001.task001.HotDrinks;

public class TemperatureComporator implements Comparator<HotDrinks>{
    
    @Override
    public int compare(HotDrinks o1, HotDrinks o2) {
        if (o1.getTemperature()>o2.getTemperature()) {
            return 1;
        }
        else {
            if (o1.getTemperature()<o2.getTemperature()) return -1;
        }
        return 0;
    }
}