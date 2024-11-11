import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class Asynchronous {
    static Map<String, Item> items = Item.getAllItems();

    public static void run() {
        System.out.println("Making a morning Tea ¬The Async Way¬");

        CompletableFuture<Void> boilWater = CompletableFuture.runAsync(Kettle::boil);

        CompletableFuture<Void> fetchTeaBag = CompletableFuture.runAsync( () ->
                items.get(Item.ItemTypes.TEABAG.toString()).get()
        );

        CompletableFuture<Void> fetchMilk = CompletableFuture.runAsync( () ->
                items.get(Item.ItemTypes.MILK.toString()).get()
        );

        CompletableFuture<Void> fetchCup = CompletableFuture.runAsync( () ->
                items.get(Item.ItemTypes.CUP.toString()).get()
        );

        boilWater.join();
        fetchTeaBag.join();
        fetchMilk.join();
        fetchCup.join();

        System.out.println("Making tea...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted Exception");
        }
        System.out.println("The tea is made! Enjoy!");
    }

}
