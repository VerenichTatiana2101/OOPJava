package seminar002.ex002;
import java.util.List;

import seminar001.task001.Automat;

public interface ActorBehaviour {
    void setMakeOrder(boolean isMade);
    void setTakeOrder(boolean isTook);
    boolean getTookOrder();
    boolean getMadeOrder();
    Order makeOrder(List<String> deList, Automat nearesAutomat, Human buyer);
}
