import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queues {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    Queue<Integer> queueOne = new LinkedList<Integer>();
    
    System.out.println("Please enter 5 integers.");
    int first = Exceptions.genericIntException(scan);
    int second = Exceptions.genericIntException(scan);
    int third = Exceptions.genericIntException(scan);
    int fourth = Exceptions.genericIntException(scan);
    int fifth = Exceptions.genericIntException(scan);

    queueOne.add(first);
    queueOne.add(second);
    queueOne.add(third);
    queueOne.add(fourth);
    queueOne.add(fifth);
    
    System.out.println("Here is your queue: " + queueOne);
    
    System.out.println();
    
    System.out.println("Peek: " + queueOne.peek());
    System.out.println("New Queue: " + queueOne);
    
    System.out.println();
    
    System.out.println("Poll: " + queueOne.poll());
    System.out.println("New Queue: " + queueOne);
  }

}
