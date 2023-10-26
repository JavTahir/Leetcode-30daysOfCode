Runtime
Details
2ms
Beats 85.22%of users with Java





class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
               ArrayList<Integer> List = new ArrayList<>();
      Arrays.sort(nums);
       int k=0;
      for(int i=0;i<nums.length;i++){
          if(i!=nums.length-1 &&nums[i]==target && nums[i+1]!=target){
              List.add(i);
              break;
          }
          else{
              if(nums[i]==target){
                  List.add(i);
                  k++;
              }
              else{
                  continue;
              }
          }


      }

      
      return List;

        
    }
}