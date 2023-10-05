class Solution {
    public int diagonalSum(int[][] mat) {

        int rows=mat.length;
        int secondary=rows-1;
        int sum=0;

        for(int i=0; i<rows ; i++){
            for(int j=i;j<=i;j++){
                if(j==secondary){
                    sum=sum+mat[i][j];
                }
                else{
                    sum=sum+mat[i][j]+mat[i][secondary];
                }
            }
            secondary=secondary-1;
        }
        
      return sum;  
    }
}