class Solution {
    public int countDays(int[] weights, int mid){
        int sum = 0;
        int days = 1;
        for(int num : weights){
                if(sum + num > mid){
                    days += 1;
                    sum = num;
                }
                else{
                    sum +=num;
                }
                }
                return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
    for(int num : weights){
        low =  Math.max(low,num);
        high += num;
    }
    while(low < high){
        int mid = (low + high)/2;
        if(countDays(weights,mid) <= days){
            high = mid;
        }
        else{
            low = mid+1;
        }
    }
    return low;
       
    }
}