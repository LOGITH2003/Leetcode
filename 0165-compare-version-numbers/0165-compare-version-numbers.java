class Solution {
    public int compareVersion(String version1, String version2) {
        
        // split the string into array
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");

        // get the maximum size of the string array
        int size = Math.max(s1.length,s2.length);

        // iterate the array
        for(int i = 0;i<size;i++) {

            // compare the string which the two string size is greater than i and both string convert into Integer which the both value are same
            if(((i<s1.length && i<s2.length) && Integer.parseInt(s1[i]) == Integer.parseInt(s2[i])))
                continue;

            // compare the string which the two string size is greater than i and both string convert into Integer which the s1 string integer value is lesser than s2 string integer value
            else if ((i<s1.length && i<s2.length) && Integer.parseInt(s1[i]) < Integer.parseInt(s2[i]))
                return -1;

            // compare the string which the two string size is greater than i and both string convert into Integer which the  s1 string integer value is greater than s2 string integer value
            else if ((i<s1.length && i<s2.length) && Integer.parseInt(s1[i]) > Integer.parseInt(s2[i]))
                return 1;

            // if the s1 array size is high iterate the weather they have number is not zero
            else if(i<s1.length ){
                if(Integer.parseInt(s1[i])!=0)
                    return 1;
            }
            // if the s2 array size is high iterate the weather they have number is not zero
            else{
                if(Integer.parseInt(s2[i])!=0)
                    return -1;
            }
        }
        return 0;
    }
}