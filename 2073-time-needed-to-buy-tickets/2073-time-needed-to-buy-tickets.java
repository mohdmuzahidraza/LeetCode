class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        int n = tickets.length;
        for(int i = 0; i < n; i++){
            q.add(i);
        }
        int time = 0;
        while(tickets[k] > 0){
            int person = q.poll();
            tickets[person]--;
            time++;

            if(tickets[person] > 0){
                q.add(person);
            }
        }
        return time;
    }
}