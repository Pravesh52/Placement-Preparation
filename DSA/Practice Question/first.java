import java.util.Stack;

public class first {
    public static void main(String[] args) {
        String str="G**gle*";

        Stack<Character>stack=new Stack<>();

        for(char ch: str.toCharArray()){
            if(ch=='*'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                    stack.push(ch);
                }
                
            
        }

        StringBuilder ans=new StringBuilder();

        for(char ch:stack){
            ans.append(ch);
        }

        System.out.println(ans.toString());
    }
}
