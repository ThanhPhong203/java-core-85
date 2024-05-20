package frontend;

import util.ScannerUtil;



public class Program02 {
    public static void main(String[] args) {
        ScannerUtil scannerUtil = new ScannerUtil();
        System.out.println("nhap vao email");
        var number = scannerUtil.inputEmail();
        System.out.printf("number : "+ number);
    }
}
