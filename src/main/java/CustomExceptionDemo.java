public class CustomExceptionDemo {
    public static void main(String[] args) {


        try {

            var age = 15;
            if (age >= 18) {
                System.out.println("ban da du 18 tuoi");
            } else {
                throw new InvalidAgeException("bn chua du 18 tuoi");
            }
        } catch (InvalidAgeException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
