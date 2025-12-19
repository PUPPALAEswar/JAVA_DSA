import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>hash=new HashMap<>();
        int l=nums.length;
        for(int i=0;i<l;i++){
            int n=nums[i];
            hash.put(n,hash.getOrDefault(n,0)+1);
            // if(hash.containsKey(n)){
            //     int prev=hash.get(n);
            //     hash.put(n,prev+1);
            // }
            // else{
            //     hash.put(n,1);
            // }
        }
        for(int num:hash.keySet()){
             if( hash.get(num)>l/2){
                return num;
             }
        }
        return -1;
    }
}
