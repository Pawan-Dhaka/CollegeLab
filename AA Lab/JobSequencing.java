import java.util.*;
public class JobSequencing {
static class Job {
String id;
int deadline, profit;
Job(String id, int deadline, int profit) {
this.id = id;
this.deadline = deadline;
this.profit = profit;
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of jobs: ");
int n = sc.nextInt();
Job[] jobs = new Job[n];
int maxDeadline = 0;
for (int i = 0; i < n; i++) {
System.out.print("Enter job id, deadline and profit: ");
String id = sc.next();
int d = sc.nextInt();
int p = sc.nextInt();
jobs[i] = new Job(id, d, p);
maxDeadline = Math.max(maxDeadline, d);
}
Arrays.sort(jobs, (a, b) -> b.profit - a.profit);
String[] slot = new String[maxDeadline + 1];
int totalProfit = 0;
for (Job job : jobs) {
for (int t = job.deadline; t >= 1; t--) {
if (slot[t] == null) {
slot[t] = job.id;
totalProfit += job.profit;
break;
}
}
}
System.out.print("Selected Job Sequence: ");
for (int t = 1; t <= maxDeadline; t++)
if (slot[t] != null)
System.out.print(slot[t] + " ");
System.out.println();
System.out.println("Maximum Profit = " + totalProfit);
sc.close();
}
}
