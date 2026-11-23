class Solution {
    public static void mergeSort(int [] nums,int low,int mid,int high){
        int [] temp = new int [high-low+1];
        int i = low;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=high){
            if(nums[i]<nums[j]){
                temp[k++] = nums[i++];
            }
            else{
                temp[k++] = nums[j++];
            }
        }
        while(i<=mid){
            temp[k++] = nums[i++];
        }
        while(j<=high){
            temp[k++] = nums[j++];
        }
        for(int i1=0;i1<=high-low;i1++){
            nums[i1+low] = temp[i1];
        }
    }
    public static void merge(int [] nums,int low,int high){
        int mid = (low+high)/2;
        if(low<high){
        merge(nums,low,mid);
        merge(nums,mid+1,high);
        mergeSort(nums,low,mid,high);
        }
    }
    public int[] sortArray(int[] nums) {
        merge(nums,0,nums.length-1);
        return nums;
    }
}