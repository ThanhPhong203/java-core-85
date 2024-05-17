public class Bird extends Animal implements Flyable, Runnable{
    @Override
    public void makeSound() {
        System.out.println("liu lo");
    }

    @Override
    public void fly() {
        System.out.println("bay");
    }

    @Override
    public void run() {
        System.out.println("bird can run...");
    }
}
