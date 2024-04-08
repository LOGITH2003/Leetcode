class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        
        ArrayList<Integer> list = new ArrayList<>();

        // convert the students array to list
        for(int n : students)
            list.add(n);

        // iterate the array
        for(int i = 0; i < sandwiches.length ; i++ ){
            if(list.contains(sandwiches[i]))
                list.remove((Integer) sandwiches[i]);
            else
                return list.size();

        }
        return 0;
        
    }
}