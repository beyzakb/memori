#%%
liste =[[1, 2], [3, 4], [5, 6, 7]]
liste=liste[::-1]

for i in range(len(liste)):
    (liste[i])=(liste[i])[::-1]
print(liste)

#%%
list = [[1,'a',['cat'],2],[[[3]],'dog'],4,5]
listnew = []
def flatten(n):
    for i in n:
        if isinstance(i, list):
            flatten(i)
        else:
            listnew.append(i)

flatten(list)
print(listnew)
