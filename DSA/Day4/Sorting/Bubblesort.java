// 1. Bubble Sort — O(n²)

// Adjacent elements 
// compare karke swap karte hain, baar baar pass 
// lagate hain.

public class Bubblesort {
    public static void main(String[] args) {
        int arr[]={5,1,4,2,8};

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }


        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
