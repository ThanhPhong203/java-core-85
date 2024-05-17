import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Person {
    protected String ten;
    protected GioiTinh gioiTinh;
    protected LocalDate ngaySinh;
    protected String diaChi;

    public Person() {
    }

    public Person(String ten, GioiTinh gioiTinh, LocalDate ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }
    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ten");
        this.ten = scanner.nextLine();
        System.out.println("Chon gioi tinh");
        System.out.println("1.Nam");
        System.out.println("2.Nu");
        System.out.println("3.Khac");
        String menu = scanner.nextLine();
        if (menu.equals("1")) {
            this.gioiTinh = GioiTinh.NAM;

        }else if (menu.equals("2")) {
            this.gioiTinh = GioiTinh.NU;
        } else if (menu.equals("3")) {
            this.gioiTinh = GioiTinh.KHAC;
        }
        System.out.println("Nhap vao ngay sinh");
        this.ngaySinh = LocalDate.parse(scanner.nextLine());
        System.out.println("Nhap vao dia chi");
        this.diaChi = scanner.nextLine();


    }
    public void showInfo(){
        System.out.println(this);
    }


    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public GioiTinh getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(GioiTinh gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
