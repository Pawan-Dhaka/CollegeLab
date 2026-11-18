import java.util.*;
public class HuﬀmanCoding {
static class Node {
char ch;
int freq;
Node left, right;
Node(char ch, int freq) {
this.ch = ch;
this.freq = freq;
}
Node(int freq, Node left, Node right) {
this.freq = freq;
this.left = left;
this.right = right;
}
}
static void printCodes(Node root, String code) {
if (root == null)
return;
if (root.left == null && root.right == null) {
System.out.println(root.ch + " : " + code);
return;
}
printCodes(root.left, code + "0");
printCodes(root.right, code + "1");
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of characters: ");
int n = sc.nextInt();
PriorityQueue<Node> pq =
new PriorityQueue<>(
Comparator.comparingInt(x -> x.freq));
for (int i = 0; i < n; i++) {
System.out.print("Enter character and frequency: ");
char ch = sc.next().charAt(0);
int freq = sc.nextInt();
pq.add(new Node(ch, freq));
}
while (pq.size() > 1) {
Node left = pq.poll();
Node right = pq.poll();
pq.add(new Node(left.freq + right.freq,
left, right));
}
Node root = pq.poll();
System.out.println("Huﬀman Codes:");
printCodes(root, "");
sc.close();
}
}
