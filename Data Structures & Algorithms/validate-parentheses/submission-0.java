class Solution {
    public boolean isValid(String s) {
        Stack <Character> sta = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                sta.push(ch);
            }
            else{
                if(!sta.isEmpty()){
                char up = sta.peek();
                if((up == '(' && ch!=')') || (up == '{' && ch!='}') || (up == '[' && ch!=']')){
                    return false;
                } 
                sta.pop();
                }
                else{
                    return false;
                }
            }
        }
        return sta.isEmpty();
    }
}