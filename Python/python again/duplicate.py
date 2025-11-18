# this will be to find duplicate but by comprehesion method

my_list = [1, 2, 3, 4, 5, 1, 2, 3, 6, 7, 8, 9, 10]
duplicate = set([x for x in my_list if my_list.count(x) > 1])
print(duplicate)