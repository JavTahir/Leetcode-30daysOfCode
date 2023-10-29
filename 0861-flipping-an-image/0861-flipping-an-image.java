class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int rows = image.length; 
        int cols = image[0].length; 

        int[][] newMatrix = new int[rows][cols]; 

        int l=0;
        int k=0;

        for(int i=0;i<rows;i++){
            for(int j=cols-1;j>=0;j--){
                int x=image[i][j];
                if(x==0){
                    image[i][j]=1;
                }
                else{
                    image[i][j]=0;
                }

                newMatrix[l][k]=image[i][j];
                k++;
            }
            l++;
            k=0;
        }

        return newMatrix;

        
    }
}