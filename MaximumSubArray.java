
class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int localMax = nums[0];
        int globalMax = nums[0];
        for(int i=1; i<nums.length; i++){
            localMax = Math.max(nums[i]+localMax, nums[i]);
            globalMax = Math.max(localMax, globalMax);
        }
    return globalMax;
    }
}

//Time Complexity = O(n)
//Space Complexity = O(1)