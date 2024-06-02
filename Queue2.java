import java.util.Scanner;
//Linked List implementation
class Node {
    int info;
    Node next;

    Node(int info) {
        this.info = info;
        this.next = null;
    }
}

public class Assignment_7 {
    //insert
    public static Node insert(Node rear, Node front) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to insert:");
        int x = sc.nextInt();
        Node newNode = new Node(x);
        if (rear == null) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        return rear;
    }

    //delete
    public static Node delete(Node rear, Node front) {
        if (front == null) {
            System.out.println("Queue is empty, cannot delete.");
            return front;
        }
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return front;
    }

    //display
    public static void display(Node rear, Node front) {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.info + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node rear = null, front = null;
        while (true) {
            System.out.println("****MENU****");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    rear = insert(rear, front);
                    if (front == null) {
                        front = rear; // Update front if the queue was initially empty
                    }
                    break;
                case 2:
                    front = delete(rear, front);
                    if (front == null) {
                        rear = null; // Update rear if the queue becomes empty
                    }
                    break;
                case 3:
                    display(rear, front);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
