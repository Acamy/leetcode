package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Hebh
 * @date 2017/12/4
 * @description:
 */
public class Solution500 {
    public static void main(String[] args){
        String[] in = {"qz","wq","asdddafadsfa","adfadfadfdassfawde"};
        System.out.println(Arrays.toString(new Solution500().findWords(in)));
    }
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<String>();
        String row1 = "qwertyuiopQWERTYUIOP";
        String row2 = "asdfghjklASDFGHJKL";
        String row3 = "zxcvbnmZXCVBNM";
        for(String word : words){
            int i = 0,j = 0,k = 0;
            for(int t = 0; t < word.length(); t ++){
                char c = word.charAt(t);
                if(row1.indexOf(c) >= 0){
                    i ++;
                }
                else if(row2.indexOf(c) >= 0){
                    j ++;
                }
                else if(row3.indexOf(c) >= 0){
                    k ++;
                }
            }
            if(i * j == 0 && i * k == 0 && j * k == 0){
                list.add(word);
            }
        }
        String[] array = new String[list.size()];
        return list.toArray(array);
    }
}
