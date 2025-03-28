class Solution {
   
    static public int[] maxPoints(int[][] grid, int[] queries) {
        int r = grid.length, c = grid[0].length, n = queries.length;
        int[][] arr = new int[n][2];
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i][0] = queries[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.add(new int[] { grid[0][0], 0, 0 });
        boolean[][] visited = new boolean[r][c];
        visited[0][0] = true;

        int x = 0, size = 1;
        for (int k = 0; k < n; k++) {
            int current = arr[k][0];

            while (size > 0 && pq.peek()[0] < current) {
                int[] temp = pq.poll();
                x++;
                size--;
                int i = temp[1], j = temp[2];

                if (j - 1 >= 0 && !visited[i][j - 1]) {
                    pq.add(new int[] { grid[i][j - 1], i, j - 1 });
                    visited[i][j - 1] = true;
                    size++;
                }

                if (i - 1 >= 0 && !visited[i - 1][j]) {
                    pq.add(new int[] { grid[i - 1][j], i - 1, j });
                    visited[i - 1][j] = true;
                    size++;
                }

                if (j + 1 < c && !visited[i][j + 1]) {
                    pq.add(new int[] { grid[i][j + 1], i, j + 1 });
                    visited[i][j + 1] = true;
                    size++;
                }

                if (i + 1 < r && !visited[i + 1][j]) {
                    pq.add(new int[] { grid[i + 1][j], i + 1, j });
                    visited[i + 1][j] = true;
                    size++;
                }
            }
            
            ans[arr[k][1]] = x;
        }
        return ans;
    }
}