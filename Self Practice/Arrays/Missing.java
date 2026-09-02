// package Self Practice.Arrays;

// find the missing number in array

public class Missing {
    public static void main(String[] args) {
        int arr[]={2,5,3,4,7};

        int missing=0;

        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]!=i){
        //         missing=i;
        //         break;
        //     }
        // }
        // System.out.println(missing);

        for(int i=1;i<=7;i++){
            boolean found=false;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.println("Missing number: "+i);
            }

        }
    }
    
}
