import java.util.Scanner;
import java.util.Arrays;

class ArrayStringOperations {

    int[] arr;
    int size;

    ArrayStringOperations(int size) {
        this.size = size;
        arr = new int[size];
    }

    void inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
    }

    void reverseArray() {
        System.out.print("Reversed Array: ");
        for(int i=size-1;i>=0;i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void sortArray() {
        Arrays.sort(arr);
        System.out.print("Sorted Array: ");
        for(int i=0;i<size;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void searchElement(int key) {
        boolean found=false;

        for(int i=0;i<size;i++) {
            if(arr[i]==key) {
                System.out.println("Element found at position " + (i+1));
                found=true;
                break;
            }
        }

        if(!found)
            System.out.println("Element not found");
    }

    
    void average() {
        int sum=0;

        for(int i=0;i<size;i++) {
            sum += arr[i];
        }

        double avg = (double)sum/size;
        System.out.println("Average = " + avg);
    }

    
    void maximum() {
        int max = arr[0];

        for(int i=1;i<size;i++) {
            if(arr[i] > max)
                max = arr[i];
        }

        System.out.println("Maximum Element = " + max);
    }

    void reverseString(String str) {
        String rev="";

        for(int i=str.length()-1;i>=0;i--) {
            rev += str.charAt(i);
        }

        System.out.println("Reversed String: " + rev);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        ArrayStringOperations obj = new ArrayStringOperations(n);

        obj.inputArray();
        obj.reverseArray();
        obj.sortArray();

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        obj.searchElement(key);

        obj.average();
        obj.maximum();

        sc.nextLine(); 
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        obj.reverseString(str);
    }
}
