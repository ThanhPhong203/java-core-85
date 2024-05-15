public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien(String hoTen, int tuoi, GioiTinh gioiTinh, String disChi, String congViec) {
        super(hoTen, tuoi, gioiTinh, disChi);
        this.congViec = congViec;

    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "congViec='" + congViec + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                ", disChi='" + disChi + '\'' +
                '}';
    }
}
