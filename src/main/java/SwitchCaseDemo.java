public class SwitchCaseDemo {
    public  static  void main(String[] args) {
        int month = 1;
        switch (month) {
            case 1:
                System.out.print("co 31 ngay");
                break;
            case 2:
                System.out.print("co 28,29 ngay");
                break;
            default:
                System.out.print("khong biet");
                break;
        }
    }
}
