package seminar002.ex002.Comporators;
import java.util.Comparator;
import seminar001.task001.HotDrinks;

public class VolumeComporator implements Comparator<HotDrinks>{
    
    @Override
    public int compare(HotDrinks o1, HotDrinks o2) {
        if (o1.getVolume()>o2.getVolume()) {
            return 1;
        }
        else {
            if (o1.getVolume()<o2.getVolume()) return -1;
        }
        return 0;
    }
}