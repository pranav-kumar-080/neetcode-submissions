class Solution {
    public static void swap(int [] nums,int s,int e){
        for(int i=0;i<((e-s)/2);i++){
            int t = nums[i+s];
            nums[i+s] = nums[e-i-1];
            nums[e-i-1] = t;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        swap(nums,0,n);
        swap(nums,0,k);
        swap(nums,k,n);
    }
}