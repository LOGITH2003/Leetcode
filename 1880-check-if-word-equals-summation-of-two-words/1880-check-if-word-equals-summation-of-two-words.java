class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int n1 = 0, n2 = 0,n3 = 0;
       for(int i = 0; i <=8; i++) {
           if (i < firstWord.length())
               n1 = (n1 * 10) + firstWord.charAt(i) - 97;
           if (i < secondWord.length())
               n2 = (n2 * 10) + secondWord.charAt(i) - 97;
           if (i < targetWord.length())
               n3 = (n3 * 10) + targetWord.charAt(i) - 97;
       }
       
       return n1+n2 == n3;
    }
}