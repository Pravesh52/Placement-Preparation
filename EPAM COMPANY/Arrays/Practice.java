import java.util.Scanner;

class Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        int size = 4;

        System.out.println("Before Insertion:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        // Insert at Beginning
        int value = 5;

        arr[size] = arr[0];
        arr[0] = value;
        size++;

        System.out.println("\n\nAfter Insert at Beginning:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        // Insert at End 
        value = 50;
        arr[size] = value;
        size++;

        System.out.println("\nAfter Insert at End:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        // Insert at Middle
        int pos = 2;
        value = 99;

        arr[size] = arr[pos];
        arr[pos] = value;
        size++;

        System.out.println("\n\nAfter Insert at Middle:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        // delete at beginning

        arr[0]=arr[size-1];
        size--;
        System.out.println("\nDelete from beginning: ");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }

        // delete from end
        size--;
        System.out.println("\nAfter delete from end: ");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
    }
}