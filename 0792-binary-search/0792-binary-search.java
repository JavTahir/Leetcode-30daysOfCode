class Solution {
    public int search(int[] nums, int target) {

        int i=0;
        int size=nums.length-1;
        while(i<=size){
            int mid=(size-i)+i/2;
            int x=nums[mid];

            if(x==target){
                return mid;
            }
            else if(target>x){
                i=mid+1;
            }
            else if(target<x){
                size=mid-1;
            }

        }

        return -1;
        
    }
}