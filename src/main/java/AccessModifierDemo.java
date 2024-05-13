import entity.Dog;
public class AccessModifierDemo {
    public static void main(String[] args) {
        // public: truy cap tu moi noi
        Dog dog1 = new Dog();
        dog1.age = 3;
        System.out.println("dog1.age = " + dog1.age);
        // protected: co the truy cap dc trong cung package

        // default: co the truy cap dc trong cung package
        // private : chi truy cap trong class do


    }
}
