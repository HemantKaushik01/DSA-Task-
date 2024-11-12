class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> li=new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();
        
    coinchange(nums,0,li,0,list);
        return list;
        
    }
    public static void coinchange(int []candidates,int sum,ArrayList<Integer> li,int idx,List<List<Integer>> list){
        //base case
        //if(sum==amount){
            //System.out.println(li);
            list.add(new ArrayList<>(li));
            //return;
        //}
        // if(sum>){
        //     return;
        // }
        //recursive call
        for(int i=idx;i<candidates.length;i++) {
            if(i>idx && candidates[i]==candidates[i-1]){
                continue;
            }
            li.add(candidates[i]);
            coinchange(candidates,sum+candidates[i],li,i+1,list);
            li.remove(li.size()-1);
        }
    }
    
}