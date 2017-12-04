package Algorithm;

/**
 * @author Hebh
 * @date 2017/12/4
 * @description:
 */
public class Solution557 {
    public static void main(String[] args){
        System.out.println(new Solution557().reverseWords("Let's take LeetCode contest"));
    }
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for(String word : words){
            sb.append(new StringBuilder(word).reverse().toString() + " ");
        }
        return sb.toString().trim();
    }
}
