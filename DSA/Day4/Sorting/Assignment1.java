// Assignment 4 (DSA): Bubble sort
//  implement karo with optimization — 
// agar koi pass mein swap na ho toh loop
// break kar do (already sorted check).


public class Assignment1 {
    public static void main(String[] args) {
        int arr[]={1,8,3,2,5};

        for(int i=0;i<arr.length-1;i++){
            boolean swapped=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    swapped=true;
                }

            }
            if(swapped==false){
                break;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
