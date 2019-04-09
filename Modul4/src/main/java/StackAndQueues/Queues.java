package StackAndQueues;

public class Queues {
    public static final int MAX_SIZE = 20;
    private int [] queue = new int [MAX_SIZE];
    private int head = 0;
    private int tail = -1;

    public void enqueue(int val){
        if (tail == MAX_SIZE -1){
            return;
        }
        tail ++;
        queue[tail] = val;

    }

    public int dequeue(){
        if (head > tail){
            System.out.println("Ur are next");
        }
        int val=queue[head];
        head =head+1;
        return val;
    }
}
