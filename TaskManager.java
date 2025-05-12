class TaskManager {
    PriorityQueue<int []> pq; //max heap banani hai
    Map<Integer,int[]> map;

    public TaskManager(List<List<Integer>> tasks) {
        pq = new PriorityQueue<>((a,b)->{
            if(b[2] != a[2]) return b[2] - a[2];
            return b[1] - a[1];
        });

        map = new HashMap<>();

        for(List<Integer> list : tasks){
            int userId = list.get(0);
            int taskId = list.get(1);
            int priority = list.get(2);

            int [] task = new int[3];
            task[0] = userId;
            task[1] = taskId;
            task[2] = priority;

            map.put(taskId,task);
            pq.offer(task);
        }
    }

    public void add(int userId, int taskId, int priority) {
        int [] task = new int[3];
        task[0] = userId;
        task[1] = taskId;
        task[2] = priority;

        pq.offer(task);
        map.put(taskId,task);
    }

    public void edit(int taskId, int newPriority) {
        int [] old = map.get(taskId);
        int [] updated = new int[3];

        updated[0] = old[0];
        updated[1] = old[1];
        updated[2] = newPriority;

        map.put(taskId,updated);
        pq.offer(updated);

    }

    public void rmv(int taskId) {
        map.remove(taskId);
    }

    public int execTop() {
        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int[] current = map.get(top[1]);

            if (current != null &&
                    current[0] == top[0] &&
                    current[1] == top[1] &&
                    current[2] == top[2]) {
                map.remove(top[1]);
                return top[0];
            }
        }

        return -1;
    }
}
