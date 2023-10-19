class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        ArrayList<Integer> List = new ArrayList<Integer>();

        int unique=1;
        int str=00;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=str){
                if(i==arr.length-1){
                    List.add(unique);
                    break;
                }

                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        arr[j]=str;
                        unique++;
                    }
                }
                List.add(unique);
                unique=1;
            }
        }

        for (int i = 0; i < List.size()-1; i++) {
            int currentElement = List.get(i);
           
           
            for (int j = i + 1; j < List.size(); j++) {
                int nextElement = List.get(j);
               
              
                if (currentElement == nextElement) {
                    return false;
                }
            }
            
        }
        return true;


        
    }
}