class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();

        int time = 0;
        for (int i=0;i<tickets.length;i++) {

            q.add(i);

        }
        while (!q.isEmpty()) {
            time++;
            int h = q.poll();
            tickets[h]--;
            if (k == h && tickets[h] == 0) {
                return time;
            }
            if (tickets[h] != 0) {
                q.add(h);

            }
        }
        return time;

    }
}