package StackAndQueues;

public class AbleToApplyAnApplication {

    public static void main(String[] args) {

        Queues queue = new Queues();
        queue.enqueue(10);
        queue.enqueue(30);
        queue.enqueue(20);
        System.out.println(queue.dequeue()+ "");
        System.out.println(queue.dequeue()+ "");
        System.out.println(queue.dequeue()+ "");
    }

}
