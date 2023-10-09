class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();


        for(int i=left;i<=right;i++){
            if(i>9 ){
                int rem=i%10;
                if(rem!=0){
                    int div=i/10;
                    while(rem!=0){
                        if((i%rem==0) && (div<10) && (i%div==0) ){
                            list.add(i);
                            break;
                        }
                        else if(div>10 ){
                            if(i%rem!=0){
                                break;
                            }
                            else{
                                rem=div%10;
                                div=div/10;
                            }
                             
                        }
                        else{
                            break;

                        }
                      
                       
                        
                    }

                }
                else{
                    continue;
                }

            }
            else{
                if(i>0){
                    list.add(i);
                }
                
            }
        }
        return list;  
        
    }
}