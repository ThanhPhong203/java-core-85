public class StaticDemo {
    public static void main(String[] args) {
    // static: thuoc ve class
        Student s1 = new Student("khoa",20);
        Student s2 = new Student("hung",15);
        s1.count = 10;
        System.out.printf("s2.count" + s2.count);

        //truy cap thong qua ten class
        System.out.printf("Student.count" + Student.count);
        int max = Student.max(10, 100);
        System.out.printf("max = " + max );
        // Static khong the truy cap non-static
        // Non-static co the truy cap static

    }
}
