class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> list = new TreeMap<>(Collections.reverseOrder());
        for(int i = 0;i<names.length;i++)
            list.put(heights[i],names[i]);
        int count  = 0;
        String ans[] = new String[list.size()];
        for (String key : list.values()) {
            ans[count] = key;count++;}
        return ans;
    }
}