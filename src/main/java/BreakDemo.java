public class BreakDemo {
    public  static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
           if (i == 5) {
               break; // Thoat ra khoi vong lap ngay lap tuc
           }
           System.out.println(i);

        }
        System.out.println("xong");
    }
}
