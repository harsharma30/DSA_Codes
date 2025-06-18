import java.util.*;
class LinearSearch{
    public static int search(int[] arr, int size, int find){
        for(int i=0;i<size;i++){
            if(arr[i] == find){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        System.out.print("Enter the number to find: ");
        int find = sc.nextInt();

        int[] arr = new int[size];
        

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int index = search(arr, size, find);
        System.out.println("Index of the targeted number is:" + index);
    }
}