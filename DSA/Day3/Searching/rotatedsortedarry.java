// Assignment 6 (DSA): Search in a rotated sorted 
// array (e.g., [4,5,6,7,0,1,2], find 0).

public class rotatedsortedarry {
    public static int search(int[]arr,int target){
        int low=0;
        int high=arr.length-1;

        

        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                return mid;
            }
            // check left half sorted hai ki nahi 
            if(arr[low]<=arr[mid]){
                // agar hai tho check karo ki target hai ki nahi 

                if(target>=arr[low] && target<arr[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }

            }

            // target right half me ab check karte hai 
            
            // agar sorted hai tho check karte hai ki hamara target hai ki nahi 
             else{
                if(target>arr[mid] && target<=arr[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
             }
        }


        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        int result=search(arr, target);

        if(result!=-1){
            System.out.println("Element find index:"+result);

        }else{
            System.out.println("Eleement not found...");
        }
    }
}
