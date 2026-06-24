// package DSA.Day1;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={10,50,80,63,56};

        int largest=arr[0];
        int SecondLargest=0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            SecondLargest=arr[i-1];
        }
        
        System.out.println(largest);
        System.out.println(SecondLargest);


    }
}
