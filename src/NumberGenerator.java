public class NumberGenerator implements Runnable{
    private Thread t;

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("đếm số = "+i);
                Thread.sleep(500);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("đếm xong!");
    }
}
