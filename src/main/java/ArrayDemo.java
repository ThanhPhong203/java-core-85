public class ArrayDemo {
    public  static void main(String [] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = new String[]{"Khoa","Huy", "Long"};
        int[] array = new int[5]; //0 0 0 0 0
        // kich thuoc cua mang
        System.out.println("numbers.leghth = " + numbers.length);
        System.out.println("numbers.leghth = " + names.length);
        System.out.println("numbers.leghth = " + array.length);
        // truy cap dua theo chi so(index)
        System.out.println("names[1] = " +names[1]);
        int lastIndex = numbers.length - 1 ;
        System.out.println(("names[lastIndex] = ")  + numbers[lastIndex]);
        // lap cac phan tu trong mang
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[i] = " + numbers[i]);

        }
        // lap cac phan tu trong mang (phai qua tra)
        for (int i = numbers.length - 1;i >= 0;i--) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }

}
