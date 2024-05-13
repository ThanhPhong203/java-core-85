import java.util.Random;
//bai 1
public class Ex1As3 {
    public static void main(String[] args) {
        float luongAccount1 = 5240.5f;
        float luongAccount2 = 10970.055f;

        int luongAccount1Rounded = Math.round(luongAccount1);
        int luongAccount2Rounded = Math.round(luongAccount2);

        System.out.println("Lương của Account 1 sau khi làm tròn: " + luongAccount1Rounded);
        System.out.println("Lương của Account 2 sau khi làm tròn: " + luongAccount2Rounded);

        // bai 2
        Random random = new Random();
        int randomNumber = random.nextInt(90000) + 10000; // Random từ 10000 đến 99999

        System.out.println("Số ngẫu nhiên có 5 chữ số: " + randomNumber);
        // bai 3


    }




}



