class Solution {
    public int romanToInt(String s) {
        char[] ch= s.toCharArray();
        int num=0;
        int i=0;
        while(i<ch.length){
            char a=ch[i];
            if(a=='I'){
                if(i!=ch.length-1){
                    if(ch[i+1]=='V'){
                    num=num+4;
                    i=i+2;
                    continue;
                    
                  }
                    else if(ch[i+1]=='X'){
                    num=num+9;
                    i=i+2;
                    continue;
                    
                  }
                  else{
                      num=num+1;
                  }

                }

                else{
                    num=num+1;
                }
            }

            else if(a=='X'){
                if(i!=ch.length-1){
                    if(ch[i+1]=='L'){
                    num=num+40;
                    i=i+2;
                    continue;
                    
                   }
                    else if(ch[i+1]=='C'){
                    num=num+90;
                    i=i+2;
                    continue;
                    
                   }
                    else{
                    num=num+10;
                   }

                }
                
                else{
                    num=num+10;
                }
            }
            else if(a=='C'){
                if(i!=ch.length-1){
                    if(ch[i+1]=='D'){
                    num=num+400;
                    i=i+2;
                    continue;
                    
                    }
                    else if(ch[i+1]=='M'){
                    num=num+900;
                    i=i+2;
                    continue;
                    
                    }
                    else{
                    num=num+100;
                   }

                }
                
                else{
                    num=num+100;
                }
            }
            else if(a=='V'){
                num=num+5;
            }
            else if(a=='L'){
                num=num+50;
            }
            else if(a=='D'){
                num=num+500;
            }
            else if(a=='M'){
                num=num+1000;
            }
            i++;
        }
        return num;
        
    }
}