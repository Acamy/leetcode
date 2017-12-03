package Algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hebh
 * @date 2017/12/3
 * @description:
 */
public class Solution728 {
    public static void main(String[] args){
        List<Integer> list = selfDividingNumbers(1,22);
        for(int i = 0;i < list.size();i ++){
            System.out.println(list.indexOf(i));
        }
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = left;i <= right;i ++){
            boolean flag = true;
            String str = String.valueOf(i);
            if(str.contains("0")){
                flag = false;
            }else{
                for(int j = 0; j < str.length();j ++){
                    int tmp = Integer.valueOf(String.valueOf(str.charAt(j)));

                    if(i % tmp != 0) {
                        flag = false;
                    }
                }
            }

            if(flag){
                list.add(i);
            }
        }
        return list;
    }
}
