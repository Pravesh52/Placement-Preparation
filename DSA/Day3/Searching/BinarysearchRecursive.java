// package DSA.Day3.Searching;

public class BinarysearchRecursive {
    public static int BinarySearch(int []arr,int low,int high,int target){
        if(low>high){
            return -1;
        }

        int mid=low+(high-low)/2;

        if(arr[mid]==target){
            return mid;
            
        }else if(arr[mid]<target){
            return BinarySearch(arr, mid+1, high, target);
        }else{
            return BinarySearch(arr, low, mid-1, target);
        }
        

    }
    public static void main(String[] args) {
        int arr[]={1,2,5,6,8,9};
        int target=8;

      int result=BinarySearch(arr, 0, arr.length-1, target);

      if(result!=-1){
        System.out.println("Find element in index: "+result);
      }else{
        System.out.println("Not element found");
      }

        
        
    }
}
