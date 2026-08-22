// Selection sort use karke array
// ko descending order mein sort karo.

public class Assignment2 {
    public static void main(String[] args) {
        int arr[]={5,3,8,1,2};

        for(int i=0;i<arr.length-1;i++){
            int minindex=i;
            for(int j=i+1;j<arr.length;j++){

                if(arr[j]>arr[minindex]){
                    minindex=j;
                }
            }

            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }
       
      
       for(int i: arr){
        System.out.println(i);
       }
    }
}
