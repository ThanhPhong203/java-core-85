public class KySu extends CanBo{
    private String nganhDaoTao;

    public KySu(String hoTen, int tuoi, GioiTinh gioiTinh, String disChi, String nganhDaoTao) {
        super(hoTen, tuoi, gioiTinh, disChi);
        this.nganhDaoTao = nganhDaoTao;

    }

    @Override
    public String toString() {
        return "KySu{" +
                "nganhDaoTao='" + nganhDaoTao + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                ", disChi='" + disChi + '\'' +
                '}';
    }
}
