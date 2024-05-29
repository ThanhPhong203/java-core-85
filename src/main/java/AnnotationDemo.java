public class AnnotationDemo {
    public static void main(String[] args) {
        // annotation: chu thich
        // @Override
        class Dog {
            @Override
            public String toString() {
                return "dog";
            }
        }
        Dog dog = new Dog();
        System.out.println("dog = " + dog);
        // @deprecated:canh bao phuong thuc bi loi thoi
        @SuppressWarnings("deprecation")
        int max = Math.max(1,100);
        System.out.println("max = " + max);
    }

}
