import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public  static  int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] nge=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=nums[i%n]){
                stack.pop();
            }
            if(i<n){
                if(!stack.isEmpty()){
                    nge[i]=stack.peek();
                }
                else{
                    nge[i]=-1;
                }
            }
            stack.push(nums[i%n]);

        }
        return nge;
    }

    public static void main(String[] args) {
        int[] arr={1,2,1};
        System.out.println(nextGreaterElements(arr));
    }
}
