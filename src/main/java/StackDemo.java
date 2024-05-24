import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //them phan tu vao dinh
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(6);
        System.out.println(stack);

        //xem phan tu o dinh
        int peek = stack.peek();
        System.out.printf("peek" + peek);

        System.out.println(stack);

        //lay phan tu o dinh
        int pop = stack.pop();
        System.out.println("pop = " + pop);

        System.out.println(stack);
        // xu ly stack
        while (!stack.empty()) {
            int top = stack.pop();
            System.out.println("top = " + top);
            System.out.println(stack);
        }
    }
}
