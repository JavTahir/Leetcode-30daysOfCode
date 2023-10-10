class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int Perimeter=0;
        for(int i=nums.length-1;i>1;i--){
            int a=nums[i];
            int b=nums[i-1];
            int c=nums[i-2];
            if(a<b+c){
                Perimeter=a+b+c;
                return Perimeter;

            }
        }
        return 0;
        
    }
}