public class Stack {

    private int[] vector;
    private int top;

    Stack(int size) {
        vector = new int[size];
        top = -1;
    }

    private boolean isStackEmpty() {
        return top == -1;
    }

    public int push(int x) {
        if (top == vector.length-1){
            return -504;
        } else {
            top++;
            vector[top] = x;
            return vector[top];
        }
    }

    public int pop() {
        if (isStackEmpty()) {
            return -404;
        } else {
            --top;
            return vector[top];
        }
    }

    public void printStack() {
        int vectorSize = vector.length - 1;
        for (int i = 0; i <= vectorSize; ++i) {
            if (i == vectorSize) {
                System.out.print(vector[i] + "\n");
            } else System.out.print(vector[i] + " ");
        }
    }
}
