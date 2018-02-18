public class Main {
//404 = stack empty 504 = stack full
    public static void main(String[] args) {
        Stack stack = new Stack(10);

        stack.printStack();

        stack.push(3);
        stack.push(4);
        stack.push(1);

        stack.printStack();

        if (stack.pop() == -404){
            System.out.println("Error, stack is already empty");
        }

        stack.push(9);

        stack.printStack();

    }
}
