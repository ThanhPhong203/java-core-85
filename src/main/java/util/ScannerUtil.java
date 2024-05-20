package util;

import java.util.Scanner;

public class ScannerUtil {
    private Scanner scanner = new Scanner(System.in);
    public int inputInt(){
        while (true) {
            try {
                var input = scanner.nextLine();

                var n = Integer.parseInt(input);
                return n;
            } catch (NumberFormatException exception) {
                System.out.println("yeu cau nhap vao so nguyen");
            }
        }
    }
    public int inputPositiveInt() {
        while (true){
            try {
                var input = scanner.nextLine();

                var n = Integer.parseInt(input);
                if (n > 0){
                    return n;
                }else {
                    System.out.println("yeu cau nhap vao so nguyen duong");
                }
            } catch (NumberFormatException exception) {
                System.out.println("yeu cau nhap vao so nguyen duong");
            }
        }


    }
    public float inputFloat(){
        while (true) {
            try {
                var input = scanner.nextLine();

                var n = Float.parseFloat(input);
                return n;
            } catch (NumberFormatException exception) {
                System.out.println("yeu cau nhap vao so thuc");
            }
        }

    }
    public double inputDouble(){
        while (true) {
            try {
                var input = scanner.nextLine();

                var n = Double.parseDouble(input);
                return n;
            } catch (NumberFormatException exception) {
                System.out.println("yeu cau nhap vao so nguyen");
            }
        }

    }
    public String inputString(){
        return scanner.nextLine()
                .trim();
    }
    public String inputEmail(){
        while (true){
            var input = inputString();
            if (input.contains("@")){
                return  input;
            }else {
                System.out.printf("yeu cau email co chua ki tu @");
            }
        }
    }
}

