class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        int start = 0;
        int total = 0;

        for (int i = 0; i < gas.length; i++) {
            int net = gas[i] - cost[i];
            // System.out.println("net: " + net);
            total += net;
            tank += net;
            // System.out.println("tank: " + tank);

            if (tank < 0) {
                start = i+1;
                // System.out.println("start moved to " + start);
                tank = 0;
            }
        }

        // System.out.println("total: " + total);
        return total < 0 ? -1 : start;
    }
}