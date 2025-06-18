import java.util.*;
class binarySearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,3,5,8,9,11};
        
        System.out.println("Enter the number to find: ");
        int find = sc.nextInt();

        int start = 0;
        int end = arr.length-1;
        int index = -1;
        
        while(start <= end){
            int mid = (start+end)/2;

            if(find == arr[mid]){
                index = mid;
                break;
            }
            else if(find<arr[mid]){
                start = 0;
                end = mid;
            }
            else if(find>arr[mid]){
                start = mid+1;
                end = arr.length-1;
            }
            //return -1;
        }

        if(index != -1){
            System.out.println("Element is: "+ index);
        }
        else{
            System.out.println("Element not found");
        }
    }
}