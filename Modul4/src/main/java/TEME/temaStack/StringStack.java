package TEME.temaStack;

public class StringStack {
    public static final int MAX_SIZE = 10;
    private String[] stack = new String[MAX_SIZE];
    private int top = -1;

    void push(String val){
        if (top == MAX_SIZE - 1){
            return;
        }
        top++;
        stack[top] = val;

    }

    String pop() {
//        return stack[top--];
//      SAU
        String val = stack[top];
        top = top - 1;
        return val;
    }

    static class method {
        private String[] stack;
        private int top = -1;

        void push(String val){
            if (top == 10 - 1){
                return;
            }
            top++;
            stack[top] = val;
        }
        String pop() {
//        return stack[top--];
//      SAU
            String val = stack[top];
            top = top - 1;
            return val;
        }


    }

}
