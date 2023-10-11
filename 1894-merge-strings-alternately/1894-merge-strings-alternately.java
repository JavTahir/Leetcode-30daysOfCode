class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] ch1=word1.toCharArray();
        char[] ch2=word2.toCharArray();
        int a=ch1.length;
        int b=ch2.length;
        int size=a+b;
        char[] charArray=new char[size];
        int k=0;

        for(int i=0;i<ch1.length;i++){
            if(i==b){
                break;
            }
            charArray[k]=ch1[i];
            k++;
            for(int j=i;j<=i;j++){
                charArray[k]=ch2[j];
            }
            k++;
        }

        if(a<b){
            for(int i=a;i<ch2.length;i++){
                charArray[k]=ch2[i];
                k++;
            }
        }
        else if(a>b){
             for(int i=b;i<ch1.length;i++){
                charArray[k]=ch1[i];
                k++;
            }
        }

        String str=new String(charArray);
        return str;
        
    }
}