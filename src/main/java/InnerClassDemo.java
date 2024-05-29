public class InnerClassDemo {
    public static void main(String[] args) {
        // inner class : class trong class
        Student student = new Student(1,"khoa");
        Student.Gender gender = student.new Gender("male");
        gender.showInfo();
        // co the truy cap privat cuat lop ngoai

        // class trong method
        demoClassInMethod();

    }

    public static void demoClassInMethod() {
        class Dog {
            private String name;
            private String color;

            public Dog(String name, String color) {
                this.name = name;
                this.color = color;
            }

            @Override
            public String toString() {
                return "dog{" +
                        "name='" + name + '\'' +
                        ", color='" + color + '\'' +
                        '}';
            }
        }
        Dog dog = new Dog("shiba","orange");
        System.out.println("dog = " + dog);
    }
}
