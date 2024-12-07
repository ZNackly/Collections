import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayBlockingQueueQueue<>(2);
        queue.offer("Alice");
        queue.offer("Bob");
        queue.add("Charlie");
        System.out.println(queue);

    }
}
