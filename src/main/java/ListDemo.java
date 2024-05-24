import java.util.LinkedList;
import java.util.List;


public class ListDemo {
    public static void main(String[] args) {
        // List(String) list = new ArrayList<String>();
        List<String> list = new LinkedList<String>();
        //them vao cuoi
        list.add("con bo");
        list.add("con trau");
        //them vao vi tri bat ki
        list.add(1,"con meo");

        //kich thuoc
        System.out.println("list.size() = " + list.size());

        //kiem tra rong
        System.out.println("list.isEmpty() = " + list.isEmpty());
        // kiem tra chua phan tu
        System.out.println("list.contains(\"con cho\") = " +list.contains("con cho"));

        // lay ra chi so
        System.out.println("list.index0f(\"con bo\") = " + list.indexOf("con bo"));

        //truy cap theo chi so
        System.out.println("list.get(2) = " + list.get(2));

        // xoa theo chi so
        list.remove(2);

        //xoa theo doi tuong
        list.remove("con bo");

        //coa theo dieu kien
        list.removeIf(animal -> animal.length() >5);

        // xoa toan bo
        list.clear();
        System.out.println(list);


    }
}
