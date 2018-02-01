package Algorithm;

/**
 * @author Hebh
 * @date 2018/2/1
 * @description:
 */
public class Solution771
{
    public int numJewelsInStones(String J, String S){
        if(J.length() == 0 || S.length() == 0){
            return 0;
        }

        int res = 0;
        int[] mapper = new int[75];
        for(int i = 0; i < J.length(); i++){
            mapper[J.charAt(i) - '0'] = 1;
        }
        for(int i = 0; i < S.length(); i++){
            if(mapper[S.charAt(i) - '0'] == 1){
                res ++;
            }
        }
        return res;
    }

    public static void main(String[] args){
        Solution771 s = new Solution771();
        System.out.println(s.numJewelsInStones("aA", "aAAbbbb"));
    }
}
