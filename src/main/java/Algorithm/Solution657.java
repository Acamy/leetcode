package Algorithm;

/**
 * @author Hebh
 * @date 2017/12/3
 * @description:
 */
public class Solution657 {
    public static void main(String[] args){
        Solution657 solution657 = new Solution657();
        System.out.println(solution657.judgeCircle("UDRL"));

    }

    public boolean judgeCircle(String moves) {
        int x = 0,y = 0;
        for(int i = 0;i < moves.length();i ++){
            char c = moves.charAt(i);
            switch (c){
                case 'R':
                    x ++;
                    break;
                case 'L':
                    x --;
                    break;
                case 'U':
                    y ++;
                    break;
                case 'D':
                    y --;
                    break;
                default:
                    break;
            }

        }
        if(x ==0 && y == 0){
            return true;
        }
        return false;
    }
}
