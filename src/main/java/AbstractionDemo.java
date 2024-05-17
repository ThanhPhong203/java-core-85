public class AbstractionDemo {
    public static void main(String[] args) {
        // tinh truu tuong abstract class .interface
        // 1. khong the khoi tao doi tuong abstract class
        // Animal animal = new Animal()

        // 2. class con phai la abstract class
        // hoac phai trien khai abstract method cua class cha
        Cat cat = new Cat();

        cat.makeSound();

        // 3.Abstract class co the khong co abstract method nao

        // interface
        // mac dinh method: public abstract
        // khong co constructor
        // khong the khoi tao doi tuong
        // tu khoa : implements
        // da ke thua
        Bird bird = new Bird();
        bird.fly();


    }
}
