class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // create the list of lists to return output
        List<List<String>> list = new ArrayList<>();

        // create the hash set to store the sorted string for future purpose
        HashSet<String> set = new HashSet<>();

        // create the string array to store the sorted string
        String[] sorted = new String[strs.length];

        for (int i = 0; i < strs.length; i++) {

            // create the character to store the string character
            char[] str = strs[i].toCharArray();

            // sort the character array
            Arrays.sort(str);

            // add the sorted character array to the hash set
            set.add(new String(str));

            // to store the sorted character array in the sorted array
            sorted[i] = new String(str);
        }
        try {
            // iterate through the hash set
            for (String s : set) {
                // create the list to store the strings with the same sorted string
                List<String> ls = new ArrayList<>();
                // iterate through the string array
                for (int i = 0; i < strs.length; i++) {
                    // if the string is equal to the sorted string then add the string to the list
                    if (s.equals(sorted[i])) {
                        // add the string to the list
                        ls.add(strs[i]);
                    }
                }
                // add the list to the list of lists
                list.add(ls);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        // return the list of lists
        return list;
    }
}