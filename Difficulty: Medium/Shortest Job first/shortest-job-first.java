// User function Template for Java

class Solution {
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int n = bt.length;
        int waitingTime = 0;
        int time = 0;
        for(int jobTime : bt){
            waitingTime += time;
            time += jobTime;
        }
        return waitingTime/n;
    }
}
