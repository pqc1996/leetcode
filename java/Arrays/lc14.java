package Arrays;

public class lc14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)return "";
        String res = strs[0];
        for(int i = 0 ;i<strs.length ;i++){
            int j = 0;
            for(;j<res.length()&&j<strs[i].length() ;j++){
                if(res.charAt(j) != strs[i].charAt(j)) break;
            }
            res = res.substring(0, j);
            if(res.equals("")) return "";
        }
        return res;
    }
}
