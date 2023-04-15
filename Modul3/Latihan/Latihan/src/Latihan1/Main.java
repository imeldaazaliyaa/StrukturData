package Latihan1;

public class Main {
    private static final int MAX_SIZE = 100;
    private String[] stackArray;
    private int top;

    public Main() {
        stackArray = new String[MAX_SIZE];
        top = -1;
    }

    public void push(String data) {
        if (top < MAX_SIZE - 1) {
            top++;
            stackArray[top] = data;
        } else {
            System.out.println("Stack overflow");
        }
    }

    public String pop() {
        String result = null;
        if (top >= 0) {
            result = stackArray[top];
            top--;
        } else {
            System.out.println("Stack underflow");
        }
        return result;
    }

    public String peek() {
        String result = null;
        if (top >= 0) {
            result = stackArray[top];
        }
        return result;
    }

    public int search(String data) {
        for (int i = top; i >= 0; i--) {
            if (stackArray[i].equals(data)) {
                return top - i + 1;
            }
        }
        return -1;
    }

    public boolean empty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Main stack = new Main();
        stack.push("Aku");
        stack.push("Anak");
        stack.push("Indonesia");

        System.out.println("next : " +stack.peek());
        stack.push("Raya");
        System.out.println(stack.pop());
        stack.push("!");

        int count = stack.search("Aku");
        while (count != -1 && count > 1){
            stack.pop();
            count--;
        }
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }
}
