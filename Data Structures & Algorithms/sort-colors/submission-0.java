class Solution {
    public static void swap(int i,int j,int [] nums){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public void sortColors(int[] nums) {
        int n=nums.length;
        int l=0,m=0,h=n-1;
        while(m<=h){
            if(nums[m]==1){
                m++;
            }
            else if(nums[m]==0){
                swap(l,m,nums);
                l++;
                m++;
            }
            else{
                swap(h,m,nums);
                h--;
            }
        }
    }
}