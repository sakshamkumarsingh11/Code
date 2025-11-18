import random
pmf = {0:0.25, 1:0.5, 2:0.125, 3:0.125}
N = 1500

cdf = []
cum = 0
for k in sorted(pmf.keys()):
    cum += pmf[k]
    cdf.append((cum, k))

samples = []
for _ in range(N):
    u = random.random()
    for thresh, val in cdf:
        if u < thresh:
            samples.append(val)
            break
counts = {k:0 for k in pmf}
for s in samples:
    counts[s] += 1

print("Counts:", counts)
print("Relative Frequencies:", {k: counts[k]/N for k in counts})
