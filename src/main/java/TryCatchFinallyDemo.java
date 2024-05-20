public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        try {
            var calculator = new Calculator();
            var result = calculator.divide(1, 0);
            System.out.println("result = " + result);
        } catch (ArithmeticException exception) {
            System.out.println("result = vô cùng");
        }
    }
}
