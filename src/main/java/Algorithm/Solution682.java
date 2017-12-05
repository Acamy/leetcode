package Algorithm;

import java.util.Stack;

/**
 * @author Hebh
 * @date 2017/12/5
 * @description:
 */
public class Solution682 {
    public static void main(String[] args){
        String[] ops = {"5","-2","4","C","D","9","+","+"};
        System.out.println(new Solution682().calPoints(ops));
    }
    public int calPoints(String[] ops) {
        int res = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for(String op : ops){
            if("+".equals(op)){
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            }else if("C".equals(op)){
                stack.pop();
            }else if("D".equals(op)){
                stack.push(2 * stack.peek());
            }else{
                stack.push(Integer.valueOf(op));
            }
        }
        for(int i : stack){
            res += i;
        }
        return res;
    }
}
