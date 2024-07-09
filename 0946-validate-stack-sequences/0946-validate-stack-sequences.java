class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> list = new Stack<>();
        int index1 = 0, index2 = 0;
        
        while(index1 < pushed.length || index2 < popped.length) {
            
            // condition 1:
            if(index1<pushed.length) {
                list.push(pushed[index1++]);
            }

            // condition 2:
            while(!list.isEmpty() && index2<popped.length&&list.peek() == popped[index2]) {
                list.pop();
                index2++;
            }
            
            // condition 3:
            if(index1>=pushed.length && !list.isEmpty() && index2<popped.length&&list.peek() != popped[index2]) {
                return false;
            }
        }
        
        return list.isEmpty();        
    }
}