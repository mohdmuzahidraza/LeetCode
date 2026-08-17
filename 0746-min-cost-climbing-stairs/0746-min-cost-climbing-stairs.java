class Solution {
    public int minCost(int[] cost, int idx, int[] d){
        if(idx==0 || idx==1){
            return cost[idx];
        }
        if(d[idx] != -1){
            return d[idx];
        }
        return d[idx] = cost[idx] + Math.min(minCost(cost, idx-1, d), minCost(cost, idx-2,d));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] d = new int[n];
        Arrays.fill(d, -1);
        return Math.min(minCost(cost, n-1, d), minCost(cost, n-2, d));
        
    }
}