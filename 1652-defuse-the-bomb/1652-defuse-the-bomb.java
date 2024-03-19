class Solution {
    public int[] decrypt(int[] code, int k) {
        int len = code.length;

        // create the array
        int [] arr = new int [len];

        // if k is equal to zero
        if(k == 0)
            return arr;

        // condition 1 :
        if(k>0)
        {
            for(int i = 0 ; i < len ; i++)
            {

                int count = 0 , n = Math.abs(k) , pos = i+1;

                while(n!=0)
                {
                    if(pos == len)
                        pos =0;
                    count += code[pos++];
                    n--;
                }

                arr[i] = count;
            }
        } // condition 2 :
        else
        {

            for(int i = 0 ; i < len ; i++)
            {

                int count = 0 , n = Math.abs(k) , pos = i-1;

                while(n!=0)
                {
                    if(pos == -1)
                        pos =len-1;
                    count += code[pos--];
                    n--;
                }

                arr[i] = count;
            }
        }

        return arr;
    }
}