// package Self Practice.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        int arr[]={1,5,8,6,1,7,8};

        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]==arr[j]){
        //             System.out.println(arr[i]);
        //         }
        //     }
        // }

        // Using arraylist and Hashset

        Set<Integer>set=new HashSet<>();
        List<Integer>result=new ArrayList<>();

        for(int num:arr){
            if(set.contains(num)){
                System.out.println(result.add(num));
            }
            set.add(num);
        }
        System.out.println(result);
    }    
}
