/**
 * Created by qin on 2016/10/19.
 */
public class Main {
    public static void main(String[] args) {
//        String s = "eabcdabcf";
//        String s = "abcabcbb";
//        String s = "";
        String s = "abcdacdefgbcdefabcdef";
//        String s = "abcdeaecdabefacgbcdecdeaafdbgagfdcbeffcaefdcbdef";
        if(findStr(s)!=null)
            System.out.println(findStr(s).length());
        else System.out.println(0);
    }
    public  static String findStr(String s){
        if(s==null || s.equals("")){
            return null;
        }
        //最长重复子串的长度
        int max=0;
        //最长重复子串的第一个字符在s中的下标
        int first=0;
        String res = null;
        //i为每次循环设定的字符串比较间隔：1,2，...，s.length()-1
        for(int i=1;i<s.length();i++){
            for(int k=0,j=0;j<s.length()-i;j++){
                if(s.charAt(j)==s.charAt(j+i))
                    k++;
                else
                    k=0;
                if(k>max){
                    max=k;
                    first=j-max+1;
                }
            }
            if(max>0){
                res = s.substring(first, first+max);
            }
        }
        return res;
    }
}

