class Solution {
    public String fractionAddition(String expression) {

        String [] arr = expression.split("(?=[+-]\\d+/\\d+)");
        int len = arr.length,count1 = 0,count2 = 0,index = 0;
        boolean flag = true;
        int [] nums1 = new int[len];
        int [] nums2 = new int[len];

        for(String s :arr)
        {
            String [] nums = s.split("/");

            nums1[index] = Integer.parseInt(nums[0]);
            nums2[index] = Integer.parseInt(nums[1]);
            count1+= nums1[index];
            count2+= nums2[index];

            if(nums2[0] != nums2[index++] && flag)
                flag = false;
        }

        if(flag)
        {
            if(count1 == 0)
                return "0/1";
            if(count1%nums2[0] == 0)
                return count1/nums2[0]+"/1";
            return count1+"/"+nums2[0];

        }
        else
        {
            int lcm = lcmOfArray(nums2),count = 0;
            for(int i = 0; i < len; i++)
            {
                count+= (nums1[i] * (lcm/nums2[i]));
            }
            if(count%lcm == 0)
                return String.valueOf(count/lcm)+"/1";
            else if(lcm%count == 0){
                if(count<0)
                    return "-1/"+lcm/count*-1;
                return "1/"+String.valueOf(lcm/count);
            }
            else
                return dividedBy(count,lcm);
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Function to return lcm of two numbers
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Function to return lcm of an array of numbers
    public static int lcmOfArray(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = lcm(result, arr[i]);
        }
        return result;
    }

    public static String dividedBy(int n1, int n2) {
        int [] arr = {2,3,5,7,9};
        for(int n : arr)
        {
            if(n1%n == 0 && n2%n == 0)
            {
                n1/=n;
                n2/=n;
                return dividedBy(n1,n2);
            }
        }
        return n1+"/"+n2;
    }
}