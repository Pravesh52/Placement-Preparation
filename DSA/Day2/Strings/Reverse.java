public class Reverse {
    public static void main(String[] args) {
        String str="Pravesh";
       char[]ch=str.toCharArray();
       int start=0;
       int end=ch.length-1;

       while(start<end){
        char temp=ch[start];
        ch[start]=ch[end];
        ch[end]=temp;

        start++;
        end--;

       }

       String reverseString=new String(ch);

       System.out.println(reverseString);






        
    }
}
