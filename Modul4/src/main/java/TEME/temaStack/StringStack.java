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

//    void method(String myMethode){
//        push("done.");
//        push("it's");
//        push("until");
//        push("impossible");
//        push("seems");
//        push("always");
//        push("It");
//        System.out.print(pop() + " ");
//        System.out.print(pop() + " ");
//        System.out.print(pop() + " ");
//        System.out.print(pop() + " ");
//        System.out.print(pop() + " ");
//        System.out.print(pop() + " ");
//        System.out.print(pop() + " ");
//    }

//    static class method {
//        private int maxSize;
//        private String[] stack;
//        private int top;
//
//        public method(int a) {
//            this.maxSize = a;
//            stack = new String[maxSize];
//            top = -1;
//        }
//        
//        void push(String val){
//            if (top == maxSize - 1){
//                return;
//            }
//            top++;
//            stack[top] = val;
//        }
//        String pop() {
////        return stack[top--];
////      SAU
//            String val = stack[top];
//            top = top - 1;
//            return val;
//        }
//
//    }

}
