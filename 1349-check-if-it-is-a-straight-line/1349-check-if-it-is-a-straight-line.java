class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int a0=coordinates[0][0];
        int b0=coordinates[0][1];
        int a1=coordinates[1][0];
        int b1=coordinates[1][1];

        if(coordinates.length==2){
            return true;
        }

        else{
            for(int i=2;i<coordinates.length;i++){
                int a=coordinates[i][0];
                int b=coordinates[i][1];

                if(((b-b0)*(a-a1))!=((b-b1)*(a-a0))){
                    return false;
                }
            }
            return true;
        }



    }
}
