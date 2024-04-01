class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char [] S1 = s1.toCharArray();
        Arrays.sort(S1);
        s1 = new String(S1);
        for(int i = 0;i<=s2.length()-s1.length();i++){
            String str = s2.substring(i,s1.length()+i);
            if(CompareStr(s1,str))
                return true;
        }
        return false;
    }
    public  static  boolean CompareStr(String s1, String s2){
        char [] S2 = s2.toCharArray();
        Arrays.sort(S2);
        s2 = new String(S2);
        return s1.equals(s2);
    }
}