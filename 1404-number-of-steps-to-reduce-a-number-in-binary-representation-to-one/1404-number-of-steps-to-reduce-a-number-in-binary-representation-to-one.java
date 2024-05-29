class Solution {
    public int numSteps(String s) {
        
        int count = 0;
        char [] arr = s.toCharArray();

        for(int i = s.length()-1;i>0;i--){
            if(arr[i]=='1'){

                int index = i;
                while(true){

                    // condition 1:
                    if(arr[index]=='0'){
                        arr[index]='1';
                        i++;
                        break;
                    }
                    // condition 2:
                    else if(arr[index]=='1' && index==0){
                        count++;
                        i++;
                        break;
                    }
                    arr[index]='0';
                    index--;
                }
            }
            count++;
        }


        return count;
        
    }
}
