import java.util.*;

public class Structures {
    public static void main(String[] args) {
        //Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(7);
        stack.push(5);
        stack.push(8);
        stack.peek();

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        System.out.println(stack.firstElement());

        //Queue
        Queue<String> queue = new LinkedList<>();
    queue.offer("dawid");
    queue.offer("basia");
    queue.offer("dawid");
    queue.poll();
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("dawid"));
        System.out.println(queue);

        //Priority Queue
        Queue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue.offer(1);
        priorityQueue.offer(1);
        priorityQueue.offer(9);
        priorityQueue.offer(7);
        priorityQueue.poll();
        System.out.println(priorityQueue);

        //Linked List
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList);
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);

        //ArrayList - Dynamic Array



    }

}
