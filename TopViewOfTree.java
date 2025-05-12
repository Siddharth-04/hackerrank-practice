class Node{
    int data;
    Node left;
    Node right;
}

class Pair{
    Node node;
    int index;

    Pair(Node node,int index){
        this.node = node;
        this.index = index;
    }
}
public class TopViewOfTree {
    public static void topView(Node root) {
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            Node front = p.node;
            int line = p.index;

            if (!map.containsKey(line)) {
                map.put(line, front.data);
            }

            if (front.left != null) {
                queue.add(new Pair(front.left, line - 1));
            }

            if (front.right != null) {
                queue.add(new Pair(front.right, line + 1));
            }
        }

        for (int key : map.keySet()) {
            System.out.print(map.get(key) + " ");
        }
    }
}