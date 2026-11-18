import java.util.*;
public class FractionalKnapsack {
static class Item {
int weight, profit;
double ratio;
Item(int weight, int profit) {
this.weight = weight;
this.profit = profit;
this.ratio = (double) profit / weight;
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of items: ");
int n = sc.nextInt();
Item[] items = new Item[n];
for (int i = 0; i < n; i++) {
System.out.print("Enter weight and profit of item " + (i + 1) + ": ");
int w = sc.nextInt();
int p = sc.nextInt();
items[i] = new Item(w, p);
}
System.out.print("Enter knapsack capacity: ");
int capacity = sc.nextInt();
Arrays.sort(items, (a, b) ->
Double.compare(b.ratio, a.ratio));
double maxProfit = 0;
int remaining = capacity;
for (Item item : items) {
if (remaining == 0)
break;
if (item.weight <= remaining) {
remaining -= item.weight;
maxProfit += item.profit;
} else {
double fraction =
(double) remaining / item.weight;
maxProfit += item.profit * fraction;
remaining = 0;
}
}

System.out.printf("Maximum Profit = %.2f%n", maxProfit);
sc.close();
}
}