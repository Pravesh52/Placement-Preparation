// package DSA.Day3.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,5,6,7,8,9};
        int target =8;
        int result=-1;

        int low =0;

        int high=arr.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target){
               result=mid;
               break;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        if(result!=-1){
            System.out.println("Element found index: "+result);
        }else{
            System.out.println("Element not found");
        }
        
    }
}
