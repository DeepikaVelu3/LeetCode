import java.util.*;

class Solution {
    public int[] shuffle(int[] nums, int n) {

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        int[] arr = new int[nums.length];

        for(int i = 0; i < n; i++){
            q1.add(nums[i]);
        }

        for(int i = n; i < nums.length; i++){
            q2.add(nums[i]);
        }

        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                arr[i] = q1.poll();
            } else {
                arr[i] = q2.poll();
            }
        }

        return arr;
    }
}
