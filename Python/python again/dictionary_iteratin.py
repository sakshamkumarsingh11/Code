user ={
    'name': 'Alice',
    'age': 30,
    'city': 'New York',
    'height': 5.5
}

for item in user:
    print(item)  # Prints the keys of the dictionaryṇ
for item in user.values():
    print(item)  # Prints the values of the dictionary
for item in user.items():
    print(item)  # Prints the key-value pairs as tuples

# to print both of them together there is andother way
for key, value in user.items():
    print(key,value)