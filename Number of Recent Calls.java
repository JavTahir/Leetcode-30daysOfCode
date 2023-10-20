class RecentCounter {
     private ArrayList<Integer> list;

    public RecentCounter() {
        list = new ArrayList<>();
        
    }
    
    public int ping(int t) {
        list.add(t);
        int x=t-3000;
        int index=list.indexOf(t);
        int count=1;
        if(index==0){
            return count;
        }
        else{
            if(x<t){
                for(int i=0;i<list.size()-1;i++){
                    int y=list.get(i);
                    if(y>=x && y<=t){
                        count++;
                    }
                }
            }
            else{
                  for(int i=1;i<list.size()-1;i++){
                    int y=list.get(i);
                    if(y>=t && y<=x){
                        count++;
                    }
                }

            }
        }

        return count;

        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */