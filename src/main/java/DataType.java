public class DataType {
    public static void main(String[] args) {
        //cu phap khoi tao bien
        //[kieu_du_lieu] [ten_bien] = [gia_tri_khoi_tao];
        // kieu so nguyen: byte(1),short(2),int(4),long(8)
        int age = 18;
        System.out.print("age = "+ age);

        // kieu so thuc: float(4), double(8)
        float pi = 3.146553f;
        double PI = 3.14875393498340;
        System.out.print("pi = "+ pi);
        System.out.print("PI = "+ PI);
        // kieu boolean
        boolean isloading = true;
        System.out.print("Isloading  " + isloading);
        // kieu ki tu :char (2)
        char c = 'a';
        System.out.print("c + =" + c);
        // kieu sau ki tu:string
        String name = "Khoa";
        System.out.print("name = " + name);
        //kieu enum
        Gender male = Gender.MALE;
        System.out.print("gender = " + male);

        //Class & Object
        Dog dog1 = new Dog();
        dog1.name = "Shiba";
        dog1.age = 5;
        dog1.gender = Gender.FEMALE;
        dog1.bark();
        int sum = dog1.sum(1, 10);
        System.out.print("sum =" + sum);

        Dog dog2 = new Dog() ;
        dog2.name = "Pitbull";
        dog2.age = 1;
        dog2.gender = Gender.MALE;
        dog2.bark();

    }
}
