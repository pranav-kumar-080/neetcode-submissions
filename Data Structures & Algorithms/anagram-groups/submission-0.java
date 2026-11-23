class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();

        for(String s:strs){
            char [] carr=s.toCharArray();
            Arrays.sort(carr);
            String sstr=new String(carr);
            if(hm.containsKey(sstr)){
                hm.get(sstr).add(s);
            }
            else{
                List<String> l = new ArrayList<>();
                l.add(s);
                hm.put(sstr,l);
            }
        }
        return new ArrayList<>(hm.values());
    }
}
