import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao ten cua ban:");
        String name = scanner.nextLine();
        System.out.println("Ten cuar bn la : " + name);

        System.out.println("Nhap vao tuoi cua ban:");
        int a = scanner.nextInt();
        System.out.println("Tuoi cua bn la : " + a);

        System.out.println("Nhập vào số a:");
        int c = scanner.nextInt();
        System.out.println("Nhập vào số b:");
        int b = scanner.nextInt();
        int max = c > b ? c : b;
        System.out.println("Số lớn hơn là: " + max);
    }
}
