public class Kettle {

    public static void boil() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Boiling...");

            try {
                Thread.sleep(1000);
            } catch(InterruptedException e){
                System.out.println("Interrupted Exception");
            }
        }
        System.out.println("Boiled water ready!");
    }
}
