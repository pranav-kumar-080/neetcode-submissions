class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        Arrays.sort(strs);
        String a = strs[0];
        String b = strs[n-1];

        if(a.length() == 0 || a.charAt(0) != b.charAt(0)){
            return "";
        }

        for(int i=0;i<Math.min(a.length(),b.length());i++){
            if(a.charAt(i)!=b.charAt(i)){
                return a.substring(0,i);
            }
        }
        return a;
    }
}