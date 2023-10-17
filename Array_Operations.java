import java.util.Scanner;

class Operations {

    Scanner sc = new Scanner(System.in);

// Function for Entering Array values
    int[] Create_Array() {
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        // initializing Array
        int[] arr = new int[size];
        // loop for entering array values
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter [" + i + "] - ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

// Function for printing Array values
    void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Value at index [" + i + "] - " + arr[i]);
        }
    }

//function for search value in the array
    void search(int value, int[] arr) {
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("Value " + value + " is found at index " + i);
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("Value " + value + " not present in array");
        }
    
    }

    int[] Insert(int position, int[] arr,int value ) {
        int[] arr2=new int[arr.length+1];
        System.out.println("Array After Insertion : ");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i < position - 1)
                   arr2[i] = arr[i];
            else if (i == position - 1)
                   arr2[i] = value;
            else
                   arr2[i] = arr[i - 1];
            }
        }
        return arr2;
    }

    void Delete(int value, int[] arr) {

    }
}

// main function
public class Array_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operations obj = new Operations();
        // entering user choice

        int[] arr = obj.Create_Array();
        obj.print(arr);
        System.out.print("Enter value you want to search ");
        int value = sc.nextInt();
        obj.search(value, arr);
        int[] arr2=obj.Insert(3, arr, 10);
        obj.print(arr2);
    }
}
