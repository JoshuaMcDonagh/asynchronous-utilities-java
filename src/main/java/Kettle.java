public class Kettle {

    public static void boil() {
        for(int i = 0; i < 4; i++) {
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
