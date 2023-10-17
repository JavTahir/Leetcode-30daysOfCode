class Solution {
    public boolean isSubsequence(String s, String t) {
       

        char[] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();

        int len=ch1.length;
        int count=0;
        int k=0;

       
        for(int i=0;i<ch2.length;i++){
            if(len!=k){
                 if(ch2[i]==ch1[k]){
                count++;
                k++;
            }

            }
           
        }

        if(count==len){
            return true;
        }

        return false;

        
    }
}