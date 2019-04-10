package TEME.temaStack;

public class StringStack {
    private int MAX_SIZE;
    private String[] stack ;
    private int top;

    public StringStack(int arraySize){
        this.MAX_SIZE = arraySize;
        stack = new String[MAX_SIZE];
        top = -1;
    }

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

    void method(String myMethode){
        String[] desparte = myMethode.split(" ");
        for(String element : desparte ){
            push(element);
        }
        for( String element : desparte){
            System.out.print(pop() + " ");
        }
    }
}
