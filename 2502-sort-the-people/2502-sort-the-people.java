class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for (int i=0;i<heights.length-1;i++){
            for(int j=i+1;j<heights.length;j++){
                if(heights[i]>heights[j]){
                    continue;
                }
                else{
                    String temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;

                   int temp1=heights[i];
                   heights[i]=heights[j];
                   heights[j]=temp1;

                }
            }
        }

        return names;
        
    }

   
}