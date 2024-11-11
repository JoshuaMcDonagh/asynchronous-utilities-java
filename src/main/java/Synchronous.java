import java.util.Map;

public class Synchronous {
    static Map<String, Item> items = Item.getAllItems();

    public static void run() {
        System.out.println("Making a morning Tea");
        Kettle.boil();
        items.get(Item.ItemTypes.TEABAG.toString()).get();
        items.get(Item.ItemTypes.MILK.toString()).get();
        items.get(Item.ItemTypes.CUP.toString()).get();
        System.out.println("Making tea...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted Exception");
        }
        System.out.println("The tea is made! Enjoy!");
    }
}
