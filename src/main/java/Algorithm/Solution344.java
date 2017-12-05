package Algorithm;

/**
 * @author Hebh
 * @date 2017/12/5
 * @description:
 */
public class Solution344 {
    public static void main(String[] args){
        System.out.println(new Solution344().reverseString("hello"));
    }

    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
