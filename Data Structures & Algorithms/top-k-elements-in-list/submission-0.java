class Pair{
    int val,freq;
    Pair(int i,int j){
        val=i;
        freq=j;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] res=new int[k];
        HashMap <Integer,Integer> map=new HashMap<>();
        int n=nums.length,c=0;
        for(int i:nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->b.freq-a.freq);
        for(int i:map.keySet()){
            pq.add(new Pair(i,map.get(i)));
        }

        for(int i=0;i<k;i++){
            res[i]=pq.poll().val;
        }
        return res;
    }
}