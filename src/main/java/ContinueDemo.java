public class ContinueDemo {
    public  static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // next
            }
            System.out.println(i);

        }
        System.out.println("xong");
    }
}
