class Solution {
    public boolean isPalindrome(String s) {
        String ns = "";
        int n = s.length();
        for(int i=0;i<n;i++){
            char p = s.charAt(i);
            if((p>='a' && p<='z') || (p>='A'&&p<='Z') || (p>='0'&&p<='9')){
                p = Character.toLowerCase(p);
                ns+=p;
            }
        }
        System.out.println(ns);
        int nq = ns.length();
        for(int i=0;i<nq/2;i++){
            if(ns.charAt(i)!=ns.charAt(nq-i-1)){
                return false;
            }
        }
        return true;
    }
}
