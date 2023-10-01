class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int k=0;
        
        if (nums.length % 2 == 0) {
            for (int i = 0; i < n; i=i+2) {
               
                result[i] = nums[k];
                result[i + 1] = nums[n];
                n=n+1;
                k++;
            }
        } else {
            System.out.println("The array can't be shuffled");
        }

        return result;
    }
}
