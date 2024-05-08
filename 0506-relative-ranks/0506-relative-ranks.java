class Solution {
    public String[] findRelativeRanks(int[] score) {
        // for the iterate purpose we need the array length
        int len = score.length;

        // sort the array in hashset
        TreeSet<Integer> ls = new TreeSet<>();
        for(int i : score)
            ls.add(i);

        //iterate the array and store in hashmap
        ArrayList<Integer> listval = new ArrayList<>(ls);
        HashMap<Integer,Integer> list = new HashMap<>();
        for(int i = len-1;i>=0;i--)
            list.put(listval.get(i), len-i);

        //create the string array and
        String [] arr = new String[len];
        for(int i = 0; i<len; i++){
            if(list.get(score[i])>3)
                arr[i] = Integer.toString(list.get(score[i]));
            else
                arr[i] = numString(list.get(score[i]));
        }


        return arr;
    }
    public static String numString(int n){
        if(n == 1)
            return "Gold Medal";
        else if(n==2)
            return "Silver Medal";
        else
            return "Bronze Medal";
    }
}