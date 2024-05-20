public class ThrowDemo {
    public static void main(String[] args) {
        try {

            var age = 15;
            if (age >= 18) {
                System.out.println("ban da du 18 tuoi");
            } else {
                throw new IllegalStateException("bn chua du 18 tuoi");
            }
        } catch (IllegalStateException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
