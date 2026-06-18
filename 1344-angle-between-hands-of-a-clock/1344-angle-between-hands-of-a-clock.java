class Solution {
    public double angleClock(int hour, int minutes) {
        double hourHand =(hour % 12)*30 + (minutes * 0.5);
        double minHand = minutes * 6;
        double diff = Math.abs(hourHand - minHand) ;
        return Math.min(diff,360-diff) ;
    }
}