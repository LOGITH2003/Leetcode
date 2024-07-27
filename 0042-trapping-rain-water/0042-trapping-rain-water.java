class Solution {
    public int trap(int[] height) {

        int count = 0, index = 0;
        while(index < height.length){
            if(height[index]>0)
                break;
            index++;
        }
        int left = index, right = height.length - 1,leftmax = 0,rightmax = 0;

        while(left < right){

            leftmax = Math.max(leftmax, height[left]);
            rightmax = Math.max(rightmax, height[right]);
            if(height[left] == height[right]){
                right--;
            }
            if(height[left] < height[right]){
                if(height[left] < leftmax){
                    count += leftmax - height[left];
                }
                left++;
            }
            else{
                if(height[right] < rightmax){
                    count += rightmax - height[right];
                }
                right--;
            }
            
        }

        return count;
    }
}