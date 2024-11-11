import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public abstract class Item {
    String itemName;

    public enum ItemTypes {
        TEABAG,
        MILK,
        CUP
    }

    public void get() {
        for(int i = 1; i <= 4; i++) {
            System.out.println("Fetching " + this.itemName + "...");

            try {
                Thread.sleep(500);
            } catch(InterruptedException e){
                System.out.println("Interrupted Exception");
            }
        }

        System.out.println(this.itemName + " has been acquired!");
    }

    public static Map<String,Item> getAllItems() {
        return Map.ofEntries(
                entry(ItemTypes.TEABAG.toString(), new TeaBag()),
                entry(ItemTypes.MILK.toString(), new Milk()),
                entry(ItemTypes.CUP.toString(), new Cup())
        );
    }
}
