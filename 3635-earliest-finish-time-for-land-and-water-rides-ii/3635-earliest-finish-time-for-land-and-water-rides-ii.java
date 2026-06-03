class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {

        int minLandEnd = Integer.MAX_VALUE;
        for (int i = 0; i < landStartTime.length; i++) {
            minLandEnd = Math.min(minLandEnd,
                    landStartTime[i] + landDuration[i]);
        }
        
        int minWaterEnd = Integer.MAX_VALUE;
        for (int j = 0; j < waterStartTime.length; j++) {
            minWaterEnd = Math.min(minWaterEnd,
                    waterStartTime[j] + waterDuration[j]);
        }
        int ans = Integer.MAX_VALUE;
        for (int j = 0; j < waterStartTime.length; j++) {
            ans = Math.min(ans,
                    Math.max(minLandEnd, waterStartTime[j]) + waterDuration[j]);
        }
        for (int i = 0; i < landStartTime.length; i++) {
            ans = Math.min(ans,
                    Math.max(minWaterEnd, landStartTime[i]) + landDuration[i]);
        }

        return ans;
    }
}