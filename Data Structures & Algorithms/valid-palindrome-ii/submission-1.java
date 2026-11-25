
class Solution {

    public static boolean find(String ns, boolean flag) {
        int nq = ns.length();

        for (int i = 0; i < nq / 2; i++) {

            if (ns.charAt(i) != ns.charAt(nq - i - 1)) {

                if (flag)
                    return false;

                else {
                    return find(ns.substring(i + 1, nq - i), true)
                        || find(ns.substring(i, nq - i - 1), true);
                }
            }
        }

        return true;
    }

    public boolean validPalindrome(String s) {

        String ns = "";
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char p = s.charAt(i);

            if ((p >= 'a' && p <= 'z') ||
                (p >= 'A' && p <= 'Z') ||
                (p >= '0' && p <= '9')) {

                p = Character.toLowerCase(p);
                ns += p;
            }
        }

        return find(ns, false);
    }
}
