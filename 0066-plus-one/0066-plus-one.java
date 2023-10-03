class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            int x=digits[i]+1;
            if(x==10){
                digits[i]=0;
            }
            else{
                digits[i]=x;
                return digits;
            }


        }

        int res[]=new int[digits.length+1];
        res[0]=1;
        for(int i=1;i<=digits.length-1;i++){
            res[i]=digits[i];
        }
        return res;
    }
}