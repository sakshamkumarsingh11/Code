import math
import statistics as stats

waiting_times = [5, 7, 10, 12, 15, 18, 20, 22, 25, 30, 35, 40, 45, 50, 55, 60, 65, 80, 100, 120]

mean = stats.mean(waiting_times)
median = stats.median(waiting_times)
std_dev = stats.stdev (waiting_times)
skewness = 3 * (mean - median) / std_dev


if skewness > 0:
    print("Distribution is positively skewed (right tail).")
elif skewness < 0:
    print("Distribution is negatively skewed (left tail).")
else:
    print("Distribution is symmetric.")