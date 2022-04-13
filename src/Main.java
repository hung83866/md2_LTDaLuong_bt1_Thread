public class Main {
    public static void main(String[] args) {
        NumberGenerator t1 = new NumberGenerator();
        NumberGenerator t2 = new NumberGenerator();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();

    }
}
