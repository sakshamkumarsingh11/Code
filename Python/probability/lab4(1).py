# 1.	Calculate the probability of drawing a heart.
# 2.	Calculate the probability of drawing a King.
# 3.	Calculate the conditional probability of drawing a King given that the card is a heart.
total_cards = 52  
hearts = 13  
kings = 4  
king_of_hearts = 1  
p_heart = hearts / total_cards  #probab of hearts
p_king = kings / total_cards  # probab of kings
p_king_given_heart = (king_of_hearts / total_cards) / (hearts / total_cards)  

print(p_heart)
print(p_king)
print(p_king_given_heart)
