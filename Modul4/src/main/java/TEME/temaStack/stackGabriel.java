package TEME.temaStack;

public class stackGabriel {
    public static void main(String[] args){
//        iCanDoIt();
        ex2Impossible();


    }

    private static void ex2Impossible() {
        StringStack myMethod = new StringStack(10);
        myMethod.method("done. it's until impossible seems always It");
    }

    private static void iCanDoIt() {
        StringStack myStack = new StringStack(10);
        myStack.push("it!");
        myStack.push("do");
        myStack.push("can");
        myStack.push("I");
        System.out.print(myStack.pop() + " ");
        System.out.print(myStack.pop() + " ");
        System.out.print(myStack.pop() + " ");
        System.out.print(myStack.pop() + " ");
    }
}
