// package Self Practice.Arrays;

// Move all zero in end

public class Movezero {
    public static void main(String[] args) {
        int arr[]={0,5,0,7,6,0,5};

        
        int j=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
