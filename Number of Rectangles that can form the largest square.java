Runtime
Details
3ms
Beats 38.03%of users with Java
Memory
Details
44.31MB
Beats 17.06%of users with Java





class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int rows=rectangles.length;
        int MaxLength=0;

        for(int i=0;i<rows;i++){
            int j=0;
            int x=Math.min(rectangles[i][j], rectangles[i][j+1]);
            if(x>MaxLength){
                MaxLength=x;
            }
        }

        int count=0;
          for(int i=0;i<rows;i++){
            int j=0;

            if(Math.min(rectangles[i][j], rectangles[i][j+1])==MaxLength){
                if(rectangles[i][j]+rectangles[i][j+1]==MaxLength ||rectangles[i][j]==MaxLength || rectangles[i][j+1]==MaxLength){
                                count++;
            }
            }
           
          
        }

        return count;
    }
}