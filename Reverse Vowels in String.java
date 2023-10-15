class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> res = new ArrayList<>();
        char[] ch=s.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            char v=Character.toLowerCase(ch[i]);

            if(v=='a' || v=='e' || v=='i' || v=='o' || v=='u'){
                res.add(ch[i]);
            }
        }

        

         for(int i=0;i<ch.length;i++){
             char v=Character.toLowerCase(ch[i]);
             if(v=='a' || v=='e' || v=='i' || v=='o' || v=='u'){ 
                ch[i]=res.remove(0);
            }
         }

         String str = new String(ch);
         return str;

        
    }
}