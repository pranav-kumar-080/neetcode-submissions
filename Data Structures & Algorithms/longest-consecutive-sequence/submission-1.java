class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxi = 0;
        for(int i:nums){
            set.add(i);
        }
        for(int i:nums){
            if(!set.contains(i-1)){
                int k = i+1;
                int res = 1;
                while(true){
                    if(set.contains(k)){
                        res++;
                        k++;
                    }
                    else{
                        break;
                    }
                }
                maxi = Math.max(maxi,res);
            }
        }
        return maxi;
    }
}
