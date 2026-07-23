class Solution {
    public int majorityElement(int[] nums) {
        int n = 0;
        int count =  0;
        for(int num : nums){
            if(count == 0){
                n = num;
            }
            if (num  == n){
                count ++;
            }else {
                count --;
            }
        }
        return n;
    }
}