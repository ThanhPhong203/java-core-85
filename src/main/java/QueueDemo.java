import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
//        Queue<Integer> queue = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        // them phan tu vao cuoi hang doi
        queue.offer(2);
        queue.offer(7);
        queue.offer(5);
        queue.offer(4);

        System.out.println(queue);

        // xem phan tu o dau hang doi
        int peek = queue.peek();
        System.out.println("peek" + peek);

        System.out.println(queue);

        // lay phan tu o dau hang doi
        int poll = queue.poll();
        System.out.println(poll);

        System.out.println(queue);

        // xu ly queue
        while (!queue.isEmpty()) {
            int top = queue.poll();
            System.out.println("top = " + top);
            System.out.println(queue);
        }
    }
}
