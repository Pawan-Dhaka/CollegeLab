import pandas as pd
import matplotlib.pyplot as plt

df = pd.read_csv("graph3.csv")


plt.figure(figsize=(8, 5))
plt.plot(df["N"], df["Time"], marker="o", linewidth=2)

plt.title("Merge Sort Time Complexity in sequential")
plt.xlabel("Input Size (N)")
plt.ylabel("Execution Time (Microseconds)")
plt.grid(True)

plt.show()