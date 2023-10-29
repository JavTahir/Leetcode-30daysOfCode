class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=00){
                if(i==nums.length-1){
                    sum=sum+nums[i];
                }
                else{
                    int count=0;
                    for(int j=i+1;j<nums.length;j++){
                        if(nums[i]==nums[j]){
                            nums[j]=00;
                            count++;
                        }
                        else{
                            continue;
                        }
                    }
                    if(count==0){
                        sum=sum+nums[i];
                    }
                   
                   
                }
            }
        }

        return sum;
        
    }
}