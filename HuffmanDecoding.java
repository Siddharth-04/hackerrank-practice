class Node {
    public int frequency; // the frequency of this tree
    public char data;
    public Node left, right;

}
class HuffmanDecoding {
    void decode(String s, Node root) {

        Node temp = root;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '0') {
                temp = temp.left;
            }

            if (c == '1') {
                temp = temp.right;
            }

            if (temp.left == null && temp.right == null) {
                System.out.print(temp.data);
                temp = root;
            }
        }

    }
}