import java.util.Scanner;
public class StringAs3 {
    public static void main(String[] args) {
        // bai 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào họ và tên:");
        String s2 = scanner.nextLine();
        String[] array = s2.split(" ");
        int count = 0;
        for (String word : array) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        // bai 2


        // Nhập xâu kí tự s1
        System.out.print("Nhập xâu kí tự s1: ");
        String s1 = scanner.nextLine();

        // Nhập xâu kí tự s2
        System.out.print("Nhập xâu kí tự s2: ");
        String s3 = scanner.nextLine();

        // Nối xâu s2 vào sau xâu s1
        String s4 = s1.concat(s3);

        // In ra kết quả
        System.out.println("Xâu sau khi nối: " + s3);
        // bai 3
        System.out.print("nhap vao ten cua ban");
        String ten = scanner.nextLine();






    }



}
