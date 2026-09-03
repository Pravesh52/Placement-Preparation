// Task: zomato all proper working model 
// task ye hai ki pahle 

import java.util.ArrayList;
import java.util.List;

public class Zomato {
    class customer{
        int customerid;
        String name;
        int phone;
        String Address;

        customer(int customerid,String name,int phone,String Address){
            this.customerid=customerid;
            this.name=name;
            this.phone=phone;
            this.Address=Address;
        }

        void customerdisplay(int id){
            System.out.println("Customer id: "+customerid);
            System.out.println("name: "+name);
            System.out.println("phone: "+phone);
            System.out.println("Address: "+Address);
        }


    }
    class Resturant{
        int resturantid;
        String name;
        String location;
        List<String>menulist=new ArrayList<>();
        menulist.add("Pizza");
    }
    

    
    public static void main(String[] args) {
        
    }
}
