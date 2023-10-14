class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> res = new ArrayList<>();

        for(int i=0;i<candies.length;i++){
            int max=Arrays.stream(candies).max().getAsInt();
           

            if(candies[i] + extraCandies>=max){
                res.add(true);
            }
            else{
                res.add(false);
            }
            

        }
        return res;
        
    }
}