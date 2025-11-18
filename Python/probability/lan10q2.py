import random
import math

num_points = 20
x_data = [random.randint(1, 100) for _ in range(num_points)]
y_data = [random.randint(1, 100) for _ in range(num_points)]

print("x_data:", x_data)
print("y_data:", y_data)
def calculate_mean(data):
    return sum(data) / len(data)

def calculate_standard_deviation(data, mean):
    variance = sum((x - mean)**2 for x in data) / len(data)
    return math.sqrt(variance)

def calculate_correlation(x_data, y_data):
    mean_x = calculate_mean(x_data)
    mean_y = calculate_mean(y_data)
    
    std_x = calculate_standard_deviation(x_data, mean_x)
    std_y = calculate_standard_deviation(y_data, mean_y)
    covariance = sum((x - mean_x)*(y - mean_y) for x, y in zip(x_data, y_data)) / len(x_data)
    
    # pcc
    correlation = covariance / (std_x * std_y)
    return correlation

correlation = calculate_correlation(x_data, y_data)
print("Correlation coefficient:", correlation)
