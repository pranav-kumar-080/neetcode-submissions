class Solution {
    public int numRescueBoats(int[] people, int limit) {

        int n = people.length;

        Arrays.sort(people);

        int i = 0,j = n-1;

        int c = 0;

        while(i<=j){
            int sum = people[i]+people[j];

            if(sum>limit){
                c++;
                j--;
            }
            else{
                c++;
                i++;
                j--;
            }
        }

        return c;
    }
}