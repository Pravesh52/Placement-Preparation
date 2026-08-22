// Assignment 6 (DSA): Given array mein, 
// sort kiye bina, find karo ki array
//  already
// sorted hai ya nahi (boolean return karo).

public class Assignment3 {
    public static void main(String[] args) {

        int arr[]={5,4,2,8,1};

        boolean sorted=true;

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1]){
                sorted=false;
                break;
            }
        }
        if(sorted==true){
            System.out.println("sorted array");
        }else{
            System.out.println("Unsorted array");
        }


        
    }
}
