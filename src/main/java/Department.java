public class Department {
    int id;
    String name;
    Department(int id, String name) {
        System.out.println("ham 2 tham so");
        this.id = id;
        this.name = name;
    }
    Department() {
        System.out.printf("Contructor 0 tham so");
    }

}
