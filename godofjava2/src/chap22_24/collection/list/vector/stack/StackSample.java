package chap22_24.collection.list.vector.stack;

import java.util.Stack;

public class StackSample {
    public static void main(String[] args) {
        StackSample sample=new StackSample();
        sample.checkPeek();
        sample.checkPop();
    }

    private void checkPop() {
        Stack<Integer> stack = new Stack<>();
        for (int loop = 0; loop < 5; loop++) {
            stack.push(loop);
            System.out.println("stack.pop() : "+stack.pop());
        }

        System.out.println("stack size : "+stack.size());
    }

    private void checkPeek() {
        Stack<Integer> stack = new Stack<>();
        for (int loop = 0; loop < 5; loop++) {
            stack.push(loop);
            System.out.println("stack.peek() : "+stack.peek());
        }

        System.out.println("stack size : "+stack.size());
    }
}
