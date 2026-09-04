
import java.util.*;
public class Third {
    public static void main(String[] args) {
        String name[]={"Pravesh","Ramesh","Aashtha","Ankit"};

        int first=0;
        int last=name.length-1;

        if(name[first].compareToIgnoreCase(name[last])>0){
            String temp=name[first];
            name[first]=name[last];
            name[last]=temp;

        }

        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }

    }
}
