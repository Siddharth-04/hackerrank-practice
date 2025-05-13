class Pair{
    int first;
    int second;

    public Pair(int a,int b){
        first = a;
        second = b;
    }
}

public class DownToZero2 {
    public static int downToZero(int n) {
        // Write your code here
        Queue<Pair> q = new LinkedList<>();
        Set<Integer> vis = new HashSet<>();

        q.add(new Pair(n, 0));
        vis.add(n);

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            int num = curr.first;
            int moves = curr.second;

            if (num == 0) return moves;

            //first operation -- decrement
            if (!vis.contains(num - 1)) {
                q.add(new Pair(num - 1, moves + 1));
                vis.add(num - 1);
            }

            //second operation
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    int a = i;
                    int b = num / i;

                    int maxAB = Math.max(a, b); //max factor

                    if (!vis.contains(maxAB)) {
                        q.add(new Pair(maxAB, moves + 1));
                        vis.add(maxAB);
                    }
                }
            }
        }

        return -1;

    }
}
