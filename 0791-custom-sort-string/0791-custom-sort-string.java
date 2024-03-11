class Solution {
    public String customSortString(String order, String s) {
        
        //create the new string to store the value
        String str = "";

        //convert the s string into character array
        char [] arr = s.toCharArray();

        //iterate the order string using for loop
        for(int i = 0 ; i < order.length() ; i++ )
        {
            //iterate the character array 
            for(int j = arr.length-1; j >=0 ; j-- )
            {
                if(arr[j] == order.charAt(i))
                {
                    str += arr[j];
                    arr[j] = '*';
                    
                }
            }
        }

        //iterate the character array
        for(char c : arr)
        {
            if(c != '*')
            {
                str += c;
            }
        }

        //returning the string 
        return str;
    }
}