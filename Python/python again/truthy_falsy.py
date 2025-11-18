age= "hello"
if age:
    print("This is truthy")
else:
    print("This is falsy")
    #the empty string is considered falsy and any non-empty string is considered truthy
#In Python, the following values are considered falsy:
#None  
#False
#0 (zero) of any numeric type, including 0.0, 0j
#Empty sequences and collections: '', (), [], {}, set(), range(0)
#Everything else is considered truthy