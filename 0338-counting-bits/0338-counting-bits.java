class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];

        for(int i=0;i<=n;i++){
            int count=Binary(i);
            arr[i]=count;

        }

        return arr;
        
    }

    public static int Binary(int n){
        if(n==0){
            return 0;
        }
        else{
                  ArrayList<Integer> list = new ArrayList<>();
                  while(n>0){
                      int a=n%2;
                       n=n/2;
                      list.add(a);
                  }
                    int one=0;
                  for(int i=0;i<list.size();i++){
                      int x=list.get(i);
                      if(x==1){
                          one++;
                      }

                  }
                  return one;
        }
    }
}