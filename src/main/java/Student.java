import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;


public class Student extends Person{
    private String maSinhVien;
    private double diemTrungBinh;
    private String email;

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ma sinh vien:");
        this.maSinhVien = scanner.nextLine();
        System.out.println("Nhap vao diem trung binh");
        this.diemTrungBinh = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap vao email");
        this.email = scanner.nextLine();


    }

    @Override
    public void showInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", diemTrungBinh=" + diemTrungBinh +
                ", email='" + email + '\'' +
                ", ten='" + ten + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", ngaySinh=" + ngaySinh +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
