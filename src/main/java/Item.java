public abstract class Item {
    String itemName;

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
}
