sensitivity = 0.95                
specificity = 0.90                 
prevalence = 0.02                  

false_positive_rate = 1 - specificity   # P(Test+ | No Disease)
p_disease = prevalence
p_no_disease = 1 - prevalence

# P(T|D)*P(D)
num = sensitivity * p_disease

# P(T|ND)*P(ND)
deno = (sensitivity * p_disease) + (false_positive_rate * p_no_disease)
probability = num / deno

