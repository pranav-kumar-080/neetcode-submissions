class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if(n>m){
            return false;
        }

        HashMap<Character,Integer> hm = new HashMap<>();

        for(char ch : s1.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<n;i++){
            char ch = s2.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)-1);
            if(hm.get(ch) == 0){
                hm.remove(ch);
            }
        }

        if(hm.size() == 0){
            return true;
        }

        for(int i=n;i<m;i++){
            char ch = s2.charAt(i);
            char t = s2.charAt(i-n);

            hm.put(t,hm.getOrDefault(t,0)+1);
            hm.put(ch,hm.getOrDefault(ch,0)-1);

            if(hm.get(t) == 0){
                hm.remove(t);
            }
            if(t!=ch && hm.get(ch) == 0){
                hm.remove(ch);
            }

            if(hm.size() == 0){
                return true;
            }
        }

        return false;
    }
}
