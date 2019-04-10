package TEME.temaStack;

public class stackGabriel {
    public static void main(String[] args){
        iCanDoIt();
//        StringStack.method myMethod = new StringStack.method();
//        myMethod.method();


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
