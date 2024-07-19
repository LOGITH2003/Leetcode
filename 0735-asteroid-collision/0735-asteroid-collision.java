class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for(int n :asteroids)
        {
            // if stack is not empty and n is negative and stack.peek is positive
            if(!stack.isEmpty() && n<0 && stack.peek()>0 )
            {
                // if stack is not empty and stack.peek() is positive and n is negative and if convert into positive is large pop the stack
                while(!stack.isEmpty() && stack.peek()<(n*-1) && stack.peek()>0)
                {
                    stack.pop();
                }

                // if the stack is empty push or stack.peek and n is negative number is convert into positive are not same
                if(stack.isEmpty() || ( stack.peek() < (n*-1)))
                    stack.push(n);
                // both positive and negative number are same
                else if(!stack.isEmpty() && stack.peek() ==(n*-1))
                    stack.pop();
            }
            else
                stack.push(n);
        }

        // convert the stack to array
        int [] arr = new int[stack.size()];
        while(!stack.isEmpty())
            arr[stack.size()-1] = stack.pop();

        return arr;

    }
}