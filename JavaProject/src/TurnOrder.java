import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ArrayList;

// Tracks and returns the turn order!
// Adding multiple players using an arrayList for the future
public class TurnOrder {
    ArrayList<String> turnOrder = new ArrayList<String>();


    public void addPlayer(String addPlayer)
    {
        turnOrder.add(addPlayer);
    }

    public String getTurnOrder()
    {
       String turn = turnOrder.get(0);
       turnOrder.remove(0);
       turnOrder.add(turn);
        return turnOrder.get(0);
    }

}
