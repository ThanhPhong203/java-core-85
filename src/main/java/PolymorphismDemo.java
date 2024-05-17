public class PolymorphismDemo {
    public static void main(String[] args) {
        // tinh da hinh
        Runnable cat = new Cat();
        callRun(cat);
        Runnable bird = new Bird();
        callRun(bird);
    }
    // instanceof
    static void callRun(Runnable runnable) {
        if (runnable instanceof  Cat) {
            System.out.println("Meo co chay duoc khong");

        } else if (runnable instanceof  Bird) {
            System.out.println("Chim co chay duoc khong");

        }
        runnable.run();
    }
}
