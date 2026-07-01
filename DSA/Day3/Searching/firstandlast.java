// Assignment 5 (DSA): Given sorted array mein,
//  first and last occurrence of a target element 
// find karo (binary search variation).

public class firstandlast {

    public static int firstoccurence(int[]arr,int target){
            int low=0;
            int high=arr.length-1;
            int result=-1;

    while(low<=high){
        int mid=low+(high-low)/2;

        if(arr[mid]==target){
            result=mid;
            high=mid-1;
        }else if(arr[mid]<target){
                low=mid+1;
        }else if(arr[mid]>target){
            high=mid-1;
        }   
    }
    return result;
 }

 public static int lastoccurence(int[]arr, int target){
    int low=0;
    int high=arr.length-1;
    int result=-1;
    while(low<=high){
        int mid=low+(high-low)/2;

        if(arr[mid]==target){
            result=mid;
            low=mid+1;
        }
        else if(arr[mid]<target){
            low=mid+1;
        }else if(arr[mid]>target){
            high=mid-1;
        }
    }


    return result;
 }
 public static void main(String[] args) {
    int arr[]={1,2,3,4,4,4,4,5,6};
    int target=4;
    

    int fist=firstoccurence(arr, target);
    int last=lastoccurence(arr, target);

    if(fist!=-1){
        System.out.println("First occurence: "+fist);
        System.out.println("Second Occurence: "+last);

    }else{
        System.out.println("Element not found..");
    }
 }   
}
