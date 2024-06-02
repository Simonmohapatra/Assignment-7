import java.util.Scanner;

//Array implementation
public class Assignment_7 {
    public static final int MAX=10;
    public static int front=-1;
    public static int rear=-1;

    //insertion
    public static void insert(int Q[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element ");
        int x=sc.nextInt();
        rear++;
        Q[rear]=x;
    }

    //deletion
    public static void delete(int Q[]){
        front++;
    }

    //display
    public static void display(int Q[]){
        for (int i=0;i<MAX;i++){
            System.out.println(Q[i]);
        }
    }

    //is_full
    public static boolean is_full(){
        return rear==MAX-1;
    }

    //is_empty
    public static boolean is_empty(){
        return front==-1 && rear==-1;
    }

    //main
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Q[]=new int[MAX];
        while (true){
            System.out.println("Menu");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println();
        }
    }
}
