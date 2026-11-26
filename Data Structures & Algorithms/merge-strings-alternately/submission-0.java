class Solution {
    public String mergeAlternately(String s1, String s2) {
     int i = 0,j = 0;
     int n = s1.length();
     int m = s2.length();

     String res = "";

     while(i<n && j<m){
        res+=s1.charAt(i);
        res+=s2.charAt(j);
        i++;
        j++;
        if(i == n){
            for(int t = j;t<m;t++){
                res+=s2.charAt(t);
            }
        }
        if(j == m){
            for(int t = i;t<n;t++){
                res+=s1.charAt(t);
            }
        }
     }  
     return res; 
    }
}