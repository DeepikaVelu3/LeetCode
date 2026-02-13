class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
     int n=nums.length;
     List<Integer> list=new ArrayList<>();
     int missing=1;
     Arrays.sort(nums);
     for(int i=0;i<n;i++){
        if(nums[i]==missing){
            missing++;
        }
        
        else if(nums[i]>missing){
            list.add(missing);
            missing++;
            i--;
        }
     }  
     while(missing<=nums.length){
            list.add(missing);
            missing++;
        }
     return list; 
    }
}