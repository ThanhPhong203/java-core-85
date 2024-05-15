public class CongNhan extends CanBo{
    private int bac;

    public CongNhan(String hoTen, int tuoi, GioiTinh gioiTinh, String disChi, int bac) {
        super(hoTen, tuoi, gioiTinh, disChi);
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "bac=" + bac +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                ", disChi='" + disChi + '\'' +
                '}';
    }
}
