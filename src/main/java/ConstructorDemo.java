public class ConstructorDemo {
    public static void main(String[] args) {
        // constructor : ham khoi tao
        // 1. khong co kieu du lieu tra ve
        // 2 ten phai trung voi ten cua class

        Department department = new Department(1,"bao ve");
        System.out.println("department.id = " + department.id);
        System.out.println("department.name = " + department.name);

        // mac dinh : 0 tham so
        Department d = new Department();
        System.out.println("d.id = " + d.id);
        System.out.println("d.name = " + d.name);
    }
}
