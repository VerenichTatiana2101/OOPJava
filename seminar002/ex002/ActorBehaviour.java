package seminar002.ex002;

import java.util.List;

public interface ActorBehaviour {
    void setMakeOrder(boolean isMade);
    void setTakeOrder(boolean isTook);
    boolean getTookOrder();
    boolean getMadeOrder();
    Order makeOrder(List <String> myList);
}
