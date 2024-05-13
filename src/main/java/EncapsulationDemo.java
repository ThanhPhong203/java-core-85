public class EncapsulationDemo {
    public static void main(String[] args) {
        // tính đóng gói
        // 1. Thêm private cho tất cả các thuộc tính
        // 2. Truy cập thông qua getter / setter
        Student student = new Student("Khoa");
        System.out.println("student.getName() = " + student.getName());
        student.setName("Đức");
        System.out.println("student.getName() = " + student.getName());
    }
}
