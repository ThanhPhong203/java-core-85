import java.util.Scanner;
public class BaiTap {
    public static void main(String[] args) {
        // bai 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap vao ten");
        String s1 = scanner.nextLine();
        String a1 = s1.substring(0, 1).toUpperCase() + s1.substring(1).toLowerCase();
        System.out.printf("a1 = "+ a1);
        // bai 2
        System.out.println("Moi ban nhap vao ho va ten");
        String s2 = scanner.nextLine();
        String[] array = s2.split(" ");
        int count = 0;
        for (String word : array){
            if (!word.isEmpty()) {
                count ++;
            }
        }
        System.out.printf("So tu : ", count);




    }

}
